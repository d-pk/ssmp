package cn.nit.dao;

import cn.nit.domain.User;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void test(){
        List<User> users = userDao.selectList(null);
        users.forEach(user -> {
            System.out.println(user);
        });
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setUage("66");
        user.setUname("temp");
        userDao.insert(user);
    }

    @Test
    public void updateUser(){
        User user = new User();
        user.setUname("updateSuccess");
        user.setUid("1");
        userDao.updateById(user);
    }

    @Test
    public void deleteUser(){
        userDao.deleteById(8);
    }

    @Test
    public void selectPage(){
        Page<User> page = new Page(1,2);
        Page page1 = userDao.selectPage(page, null);

    }
}