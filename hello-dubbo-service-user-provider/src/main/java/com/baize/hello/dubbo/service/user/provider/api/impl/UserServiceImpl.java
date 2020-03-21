package com.baize.hello.dubbo.service.user.provider.api.impl;

/**
 * @ProjectName: hello-dubbo-service-user
 * @Package: com.baize.hello.dubbo.service.user.provider.api.impl
 * @ClassName: UserServiceImpl
 * @Author: BaiZe
 * @Description:
 * @Date: 2019/8/21 0:21
 * @Version: 1.0
 */
import com.alibaba.dubbo.config.annotation.Service;
import com.baize.hello.dubbo.service.user.api.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
    })
    @Override
    public String sayHi() {
        return "Hello Dubbo,i am from port:"+port;
//        throw new RuntimeException("Exception to show hystrix enabled.");
    }
}