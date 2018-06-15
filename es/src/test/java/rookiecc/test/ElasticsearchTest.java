package rookiecc.test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElasticsearchTest {
	public final static Log logger = LogFactory.getLog(ElasticsearchTest.class);
	public final static String HOST = "127.0.0.1";
	public final static int PORT = 9300;

	private TransportClient client = null;

//	@SuppressWarnings({ "resource", "unchecked" })
//	@Before
//	public void getConnection() throws UnknownHostException {
//		// 创建客户端
//		client = new PreBuiltTransportClient(Settings.EMPTY)
//				.addTransportAddresses(new TransportAddress(InetAddress.getByName(HOST), PORT));
//		logger.info("create connection");
//	}
//
//	@Test
//	public void addIndex1() throws IOException {
//		IndexResponse response = client.prepareIndex("msg", "tweet", "1").setSource(XContentFactory.jsonBuilder()
//				.startObject().field("userName", "张三").field("sendDate", new Date()).field("msg", "你好李四").endObject())
//				.get();
//
//		logger.info("索引名称:" + response.getIndex() + "\n类型:" + response.getType() + "\n文档ID:" + response.getId()
//				+ "\n当前实例状态:" + response.status());
//	}
//
//	@Test
//	public void addIndex2() {
//		String jsonStr = "{" + "\"userName\":\"张三\"," + "\"sendDate\":\"2017-11-30\"," + "\"msg\":\"你好李四\"" + "}";
//		IndexResponse response = client.prepareIndex("weixin", "tweet").setSource(jsonStr, XContentType.JSON).get();
//		logger.info("json索引名称:" + response.getIndex() + "\njson类型:" + response.getType() + "\njson文档ID:"
//				+ response.getId() + "\n当前实例json状态:" + response.status());
//	}
//	
//	
//	@Test
//	public void getData1() {
//		GetResponse getResponse = client.prepareGet("msg", "tweet", "1").get();
//		logger.info("索引库的数据:" + getResponse.getSourceAsString());
//	}
//
//	@After
//	public void closeConnection() {
//		// 关闭客户端
//		client.close();
//	}
}
