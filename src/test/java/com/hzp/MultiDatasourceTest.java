package com.hzp;

import com.hzp.dao.firstslaver.MmmMapper;
import  com.hzp.model.firstslaver.Mmm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HzpRocketPlanApplication.class)
public class MultiDatasourceTest {
    @Autowired
//    private UserMapper userMapper;
    private MmmMapper mmmMapper;
//    @Autowired
//    private UserSlaverDao slaverUserDao;
    /**
     * 查询用户
     * @throws Exception
     */
    @Test
    public void testQueryUser() throws Exception {
//        User masterUser = userMapper.selectByPrimaryKey(1);
        Mmm mmm = new Mmm();
        mmm.setMonths("123214");
        mmmMapper.insert(mmm);
//        System.out.println("masterUser==>>>"+masterUser.getUsername());

//        User slaverUser = slaverUserDao.queryUserById(1L);
//        System.out.println("slaverUser==>"+slaverUser.getName());
    }
}

