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

    //�û�����
    public Member login(String loginName, String loginPass){
      log.info("�û�����");
        return null;
    }

    //�û�ע��
    public Member logOff(String loginName){
        log.info("�û�ע��");
        int a= 1/0;
        return null;

    }



}
