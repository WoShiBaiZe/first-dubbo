package com.baize.hello.dubbo.service.user.provider;

/**
 * @ProjectName: hello-dubbo-service-user
 * @Package: com.baize.hello.dubbo.service.user.provider
 * @ClassName: HelloDubboServiceUserProviderApplication
 * @Author: BaiZe
 * @Description:
 * @Date: 2019/8/21 0:23
 * @Version: 1.0
 */
import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@SpringBootApplication
public class HelloDubboServiceUserProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloDubboServiceUserProviderApplication.class, args);
        // 启动 Provider 容器，注意这里的 Main 是 com.alibaba.dubbo.container 包下的
        Main.main(args);
    }
}
