package com.hua.util;

import lombok.extern.slf4j.Slf4j;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @type DubboProvider
 * @description 
 * @author qianye.zheng
 */
@Slf4j
public class DubboProvider {

	/**
	 * 
	 * @description 
	 * @param args
	 * @author qianye.zheng
	 */
  public static void main(String[] args) {
    try {
      ClassPathXmlApplicationContext context = 
    		  new ClassPathXmlApplicationContext("classpath*:/META-INF/spring/*.xml");
      context.start();

      Thread.currentThread().join();
      
      context.close();
      
    } catch (Exception e) {
      e.printStackTrace();
      log.error("使用dubboProvider启动系统，异常退出", e);
    }

    synchronized (DubboProvider.class) {
      while (true) {
        try {
          DubboProvider.class.wait();
        } catch (InterruptedException e) {
          log.error("使用dubboProvider启动系统，synchronized error:", e);
        }
      }
    }
  }

}
