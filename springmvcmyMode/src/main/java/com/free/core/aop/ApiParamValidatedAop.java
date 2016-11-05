package com.free.core.aop;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import com.free.core.constants.ErrorCode;
import com.free.core.vo.ResponseData;



/**
 * 统一参数验证
 * 此aop会执行com.xlqh.outlook.controller包下所有类的带BindingResult参数的方法
 *
 */
@Component
@Aspect
public class ApiParamValidatedAop {
	
	//private Logger log = LoggerFactory.getLogger(getClass());
	
	/**
	 * 
	 * @param pjp
	 * @return 如果存在错误将返回: {"result":"100","msg":"userId:不能为null,status:不能为null","elapsedMilliseconds":0,"data":null}
	 * @throws Throwable
	 */
	@Around("execution(* com.free.*.controller..*(..))")
	public Object handle(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("validator");
		
		BindingResult bindingResult = null;
		for (Object arg : pjp.getArgs()) {
			if (arg instanceof BindingResult) {
				bindingResult = (BindingResult) arg;
			}
		}
		if (bindingResult != null) {
			List<FieldError> errors = bindingResult.getFieldErrors();
			if (errors.size() > 0) {
				StringBuilder msg = new StringBuilder();
				for (FieldError error : errors) {
					msg.append(error.getField() + ":"
							+ error.getDefaultMessage() + ",");
				}
				if(msg.length()>0)
				msg.deleteCharAt(msg.length() - 1);
				return new ResponseData(ErrorCode.INVALID_PARAMS,msg.toString());
			}
		}
		return pjp.proceed();
	}
	
	
}
