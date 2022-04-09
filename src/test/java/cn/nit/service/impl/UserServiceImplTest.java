package cn.nit.service.impl;

import cn.nit.dao.UserDao;
import cn.nit.domain.User;
import cn.nit.service.UserService;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        int count = userService.count();
        System.out.println("记录数："+count);
    }

    @Test
    public void deleteUser(){
        userService.removeById(7);
    }

    @Test
    public void getUser(){
        BaseMapper<User> baseMapper = userService.getBaseMapper();
        List<User> users = baseMapper.selectList(null);
        users.forEach(user -> {
            System.out.println(user);
        });
    }
}