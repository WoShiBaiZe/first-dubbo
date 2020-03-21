package com.baize.hello.dubbo.service.user.consumer;

/**
 * @ProjectName: hello-dubbo-service-user
 * @Package: com.baize.hello.dubbo.service.user.consumer
 * @ClassName: HelloDubboServiceUserConsumerApplication
 * @Author: BaiZe
 * @Description:
 * @Date: 2019/8/21 0:29
 * @Version: 1.0
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication
public class HelloDubboServiceUserConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloDubboServiceUserConsumerApplication.class, args);
    }
}