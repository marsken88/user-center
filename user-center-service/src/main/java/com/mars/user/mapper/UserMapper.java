package com.mars.user.mapper;

import com.mars.user.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author ken
 * @Package com.mars.user.mapper
 * @Description:
 * @Date 2017/11/17 23:51
 */
@Repository
@Mapper
public interface UserMapper {
    @Insert("insert into user ( id , userName , userMobile ) values ( #{userId} , #{userName} , #{userMobile} )")
    void insert(User user);
}
