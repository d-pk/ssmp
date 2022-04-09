package cn.nit.service.impl;

import cn.nit.dao.UserDao;
import cn.nit.domain.User;
import cn.nit.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService{
}
