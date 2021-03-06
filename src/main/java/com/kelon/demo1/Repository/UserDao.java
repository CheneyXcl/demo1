package com.kelon.demo1.Repository;

import com.kelon.demo1.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<User> getAllUser()
    {
        String sql = "select * from user";
//        List<User> users = jdbcTemplate.query(sql, new RowMapper<User>() {
//            @Override
//            public User mapRow(ResultSet rs, int i) throws SQLException {
//                User p = new User(); //特别需要new，不然如果结果集是list就只有1个对象
//                p.setId(rs.getLong("id"));
//                p.setEmail(rs.getString("email"));
//                p.setNickName(rs.getString("nick_name"));
//                p.setPassWord(rs.getString("pass_word"));
//                p.setUserName(rs.getString("user_name"));
//                p.setRegTime(rs.getString("reg_time"));
//                return p;
//            }});

        List<User> users;
        try {
            users = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(User.class));
            return users;
        }
        catch (Exception e)
        {
            System.out.println(this.getClass().toString()+ '\n'+ e.getMessage());
            return  null;
        }

        //List<User> users = jdbcTemplate.queryForList(,User.class);

    }
}
