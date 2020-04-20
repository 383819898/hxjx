
import com.guoguo.Mapper.UserDetailsDAO;

import com.guoguo.entity.UserDetails;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * PACKAGE_NAME
 * 作者      : 陈晓
 * 描述      :
 * 创建日期  : 2017/12/5
 * 修改日期  :
 */

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath*:spring-mvc.xml","classpath*:spring-mybatis.xml"})
@WebAppConfiguration("src/main/resources")
public class TestMybatis {

 /* private static Logger logger = LoggerFactory.getLogger(TestMybatis.class);*/

/*    Logger logger = LoggerFactory.getLogger(TestMybatis.class);*/
    String urlAll ="http://www.baoliny.com";
/*  @Autowired
  private IUserDao dao;*/


/*    @Autowired
    private UserDetailsDAO;

    @Autowired
    private GuoguoChapterDAO guoguoChapterDAO;*/



    @Autowired
    private UserDetailsDAO userDetailsDAO;

/*    @Test
    public void testSelectUser() throws Exception {
        GuoguoBookName guoguoBookName = new GuoguoBookName();

        guoguoBookName.setGuoguoAuthor("3123");

        guoguoBookNameDAO.insert(guoguoBookName);


  }*/

    @Test
    public void getPage(){

        try {


            UserDetails userDetails = new UserDetails();

            userDetails.setUsername("123");
            userDetails.setPassword("123");
/*
            userDetails.setCreateTime(new Date());
            userDetails.setUpdateTime(new Date());
*/

//            userDetailsDAO.login(userDetails);

            List<UserDetails> userDetails1 = userDetailsDAO.selectAll(userDetails);
            System.out.println("===============================================");
            System.out.println(userDetails1);
            System.out.println(userDetails1.size());


        } catch (Exception e) {
            e.printStackTrace();
        }

    }




}
