package com.pinyougou.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private Integer agentId;

    private String username;

    private String password;

    private String telephoneNum;

    private String telephonePwd;

    private String name;

    private Byte gender;

    private String identityNum;

    private String picture;

    private Byte callPattern;

    private String exteriorPhone;

    private Integer groupId;

    private Boolean autoAnswer;

    private Boolean userStatus;

    private Boolean status;

    private String phoneNum;

    private String avatar;

    private String email;

    private String lastLoginIp;

    private Boolean isOnline;

    private String address;

    private Date utime;

    private Date ctime;

    private Integer isUseDialpad;

    private Integer type;

    private Integer isFirstLogin;

    private String token;

    private Byte isAutoCall;

    private String staffId;

    private String loginip;

    private Byte isVerify;

    private String verifaceAddress;

    private Byte isFaceCollect;

    private Byte faceAudit;

    private Date loginTime;

    private Integer pAgentid;

    private Integer provinceid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum == null ? null : telephoneNum.trim();
    }

    public String getTelephonePwd() {
        return telephonePwd;
    }

    public void setTelephonePwd(String telephonePwd) {
        this.telephonePwd = telephonePwd == null ? null : telephonePwd.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum == null ? null : identityNum.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Byte getCallPattern() {
        return callPattern;
    }

    public void setCallPattern(Byte callPattern) {
        this.callPattern = callPattern;
    }

    public String getExteriorPhone() {
        return exteriorPhone;
    }

    public void setExteriorPhone(String exteriorPhone) {
        this.exteriorPhone = exteriorPhone == null ? null : exteriorPhone.trim();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Boolean getAutoAnswer() {
        return autoAnswer;
    }

    public void setAutoAnswer(Boolean autoAnswer) {
        this.autoAnswer = autoAnswer;
    }

    public Boolean getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Boolean userStatus) {
        this.userStatus = userStatus;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getIsUseDialpad() {
        return isUseDialpad;
    }

    public void setIsUseDialpad(Integer isUseDialpad) {
        this.isUseDialpad = isUseDialpad;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsFirstLogin() {
        return isFirstLogin;
    }

    public void setIsFirstLogin(Integer isFirstLogin) {
        this.isFirstLogin = isFirstLogin;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Byte getIsAutoCall() {
        return isAutoCall;
    }

    public void setIsAutoCall(Byte isAutoCall) {
        this.isAutoCall = isAutoCall;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public Byte getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(Byte isVerify) {
        this.isVerify = isVerify;
    }

    public String getVerifaceAddress() {
        return verifaceAddress;
    }

    public void setVerifaceAddress(String verifaceAddress) {
        this.verifaceAddress = verifaceAddress == null ? null : verifaceAddress.trim();
    }

    public Byte getIsFaceCollect() {
        return isFaceCollect;
    }

    public void setIsFaceCollect(Byte isFaceCollect) {
        this.isFaceCollect = isFaceCollect;
    }

    public Byte getFaceAudit() {
        return faceAudit;
    }

    public void setFaceAudit(Byte faceAudit) {
        this.faceAudit = faceAudit;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getpAgentid() {
        return pAgentid;
    }

    public void setpAgentid(Integer pAgentid) {
        this.pAgentid = pAgentid;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }
}