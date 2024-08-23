package org.example.springbootintegrationmybatis.batis;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("insert into myUser (name,age) values (#{name},#{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void createUser(User user);

    @Select("select * from myUser where id=#{id}")
    User getUserById(Integer id);

    @Select("select * from myUser")
    List<User> getAllUsers();

    @Delete("delete from myUser where id=#{id}")
    void deleteUserById(Integer id);

    @Update("update myUser set name=#{name},age=#{age} where id=#{id}")
    void updateUser(User user);
}
