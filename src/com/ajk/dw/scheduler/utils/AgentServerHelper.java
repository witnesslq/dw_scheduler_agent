package com.ajk.dw.scheduler.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.ajk.dw.scheduler.utils.IPUtils;

public class AgentServerHelper {
	
	public static String getLocalIp(){
		return IPUtils.getFirstNoLoopbackIP4Address();
	}
	
	public static ExecutorService createThreadPool(int corePoolSize, int maxPoolSize){
		return new ThreadPoolExecutor(corePoolSize, maxPoolSize, 1L,TimeUnit.SECONDS,
				new LinkedBlockingQueue<Runnable>());
	}
}
