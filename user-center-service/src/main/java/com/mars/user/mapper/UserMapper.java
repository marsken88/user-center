package com.mars.user.mapper;

import com.mars.user.po.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ken
 * @Package com.mars.user.mapper
 * @Description:
 * @Date 2017/11/17 23:51
 */
@Repository
@Mapper
public interface UserMapper {

    /**
     * 使用user对象对数据库插入
     *
     * @param user
     */
    @Insert("insert into user ( id , user_name , user_mobile ) values ( #{userId} , #{userName} , #{userMobile} )")
    void insert(User user);

    /**
     * 删除用户
     * @param userId
     */
    @Delete("delete from user where id = #{userId}")
    void remove(Long userId);

    /**
     * 获取所有用户
     * @return
     */
    @Select("select id user_name , user_mobile from user ")
    List<User> getUsers();
}
