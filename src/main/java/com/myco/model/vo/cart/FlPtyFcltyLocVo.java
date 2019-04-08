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
 * 参与方设施与位置关系
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
public class FlPtyFcltyLocVo implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private boolean isBlankObj = true;
    private static final Logger logger = Logger.getLogger(FlPtyFcltyLocVo.class);
    
    private Long id = null; // 主键    <id="flPtyFcltyLocVo_id" name="flPtyFcltyLocVo.id">
    private String idStr = null; // 主键    <id="flPtyFcltyLocVo_idStr" name="flPtyFcltyLocVo.idStr">
    private Long ptyFcltyId = null; // 相关方设施ID    <id="flPtyFcltyLocVo_ptyFcltyId" name="flPtyFcltyLocVo.ptyFcltyId">
    private String ptyFcltyCd = null; // 相关方设施代码    <id="flPtyFcltyLocVo_ptyFcltyCd" name="flPtyFcltyLocVo.ptyFcltyCd">
    private String ptyFcltyNmCn = null; // 相关方设施中文名    <id="flPtyFcltyLocVo_ptyFcltyNmCn" name="flPtyFcltyLocVo.ptyFcltyNmCn">
    private Long locId = null; // 位置ID    <id="flPtyFcltyLocVo_locId" name="flPtyFcltyLocVo.locId">
    private String locCd = null; // 位置CD    <id="flPtyFcltyLocVo_locCd" name="flPtyFcltyLocVo.locCd">
    private String locNmCn = null; // 位置中文名    <id="flPtyFcltyLocVo_locNmCn" name="flPtyFcltyLocVo.locNmCn">
    private String cd = null; // 代码，逻辑上标识一条记录，可重复。针对重复的记录，通过该记录的修订标识或状态标识进行区分。    <id="flPtyFcltyLocVo_cd" name="flPtyFcltyLocVo.cd">
    private String nmCn = null; // 中文名    <id="flPtyFcltyLocVo_nmCn" name="flPtyFcltyLocVo.nmCn">
    private String nmEn = null; // 英文名    <id="flPtyFcltyLocVo_nmEn" name="flPtyFcltyLocVo.nmEn">
    private String memo = null; // 描述    <id="flPtyFcltyLocVo_memo" name="flPtyFcltyLocVo.memo">
    private String catCd = null; // 分类代码    <id="flPtyFcltyLocVo_catCd" name="flPtyFcltyLocVo.catCd">
    private String catNmCn = null; // 分类中文名    <id="flPtyFcltyLocVo_catNmCn" name="flPtyFcltyLocVo.catNmCn">
    private String ctryCd = null; // 国家代码    <id="flPtyFcltyLocVo_ctryCd" name="flPtyFcltyLocVo.ctryCd">
    private String ctryNmCn = null; // 国家中文名    <id="flPtyFcltyLocVo_ctryNmCn" name="flPtyFcltyLocVo.ctryNmCn">
    private String stCd = null; // 省(州)代码    <id="flPtyFcltyLocVo_stCd" name="flPtyFcltyLocVo.stCd">
    private String stNmCn = null; // 省(州)中文名    <id="flPtyFcltyLocVo_stNmCn" name="flPtyFcltyLocVo.stNmCn">
    private String ctyCd = null; // 城市代码    <id="flPtyFcltyLocVo_ctyCd" name="flPtyFcltyLocVo.ctyCd">
    private String ctyNmCn = null; // 城市中文名    <id="flPtyFcltyLocVo_ctyNmCn" name="flPtyFcltyLocVo.ctyNmCn">
    private String distCd = null; // 区代码    <id="flPtyFcltyLocVo_distCd" name="flPtyFcltyLocVo.distCd">
    private String distNmCn = null; // 区中文名    <id="flPtyFcltyLocVo_distNmCn" name="flPtyFcltyLocVo.distNmCn">
    private String addrLine1 = null; // 地址1    <id="flPtyFcltyLocVo_addrLine1" name="flPtyFcltyLocVo.addrLine1">
    private String addrLine2 = null; // 地址2    <id="flPtyFcltyLocVo_addrLine2" name="flPtyFcltyLocVo.addrLine2">
    private String zipCd = null; // 邮政编码    <id="flPtyFcltyLocVo_zipCd" name="flPtyFcltyLocVo.zipCd">
    private String contcNm1 = null; // 联系人1    <id="flPtyFcltyLocVo_contcNm1" name="flPtyFcltyLocVo.contcNm1">
    private String contcNm2 = null; // 联系人2    <id="flPtyFcltyLocVo_contcNm2" name="flPtyFcltyLocVo.contcNm2">
    private String telephone1 = null; // 固定电话1    <id="flPtyFcltyLocVo_telephone1" name="flPtyFcltyLocVo.telephone1">
    private String telephone2 = null; // 固定电话2    <id="flPtyFcltyLocVo_telephone2" name="flPtyFcltyLocVo.telephone2">
    private String telephone3 = null; // 固定电话3    <id="flPtyFcltyLocVo_telephone3" name="flPtyFcltyLocVo.telephone3">
    private String mobilePhone1 = null; // 移动电话1    <id="flPtyFcltyLocVo_mobilePhone1" name="flPtyFcltyLocVo.mobilePhone1">
    private String mobilePhone2 = null; // 移动电话2    <id="flPtyFcltyLocVo_mobilePhone2" name="flPtyFcltyLocVo.mobilePhone2">
    private Timestamp vldFrom = null; // 生效开始时间    <id="flPtyFcltyLocVo_vldFrom" name="flPtyFcltyLocVo.vldFrom">
    private String vldFromStr = null; // 生效开始时间（多值）    <id="flPtyFcltyLocVo_vldFromStr" name="flPtyFcltyLocVo.vldFromStr">
    private Timestamp vldTo = null; // 生效截止时间    <id="flPtyFcltyLocVo_vldTo" name="flPtyFcltyLocVo.vldTo">
    private String vldToStr = null; // 生效截止时间（多值）    <id="flPtyFcltyLocVo_vldToStr" name="flPtyFcltyLocVo.vldToStr">
    private String statCd = null; // 状态代码    <id="flPtyFcltyLocVo_statCd" name="flPtyFcltyLocVo.statCd">
    private String statNmCn = null; // 状态中文名    <id="flPtyFcltyLocVo_statNmCn" name="flPtyFcltyLocVo.statNmCn">
    private Short viewOrd = null; // 显示顺序    <id="flPtyFcltyLocVo_viewOrd" name="flPtyFcltyLocVo.viewOrd">
    private Short logicOrd = null; // 逻辑顺序    <id="flPtyFcltyLocVo_logicOrd" name="flPtyFcltyLocVo.logicOrd">
    private Timestamp crtTm = null; // 创建时间    <id="flPtyFcltyLocVo_crtTm" name="flPtyFcltyLocVo.crtTm">
    private String crtTmStr = null; // 创建时间（多值）    <id="flPtyFcltyLocVo_crtTmStr" name="flPtyFcltyLocVo.crtTmStr">
    private String crtBy = null; // 创建人    <id="flPtyFcltyLocVo_crtBy" name="flPtyFcltyLocVo.crtBy">
    private Timestamp updTm = null; // 更新时间    <id="flPtyFcltyLocVo_updTm" name="flPtyFcltyLocVo.updTm">
    private String updTmStr = null; // 更新时间（多值）    <id="flPtyFcltyLocVo_updTmStr" name="flPtyFcltyLocVo.updTmStr">
    private String updBy = null; // 更新人    <id="flPtyFcltyLocVo_updBy" name="flPtyFcltyLocVo.updBy">
    private String editFlag = null; // 编辑标识，“删除”代表逻辑删除    <id="flPtyFcltyLocVo_editFlag" name="flPtyFcltyLocVo.editFlag">
    private String relsNbr = null; // 发布版本标识    <id="flPtyFcltyLocVo_relsNbr" name="flPtyFcltyLocVo.relsNbr">

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public FlPtyFcltyLocVo newEmptyCopy() {
        FlPtyFcltyLocVo newFlPtyFcltyLocVo = new FlPtyFcltyLocVo();
        newFlPtyFcltyLocVo.setId(this.id);
        newFlPtyFcltyLocVo.setVldFrom(this.vldFrom);
        newFlPtyFcltyLocVo.setVldTo(this.vldTo);
        newFlPtyFcltyLocVo.setCrtTm(this.crtTm);
        newFlPtyFcltyLocVo.setUpdTm(this.updTm);
        newFlPtyFcltyLocVo.setEditFlag(this.editFlag);
        newFlPtyFcltyLocVo.setRelsNbr(this.relsNbr);
        return newFlPtyFcltyLocVo;
    }

    public void setId(Long id) {
        isBlankObj = false;
        this.id = id;
    }

    public Long getId() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"id\">");
        return id;
    }
    
    public void setIdStr(String idStr) {
        isBlankObj = false;
        this.idStr = idStr;
    }

    public String getIdStr() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"idStr\">");
        return idStr;
    }
    
    public void setPtyFcltyId(Long ptyFcltyId) {
        isBlankObj = false;
        this.ptyFcltyId = ptyFcltyId;
    }

    public Long getPtyFcltyId() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"ptyFcltyId\">");
        return ptyFcltyId;
    }
    
    public void setPtyFcltyCd(String ptyFcltyCd) {
        isBlankObj = false;
        this.ptyFcltyCd = ptyFcltyCd;
    }

    public String getPtyFcltyCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"ptyFcltyCd\">");
        return ptyFcltyCd;
    }
    
    public void setPtyFcltyNmCn(String ptyFcltyNmCn) {
        isBlankObj = false;
        this.ptyFcltyNmCn = ptyFcltyNmCn;
    }

    public String getPtyFcltyNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"ptyFcltyNmCn\">");
        return ptyFcltyNmCn;
    }
    
    public void setLocId(Long locId) {
        isBlankObj = false;
        this.locId = locId;
    }

    public Long getLocId() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"locId\">");
        return locId;
    }
    
    public void setLocCd(String locCd) {
        isBlankObj = false;
        this.locCd = locCd;
    }

    public String getLocCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"locCd\">");
        return locCd;
    }
    
    public void setLocNmCn(String locNmCn) {
        isBlankObj = false;
        this.locNmCn = locNmCn;
    }

    public String getLocNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"locNmCn\">");
        return locNmCn;
    }
    
    public void setCd(String cd) {
        isBlankObj = false;
        this.cd = cd;
    }

    public String getCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"cd\">");
        return cd;
    }
    
    public void setNmCn(String nmCn) {
        isBlankObj = false;
        this.nmCn = nmCn;
    }

    public String getNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"nmCn\">");
        return nmCn;
    }
    
    public void setNmEn(String nmEn) {
        isBlankObj = false;
        this.nmEn = nmEn;
    }

    public String getNmEn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"nmEn\">");
        return nmEn;
    }
    
    public void setMemo(String memo) {
        isBlankObj = false;
        this.memo = memo;
    }

    public String getMemo() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"memo\">");
        return memo;
    }
    
    public void setCatCd(String catCd) {
        isBlankObj = false;
        this.catCd = catCd;
    }

    public String getCatCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"catCd\">");
        return catCd;
    }
    
    public void setCatNmCn(String catNmCn) {
        isBlankObj = false;
        this.catNmCn = catNmCn;
    }

    public String getCatNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"catNmCn\">");
        return catNmCn;
    }
    
    public void setCtryCd(String ctryCd) {
        isBlankObj = false;
        this.ctryCd = ctryCd;
    }

    public String getCtryCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"ctryCd\">");
        return ctryCd;
    }
    
    public void setCtryNmCn(String ctryNmCn) {
        isBlankObj = false;
        this.ctryNmCn = ctryNmCn;
    }

    public String getCtryNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"ctryNmCn\">");
        return ctryNmCn;
    }
    
    public void setStCd(String stCd) {
        isBlankObj = false;
        this.stCd = stCd;
    }

    public String getStCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"stCd\">");
        return stCd;
    }
    
    public void setStNmCn(String stNmCn) {
        isBlankObj = false;
        this.stNmCn = stNmCn;
    }

    public String getStNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"stNmCn\">");
        return stNmCn;
    }
    
    public void setCtyCd(String ctyCd) {
        isBlankObj = false;
        this.ctyCd = ctyCd;
    }

    public String getCtyCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"ctyCd\">");
        return ctyCd;
    }
    
    public void setCtyNmCn(String ctyNmCn) {
        isBlankObj = false;
        this.ctyNmCn = ctyNmCn;
    }

    public String getCtyNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"ctyNmCn\">");
        return ctyNmCn;
    }
    
    public void setDistCd(String distCd) {
        isBlankObj = false;
        this.distCd = distCd;
    }

    public String getDistCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"distCd\">");
        return distCd;
    }
    
    public void setDistNmCn(String distNmCn) {
        isBlankObj = false;
        this.distNmCn = distNmCn;
    }

    public String getDistNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"distNmCn\">");
        return distNmCn;
    }
    
    public void setAddrLine1(String addrLine1) {
        isBlankObj = false;
        this.addrLine1 = addrLine1;
    }

    public String getAddrLine1() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"addrLine1\">");
        return addrLine1;
    }
    
    public void setAddrLine2(String addrLine2) {
        isBlankObj = false;
        this.addrLine2 = addrLine2;
    }

    public String getAddrLine2() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"addrLine2\">");
        return addrLine2;
    }
    
    public void setZipCd(String zipCd) {
        isBlankObj = false;
        this.zipCd = zipCd;
    }

    public String getZipCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"zipCd\">");
        return zipCd;
    }
    
    public void setContcNm1(String contcNm1) {
        isBlankObj = false;
        this.contcNm1 = contcNm1;
    }

    public String getContcNm1() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"contcNm1\">");
        return contcNm1;
    }
    
    public void setContcNm2(String contcNm2) {
        isBlankObj = false;
        this.contcNm2 = contcNm2;
    }

    public String getContcNm2() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"contcNm2\">");
        return contcNm2;
    }
    
    public void setTelephone1(String telephone1) {
        isBlankObj = false;
        this.telephone1 = telephone1;
    }

    public String getTelephone1() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"telephone1\">");
        return telephone1;
    }
    
    public void setTelephone2(String telephone2) {
        isBlankObj = false;
        this.telephone2 = telephone2;
    }

    public String getTelephone2() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"telephone2\">");
        return telephone2;
    }
    
    public void setTelephone3(String telephone3) {
        isBlankObj = false;
        this.telephone3 = telephone3;
    }

    public String getTelephone3() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"telephone3\">");
        return telephone3;
    }
    
    public void setMobilePhone1(String mobilePhone1) {
        isBlankObj = false;
        this.mobilePhone1 = mobilePhone1;
    }

    public String getMobilePhone1() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"mobilePhone1\">");
        return mobilePhone1;
    }
    
    public void setMobilePhone2(String mobilePhone2) {
        isBlankObj = false;
        this.mobilePhone2 = mobilePhone2;
    }

    public String getMobilePhone2() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"mobilePhone2\">");
        return mobilePhone2;
    }
    
    public void setVldFrom(Timestamp vldFrom) {
        isBlankObj = false;
        this.vldFrom = vldFrom;
    }

    public Timestamp getVldFrom() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"vldFrom\">");
        return vldFrom;
    }
    
    public void setVldFromStr(String vldFromStr) {
        isBlankObj = false;
        this.vldFromStr = vldFromStr;
    }

    public String getVldFromStr() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"vldFromStr\">");
        return vldFromStr;
    }
    
    public void setVldTo(Timestamp vldTo) {
        isBlankObj = false;
        this.vldTo = vldTo;
    }

    public Timestamp getVldTo() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"vldTo\">");
        return vldTo;
    }
    
    public void setVldToStr(String vldToStr) {
        isBlankObj = false;
        this.vldToStr = vldToStr;
    }

    public String getVldToStr() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"vldToStr\">");
        return vldToStr;
    }
    
    public void setStatCd(String statCd) {
        isBlankObj = false;
        this.statCd = statCd;
    }

    public String getStatCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"statCd\">");
        return statCd;
    }
    
    public void setStatNmCn(String statNmCn) {
        isBlankObj = false;
        this.statNmCn = statNmCn;
    }

    public String getStatNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"statNmCn\">");
        return statNmCn;
    }
    
    public void setViewOrd(Short viewOrd) {
        isBlankObj = false;
        this.viewOrd = viewOrd;
    }

    public Short getViewOrd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"viewOrd\">");
        return viewOrd;
    }
    
    public void setLogicOrd(Short logicOrd) {
        isBlankObj = false;
        this.logicOrd = logicOrd;
    }

    public Short getLogicOrd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"logicOrd\">");
        return logicOrd;
    }
    
    public void setCrtTm(Timestamp crtTm) {
        isBlankObj = false;
        this.crtTm = crtTm;
    }

    public Timestamp getCrtTm() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"crtTm\">");
        return crtTm;
    }
    
    public void setCrtTmStr(String crtTmStr) {
        isBlankObj = false;
        this.crtTmStr = crtTmStr;
    }

    public String getCrtTmStr() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"crtTmStr\">");
        return crtTmStr;
    }
    
    public void setCrtBy(String crtBy) {
        isBlankObj = false;
        this.crtBy = crtBy;
    }

    public String getCrtBy() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"crtBy\">");
        return crtBy;
    }
    
    public void setUpdTm(Timestamp updTm) {
        isBlankObj = false;
        this.updTm = updTm;
    }

    public Timestamp getUpdTm() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"updTm\">");
        return updTm;
    }
    
    public void setUpdTmStr(String updTmStr) {
        isBlankObj = false;
        this.updTmStr = updTmStr;
    }

    public String getUpdTmStr() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"updTmStr\">");
        return updTmStr;
    }
    
    public void setUpdBy(String updBy) {
        isBlankObj = false;
        this.updBy = updBy;
    }

    public String getUpdBy() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"updBy\">");
        return updBy;
    }
    
    public void setEditFlag(String editFlag) {
        isBlankObj = false;
        this.editFlag = editFlag;
    }

    public String getEditFlag() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"editFlag\">");
        return editFlag;
    }
    
    public void setRelsNbr(String relsNbr) {
        isBlankObj = false;
        this.relsNbr = relsNbr;
    }

    public String getRelsNbr() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyLocVo	<includedAttr name=\"relsNbr\">");
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
