package com.aji;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.aji.netty.WSServer;

@Component
public class NettyBooter implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	// 初始化启动
	// springboot启动后 netty服务启动
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (event.getApplicationContext().getParent() == null) {
			try {
				WSServer.getInstance().start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
