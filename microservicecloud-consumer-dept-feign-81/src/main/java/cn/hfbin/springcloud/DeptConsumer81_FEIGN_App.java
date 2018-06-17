package cn.hfbin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"cn.hfbin.springcloud"})
@ComponentScan("cn.hfbin.springcloud")
public class DeptConsumer81_FEIGN_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer81_FEIGN_App.class, args);
	}
}
