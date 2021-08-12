package com.missloverexception.project.utils.resultModel;

import lombok.Data;

public enum CommonResultEnum {
    RESULT_SUCCESS("10001", "成功"),
    RESULT_FAIL("10000", "失败"),
    RESULT_PROCESS("10002", "处理中"),
    ;

    private String code;

    private String message;

    CommonResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
