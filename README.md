# visadirectapi
Use of visa direct api


Requirements 

you will need to :
install jdk
create the certificate keystore following the visadevelopment tutorial
create the certificate truststore following the visadevelopment tutorial
create a file with the user/key provided by visadevelpment
edit  visadirectapi/src/main/resources/application.properties  to point to your truststore, keystore and user/key files

To run test execute gradlew test


here are some commands I used for creating keystore and truststore. I dropped the key and the 2 certs into a folder and run them.

"C:\OpenSSL-Win64\bin\openssl" pkcs12 -export -in cert.pem -inkey "key_visadirectII.pem" -certfile cert.pem -out myapp_keyAndCertBundle.p12
"C:\Program Files\Java\jdk1.8.0_40\bin\keytool" -importkeystore -srckeystore myapp_keyAndCertBundle.p12 -srcstoretype PKCS12 -destkeystore myapp_keyAndCertBundle.jks
"C:\Program Files\Java\jdk1.8.0_40\bin\keytool"  -import -alias ejbca -keystore clientkeystore.jks -file VDPCA-SBX.pem -storepass change

//Optional since now the cert is not selfsigned but signed by GeoTrust
use an existing cacerts since it still needs standard CAs such as GeoTrust. usually the default pass for a java cacerts is "changeit"
"C:\Program Files\Java\jdk1.8.0_40\bin\keytool"  -import -alias ejbca -keystore cacerts -file VDPCA-SBX.pem -storepass changeit