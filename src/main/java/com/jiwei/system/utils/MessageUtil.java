package com.jiwei.system.utils;

import com.github.qcloudsms.SmsMultiSender;
import com.github.qcloudsms.httpclient.HTTPException;


import java.io.IOException;
import java.util.Random;

/**
 * @title: CookieUtil
 * @Author 赖志宇
 * @Description TODO
 * @Date: 2020/8/14
 * @Version 1.0
 */
public class MessageUtil {

    private static final int APPID = 1400326869;
    private static final String APPKEY = "b3341bab00cea450bdced224b0056176";
    private static final int TEMPLATEDID = 546816;
    private static final String SMSSIGN = "计算机维护队";
    private static final String candidateCode="1234567890";
    private static final int codeMessageLength = 6;

    /**
     * 发送短信，错误返回详情参考腾讯api文档
     * @param phoneNumber
     * @return 6位数字验证码
     * @throws HTTPException
     * @throws IOException
     */
    public static String sendMessage(String phoneNumber) throws HTTPException, IOException {
        String code = generateVerifyCode();
        String []params = code.split(" ");
        SmsMultiSender smsMultiSender = new SmsMultiSender(APPID,APPKEY);
        smsMultiSender.sendWithParam("86",phoneNumber.split(","),TEMPLATEDID,params,SMSSIGN,"","");
        return code;
    }

    /**
     * 用于生成随机的验证码
     * @return 6位数字验证码
     */
    private static String generateVerifyCode(){
        Random random = new Random(System.currentTimeMillis());
        int resourceLength = candidateCode.length();
        StringBuilder code = new StringBuilder(codeMessageLength);
        for(int i=0;i<codeMessageLength;i++){
            code.append(candidateCode.charAt(random.nextInt(resourceLength-1)));
        }
        return code.toString();
    }
}
