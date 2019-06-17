package com.example.demo.service;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class LogService implements MethodBeforeAdvice  {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {

		Log l = LogFactory.getLog(EmployeeService.class);
		l.info("method called......");
	}
}
