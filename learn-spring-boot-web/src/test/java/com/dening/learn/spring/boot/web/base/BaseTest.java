package com.dening.learn.spring.boot.web.base;

import com.dening.learn.spring.boot.web.LearnSpringBootWebApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: wudening
 * @Description: 测试基类-需要启动spring boot容器的测试类继承它-利用IOC进行依赖注入
 * @Date: 2021/4/19 6:25 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LearnSpringBootWebApplication.class)
public class BaseTest {
}
