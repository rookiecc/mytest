package rookiecc.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.Test;

import junit.framework.Assert;

public class ElasticsearchTest {
	public final static Log logger = LogFactory.getLog(ElasticsearchTest.class);
	public final static String HOST = "127.0.0.1";
	public final static int PORT = 9300;
	
	@Test
	public void test1() throws UnknownHostException {
		// 创建客户端
		@SuppressWarnings("resource")
		TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
				.addTransportAddresses(new TransportAddress(InetAddress.getByName(HOST), PORT));

		Assert.assertEquals("_client_", client.nodeName());
		logger.info("testing...........");
		// 关闭客户端
		client.close();
	}
}
