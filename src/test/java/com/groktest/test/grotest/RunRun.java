package com.groktest.test.grotest;

import java.io.File;

public class RunRun {
	public static void main(String[] args) {
		//File logFile = new File("/home/woshixin/logs/javaException");
		File logFile = new File("/usr/local/apache-tomcat-6.0.35/logs/catalina.out");
		//Thread wthread = new Thread(new LogWriter(logFile));
		//wthread.start();
		Thread rthread = new Thread(new LogReader(logFile));
		rthread.start();
	}
}
