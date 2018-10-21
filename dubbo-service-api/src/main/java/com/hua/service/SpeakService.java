/**
  * @filename SpeakService.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.service;

import com.hua.bean.ResultBean;

 /**
 * @type SpeakService
 * @description 
 * @author qianye.zheng
 */
public interface SpeakService
{
	
	/**
	 * 
	 * @description 
	 * @param content
	 * @return
	 * @author qianye.zheng
	 */
	public ResultBean say(final String content);
	
	/**
	 * 
	 * @description 
	 * @param content
	 * @return
	 * @author qianye.zheng
	 */
	public ResultBean sayWithTalk(final String content);
	
	/**
	 * 
	 * @description 
	 * @param content
	 * @return
	 * @author qianye.zheng
	 */
	public ResultBean sayAndWalk(final String content);
	
}
