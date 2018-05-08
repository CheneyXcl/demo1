package com.kelon.demo1;

import com.kelon.demo1.Repository.iUserDao;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import org.springframework.test.context.junit4.SpringRunner;


import java.text.DateFormat;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class iUserDaoTests {

    @Autowired
    private iUserDao userRepository;

    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        //userRepository.save(new User("aa1", "aa@126.com", "aa", "aa123456",formattedDate));
        //userRepository.save(new User("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
        //userRepository.save(new User("cc3", "cc@126.com", "cc", "cc123456",formattedDate));

        //List<User> users = userRepository.findByUserName()


        Assert.assertEquals(3,userRepository.findAll().size());
        Assert.assertEquals("cc", userRepository.findByUserNameOrEmail("cc3", "cc@126.com").getNickName());

       // userRepository.delete(userRepository.findByUserName("aa1"));
    }

}