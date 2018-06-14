package rookiecc.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ElasticsearchTest {
	 private Logger logger = LoggerFactory.getLogger(ElasticsearchTest.class);
	 public final static String HOST = "127.0.0.1";
	 public final static int PORT = 9300;
	 
	 @SuppressWarnings("resource")
	   @Test
	      public void test1() throws UnknownHostException {
	         //创建客户端
	          TransportClient client = new PreBuiltTransportClient(Settings.EMPTY).addTransportAddresses(
	                                   new TransportAddress(InetAddress.getByName(HOST),PORT));
	          
	               logger.debug("Elasticsearch connect info:" + client.toString());
	  
	          //关闭客户端
	          client.close();
	 }
}
