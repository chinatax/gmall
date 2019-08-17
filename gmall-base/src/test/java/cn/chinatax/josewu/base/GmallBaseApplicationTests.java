package cn.chinatax.josewu.base;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallBaseApplicationTests {


    @Before
    public void before() {

       System.out.println("Testing....");

    }
    @Test
    public void contextLoads() {
        System.out.println("Testing....");

    }



}
