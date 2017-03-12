package cn.edu.ntu.controller;

import org.springframework.beans.factory.annotation.Autowired;

import net.spy.memcached.MemcachedClient;

public class BaseController {

	/**
	 * memcache采用hash算法，存入其中的对象必须可序列化
	 */
	@Autowired
	protected MemcachedClient memcacheClient;
	
}
