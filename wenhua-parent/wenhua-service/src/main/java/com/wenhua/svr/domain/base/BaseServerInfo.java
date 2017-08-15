package com.wenhua.svr.domain.base;

import com.wenhua.svr.base.domain.AbstractEntity;

import java.util.Date;

public class BaseServerInfo extends AbstractEntity<Integer, BaseServerInfo> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private String barId;
    private String mac;
    private String ip;

    private String pcName;
    /** 操作系统类型 0-windows, 1-macos, 2-android, 3-linux */
    private Integer osType;

    private String osVersion;
    
    private String wenhuaVer;

    private String creator;

    private Date createTime;
    
    private Integer installedNum;

    private Integer isValid;

    public Integer getId() {
        return super.getId();
    }

    public void setId(Integer id) {
        super.setId(id);
    }

    public String getBarId() {
        return barId;
    }

    public void setBarId(String barId) {
        this.barId = barId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    public Integer getOsType() {
        return osType;
    }

    public void setOsType(Integer osType) {
        this.osType = osType;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public String getWenhuaVer() {
		return wenhuaVer;
	}

	public void setWenhuaVer(String wenhuaVer) {
		this.wenhuaVer = wenhuaVer;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public Integer getInstalledNum() {
		return installedNum;
	}

	public void setInstalledNum(Integer installedNum) {
		this.installedNum = installedNum;
	}

	public Integer getIsValid() {
		return isValid;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}
    
}