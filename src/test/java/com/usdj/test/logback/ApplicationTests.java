package com.usdj.test.logback;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: Java-API-Test
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-15 20:37
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
//@Slf4j
public class ApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(ApplicationTests.class);
	//private  final Logger log = LoggerFactory.getLogger(this.getClass());
	@Test
	public void contextLoads() {
		log.info("Output info log");
		log.debug("Output debug log");
		log.error("Output error log");
	}
}
