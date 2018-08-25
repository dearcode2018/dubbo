/**
  * @filename SpeakServiceImpl.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.service;

import org.springframework.stereotype.Service;

import com.hua.bean.ResultBean;

 /**
 * @type SpeakServiceImpl
 * @description 
 * @author qianye.zheng
 */
@Service
public class SpeakServiceImpl implements SpeakService
{

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
		resultBean.setMessage("Say: " + content);
		resultBean.setSuccess(true);
		resultBean.setMessageCode("200");
		
		return resultBean;
	}

}
