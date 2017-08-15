package com.wenhua.svr.thread.impl;

import com.wenhua.svr.domain.ServerInfo;
import com.wenhua.svr.enums.BusinessTypeEnum;
import com.wenhua.svr.service.AuthService;
import com.wenhua.svr.thread.AbstractThread;

public class BarStatisticHandleThread extends AbstractThread {
	
	private AuthService authService;
	private BusinessTypeEnum  businessType;
	private Object data;

	public BarStatisticHandleThread(AuthService authService,BusinessTypeEnum businessType,Object data){
		this.authService=authService;
		this.businessType=businessType;
		this.data=data;
	}
	
	
	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		switch (businessType) {
		case ServerInfoUpdate: //update server_info
			ServerInfo info=(ServerInfo)data;
			this.authService.updateServerInfo(info);
			break;

		default:
			break;
		}

	}

}
