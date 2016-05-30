package visadirectapi;

import static org.junit.Assert.*;

import java.io.File;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.TimeZone;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import visadirect.CxvdemoApplication;
import visadirect.client.PushFundsClient;
import visadirect.model.PushFundsBody;
import visadirect.model.PushFundsResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CxvdemoApplication.class)
public class CxvdemoApplicationTests {

	@Autowired
	PushFundsClient aPushFundsClient;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testLookup() throws Exception {

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("bodyjson").getFile());

		ObjectMapper mapper = new ObjectMapper();
		PushFundsBody aPushFundsBody = mapper.readValue(file, PushFundsBody.class);

		// 2016-05-23T09:44:17 usually GMT
		SimpleDateFormat dateFormatGmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		dateFormatGmt.setTimeZone(TimeZone.getTimeZone("GMT"));

		aPushFundsBody.setLocalTransactionDateTime(dateFormatGmt.format(new Date()));

		ResponseEntity<PushFundsResponse> response = aPushFundsClient.postRequest(aPushFundsBody);

		assertTrue(response.getStatusCode().value()==200);

	}

	HttpHeaders createHeaders(String username, String password) {
		return new HttpHeaders() {
			{
				String auth = username + ":" + password;
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				set("Authorization", authHeader);
			}
		};
	}

}
