package com.wenhua.svr.domain;

import java.util.Date;

import com.wenhua.util.tools.DateUtils;

public class BarOnlineStatistic {

	private String barId;
	private String barName;
	private String approvalNum;
	private Integer computerNum;
	private Integer installedNum; // 新增，已安装终端, 页面上的"已安装终端" = BarOnlineStatistic.installedNum
	private String statDate= "";
    private Integer offlineNum = 0;
    private Integer onlineNum = 0;
    private Integer onlineNumToday = 0;
    private Integer onlineMaxToday = 0;
    private Integer onlineNumYsday = 0;
    private Integer onlineMaxYsday = 0;
    private Integer userNum = 0;
    private Integer userNumToday = 0;
    private Integer userMaxToday = 0;
    private Integer userNumYsday = 0;
    private Integer userMaxYsday = 0;
    private Integer poweronNum = 0;
    private Integer poweronNumToday = 0;
    private Integer poweronMaxToday = 0;
    private Integer poweronNumYsday = 0;
    private Integer poweronMaxYsday = 0;
    
    
	public String getBarId() {
		return barId;
	}
	public void setBarId(String barId) {
		this.barId = barId;
	}
	public String getBarName() {
		return barName;
	}
	public void setBarName(String barName) {
		this.barName = barName;
	}
	public String getStatDate() {
		return statDate;
	}
	public void setStatDate(String statDate) {
		this.statDate = statDate;
	}
	public Integer getOfflineNum() {
		return offlineNum;
	}
	public void setOfflineNum(Integer offlineNum) {
		this.offlineNum = offlineNum;
	}
	public Integer getOnlineNum() {
		return onlineNum;
	}
	public void setOnlineNum(Integer onlineNum) {
		this.onlineNum = onlineNum;
	}
	public Integer getOnlineNumToday() {
		return onlineNumToday;
	}
	public void setOnlineNumToday(Integer onlineNumToday) {
		this.onlineNumToday = onlineNumToday;
	}
	public Integer getOnlineMaxToday() {
		return onlineMaxToday;
	}
	public void setOnlineMaxToday(Integer onlineMaxToday) {
		this.onlineMaxToday = onlineMaxToday;
	}
	public Integer getOnlineNumYsday() {
		return onlineNumYsday;
	}
	public void setOnlineNumYsday(Integer onlineNumYsday) {
		this.onlineNumYsday = onlineNumYsday;
	}
	public Integer getOnlineMaxYsday() {
		return onlineMaxYsday;
	}
	public void setOnlineMaxYsday(Integer onlineMaxYsday) {
		this.onlineMaxYsday = onlineMaxYsday;
	}
	public Integer getUserNum() {
		return userNum;
	}
	public void setUserNum(Integer userNum) {
		this.userNum = userNum;
	}
	public Integer getUserNumToday() {
		return userNumToday;
	}
	public void setUserNumToday(Integer userNumToday) {
		this.userNumToday = userNumToday;
	}
	public Integer getUserMaxToday() {
		return userMaxToday;
	}
	public void setUserMaxToday(Integer userMaxToday) {
		this.userMaxToday = userMaxToday;
	}
	public Integer getUserNumYsday() {
		return userNumYsday;
	}
	public void setUserNumYsday(Integer userNumYsday) {
		this.userNumYsday = userNumYsday;
	}
	public Integer getUserMaxYsday() {
		return userMaxYsday;
	}
	public void setUserMaxYsday(Integer userMaxYsday) {
		this.userMaxYsday = userMaxYsday;
	}
	public Integer getPoweronNum() {
		return poweronNum;
	}
	public void setPoweronNum(Integer poweronNum) {
		this.poweronNum = poweronNum;
	}
	public Integer getPoweronNumToday() {
		return poweronNumToday;
	}
	public void setPoweronNumToday(Integer poweronNumToday) {
		this.poweronNumToday = poweronNumToday;
	}
	public Integer getPoweronMaxToday() {
		return poweronMaxToday;
	}
	public void setPoweronMaxToday(Integer poweronMaxToday) {
		this.poweronMaxToday = poweronMaxToday;
	}
	public Integer getPoweronNumYsday() {
		return poweronNumYsday;
	}
	public void setPoweronNumYsday(Integer poweronNumYsday) {
		this.poweronNumYsday = poweronNumYsday;
	}
	public Integer getPoweronMaxYsday() {
		return poweronMaxYsday;
	}
	public void setPoweronMaxYsday(Integer poweronMaxYsday) {
		this.poweronMaxYsday = poweronMaxYsday;
	}
	public String getApprovalNum() {
		return approvalNum;
	}
	public void setApprovalNum(String approvalNum) {
		this.approvalNum = approvalNum;
	}
	public Integer getComputerNum() {
		return computerNum;
	}
	public void setComputerNum(Integer computerNum) {
		this.computerNum = computerNum;
	}
	public Integer getInstalledNum() {
		return installedNum;
	}
	public void setInstalledNum(Integer installedNum) {
		this.installedNum = installedNum;
	}
    
    
	
	
	public void clearData(){
		String curDate=DateUtils.getString(new Date(), DateUtils.DATE_FORMAT);
		if(curDate.equals(this.getStatDate())){
			return;
		}else{
			offlineNum = 0;
			onlineNum = 0;
			onlineNumToday = 0;
			onlineMaxToday = 0;
			onlineNumYsday = 0;
			onlineMaxYsday = 0;
			userNum = 0;
			userNumToday = 0;
			userMaxToday = 0;
			userNumYsday = 0;
			userMaxYsday = 0;
			poweronNum = 0;
			poweronNumToday = 0;
			poweronMaxToday = 0;
			poweronNumYsday = 0;
			poweronMaxYsday = 0;
		}
	}
	
}
