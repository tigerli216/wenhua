package com.wenhua.server.vo;

public class StatBarVo {

	private String barId;

	private String barName;
	private String approvalNum;
	private Integer computerNum;
	private Integer isdeployed;
	private Integer isOnline;//是否在线 1-是 0-否
	
	private int online;//在线终端数

	private int offline;//离线终端数

	private int valid;

	private String serverVersion;
	
	private int onlineNumToday;//今日累计在线
	private int onlineNumYsday; //昨日累计在线


	public static StatBarVo newOne(String barId, String barName,String approvalNum,Integer computerNum,Integer isdeployed,Integer isOnline, int online, int offline, int valid, String serverVersion) {
		StatBarVo vo = new StatBarVo();
		vo.setBarId(barId);
		vo.setBarName(barName);
		vo.setApprovalNum(approvalNum);
		vo.setComputerNum(computerNum);
		vo.setIsOnline(isOnline);
		vo.setIsdeployed(isdeployed);
		vo.setOnline(online);
		vo.setOffline(offline);
		vo.setValid(valid);
		vo.setServerVersion(serverVersion);
		return vo;
	}
	
	public static StatBarVo newOne(String barId, String barName,String approvalNum,Integer computerNum,Integer isdeployed,Integer isOnline, int online, int offline, int onlineNumToday, int onlineNumYsday) {
		StatBarVo vo = new StatBarVo();
		vo.setBarId(barId);
		vo.setBarName(barName);
		vo.setApprovalNum(approvalNum);
		vo.setComputerNum(computerNum);
		vo.setIsdeployed(isdeployed);
		vo.setIsOnline(isOnline);
		vo.setOnline(online);
		vo.setOffline(offline);
		vo.setOnlineNumToday(onlineNumToday);
		vo.setOnlineNumYsday(onlineNumYsday);
		return vo;
	}
	
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

	public int getOnline() {
		return online;
	}

	public void setOnline(int online) {
		this.online = online;
	}

	public int getOffline() {
		return offline;
	}

	public void setOffline(int offline) {
		this.offline = offline;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

	public String getServerVersion() {
		return serverVersion;
	}

	public void setServerVersion(String serverVersion) {
		this.serverVersion = serverVersion;
	}

	public int getOnlineNumToday() {
		return onlineNumToday;
	}

	public void setOnlineNumToday(int onlineNumToday) {
		this.onlineNumToday = onlineNumToday;
	}

	public int getOnlineNumYsday() {
		return onlineNumYsday;
	}

	public void setOnlineNumYsday(int onlineNumYsday) {
		this.onlineNumYsday = onlineNumYsday;
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

	public Integer getIsdeployed() {
		return isdeployed;
	}

	public void setIsdeployed(Integer isdeployed) {
		this.isdeployed = isdeployed;
	}

	public Integer getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(Integer isOnline) {
		this.isOnline = isOnline;
	}

}
