package com.hua.util;


import lombok.extern.slf4j.Slf4j;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动Dubbo服务用的MainClass
 *
 * @author :evan
 */
@Slf4j
public class DubboProvider {

  public static void main(String[] args) {
    try {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/META-INF/spring/applicationContext-*.xml");
      context.start();

      Thread.currentThread().join();
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
