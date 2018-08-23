package com.zbl.demo.factory;

import com.zbl.demo.factory.impl.CmsSender;
import com.zbl.demo.factory.impl.MailSender;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class SenderFactory {
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("cms".equals(type)) {
            return new CmsSender();
        }else{
            System.out.println("null");
            return null;
        }
    }
}
