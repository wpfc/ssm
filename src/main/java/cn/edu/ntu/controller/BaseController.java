package cn.edu.ntu.controller;

import org.springframework.beans.factory.annotation.Autowired;

import net.spy.memcached.MemcachedClient;

public class BaseController {

	/**
	 * memcache����hash�㷨���������еĶ����������л�
	 */
	@Autowired
	protected MemcachedClient memcacheClient;
	
}
