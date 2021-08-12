package com.missloverexception.project.utils.resultModel;


import lombok.Data;

import java.util.Date;

@Data
public class CommonResult<T> {

    private String code;

    private String message;

    private T data;

    private CommonResult() {}

    public static CommonResult getMsgInstance(String code, String message) {
        CommonResult result = new CommonResult();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static CommonResult getMsgEnumInstance(CommonResultEnum resultEnum) {
        CommonResult result = new CommonResult();
        result.setCode(resultEnum.getCode());
        result.setMessage(resultEnum.getMessage());
        return result;
    }

    public static <T> CommonResult<T> getDataInstance(String code, String message, T data) {
        CommonResult result = new CommonResult();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Date(1612603708733L));
    }

}
