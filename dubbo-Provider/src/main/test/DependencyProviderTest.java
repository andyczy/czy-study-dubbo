import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @auther 陈郑游
 * @create 2017/4/5 0005
 * @功能
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */
public class DependencyProviderTest {

	//main
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dependency-provider.xml"});

		// 按任意键退出
		context.start();

		System.out.println("Press any key to exit!");
		//为保证服务一直开着，利用输入流的阻塞来模拟
		System.in.read();
	}
}