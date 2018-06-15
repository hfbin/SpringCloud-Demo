package cn.hfbin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by: HuangFuBin
 * Date: 2018/6/13
 * Time: 9:48
 * Such description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_App {

    public static void main(String[] args)
    {
        SpringApplication.run(EurekaServer7002_App.class, args);
    }
}
