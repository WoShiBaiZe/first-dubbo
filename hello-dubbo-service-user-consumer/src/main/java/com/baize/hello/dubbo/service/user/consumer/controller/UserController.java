package com.baize.hello.dubbo.service.user.consumer.controller;

/**
 * @ProjectName: hello-dubbo-service-user
 * @Package: com.baize.hello.dubbo.service.user.consumer.controller
 * @ClassName: UserController
 * @Author: BaiZe
 * @Description:
 * @Date: 2019/8/21 0:28
 * @Version: 1.0
 */
import com.alibaba.dubbo.config.annotation.Reference;
import com.baize.hello.dubbo.service.user.api.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference(version = "${user.service.version}")
    private UserService userService;

    @HystrixCommand(fallbackMethod = "hiError")
    @RequestMapping(value = "hi")
    public String sayHi() {
        return userService.sayHi();
    }

    public String hiError(){
        return "Hello Hystrix";
    }
}
