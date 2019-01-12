package com.yolo.application.model;

public class Sleep {
	private int fallAsleep;
	private int wakeUp;
	private String sleepAnalysisMessage;
	
	public int getFallAsleep() {
		return fallAsleep;
	}
	public void setFallAsleep(int fallAsleep) {
		this.fallAsleep = fallAsleep;
	}
	public int getWakeUp() {
		return wakeUp;
	}
	public void setWakeUp(int wakeUp) {
		this.wakeUp = wakeUp;
	}
	public String getSleepAnalysisMessage() {
		return sleepAnalysisMessage;
	}
	public void setSleepAnalysisMessage(String sleepAnalysisMessage) {
		this.sleepAnalysisMessage = sleepAnalysisMessage;
	}

}
