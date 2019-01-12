package com.yolo.application.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.springframework.stereotype.Service;

import com.yolo.application.SleepService;
import com.yolo.application.model.Sleep;


@Service
public class SleepServiceRest {
	
	public void getSleepInfo(Sleep sleep) throws MalformedURLException {
		URL url = new URL("http://localhost:9999/ws/hello?wsdl");
		QName qname = new QName("http://application.yolo.com/", "SleepServiceImplService");

		javax.xml.ws.Service service = javax.xml.ws.Service.create(url, qname);

		SleepService hello = service.getPort(SleepService.class);
		sleep.setSleepAnalysisMessage(hello.getSleepInfo(sleep.getWakeUp(),sleep.getFallAsleep()));
	}
}