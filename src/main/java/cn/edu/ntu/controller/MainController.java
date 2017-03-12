package cn.edu.ntu.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import ch.qos.logback.classic.Logger;

public class MainController implements Controller {

	Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		
		Map<String, String> map = new HashMap<String, String>();
		map.put("userName", "ÕÅÈý");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		logger.debug("debug");
		logger.warn("warn");
		logger.info("info");
		
		return new ModelAndView("/WEB-INF/ftl/hello.ftl", map);
	}

}
