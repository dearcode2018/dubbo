/**
  * @filename WalkServiceImpl.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.service;

import org.springframework.stereotype.Service;

import com.hua.bean.ResultBean;

/**
 * @type WalkServiceImpl
 * @description 
 * @author qianye.zheng
 */
@Service
public class WalkServiceImpl implements WalkService
{

	/**
	 * @description 
	 * @param content
	 * @return
	 * @author qianye.zheng
	 */
	@Override
	public ResultBean walk(String content)
	{
		System.out.println("Invoking WalkServiceImpl.walk");
		ResultBean resultBean = new ResultBean();
		resultBean.setId("2019025658");
		resultBean.setMessage("walk: " + content);
		resultBean.setSuccess(true);
		resultBean.setMessageCode("200");
		
		return resultBean;
	}

}
