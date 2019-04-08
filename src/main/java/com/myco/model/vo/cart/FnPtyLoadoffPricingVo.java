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
 * 参与卸货费报价
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
public class FnPtyLoadoffPricingVo implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private boolean isBlankObj = true;
    private static final Logger logger = Logger.getLogger(FnPtyLoadoffPricingVo.class);
    
    private Long id = null; // 主键    <id="fnPtyLoadoffPricingVo_id" name="fnPtyLoadoffPricingVo.id">
    private String idStr = null; // 主键    <id="fnPtyLoadoffPricingVo_idStr" name="fnPtyLoadoffPricingVo.idStr">
    private Long csneeOwnerId = null; // 收货点属主ID    <id="fnPtyLoadoffPricingVo_csneeOwnerId" name="fnPtyLoadoffPricingVo.csneeOwnerId">
    private String csneeOwnerCd = null; // 收货点属主代码    <id="fnPtyLoadoffPricingVo_csneeOwnerCd" name="fnPtyLoadoffPricingVo.csneeOwnerCd">
    private String csneeOwnerNmCn = null; // 收货点属主中文名    <id="fnPtyLoadoffPricingVo_csneeOwnerNmCn" name="fnPtyLoadoffPricingVo.csneeOwnerNmCn">
    private Long csneeId = null; // 收货点ID    <id="fnPtyLoadoffPricingVo_csneeId" name="fnPtyLoadoffPricingVo.csneeId">
    private String csneeCd = null; // 收货点代码    <id="fnPtyLoadoffPricingVo_csneeCd" name="fnPtyLoadoffPricingVo.csneeCd">
    private String csneeNmCn = null; // 收货点中文名    <id="fnPtyLoadoffPricingVo_csneeNmCn" name="fnPtyLoadoffPricingVo.csneeNmCn">
    private String csneeAddr = null; // 收货点地址    <id="fnPtyLoadoffPricingVo_csneeAddr" name="fnPtyLoadoffPricingVo.csneeAddr">
    private Long ptyFcltyId = null; // 收货点仓库ID    <id="fnPtyLoadoffPricingVo_ptyFcltyId" name="fnPtyLoadoffPricingVo.ptyFcltyId">
    private String ptyFcltyCd = null; // 收货点仓库代码    <id="fnPtyLoadoffPricingVo_ptyFcltyCd" name="fnPtyLoadoffPricingVo.ptyFcltyCd">
    private String ptyFcltyNmCn = null; // 收货点仓库中文名    <id="fnPtyLoadoffPricingVo_ptyFcltyNmCn" name="fnPtyLoadoffPricingVo.ptyFcltyNmCn">
    private Timestamp crtTm = null; // 创建时间    <id="fnPtyLoadoffPricingVo_crtTm" name="fnPtyLoadoffPricingVo.crtTm">
    private String crtTmStr = null; // 创建时间（多值）    <id="fnPtyLoadoffPricingVo_crtTmStr" name="fnPtyLoadoffPricingVo.crtTmStr">
    private String crtBy = null; // 创建人    <id="fnPtyLoadoffPricingVo_crtBy" name="fnPtyLoadoffPricingVo.crtBy">
    private String crtChlCd = null; // 创建渠道代码    <id="fnPtyLoadoffPricingVo_crtChlCd" name="fnPtyLoadoffPricingVo.crtChlCd">
    private Timestamp updTm = null; // 更新时间    <id="fnPtyLoadoffPricingVo_updTm" name="fnPtyLoadoffPricingVo.updTm">
    private String updTmStr = null; // 更新时间（多值）    <id="fnPtyLoadoffPricingVo_updTmStr" name="fnPtyLoadoffPricingVo.updTmStr">
    private String updBy = null; // 更新人    <id="fnPtyLoadoffPricingVo_updBy" name="fnPtyLoadoffPricingVo.updBy">
    private String updChlCd = null; // 更新渠道代码    <id="fnPtyLoadoffPricingVo_updChlCd" name="fnPtyLoadoffPricingVo.updChlCd">
    private String editFlag = null; // 编辑标识，“删除”代表逻辑删除    <id="fnPtyLoadoffPricingVo_editFlag" name="fnPtyLoadoffPricingVo.editFlag">
    private String syncFlag = null; // 同步标志    <id="fnPtyLoadoffPricingVo_syncFlag" name="fnPtyLoadoffPricingVo.syncFlag">
    private String relsNbr = null; // 发布版本标识    <id="fnPtyLoadoffPricingVo_relsNbr" name="fnPtyLoadoffPricingVo.relsNbr">

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public FnPtyLoadoffPricingVo newEmptyCopy() {
        FnPtyLoadoffPricingVo newFnPtyLoadoffPricingVo = new FnPtyLoadoffPricingVo();
        newFnPtyLoadoffPricingVo.setId(this.id);
        newFnPtyLoadoffPricingVo.setCrtTm(this.crtTm);
        newFnPtyLoadoffPricingVo.setUpdTm(this.updTm);
        newFnPtyLoadoffPricingVo.setEditFlag(this.editFlag);
        newFnPtyLoadoffPricingVo.setRelsNbr(this.relsNbr);
        return newFnPtyLoadoffPricingVo;
    }

    public void setId(Long id) {
        isBlankObj = false;
        this.id = id;
    }

    public Long getId() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"id\">");
        return id;
    }
    
    public void setIdStr(String idStr) {
        isBlankObj = false;
        this.idStr = idStr;
    }

    public String getIdStr() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"idStr\">");
        return idStr;
    }
    
    public void setCsneeOwnerId(Long csneeOwnerId) {
        isBlankObj = false;
        this.csneeOwnerId = csneeOwnerId;
    }

    public Long getCsneeOwnerId() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"csneeOwnerId\">");
        return csneeOwnerId;
    }
    
    public void setCsneeOwnerCd(String csneeOwnerCd) {
        isBlankObj = false;
        this.csneeOwnerCd = csneeOwnerCd;
    }

    public String getCsneeOwnerCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"csneeOwnerCd\">");
        return csneeOwnerCd;
    }
    
    public void setCsneeOwnerNmCn(String csneeOwnerNmCn) {
        isBlankObj = false;
        this.csneeOwnerNmCn = csneeOwnerNmCn;
    }

    public String getCsneeOwnerNmCn() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"csneeOwnerNmCn\">");
        return csneeOwnerNmCn;
    }
    
    public void setCsneeId(Long csneeId) {
        isBlankObj = false;
        this.csneeId = csneeId;
    }

    public Long getCsneeId() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"csneeId\">");
        return csneeId;
    }
    
    public void setCsneeCd(String csneeCd) {
        isBlankObj = false;
        this.csneeCd = csneeCd;
    }

    public String getCsneeCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"csneeCd\">");
        return csneeCd;
    }
    
    public void setCsneeNmCn(String csneeNmCn) {
        isBlankObj = false;
        this.csneeNmCn = csneeNmCn;
    }

    public String getCsneeNmCn() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"csneeNmCn\">");
        return csneeNmCn;
    }
    
    public void setCsneeAddr(String csneeAddr) {
        isBlankObj = false;
        this.csneeAddr = csneeAddr;
    }

    public String getCsneeAddr() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"csneeAddr\">");
        return csneeAddr;
    }
    
    public void setPtyFcltyId(Long ptyFcltyId) {
        isBlankObj = false;
        this.ptyFcltyId = ptyFcltyId;
    }

    public Long getPtyFcltyId() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"ptyFcltyId\">");
        return ptyFcltyId;
    }
    
    public void setPtyFcltyCd(String ptyFcltyCd) {
        isBlankObj = false;
        this.ptyFcltyCd = ptyFcltyCd;
    }

    public String getPtyFcltyCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"ptyFcltyCd\">");
        return ptyFcltyCd;
    }
    
    public void setPtyFcltyNmCn(String ptyFcltyNmCn) {
        isBlankObj = false;
        this.ptyFcltyNmCn = ptyFcltyNmCn;
    }

    public String getPtyFcltyNmCn() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"ptyFcltyNmCn\">");
        return ptyFcltyNmCn;
    }
    
    public void setCrtTm(Timestamp crtTm) {
        isBlankObj = false;
        this.crtTm = crtTm;
    }

    public Timestamp getCrtTm() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"crtTm\">");
        return crtTm;
    }
    
    public void setCrtTmStr(String crtTmStr) {
        isBlankObj = false;
        this.crtTmStr = crtTmStr;
    }

    public String getCrtTmStr() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"crtTmStr\">");
        return crtTmStr;
    }
    
    public void setCrtBy(String crtBy) {
        isBlankObj = false;
        this.crtBy = crtBy;
    }

    public String getCrtBy() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"crtBy\">");
        return crtBy;
    }
    
    public void setCrtChlCd(String crtChlCd) {
        isBlankObj = false;
        this.crtChlCd = crtChlCd;
    }

    public String getCrtChlCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"crtChlCd\">");
        return crtChlCd;
    }
    
    public void setUpdTm(Timestamp updTm) {
        isBlankObj = false;
        this.updTm = updTm;
    }

    public Timestamp getUpdTm() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"updTm\">");
        return updTm;
    }
    
    public void setUpdTmStr(String updTmStr) {
        isBlankObj = false;
        this.updTmStr = updTmStr;
    }

    public String getUpdTmStr() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"updTmStr\">");
        return updTmStr;
    }
    
    public void setUpdBy(String updBy) {
        isBlankObj = false;
        this.updBy = updBy;
    }

    public String getUpdBy() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"updBy\">");
        return updBy;
    }
    
    public void setUpdChlCd(String updChlCd) {
        isBlankObj = false;
        this.updChlCd = updChlCd;
    }

    public String getUpdChlCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"updChlCd\">");
        return updChlCd;
    }
    
    public void setEditFlag(String editFlag) {
        isBlankObj = false;
        this.editFlag = editFlag;
    }

    public String getEditFlag() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"editFlag\">");
        return editFlag;
    }
    
    public void setSyncFlag(String syncFlag) {
        isBlankObj = false;
        this.syncFlag = syncFlag;
    }

    public String getSyncFlag() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"syncFlag\">");
        return syncFlag;
    }
    
    public void setRelsNbr(String relsNbr) {
        isBlankObj = false;
        this.relsNbr = relsNbr;
    }

    public String getRelsNbr() {
        logger.trace("com.myco.model.vo.cart.FnPtyLoadoffPricingVo	<includedAttr name=\"relsNbr\">");
        return relsNbr;
    }
    
    public boolean isBlankObj() {
        return this.isBlankObj;
    }
    
}
