package cn.service.impl;

import cn.service.HelloService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;

@Service/*(interfaceClass = HelloService.class)*/    // 发布服务必须使用Dubbo提供的service注解
@Transactional
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
