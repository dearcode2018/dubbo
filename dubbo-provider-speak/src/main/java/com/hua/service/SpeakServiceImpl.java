/**
  * @filename SpeakServiceImpl.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.hua.bean.ResultBean;
import com.hua.util.JacksonUtil;

 /**
 * @type SpeakServiceImpl
 * @description 
 * @author qianye.zheng
 */
@Service
public class SpeakServiceImpl implements SpeakService
{

	@Value("${abc.name}")
	private String value;
	
	@Resource
	private TalkService talkService;
	
	@Resource
	private WalkService walkService;
	
	/**
	 * @description 
	 * @param content
	 * @return
	 * @author qianye.zheng
	 */
	@Override
	public ResultBean say(final String content)
	{
		ResultBean resultBean = new ResultBean();
		resultBean.setId("20180825");
		resultBean.setMessage(value + "Say: " + content);
		resultBean.setSuccess(true);
		resultBean.setMessageCode("200");
		
		return resultBean;
	}

	/**
	 * @description 
	 * @param content
	 * @return
	 * @author qianye.zheng
	 */
	@Override
	public ResultBean sayWithTalk(String content)
	{
		ResultBean resultBean0 = talkService.talk("sayWithTalk");
		System.out.println(JacksonUtil.writeAsString(resultBean0));
		ResultBean resultBean = new ResultBean();
		resultBean.setId("20180825");
		resultBean.setMessage(value + "Say: " + content);
		resultBean.setSuccess(true);
		resultBean.setMessageCode("200");
		
		return resultBean;
	}

	/**
	 * @description 
	 * @param content
	 * @return
	 * @author qianye.zheng
	 */
	@Override
	public ResultBean sayAndWalk(String content)
	{
		ResultBean resultBean0 = walkService.walk("sayAndWalk");
		System.out.println(JacksonUtil.writeAsString(resultBean0));
		ResultBean resultBean = new ResultBean();
		resultBean.setId("20180825");
		resultBean.setMessage(value + "Say: " + content);
		resultBean.setSuccess(true);
		resultBean.setMessageCode("200");
		
		return resultBean;
	}
	
}
