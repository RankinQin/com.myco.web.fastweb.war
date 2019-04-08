/**************************************************************************************
 * 请不要编辑这个文件，在下一次脚本运行的时候，本文件内容将根据最新的数据模型和配置进行更新
 **************************************************************************************/
package com.myco.model.vo.cart;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import org.apache.log4j.Logger;

import com.myco.common.lang.CatSysCode;

/**
 * 位置
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
public class LcLocVo implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private boolean isBlankObj = true;
    private static final Logger logger = Logger.getLogger(LcLocVo.class);
    
    private Long id = null; // 主键    <id="lcLocVo_id" name="lcLocVo.id">
    private String idStr = null; // 主键    <id="lcLocVo_idStr" name="lcLocVo.idStr">
    private String cd = null; // 代码，逻辑上标识一条记录，可重复。针对重复的记录，通过该记录的修订标识或状态标识进行区分。    <id="lcLocVo_cd" name="lcLocVo.cd">
    private String nmCn = null; // 中文名，在通过百度解析导航地址的时候，存放的是百度返回的逆向解析的地址，为了提高地址的标准性。    <id="lcLocVo_nmCn" name="lcLocVo.nmCn">
    private String nmEn = null; // 英文名    <id="lcLocVo_nmEn" name="lcLocVo.nmEn">
    private String memo = null; // 描述    <id="lcLocVo_memo" name="lcLocVo.memo">
    private String catCd = null; // 分类代码    <id="lcLocVo_catCd" name="lcLocVo.catCd">
    private String catNmCn = null; // 分类中文名    <id="lcLocVo_catNmCn" name="lcLocVo.catNmCn">
    private String ctryCd = null; // 国家代码    <id="lcLocVo_ctryCd" name="lcLocVo.ctryCd">
    private String ctryNmCn = null; // 国家中文名    <id="lcLocVo_ctryNmCn" name="lcLocVo.ctryNmCn">
    private String stCd = null; // 省(州)代码    <id="lcLocVo_stCd" name="lcLocVo.stCd">
    private String stNmCn = null; // 省(州)中文名    <id="lcLocVo_stNmCn" name="lcLocVo.stNmCn">
    private String ctyCd = null; // 城市代码    <id="lcLocVo_ctyCd" name="lcLocVo.ctyCd">
    private String ctyNmCn = null; // 城市中文名    <id="lcLocVo_ctyNmCn" name="lcLocVo.ctyNmCn">
    private String distCd = null; // 区代码    <id="lcLocVo_distCd" name="lcLocVo.distCd">
    private String distNmCn = null; // 区中文名    <id="lcLocVo_distNmCn" name="lcLocVo.distNmCn">
    private String townCd = null; // 乡镇（或街道）代码    <id="lcLocVo_townCd" name="lcLocVo.townCd">
    private String townNmCn = null; // 乡镇（或街道）中文名    <id="lcLocVo_townNmCn" name="lcLocVo.townNmCn">
    private String strCd = null; // 街道门牌号    <id="lcLocVo_strCd" name="lcLocVo.strCd">
    private String strNmCn = null; // 街道中文名    <id="lcLocVo_strNmCn" name="lcLocVo.strNmCn">
    private String addrLine1 = null; // 地址1    <id="lcLocVo_addrLine1" name="lcLocVo.addrLine1">
    private String addrLine2 = null; // 地址2    <id="lcLocVo_addrLine2" name="lcLocVo.addrLine2">
    private String addrLine3 = null; // 地址3    <id="lcLocVo_addrLine3" name="lcLocVo.addrLine3">
    private String addrLine4 = null; // 地址4    <id="lcLocVo_addrLine4" name="lcLocVo.addrLine4">
    private String zipCd = null; // 邮政编码    <id="lcLocVo_zipCd" name="lcLocVo.zipCd">
    private String contcNm1 = null; // 联系人1    <id="lcLocVo_contcNm1" name="lcLocVo.contcNm1">
    private String contcNm2 = null; // 联系人2    <id="lcLocVo_contcNm2" name="lcLocVo.contcNm2">
    private String telephone1 = null; // 固定电话1    <id="lcLocVo_telephone1" name="lcLocVo.telephone1">
    private String telephone2 = null; // 固定电话2    <id="lcLocVo_telephone2" name="lcLocVo.telephone2">
    private String mobilePhone1 = null; // 移动电话1    <id="lcLocVo_mobilePhone1" name="lcLocVo.mobilePhone1">
    private String mobilePhone2 = null; // 移动电话2    <id="lcLocVo_mobilePhone2" name="lcLocVo.mobilePhone2">
    private String fax1 = null; // 传真号1    <id="lcLocVo_fax1" name="lcLocVo.fax1">
    private String fax2 = null; // 传真号2    <id="lcLocVo_fax2" name="lcLocVo.fax2">
    private String email1 = null; // Email地址1    <id="lcLocVo_email1" name="lcLocVo.email1">
    private String email2 = null; // Email地址2    <id="lcLocVo_email2" name="lcLocVo.email2">
    private String wechat = null; // 微信    <id="lcLocVo_wechat" name="lcLocVo.wechat">
    private String qq = null; // QQ号    <id="lcLocVo_qq" name="lcLocVo.qq">
    private String webSite = null; // 网址    <id="lcLocVo_webSite" name="lcLocVo.webSite">
    private String statCd = null; // 状态代码    <id="lcLocVo_statCd" name="lcLocVo.statCd">
    private String statNmCn = null; // 状态中文名    <id="lcLocVo_statNmCn" name="lcLocVo.statNmCn">
    private Short viewOrd = null; // 显示顺序    <id="lcLocVo_viewOrd" name="lcLocVo.viewOrd">
    private Short logicOrd = null; // 逻辑顺序    <id="lcLocVo_logicOrd" name="lcLocVo.logicOrd">
    private Timestamp crtTm = null; // 创建时间    <id="lcLocVo_crtTm" name="lcLocVo.crtTm">
    private String crtTmStr = null; // 创建时间（多值）    <id="lcLocVo_crtTmStr" name="lcLocVo.crtTmStr">
    private String crtBy = null; // 创建人    <id="lcLocVo_crtBy" name="lcLocVo.crtBy">
    private Timestamp updTm = null; // 更新时间    <id="lcLocVo_updTm" name="lcLocVo.updTm">
    private String updTmStr = null; // 更新时间（多值）    <id="lcLocVo_updTmStr" name="lcLocVo.updTmStr">
    private String updBy = null; // 更新人    <id="lcLocVo_updBy" name="lcLocVo.updBy">
    private String editFlag = null; // 编辑标识，“删除”代表逻辑删除    <id="lcLocVo_editFlag" name="lcLocVo.editFlag">
    private String syncFlag = null; // 同步标志    <id="lcLocVo_syncFlag" name="lcLocVo.syncFlag">
    private String relsNbr = null; // 发布版本标识    <id="lcLocVo_relsNbr" name="lcLocVo.relsNbr">

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public LcLocVo newEmptyCopy() {
        LcLocVo newLcLocVo = new LcLocVo();
        newLcLocVo.setId(this.id);
        newLcLocVo.setCrtTm(this.crtTm);
        newLcLocVo.setUpdTm(this.updTm);
        newLcLocVo.setEditFlag(this.editFlag);
        newLcLocVo.setRelsNbr(this.relsNbr);
        return newLcLocVo;
    }

    public void setId(Long id) {
        isBlankObj = false;
        this.id = id;
    }

    public Long getId() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"id\">");
        return id;
    }
    
    public void setIdStr(String idStr) {
        isBlankObj = false;
        this.idStr = idStr;
    }

    public String getIdStr() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"idStr\">");
        return idStr;
    }
    
    public void setCd(String cd) {
        isBlankObj = false;
        this.cd = cd;
    }

    public String getCd() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"cd\">");
        return cd;
    }
    
    public void setNmCn(String nmCn) {
        isBlankObj = false;
        this.nmCn = nmCn;
    }

    public String getNmCn() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"nmCn\">");
        return nmCn;
    }
    
    public void setNmEn(String nmEn) {
        isBlankObj = false;
        this.nmEn = nmEn;
    }

    public String getNmEn() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"nmEn\">");
        return nmEn;
    }
    
    public void setMemo(String memo) {
        isBlankObj = false;
        this.memo = memo;
    }

    public String getMemo() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"memo\">");
        return memo;
    }
    
    public void setCatCd(String catCd) {
        isBlankObj = false;
        this.catCd = catCd;
    }

    public String getCatCd() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"catCd\">");
        return catCd;
    }
    
    public void setCatNmCn(String catNmCn) {
        isBlankObj = false;
        this.catNmCn = catNmCn;
    }

    public String getCatNmCn() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"catNmCn\">");
        return catNmCn;
    }
    
    public void setCtryCd(String ctryCd) {
        isBlankObj = false;
        this.ctryCd = ctryCd;
    }

    public String getCtryCd() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"ctryCd\">");
        return ctryCd;
    }
    
    public void setCtryNmCn(String ctryNmCn) {
        isBlankObj = false;
        this.ctryNmCn = ctryNmCn;
    }

    public String getCtryNmCn() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"ctryNmCn\">");
        return ctryNmCn;
    }
    
    public void setStCd(String stCd) {
        isBlankObj = false;
        this.stCd = stCd;
    }

    public String getStCd() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"stCd\">");
        return stCd;
    }
    
    public void setStNmCn(String stNmCn) {
        isBlankObj = false;
        this.stNmCn = stNmCn;
    }

    public String getStNmCn() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"stNmCn\">");
        return stNmCn;
    }
    
    public void setCtyCd(String ctyCd) {
        isBlankObj = false;
        this.ctyCd = ctyCd;
    }

    public String getCtyCd() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"ctyCd\">");
        return ctyCd;
    }
    
    public void setCtyNmCn(String ctyNmCn) {
        isBlankObj = false;
        this.ctyNmCn = ctyNmCn;
    }

    public String getCtyNmCn() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"ctyNmCn\">");
        return ctyNmCn;
    }
    
    public void setDistCd(String distCd) {
        isBlankObj = false;
        this.distCd = distCd;
    }

    public String getDistCd() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"distCd\">");
        return distCd;
    }
    
    public void setDistNmCn(String distNmCn) {
        isBlankObj = false;
        this.distNmCn = distNmCn;
    }

    public String getDistNmCn() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"distNmCn\">");
        return distNmCn;
    }
    
    public void setTownCd(String townCd) {
        isBlankObj = false;
        this.townCd = townCd;
    }

    public String getTownCd() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"townCd\">");
        return townCd;
    }
    
    public void setTownNmCn(String townNmCn) {
        isBlankObj = false;
        this.townNmCn = townNmCn;
    }

    public String getTownNmCn() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"townNmCn\">");
        return townNmCn;
    }
    
    public void setStrCd(String strCd) {
        isBlankObj = false;
        this.strCd = strCd;
    }

    public String getStrCd() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"strCd\">");
        return strCd;
    }
    
    public void setStrNmCn(String strNmCn) {
        isBlankObj = false;
        this.strNmCn = strNmCn;
    }

    public String getStrNmCn() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"strNmCn\">");
        return strNmCn;
    }
    
    public void setAddrLine1(String addrLine1) {
        isBlankObj = false;
        this.addrLine1 = addrLine1;
    }

    public String getAddrLine1() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"addrLine1\">");
        return addrLine1;
    }
    
    public void setAddrLine2(String addrLine2) {
        isBlankObj = false;
        this.addrLine2 = addrLine2;
    }

    public String getAddrLine2() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"addrLine2\">");
        return addrLine2;
    }
    
    public void setAddrLine3(String addrLine3) {
        isBlankObj = false;
        this.addrLine3 = addrLine3;
    }

    public String getAddrLine3() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"addrLine3\">");
        return addrLine3;
    }
    
    public void setAddrLine4(String addrLine4) {
        isBlankObj = false;
        this.addrLine4 = addrLine4;
    }

    public String getAddrLine4() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"addrLine4\">");
        return addrLine4;
    }
    
    public void setZipCd(String zipCd) {
        isBlankObj = false;
        this.zipCd = zipCd;
    }

    public String getZipCd() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"zipCd\">");
        return zipCd;
    }
    
    public void setContcNm1(String contcNm1) {
        isBlankObj = false;
        this.contcNm1 = contcNm1;
    }

    public String getContcNm1() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"contcNm1\">");
        return contcNm1;
    }
    
    public void setContcNm2(String contcNm2) {
        isBlankObj = false;
        this.contcNm2 = contcNm2;
    }

    public String getContcNm2() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"contcNm2\">");
        return contcNm2;
    }
    
    public void setTelephone1(String telephone1) {
        isBlankObj = false;
        this.telephone1 = telephone1;
    }

    public String getTelephone1() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"telephone1\">");
        return telephone1;
    }
    
    public void setTelephone2(String telephone2) {
        isBlankObj = false;
        this.telephone2 = telephone2;
    }

    public String getTelephone2() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"telephone2\">");
        return telephone2;
    }
    
    public void setMobilePhone1(String mobilePhone1) {
        isBlankObj = false;
        this.mobilePhone1 = mobilePhone1;
    }

    public String getMobilePhone1() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"mobilePhone1\">");
        return mobilePhone1;
    }
    
    public void setMobilePhone2(String mobilePhone2) {
        isBlankObj = false;
        this.mobilePhone2 = mobilePhone2;
    }

    public String getMobilePhone2() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"mobilePhone2\">");
        return mobilePhone2;
    }
    
    public void setFax1(String fax1) {
        isBlankObj = false;
        this.fax1 = fax1;
    }

    public String getFax1() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"fax1\">");
        return fax1;
    }
    
    public void setFax2(String fax2) {
        isBlankObj = false;
        this.fax2 = fax2;
    }

    public String getFax2() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"fax2\">");
        return fax2;
    }
    
    public void setEmail1(String email1) {
        isBlankObj = false;
        this.email1 = email1;
    }

    public String getEmail1() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"email1\">");
        return email1;
    }
    
    public void setEmail2(String email2) {
        isBlankObj = false;
        this.email2 = email2;
    }

    public String getEmail2() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"email2\">");
        return email2;
    }
    
    public void setWechat(String wechat) {
        isBlankObj = false;
        this.wechat = wechat;
    }

    public String getWechat() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"wechat\">");
        return wechat;
    }
    
    public void setQq(String qq) {
        isBlankObj = false;
        this.qq = qq;
    }

    public String getQq() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"qq\">");
        return qq;
    }
    
    public void setWebSite(String webSite) {
        isBlankObj = false;
        this.webSite = webSite;
    }

    public String getWebSite() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"webSite\">");
        return webSite;
    }
    
    public void setStatCd(String statCd) {
        isBlankObj = false;
        this.statCd = statCd;
    }

    public String getStatCd() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"statCd\">");
        return statCd;
    }
    
    public void setStatNmCn(String statNmCn) {
        isBlankObj = false;
        this.statNmCn = statNmCn;
    }

    public String getStatNmCn() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"statNmCn\">");
        return statNmCn;
    }
    
    public void setViewOrd(Short viewOrd) {
        isBlankObj = false;
        this.viewOrd = viewOrd;
    }

    public Short getViewOrd() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"viewOrd\">");
        return viewOrd;
    }
    
    public void setLogicOrd(Short logicOrd) {
        isBlankObj = false;
        this.logicOrd = logicOrd;
    }

    public Short getLogicOrd() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"logicOrd\">");
        return logicOrd;
    }
    
    public void setCrtTm(Timestamp crtTm) {
        isBlankObj = false;
        this.crtTm = crtTm;
    }

    public Timestamp getCrtTm() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"crtTm\">");
        return crtTm;
    }
    
    public void setCrtTmStr(String crtTmStr) {
        isBlankObj = false;
        this.crtTmStr = crtTmStr;
    }

    public String getCrtTmStr() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"crtTmStr\">");
        return crtTmStr;
    }
    
    public void setCrtBy(String crtBy) {
        isBlankObj = false;
        this.crtBy = crtBy;
    }

    public String getCrtBy() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"crtBy\">");
        return crtBy;
    }
    
    public void setUpdTm(Timestamp updTm) {
        isBlankObj = false;
        this.updTm = updTm;
    }

    public Timestamp getUpdTm() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"updTm\">");
        return updTm;
    }
    
    public void setUpdTmStr(String updTmStr) {
        isBlankObj = false;
        this.updTmStr = updTmStr;
    }

    public String getUpdTmStr() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"updTmStr\">");
        return updTmStr;
    }
    
    public void setUpdBy(String updBy) {
        isBlankObj = false;
        this.updBy = updBy;
    }

    public String getUpdBy() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"updBy\">");
        return updBy;
    }
    
    public void setEditFlag(String editFlag) {
        isBlankObj = false;
        this.editFlag = editFlag;
    }

    public String getEditFlag() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"editFlag\">");
        return editFlag;
    }
    
    public void setSyncFlag(String syncFlag) {
        isBlankObj = false;
        this.syncFlag = syncFlag;
    }

    public String getSyncFlag() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"syncFlag\">");
        return syncFlag;
    }
    
    public void setRelsNbr(String relsNbr) {
        isBlankObj = false;
        this.relsNbr = relsNbr;
    }

    public String getRelsNbr() {
        logger.trace("com.myco.model.vo.cart.LcLocVo	<includedAttr name=\"relsNbr\">");
        return relsNbr;
    }
    
    // 当出现catCd、statCd、rsnCd，且后续紧跟NmCn或NmEn，增加以枚举类为参数的快速调用，用以同时设置cd和配套的nm 
    public void setCatCd(CatSysCode catSysCode) {
        this.catCd = catSysCode.cd();
        this.catNmCn = catSysCode.nmCn();
    }
    
    // 当出现catCd、statCd、rsnCd，且后续紧跟NmCn或NmEn，增加以枚举类为参数的快速调用，用以同时设置cd和配套的nm 
    public void setStatCd(CatSysCode catSysCode) {
        this.statCd = catSysCode.cd();
        this.statNmCn = catSysCode.nmCn();
    }
    
    public boolean isBlankObj() {
        return this.isBlankObj;
    }
    
}
