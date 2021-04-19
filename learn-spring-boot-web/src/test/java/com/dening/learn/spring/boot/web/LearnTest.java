package com.dening.learn.spring.boot.web;

import com.dening.learn.spring.boot.web.base.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Author: wudening
 * @Description: 测试学习类
 * @Date: 2021/4/19 6:30 下午
 */
@Slf4j
public class LearnTest extends BaseTest {

    @Test
    public void logbackTest() {
        log.info("spring boot 2项目，测试接入logback日志");
    }
}
