package com.neuedu.dao;

import com.neuedu.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_user
     *
     * @mbg.generated
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_user
     *
     * @mbg.generated
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_user
     *
     * @mbg.generated
     */
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(User record);
    //判断用户名是否存在
    int countUsername(@Param("username") String username);
    //判断邮箱是否存在
    int countEmail(@Param("email")String email);
    //根据用户名密码查询用户
    User findUserByUsernameAndPassword(@Param("username") String username,
                                       @Param("password") String password);

    //忘记密码找问题
    String forgetGetQuestion(@Param("username")String username);

    String forgetCheckAnswer(@Param("username")String username,
                             @Param("question")String question);

    //判断是否是管理员
    int adminLogin(@Param("username") String username,
                   @Param("password") String password);
}