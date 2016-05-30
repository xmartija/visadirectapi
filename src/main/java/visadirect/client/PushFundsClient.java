package visadirect.client;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Properties;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import visadirect.model.PushFundsBody;
import visadirect.model.PushFundsResponse;

@Component
public class PushFundsClient {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	Properties clientProperties;

	public ResponseEntity<PushFundsResponse> postRequest(PushFundsBody aPushFundsBody) throws Exception {

		// extracted from sandbox example
		String url = "https://sandbox.api.visa.com/visadirect/fundstransfer/v1/pushfundstransactions";

		String user = clientProperties.getProperty("user");
		String pass = clientProperties.getProperty("pass");
		HttpHeaders headers = createHeaders(user, pass);
		// REQUIRED !!! not optional !!
		headers.setContentType(MediaType.APPLICATION_JSON);
		// optional
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity request = new HttpEntity(aPushFundsBody, headers);

		ResponseEntity<PushFundsResponse> response = restTemplate.exchange(url, HttpMethod.POST, request,
				PushFundsResponse.class);
		return response;

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
