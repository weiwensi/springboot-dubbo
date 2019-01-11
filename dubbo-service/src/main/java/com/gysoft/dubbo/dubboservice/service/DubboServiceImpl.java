package com.gysoft.dubbo.dubboservice.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gysoft.dubbo.DubboService;
import com.gysoft.dubbo.bean.User;

/**
 * @Description
 * @Author DJZ-WWS
 * @Date 2019/1/11 17:57
 */

@Service
public class DubboServiceImpl  implements DubboService {

    @Override
    public String  testDubbo() {
        User user = new User();
        user.setName("tom");
        user.setAge(18);
        return user.toString();
    }
}
