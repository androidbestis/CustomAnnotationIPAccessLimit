package com.xudong.exception;

/**
 * 自定义Exception异常类
 */
public class RequestLimitException extends Exception{

    private static final long serialVersionUID = 1364225358754654702L;

    public RequestLimitException(){
        super("HTTP请求超出设定的限制");
    }

    public RequestLimitException(String message){
        super(message);
    }
}
