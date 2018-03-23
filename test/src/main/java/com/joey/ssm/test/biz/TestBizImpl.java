package com.joey.ssm.test.biz;

import com.joey.ssm.mybatisplus.model.User;
import com.joey.ssm.mybatisplus.service.UserService;
import com.joey.ssm.test.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yp-tc-m-7179 on 2018/3/22.
 */
@Service
public class TestBizImpl implements TestBiz{
    @Resource
    private TestService testService;
    @Resource
    private UserService userService;

    public void test() {
//        testService.test();
        User user = userService.selectById(1);
        System.out.println(user);
    }
}
