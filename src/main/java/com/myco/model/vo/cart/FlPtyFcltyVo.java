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
 * 参与方与设施间关系，可以用来表示多个PTY共享FCLTY的情况。
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
public class FlPtyFcltyVo implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private boolean isBlankObj = true;
    private static final Logger logger = Logger.getLogger(FlPtyFcltyVo.class);
    
    private Long id = null; // 主键    <id="flPtyFcltyVo_id" name="flPtyFcltyVo.id">
    private String idStr = null; // 主键    <id="flPtyFcltyVo_idStr" name="flPtyFcltyVo.idStr">
    private Long ptyId = null; // 参与方ID    <id="flPtyFcltyVo_ptyId" name="flPtyFcltyVo.ptyId">
    private String ptyCd = null; // 参与方代码    <id="flPtyFcltyVo_ptyCd" name="flPtyFcltyVo.ptyCd">
    private String ptyNmCn = null; // 参与方中文名    <id="flPtyFcltyVo_ptyNmCn" name="flPtyFcltyVo.ptyNmCn">
    private Long fcltyId = null; // 设施ID    <id="flPtyFcltyVo_fcltyId" name="flPtyFcltyVo.fcltyId">
    private String fcltyCd = null; // 设施代码    <id="flPtyFcltyVo_fcltyCd" name="flPtyFcltyVo.fcltyCd">
    private String fcltyNmCn = null; // 设施名称    <id="flPtyFcltyVo_fcltyNmCn" name="flPtyFcltyVo.fcltyNmCn">
    private String fcltyCatCd = null; // 设施分类代码    <id="flPtyFcltyVo_fcltyCatCd" name="flPtyFcltyVo.fcltyCatCd">
    private String fcltyCatNmCn = null; // 设施分类中文名    <id="flPtyFcltyVo_fcltyCatNmCn" name="flPtyFcltyVo.fcltyCatNmCn">
    private String cd = null; // 未经平台标准化的、专属于某个PTY的代码。    <id="flPtyFcltyVo_cd" name="flPtyFcltyVo.cd">
    private String nmCn = null; // 未经平台标准化的、专属于某个PTY的中文名。    <id="flPtyFcltyVo_nmCn" name="flPtyFcltyVo.nmCn">
    private String nmEn = null; // 未经平台标准化的、专属于某个PTY的英文名。    <id="flPtyFcltyVo_nmEn" name="flPtyFcltyVo.nmEn">
    private String oprSpec = null; // 操作规范    <id="flPtyFcltyVo_oprSpec" name="flPtyFcltyVo.oprSpec">
    private String memo = null; // 描述    <id="flPtyFcltyVo_memo" name="flPtyFcltyVo.memo">
    private String catCd = null; // 分类代码    <id="flPtyFcltyVo_catCd" name="flPtyFcltyVo.catCd">
    private String catNmCn = null; // 分类中文名    <id="flPtyFcltyVo_catNmCn" name="flPtyFcltyVo.catNmCn">
    private Long ownerId = null; // 属主主键    <id="flPtyFcltyVo_ownerId" name="flPtyFcltyVo.ownerId">
    private String ownerCd = null; // 属主代码    <id="flPtyFcltyVo_ownerCd" name="flPtyFcltyVo.ownerCd">
    private String ownerNmCn = null; // 属主中文名    <id="flPtyFcltyVo_ownerNmCn" name="flPtyFcltyVo.ownerNmCn">
    private String ownerContcNm = null; // 属主联系人姓名    <id="flPtyFcltyVo_ownerContcNm" name="flPtyFcltyVo.ownerContcNm">
    private String ownerContcTel = null; // 属主联系人电话    <id="flPtyFcltyVo_ownerContcTel" name="flPtyFcltyVo.ownerContcTel">
    private Long drvrId = null; // 司机主键    <id="flPtyFcltyVo_drvrId" name="flPtyFcltyVo.drvrId">
    private String drvrCd = null; // 司机代码    <id="flPtyFcltyVo_drvrCd" name="flPtyFcltyVo.drvrCd">
    private String drvrNmCn = null; // 司机中文名    <id="flPtyFcltyVo_drvrNmCn" name="flPtyFcltyVo.drvrNmCn">
    private Timestamp vldFrom = null; // 生效开始时间    <id="flPtyFcltyVo_vldFrom" name="flPtyFcltyVo.vldFrom">
    private String vldFromStr = null; // 生效开始时间（多值）    <id="flPtyFcltyVo_vldFromStr" name="flPtyFcltyVo.vldFromStr">
    private Timestamp vldTo = null; // 生效截止时间    <id="flPtyFcltyVo_vldTo" name="flPtyFcltyVo.vldTo">
    private String vldToStr = null; // 生效截止时间（多值）    <id="flPtyFcltyVo_vldToStr" name="flPtyFcltyVo.vldToStr">
    private String statCd = null; // 状态代码    <id="flPtyFcltyVo_statCd" name="flPtyFcltyVo.statCd">
    private String statNmCn = null; // 状态中文名    <id="flPtyFcltyVo_statNmCn" name="flPtyFcltyVo.statNmCn">
    private Short viewOrd = null; // 显示顺序    <id="flPtyFcltyVo_viewOrd" name="flPtyFcltyVo.viewOrd">
    private Integer logicOrd = null; // 逻辑顺序    <id="flPtyFcltyVo_logicOrd" name="flPtyFcltyVo.logicOrd">
    private String prefFlag = null; // 参与方与设施的首选标志    <id="flPtyFcltyVo_prefFlag" name="flPtyFcltyVo.prefFlag">
    private Timestamp crtTm = null; // 创建时间    <id="flPtyFcltyVo_crtTm" name="flPtyFcltyVo.crtTm">
    private String crtTmStr = null; // 创建时间（多值）    <id="flPtyFcltyVo_crtTmStr" name="flPtyFcltyVo.crtTmStr">
    private String crtBy = null; // 创建人    <id="flPtyFcltyVo_crtBy" name="flPtyFcltyVo.crtBy">
    private String crtChlCd = null; // 创建渠道代码    <id="flPtyFcltyVo_crtChlCd" name="flPtyFcltyVo.crtChlCd">
    private Timestamp updTm = null; // 更新时间    <id="flPtyFcltyVo_updTm" name="flPtyFcltyVo.updTm">
    private String updTmStr = null; // 更新时间（多值）    <id="flPtyFcltyVo_updTmStr" name="flPtyFcltyVo.updTmStr">
    private String updBy = null; // 更新人    <id="flPtyFcltyVo_updBy" name="flPtyFcltyVo.updBy">
    private String updChlCd = null; // 更新渠道代码    <id="flPtyFcltyVo_updChlCd" name="flPtyFcltyVo.updChlCd">
    private String editFlag = null; // 编辑标识，“删除”代表逻辑删除    <id="flPtyFcltyVo_editFlag" name="flPtyFcltyVo.editFlag">
    private String relsNbr = null; // 发布版本标识    <id="flPtyFcltyVo_relsNbr" name="flPtyFcltyVo.relsNbr">

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public FlPtyFcltyVo newEmptyCopy() {
        FlPtyFcltyVo newFlPtyFcltyVo = new FlPtyFcltyVo();
        newFlPtyFcltyVo.setId(this.id);
        newFlPtyFcltyVo.setVldFrom(this.vldFrom);
        newFlPtyFcltyVo.setVldTo(this.vldTo);
        newFlPtyFcltyVo.setCrtTm(this.crtTm);
        newFlPtyFcltyVo.setUpdTm(this.updTm);
        newFlPtyFcltyVo.setEditFlag(this.editFlag);
        newFlPtyFcltyVo.setRelsNbr(this.relsNbr);
        return newFlPtyFcltyVo;
    }

    public void setId(Long id) {
        isBlankObj = false;
        this.id = id;
    }

    public Long getId() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"id\">");
        return id;
    }
    
    public void setIdStr(String idStr) {
        isBlankObj = false;
        this.idStr = idStr;
    }

    public String getIdStr() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"idStr\">");
        return idStr;
    }
    
    public void setPtyId(Long ptyId) {
        isBlankObj = false;
        this.ptyId = ptyId;
    }

    public Long getPtyId() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"ptyId\">");
        return ptyId;
    }
    
    public void setPtyCd(String ptyCd) {
        isBlankObj = false;
        this.ptyCd = ptyCd;
    }

    public String getPtyCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"ptyCd\">");
        return ptyCd;
    }
    
    public void setPtyNmCn(String ptyNmCn) {
        isBlankObj = false;
        this.ptyNmCn = ptyNmCn;
    }

    public String getPtyNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"ptyNmCn\">");
        return ptyNmCn;
    }
    
    public void setFcltyId(Long fcltyId) {
        isBlankObj = false;
        this.fcltyId = fcltyId;
    }

    public Long getFcltyId() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"fcltyId\">");
        return fcltyId;
    }
    
    public void setFcltyCd(String fcltyCd) {
        isBlankObj = false;
        this.fcltyCd = fcltyCd;
    }

    public String getFcltyCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"fcltyCd\">");
        return fcltyCd;
    }
    
    public void setFcltyNmCn(String fcltyNmCn) {
        isBlankObj = false;
        this.fcltyNmCn = fcltyNmCn;
    }

    public String getFcltyNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"fcltyNmCn\">");
        return fcltyNmCn;
    }
    
    public void setFcltyCatCd(String fcltyCatCd) {
        isBlankObj = false;
        this.fcltyCatCd = fcltyCatCd;
    }

    public String getFcltyCatCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"fcltyCatCd\">");
        return fcltyCatCd;
    }
    
    public void setFcltyCatNmCn(String fcltyCatNmCn) {
        isBlankObj = false;
        this.fcltyCatNmCn = fcltyCatNmCn;
    }

    public String getFcltyCatNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"fcltyCatNmCn\">");
        return fcltyCatNmCn;
    }
    
    public void setCd(String cd) {
        isBlankObj = false;
        this.cd = cd;
    }

    public String getCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"cd\">");
        return cd;
    }
    
    public void setNmCn(String nmCn) {
        isBlankObj = false;
        this.nmCn = nmCn;
    }

    public String getNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"nmCn\">");
        return nmCn;
    }
    
    public void setNmEn(String nmEn) {
        isBlankObj = false;
        this.nmEn = nmEn;
    }

    public String getNmEn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"nmEn\">");
        return nmEn;
    }
    
    public void setOprSpec(String oprSpec) {
        isBlankObj = false;
        this.oprSpec = oprSpec;
    }

    public String getOprSpec() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"oprSpec\">");
        return oprSpec;
    }
    
    public void setMemo(String memo) {
        isBlankObj = false;
        this.memo = memo;
    }

    public String getMemo() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"memo\">");
        return memo;
    }
    
    public void setCatCd(String catCd) {
        isBlankObj = false;
        this.catCd = catCd;
    }

    public String getCatCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"catCd\">");
        return catCd;
    }
    
    public void setCatNmCn(String catNmCn) {
        isBlankObj = false;
        this.catNmCn = catNmCn;
    }

    public String getCatNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"catNmCn\">");
        return catNmCn;
    }
    
    public void setOwnerId(Long ownerId) {
        isBlankObj = false;
        this.ownerId = ownerId;
    }

    public Long getOwnerId() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"ownerId\">");
        return ownerId;
    }
    
    public void setOwnerCd(String ownerCd) {
        isBlankObj = false;
        this.ownerCd = ownerCd;
    }

    public String getOwnerCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"ownerCd\">");
        return ownerCd;
    }
    
    public void setOwnerNmCn(String ownerNmCn) {
        isBlankObj = false;
        this.ownerNmCn = ownerNmCn;
    }

    public String getOwnerNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"ownerNmCn\">");
        return ownerNmCn;
    }
    
    public void setOwnerContcNm(String ownerContcNm) {
        isBlankObj = false;
        this.ownerContcNm = ownerContcNm;
    }

    public String getOwnerContcNm() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"ownerContcNm\">");
        return ownerContcNm;
    }
    
    public void setOwnerContcTel(String ownerContcTel) {
        isBlankObj = false;
        this.ownerContcTel = ownerContcTel;
    }

    public String getOwnerContcTel() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"ownerContcTel\">");
        return ownerContcTel;
    }
    
    public void setDrvrId(Long drvrId) {
        isBlankObj = false;
        this.drvrId = drvrId;
    }

    public Long getDrvrId() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"drvrId\">");
        return drvrId;
    }
    
    public void setDrvrCd(String drvrCd) {
        isBlankObj = false;
        this.drvrCd = drvrCd;
    }

    public String getDrvrCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"drvrCd\">");
        return drvrCd;
    }
    
    public void setDrvrNmCn(String drvrNmCn) {
        isBlankObj = false;
        this.drvrNmCn = drvrNmCn;
    }

    public String getDrvrNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"drvrNmCn\">");
        return drvrNmCn;
    }
    
    public void setVldFrom(Timestamp vldFrom) {
        isBlankObj = false;
        this.vldFrom = vldFrom;
    }

    public Timestamp getVldFrom() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"vldFrom\">");
        return vldFrom;
    }
    
    public void setVldFromStr(String vldFromStr) {
        isBlankObj = false;
        this.vldFromStr = vldFromStr;
    }

    public String getVldFromStr() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"vldFromStr\">");
        return vldFromStr;
    }
    
    public void setVldTo(Timestamp vldTo) {
        isBlankObj = false;
        this.vldTo = vldTo;
    }

    public Timestamp getVldTo() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"vldTo\">");
        return vldTo;
    }
    
    public void setVldToStr(String vldToStr) {
        isBlankObj = false;
        this.vldToStr = vldToStr;
    }

    public String getVldToStr() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"vldToStr\">");
        return vldToStr;
    }
    
    public void setStatCd(String statCd) {
        isBlankObj = false;
        this.statCd = statCd;
    }

    public String getStatCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"statCd\">");
        return statCd;
    }
    
    public void setStatNmCn(String statNmCn) {
        isBlankObj = false;
        this.statNmCn = statNmCn;
    }

    public String getStatNmCn() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"statNmCn\">");
        return statNmCn;
    }
    
    public void setViewOrd(Short viewOrd) {
        isBlankObj = false;
        this.viewOrd = viewOrd;
    }

    public Short getViewOrd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"viewOrd\">");
        return viewOrd;
    }
    
    public void setLogicOrd(Integer logicOrd) {
        isBlankObj = false;
        this.logicOrd = logicOrd;
    }

    public Integer getLogicOrd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"logicOrd\">");
        return logicOrd;
    }
    
    public void setPrefFlag(String prefFlag) {
        isBlankObj = false;
        this.prefFlag = prefFlag;
    }

    public String getPrefFlag() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"prefFlag\">");
        return prefFlag;
    }
    
    public void setCrtTm(Timestamp crtTm) {
        isBlankObj = false;
        this.crtTm = crtTm;
    }

    public Timestamp getCrtTm() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"crtTm\">");
        return crtTm;
    }
    
    public void setCrtTmStr(String crtTmStr) {
        isBlankObj = false;
        this.crtTmStr = crtTmStr;
    }

    public String getCrtTmStr() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"crtTmStr\">");
        return crtTmStr;
    }
    
    public void setCrtBy(String crtBy) {
        isBlankObj = false;
        this.crtBy = crtBy;
    }

    public String getCrtBy() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"crtBy\">");
        return crtBy;
    }
    
    public void setCrtChlCd(String crtChlCd) {
        isBlankObj = false;
        this.crtChlCd = crtChlCd;
    }

    public String getCrtChlCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"crtChlCd\">");
        return crtChlCd;
    }
    
    public void setUpdTm(Timestamp updTm) {
        isBlankObj = false;
        this.updTm = updTm;
    }

    public Timestamp getUpdTm() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"updTm\">");
        return updTm;
    }
    
    public void setUpdTmStr(String updTmStr) {
        isBlankObj = false;
        this.updTmStr = updTmStr;
    }

    public String getUpdTmStr() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"updTmStr\">");
        return updTmStr;
    }
    
    public void setUpdBy(String updBy) {
        isBlankObj = false;
        this.updBy = updBy;
    }

    public String getUpdBy() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"updBy\">");
        return updBy;
    }
    
    public void setUpdChlCd(String updChlCd) {
        isBlankObj = false;
        this.updChlCd = updChlCd;
    }

    public String getUpdChlCd() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"updChlCd\">");
        return updChlCd;
    }
    
    public void setEditFlag(String editFlag) {
        isBlankObj = false;
        this.editFlag = editFlag;
    }

    public String getEditFlag() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"editFlag\">");
        return editFlag;
    }
    
    public void setRelsNbr(String relsNbr) {
        isBlankObj = false;
        this.relsNbr = relsNbr;
    }

    public String getRelsNbr() {
        logger.trace("com.myco.model.vo.cart.FlPtyFcltyVo	<includedAttr name=\"relsNbr\">");
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
