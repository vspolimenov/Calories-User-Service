package com.yolo.application;

	import javax.jws.WebMethod;
import javax.jws.WebService;

//Service Endpoint Interface
@WebService
//@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface SleepService{
	
	@WebMethod String getSleepInfo(int wakeUp, int fallAsleep);
	
}