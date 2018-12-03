/**
 * Author: Chen zheng you
 * CreateTime: 2018-12-03 9:07
 * Description:消费端启动类
 */
@SpringBootApplication(scanBasePackages = "com.github.andyczy.consumer")
public class DubboConsumerStart {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerStart.class,args);

    }
}
