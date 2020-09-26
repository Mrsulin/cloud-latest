package com.sulin.cloud.common.exception;

import com.sulin.cloud.common.utils.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理器
 *
 * @author slc
 */
@RestControllerAdvice
public class RRExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 处理自定义异常
	 */
	@ExceptionHandler(RRException.class)
	public R handleRRException(RRException e){
		R r = new R();
		r.put("code", e.getCode());
		r.put("msg", e.getMessage());

		return r;
	}


	@ExceptionHandler(MethodArgumentNotValidException.class)
	public R handleMethodArgumentNotValidException (MethodArgumentNotValidException e){
		StringBuilder error=new StringBuilder();
		BindingResult bindingResult = e.getBindingResult();
		for(int i=0;i<bindingResult.getFieldErrors().size();i++){
			if(i>0){
				error.append(",");
			}
			FieldError fieldError = bindingResult.getFieldErrors().get(i);
			error.append(fieldError.getField()).append(" :").append(fieldError.getDefaultMessage());
		}
		return  R.error().put("code", HttpStatus.UNAUTHORIZED).put("msg",error);
	}
	/*@ExceptionHandler(BindException.class)
	public R handleBindException (BindException e){
		StringBuilder errorInfo=new StringBuilder();
		BindingResult bindingResult = e.getBindingResult();
		for(int i=0;i<bindingResult.getFieldErrors().size();i++){
			if(i>0){
				errorInfo.append(",");
			}
			FieldError fieldError = bindingResult.getFieldErrors().get(i);
			errorInfo.append(fieldError.getField()).append(" :").append(fieldError.getDefaultMessage());
		}
		return  R.error().put("code", HttpStatus.METHOD_NOT_ALLOWED).put("msg",errorInfo);
	}*/

	@ExceptionHandler(Exception.class)
	public R handleException(Exception e){
		logger.error(e.getMessage(), e);
		return R.error();
	}
}
