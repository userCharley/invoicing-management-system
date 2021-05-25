package com.charley.admin.model;

import java.time.LocalDateTime;

/**
 * 公共返回对象
 *
 * @author charley
 */
public class CaptchaImageModel {

    private String code;

    private LocalDateTime expireTime;


    public CaptchaImageModel(String code, int expireAfterSeconds){
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireAfterSeconds);
    }

    public String getCode() {
        return code;
    }

    /**
     * 验证码是否失效
     * @return
     */
    public boolean isExpired(){
        return  LocalDateTime.now().isAfter(expireTime);
    }
}
