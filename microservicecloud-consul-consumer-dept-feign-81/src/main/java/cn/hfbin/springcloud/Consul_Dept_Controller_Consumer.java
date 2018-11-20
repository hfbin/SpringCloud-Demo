package cn.hfbin.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.consul.discovery.ConsulDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages= {"cn.hfbin.springcloud"})

public class Consul_Dept_Controller_Consumer
{
/*
	@Autowired
	private ConsulDiscoveryClient consulDiscoveryClient;
*/

	public static void main(String[] args)
	{
		SpringApplication.run(Consul_Dept_Controller_Consumer.class, args);
	}
/*	@Override
	public void run(String... args) throws Exception {
		List<ServiceInstance> serviceInstanceList = consulDiscoveryClient.getInstances("consulservice1");
		ServiceInstance serviceInstance = serviceInstanceList.get(0);
		System.out.println("服务地址：" + serviceInstance.getUri());
		System.out.println("服务名称：" +serviceInstance.getServiceId());

		String callServiceResult = new RestTemplate().getForObject(serviceInstance.getUri().toString()+"/hi",String.class);
		System.out.println(callServiceResult);
	}*/

}
