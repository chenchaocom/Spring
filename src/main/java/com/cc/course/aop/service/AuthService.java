package com.cc.course.aop.service;


import com.cc.course.aop.model.Member;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Created by chenchao on 2019/7/12.
 */
@Service
public class AuthService {

    private final static Logger log = Logger.getLogger(AuthService.class);

    //用户登入
    public Member login(String loginName, String loginPass){
      log.info("用户登入");
        return null;
    }

    //用户注销
    public Member logOff(String loginName){
        log.info("用户注销");
        int a= 1/0;
        return null;

    }



}
