package visadirect;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Properties;

import javax.net.ssl.SSLContext;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CxvdemoApplication {
	@Value("${app.keyStore}")
	private String keyStore;
	@Value("${app.keyStorePassword}")
	private String keyStorePassword;
	@Value("${app.keyPassword}")
	private String keyPassword;
	
	@Value("${app.apiuserpass}")
			private String apiuserpass;


	private static final Logger log = LoggerFactory.getLogger(CxvdemoApplication.class);

	// TODO validate that stores are files
	// TODO dont use "@Bean String" for initializing. must be better way.
	@Bean
	Properties clientProperties() throws IOException {
		Properties prop = new Properties();
		InputStream input = null;
		input = new FileInputStream(apiuserpass);

		// load a properties file
		prop.load(input);

		return prop;
	}

	@Bean 
	public RestTemplate restTemplate() throws KeyManagementException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {
		// Load client certificate into key store
        SSLContext sslcontext = SSLContexts.custom()
               .loadKeyMaterial(new File(keyStore), keyStorePassword.toCharArray(),
               		keyPassword.toCharArray())
               .build();

       // Allow TLSv1 protocol only . seems like imoportant now.
       SSLConnectionSocketFactory sslSocketFactory = new SSLConnectionSocketFactory(sslcontext, new String[] { "TLSv1" }, null,
               SSLConnectionSocketFactory.STRICT_HOSTNAME_VERIFIER);

       CloseableHttpClient httpClient = HttpClients.custom()
                   .setSSLSocketFactory(sslSocketFactory)
                   .build();
		HttpComponentsClientHttpRequestFactory requestFactory = 
			      new HttpComponentsClientHttpRequestFactory();
			    requestFactory.setHttpClient(httpClient);
			    RestTemplate restTemplate = new RestTemplate(requestFactory);
		return restTemplate;
	}
	public static void main(String[] args) {

		SpringApplication.run(CxvdemoApplication.class, args);
	}

}
