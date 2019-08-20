package cn.chinatax.josewu.gmallweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages = {"cn.chinatax.josewu.base",
                               "cn.chinatax.josewu.gmalldao",
                               "cn.chinatax.josewu.gmallservice",
                               "cn.chinatax.josewu.gmallweb"})
@MapperScan(value = {"cn.chinatax.josewu.mapper"})
public class GmallWebApplication {

    public static void main(String[] args) {

        SpringApplication.run(GmallWebApplication.class, args);
    }

}
