/**
  * @filename TalkServiceImpl.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.service;

import org.springframework.stereotype.Service;

import com.hua.bean.ResultBean;

/**
 * @type TalkServiceImpl
 * @description 
 * @author qianye.zheng
 */
@Service
public class TalkServiceImpl implements TalkService
{

	/**
	 * @description 
	 * @param content
	 * @return
	 * @author qianye.zheng
	 */
	@Override
	public ResultBean talk(final String content)
	{
		System.out.println("Invoking TalkServiceImpl.talk");
		ResultBean resultBean = new ResultBean();
		resultBean.setId("20180825");
		resultBean.setMessage("Talk: " + content);
		resultBean.setSuccess(true);
		resultBean.setMessageCode("200");
		
		return resultBean;
	}
	
}
