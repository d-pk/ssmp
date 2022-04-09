package cn.nit.dao;

import cn.nit.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserDao extends BaseMapper<User> {
}
