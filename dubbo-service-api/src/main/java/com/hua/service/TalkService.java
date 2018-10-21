/**
  * @filename TalkService.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.service;

import com.hua.bean.ResultBean;

/**
 * @type TalkService
 * @description 
 * @author qianye.zheng
 */
public interface TalkService
{	
	
	/**
	 * 
	 * @description 
	 * @param content
	 * @return
	 * @author qianye.zheng
	 */
	public ResultBean talk(final String content);

}
