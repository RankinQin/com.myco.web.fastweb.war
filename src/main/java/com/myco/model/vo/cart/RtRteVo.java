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
 * 线路
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
public class RtRteVo implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private boolean isBlankObj = true;
    private static final Logger logger = Logger.getLogger(RtRteVo.class);
    
    private Long id = null; // 主键    <id="rtRteVo_id" name="rtRteVo.id">
    private String idStr = null; // 主键    <id="rtRteVo_idStr" name="rtRteVo.idStr">
    private String cd = null; // 代码，逻辑上标识一条记录，可重复。针对重复的记录，通过该记录的修订标识或状态标识进行区分。    <id="rtRteVo_cd" name="rtRteVo.cd">
    private String nmCn = null; // 中文名    <id="rtRteVo_nmCn" name="rtRteVo.nmCn">
    private String nmEn = null; // 英文名    <id="rtRteVo_nmEn" name="rtRteVo.nmEn">
    private String memo = null; // 描述    <id="rtRteVo_memo" name="rtRteVo.memo">
    private String catCd = null; // 分类代码    <id="rtRteVo_catCd" name="rtRteVo.catCd">
    private String catNmCn = null; // 分类中文名    <id="rtRteVo_catNmCn" name="rtRteVo.catNmCn">
    private Long dptrLocId = null; // 始发位置ID    <id="rtRteVo_dptrLocId" name="rtRteVo.dptrLocId">
    private String dptrLocCd = null; // 始发位置代码    <id="rtRteVo_dptrLocCd" name="rtRteVo.dptrLocCd">
    private String dptrLocNmCn = null; // 始发位置中文名    <id="rtRteVo_dptrLocNmCn" name="rtRteVo.dptrLocNmCn">
    private String dptrStCd = null; // 始发省(州)代码    <id="rtRteVo_dptrStCd" name="rtRteVo.dptrStCd">
    private String dptrStNmCn = null; // 始发省(州)中文名    <id="rtRteVo_dptrStNmCn" name="rtRteVo.dptrStNmCn">
    private String dptrCtyCd = null; // 始发城市编码    <id="rtRteVo_dptrCtyCd" name="rtRteVo.dptrCtyCd">
    private String dptrCtyNmCn = null; // 始发城市中文名    <id="rtRteVo_dptrCtyNmCn" name="rtRteVo.dptrCtyNmCn">
    private String dptrDistCd = null; // 始发地区编码    <id="rtRteVo_dptrDistCd" name="rtRteVo.dptrDistCd">
    private String dptrDistNmCn = null; // 始发地区中文名    <id="rtRteVo_dptrDistNmCn" name="rtRteVo.dptrDistNmCn">
    private Long arrvLocId = null; // 到达位置ID    <id="rtRteVo_arrvLocId" name="rtRteVo.arrvLocId">
    private String arrvLocCd = null; // 到达位置代码    <id="rtRteVo_arrvLocCd" name="rtRteVo.arrvLocCd">
    private String arrvLocNmCn = null; // 到达位置中文名    <id="rtRteVo_arrvLocNmCn" name="rtRteVo.arrvLocNmCn">
    private String arrvStCd = null; // 到达省(州)代码    <id="rtRteVo_arrvStCd" name="rtRteVo.arrvStCd">
    private String arrvStNmCn = null; // 到达省(州)中文名    <id="rtRteVo_arrvStNmCn" name="rtRteVo.arrvStNmCn">
    private String arrvCtyCd = null; // 到达城市编码    <id="rtRteVo_arrvCtyCd" name="rtRteVo.arrvCtyCd">
    private String arrvCtyNmCn = null; // 到达城市中文名    <id="rtRteVo_arrvCtyNmCn" name="rtRteVo.arrvCtyNmCn">
    private String arrvDistCd = null; // 到达地区代码    <id="rtRteVo_arrvDistCd" name="rtRteVo.arrvDistCd">
    private String arrvDistNmCn = null; // 到达地区中文名    <id="rtRteVo_arrvDistNmCn" name="rtRteVo.arrvDistNmCn">
    private Long arrvPtyFcltyId = null; // 到达参与方设备ID    <id="rtRteVo_arrvPtyFcltyId" name="rtRteVo.arrvPtyFcltyId">
    private String arrvPtyFcltyCd = null; // 到达参与方设备编码    <id="rtRteVo_arrvPtyFcltyCd" name="rtRteVo.arrvPtyFcltyCd">
    private String arrvPtyFcltyNmCn = null; // 到达参与方设备中文名称    <id="rtRteVo_arrvPtyFcltyNmCn" name="rtRteVo.arrvPtyFcltyNmCn">
    private String transfStCd = null; // 中转省(州)代码    <id="rtRteVo_transfStCd" name="rtRteVo.transfStCd">
    private String transfStNmCn = null; // 中转省(州)中文名    <id="rtRteVo_transfStNmCn" name="rtRteVo.transfStNmCn">
    private String transfCtyCd = null; // 中转城市编码    <id="rtRteVo_transfCtyCd" name="rtRteVo.transfCtyCd">
    private String transfCtyNmCn = null; // 中转城市中文名    <id="rtRteVo_transfCtyNmCn" name="rtRteVo.transfCtyNmCn">
    private String transfDistCd = null; // 中转地区代码    <id="rtRteVo_transfDistCd" name="rtRteVo.transfDistCd">
    private String transfDistNmCn = null; // 中转地区中文名    <id="rtRteVo_transfDistNmCn" name="rtRteVo.transfDistNmCn">
    private Double dist = null; // 两个配送点之间的行驶距离    <id="rtRteVo_dist" name="rtRteVo.dist">
    private String distMuCd = null; // 里程单位编号    <id="rtRteVo_distMuCd" name="rtRteVo.distMuCd">
    private String distMuNmCn = null; // 里程单位中文名    <id="rtRteVo_distMuNmCn" name="rtRteVo.distMuNmCn">
    private Double ftlTime = null; // 整车时效    <id="rtRteVo_ftlTime" name="rtRteVo.ftlTime">
    private String ftlTimeMuCd = null; // 整车时效单位编号    <id="rtRteVo_ftlTimeMuCd" name="rtRteVo.ftlTimeMuCd">
    private String ftlTimeMuNmCn = null; // 整车时效单位中文名    <id="rtRteVo_ftlTimeMuNmCn" name="rtRteVo.ftlTimeMuNmCn">
    private Double ltlTime = null; // 零担时效    <id="rtRteVo_ltlTime" name="rtRteVo.ltlTime">
    private String ltlTimeMuCd = null; // 零担时效单位编号    <id="rtRteVo_ltlTimeMuCd" name="rtRteVo.ltlTimeMuCd">
    private String ltlTimeMuNmCn = null; // 零担时效单位中文名    <id="rtRteVo_ltlTimeMuNmCn" name="rtRteVo.ltlTimeMuNmCn">
    private Double rcptTime = null; // 回单时效    <id="rtRteVo_rcptTime" name="rtRteVo.rcptTime">
    private String rcptTimeMuCd = null; // 回单时效单位编号    <id="rtRteVo_rcptTimeMuCd" name="rtRteVo.rcptTimeMuCd">
    private String rcptTimeMuNmCn = null; // 回单时效单位中文名    <id="rtRteVo_rcptTimeMuNmCn" name="rtRteVo.rcptTimeMuNmCn">
    private Timestamp vldFrom = null; // 生效开始时间    <id="rtRteVo_vldFrom" name="rtRteVo.vldFrom">
    private String vldFromStr = null; // 生效开始时间（多值）    <id="rtRteVo_vldFromStr" name="rtRteVo.vldFromStr">
    private Timestamp vldTo = null; // 生效截止时间    <id="rtRteVo_vldTo" name="rtRteVo.vldTo">
    private String vldToStr = null; // 生效截止时间（多值）    <id="rtRteVo_vldToStr" name="rtRteVo.vldToStr">
    private String statCd = null; // 状态代码    <id="rtRteVo_statCd" name="rtRteVo.statCd">
    private String statNmCn = null; // 状态中文名    <id="rtRteVo_statNmCn" name="rtRteVo.statNmCn">
    private Short viewOrd = null; // 显示顺序    <id="rtRteVo_viewOrd" name="rtRteVo.viewOrd">
    private Short logicOrd = null; // 逻辑顺序    <id="rtRteVo_logicOrd" name="rtRteVo.logicOrd">
    private Timestamp crtTm = null; // 创建时间    <id="rtRteVo_crtTm" name="rtRteVo.crtTm">
    private String crtTmStr = null; // 创建时间（多值）    <id="rtRteVo_crtTmStr" name="rtRteVo.crtTmStr">
    private String crtBy = null; // 创建人    <id="rtRteVo_crtBy" name="rtRteVo.crtBy">
    private Timestamp updTm = null; // 更新时间    <id="rtRteVo_updTm" name="rtRteVo.updTm">
    private String updTmStr = null; // 更新时间（多值）    <id="rtRteVo_updTmStr" name="rtRteVo.updTmStr">
    private String updBy = null; // 更新人    <id="rtRteVo_updBy" name="rtRteVo.updBy">
    private String editFlag = null; // 编辑标识，“删除”代表逻辑删除    <id="rtRteVo_editFlag" name="rtRteVo.editFlag">
    private String syncFlag = null; // 同步标志    <id="rtRteVo_syncFlag" name="rtRteVo.syncFlag">
    private String relsNbr = null; // 发布版本标识    <id="rtRteVo_relsNbr" name="rtRteVo.relsNbr">

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public RtRteVo newEmptyCopy() {
        RtRteVo newRtRteVo = new RtRteVo();
        newRtRteVo.setId(this.id);
        newRtRteVo.setVldFrom(this.vldFrom);
        newRtRteVo.setVldTo(this.vldTo);
        newRtRteVo.setCrtTm(this.crtTm);
        newRtRteVo.setUpdTm(this.updTm);
        newRtRteVo.setEditFlag(this.editFlag);
        newRtRteVo.setRelsNbr(this.relsNbr);
        return newRtRteVo;
    }

    public void setId(Long id) {
        isBlankObj = false;
        this.id = id;
    }

    public Long getId() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"id\">");
        return id;
    }
    
    public void setIdStr(String idStr) {
        isBlankObj = false;
        this.idStr = idStr;
    }

    public String getIdStr() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"idStr\">");
        return idStr;
    }
    
    public void setCd(String cd) {
        isBlankObj = false;
        this.cd = cd;
    }

    public String getCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"cd\">");
        return cd;
    }
    
    public void setNmCn(String nmCn) {
        isBlankObj = false;
        this.nmCn = nmCn;
    }

    public String getNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"nmCn\">");
        return nmCn;
    }
    
    public void setNmEn(String nmEn) {
        isBlankObj = false;
        this.nmEn = nmEn;
    }

    public String getNmEn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"nmEn\">");
        return nmEn;
    }
    
    public void setMemo(String memo) {
        isBlankObj = false;
        this.memo = memo;
    }

    public String getMemo() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"memo\">");
        return memo;
    }
    
    public void setCatCd(String catCd) {
        isBlankObj = false;
        this.catCd = catCd;
    }

    public String getCatCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"catCd\">");
        return catCd;
    }
    
    public void setCatNmCn(String catNmCn) {
        isBlankObj = false;
        this.catNmCn = catNmCn;
    }

    public String getCatNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"catNmCn\">");
        return catNmCn;
    }
    
    public void setDptrLocId(Long dptrLocId) {
        isBlankObj = false;
        this.dptrLocId = dptrLocId;
    }

    public Long getDptrLocId() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"dptrLocId\">");
        return dptrLocId;
    }
    
    public void setDptrLocCd(String dptrLocCd) {
        isBlankObj = false;
        this.dptrLocCd = dptrLocCd;
    }

    public String getDptrLocCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"dptrLocCd\">");
        return dptrLocCd;
    }
    
    public void setDptrLocNmCn(String dptrLocNmCn) {
        isBlankObj = false;
        this.dptrLocNmCn = dptrLocNmCn;
    }

    public String getDptrLocNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"dptrLocNmCn\">");
        return dptrLocNmCn;
    }
    
    public void setDptrStCd(String dptrStCd) {
        isBlankObj = false;
        this.dptrStCd = dptrStCd;
    }

    public String getDptrStCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"dptrStCd\">");
        return dptrStCd;
    }
    
    public void setDptrStNmCn(String dptrStNmCn) {
        isBlankObj = false;
        this.dptrStNmCn = dptrStNmCn;
    }

    public String getDptrStNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"dptrStNmCn\">");
        return dptrStNmCn;
    }
    
    public void setDptrCtyCd(String dptrCtyCd) {
        isBlankObj = false;
        this.dptrCtyCd = dptrCtyCd;
    }

    public String getDptrCtyCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"dptrCtyCd\">");
        return dptrCtyCd;
    }
    
    public void setDptrCtyNmCn(String dptrCtyNmCn) {
        isBlankObj = false;
        this.dptrCtyNmCn = dptrCtyNmCn;
    }

    public String getDptrCtyNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"dptrCtyNmCn\">");
        return dptrCtyNmCn;
    }
    
    public void setDptrDistCd(String dptrDistCd) {
        isBlankObj = false;
        this.dptrDistCd = dptrDistCd;
    }

    public String getDptrDistCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"dptrDistCd\">");
        return dptrDistCd;
    }
    
    public void setDptrDistNmCn(String dptrDistNmCn) {
        isBlankObj = false;
        this.dptrDistNmCn = dptrDistNmCn;
    }

    public String getDptrDistNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"dptrDistNmCn\">");
        return dptrDistNmCn;
    }
    
    public void setArrvLocId(Long arrvLocId) {
        isBlankObj = false;
        this.arrvLocId = arrvLocId;
    }

    public Long getArrvLocId() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"arrvLocId\">");
        return arrvLocId;
    }
    
    public void setArrvLocCd(String arrvLocCd) {
        isBlankObj = false;
        this.arrvLocCd = arrvLocCd;
    }

    public String getArrvLocCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"arrvLocCd\">");
        return arrvLocCd;
    }
    
    public void setArrvLocNmCn(String arrvLocNmCn) {
        isBlankObj = false;
        this.arrvLocNmCn = arrvLocNmCn;
    }

    public String getArrvLocNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"arrvLocNmCn\">");
        return arrvLocNmCn;
    }
    
    public void setArrvStCd(String arrvStCd) {
        isBlankObj = false;
        this.arrvStCd = arrvStCd;
    }

    public String getArrvStCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"arrvStCd\">");
        return arrvStCd;
    }
    
    public void setArrvStNmCn(String arrvStNmCn) {
        isBlankObj = false;
        this.arrvStNmCn = arrvStNmCn;
    }

    public String getArrvStNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"arrvStNmCn\">");
        return arrvStNmCn;
    }
    
    public void setArrvCtyCd(String arrvCtyCd) {
        isBlankObj = false;
        this.arrvCtyCd = arrvCtyCd;
    }

    public String getArrvCtyCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"arrvCtyCd\">");
        return arrvCtyCd;
    }
    
    public void setArrvCtyNmCn(String arrvCtyNmCn) {
        isBlankObj = false;
        this.arrvCtyNmCn = arrvCtyNmCn;
    }

    public String getArrvCtyNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"arrvCtyNmCn\">");
        return arrvCtyNmCn;
    }
    
    public void setArrvDistCd(String arrvDistCd) {
        isBlankObj = false;
        this.arrvDistCd = arrvDistCd;
    }

    public String getArrvDistCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"arrvDistCd\">");
        return arrvDistCd;
    }
    
    public void setArrvDistNmCn(String arrvDistNmCn) {
        isBlankObj = false;
        this.arrvDistNmCn = arrvDistNmCn;
    }

    public String getArrvDistNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"arrvDistNmCn\">");
        return arrvDistNmCn;
    }
    
    public void setArrvPtyFcltyId(Long arrvPtyFcltyId) {
        isBlankObj = false;
        this.arrvPtyFcltyId = arrvPtyFcltyId;
    }

    public Long getArrvPtyFcltyId() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"arrvPtyFcltyId\">");
        return arrvPtyFcltyId;
    }
    
    public void setArrvPtyFcltyCd(String arrvPtyFcltyCd) {
        isBlankObj = false;
        this.arrvPtyFcltyCd = arrvPtyFcltyCd;
    }

    public String getArrvPtyFcltyCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"arrvPtyFcltyCd\">");
        return arrvPtyFcltyCd;
    }
    
    public void setArrvPtyFcltyNmCn(String arrvPtyFcltyNmCn) {
        isBlankObj = false;
        this.arrvPtyFcltyNmCn = arrvPtyFcltyNmCn;
    }

    public String getArrvPtyFcltyNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"arrvPtyFcltyNmCn\">");
        return arrvPtyFcltyNmCn;
    }
    
    public void setTransfStCd(String transfStCd) {
        isBlankObj = false;
        this.transfStCd = transfStCd;
    }

    public String getTransfStCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"transfStCd\">");
        return transfStCd;
    }
    
    public void setTransfStNmCn(String transfStNmCn) {
        isBlankObj = false;
        this.transfStNmCn = transfStNmCn;
    }

    public String getTransfStNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"transfStNmCn\">");
        return transfStNmCn;
    }
    
    public void setTransfCtyCd(String transfCtyCd) {
        isBlankObj = false;
        this.transfCtyCd = transfCtyCd;
    }

    public String getTransfCtyCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"transfCtyCd\">");
        return transfCtyCd;
    }
    
    public void setTransfCtyNmCn(String transfCtyNmCn) {
        isBlankObj = false;
        this.transfCtyNmCn = transfCtyNmCn;
    }

    public String getTransfCtyNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"transfCtyNmCn\">");
        return transfCtyNmCn;
    }
    
    public void setTransfDistCd(String transfDistCd) {
        isBlankObj = false;
        this.transfDistCd = transfDistCd;
    }

    public String getTransfDistCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"transfDistCd\">");
        return transfDistCd;
    }
    
    public void setTransfDistNmCn(String transfDistNmCn) {
        isBlankObj = false;
        this.transfDistNmCn = transfDistNmCn;
    }

    public String getTransfDistNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"transfDistNmCn\">");
        return transfDistNmCn;
    }
    
    public void setDist(Double dist) {
        isBlankObj = false;
        this.dist = dist;
    }

    public Double getDist() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"dist\">");
        return dist;
    }
    
    public void setDistMuCd(String distMuCd) {
        isBlankObj = false;
        this.distMuCd = distMuCd;
    }

    public String getDistMuCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"distMuCd\">");
        return distMuCd;
    }
    
    public void setDistMuNmCn(String distMuNmCn) {
        isBlankObj = false;
        this.distMuNmCn = distMuNmCn;
    }

    public String getDistMuNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"distMuNmCn\">");
        return distMuNmCn;
    }
    
    public void setFtlTime(Double ftlTime) {
        isBlankObj = false;
        this.ftlTime = ftlTime;
    }

    public Double getFtlTime() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"ftlTime\">");
        return ftlTime;
    }
    
    public void setFtlTimeMuCd(String ftlTimeMuCd) {
        isBlankObj = false;
        this.ftlTimeMuCd = ftlTimeMuCd;
    }

    public String getFtlTimeMuCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"ftlTimeMuCd\">");
        return ftlTimeMuCd;
    }
    
    public void setFtlTimeMuNmCn(String ftlTimeMuNmCn) {
        isBlankObj = false;
        this.ftlTimeMuNmCn = ftlTimeMuNmCn;
    }

    public String getFtlTimeMuNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"ftlTimeMuNmCn\">");
        return ftlTimeMuNmCn;
    }
    
    public void setLtlTime(Double ltlTime) {
        isBlankObj = false;
        this.ltlTime = ltlTime;
    }

    public Double getLtlTime() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"ltlTime\">");
        return ltlTime;
    }
    
    public void setLtlTimeMuCd(String ltlTimeMuCd) {
        isBlankObj = false;
        this.ltlTimeMuCd = ltlTimeMuCd;
    }

    public String getLtlTimeMuCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"ltlTimeMuCd\">");
        return ltlTimeMuCd;
    }
    
    public void setLtlTimeMuNmCn(String ltlTimeMuNmCn) {
        isBlankObj = false;
        this.ltlTimeMuNmCn = ltlTimeMuNmCn;
    }

    public String getLtlTimeMuNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"ltlTimeMuNmCn\">");
        return ltlTimeMuNmCn;
    }
    
    public void setRcptTime(Double rcptTime) {
        isBlankObj = false;
        this.rcptTime = rcptTime;
    }

    public Double getRcptTime() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"rcptTime\">");
        return rcptTime;
    }
    
    public void setRcptTimeMuCd(String rcptTimeMuCd) {
        isBlankObj = false;
        this.rcptTimeMuCd = rcptTimeMuCd;
    }

    public String getRcptTimeMuCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"rcptTimeMuCd\">");
        return rcptTimeMuCd;
    }
    
    public void setRcptTimeMuNmCn(String rcptTimeMuNmCn) {
        isBlankObj = false;
        this.rcptTimeMuNmCn = rcptTimeMuNmCn;
    }

    public String getRcptTimeMuNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"rcptTimeMuNmCn\">");
        return rcptTimeMuNmCn;
    }
    
    public void setVldFrom(Timestamp vldFrom) {
        isBlankObj = false;
        this.vldFrom = vldFrom;
    }

    public Timestamp getVldFrom() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"vldFrom\">");
        return vldFrom;
    }
    
    public void setVldFromStr(String vldFromStr) {
        isBlankObj = false;
        this.vldFromStr = vldFromStr;
    }

    public String getVldFromStr() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"vldFromStr\">");
        return vldFromStr;
    }
    
    public void setVldTo(Timestamp vldTo) {
        isBlankObj = false;
        this.vldTo = vldTo;
    }

    public Timestamp getVldTo() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"vldTo\">");
        return vldTo;
    }
    
    public void setVldToStr(String vldToStr) {
        isBlankObj = false;
        this.vldToStr = vldToStr;
    }

    public String getVldToStr() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"vldToStr\">");
        return vldToStr;
    }
    
    public void setStatCd(String statCd) {
        isBlankObj = false;
        this.statCd = statCd;
    }

    public String getStatCd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"statCd\">");
        return statCd;
    }
    
    public void setStatNmCn(String statNmCn) {
        isBlankObj = false;
        this.statNmCn = statNmCn;
    }

    public String getStatNmCn() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"statNmCn\">");
        return statNmCn;
    }
    
    public void setViewOrd(Short viewOrd) {
        isBlankObj = false;
        this.viewOrd = viewOrd;
    }

    public Short getViewOrd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"viewOrd\">");
        return viewOrd;
    }
    
    public void setLogicOrd(Short logicOrd) {
        isBlankObj = false;
        this.logicOrd = logicOrd;
    }

    public Short getLogicOrd() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"logicOrd\">");
        return logicOrd;
    }
    
    public void setCrtTm(Timestamp crtTm) {
        isBlankObj = false;
        this.crtTm = crtTm;
    }

    public Timestamp getCrtTm() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"crtTm\">");
        return crtTm;
    }
    
    public void setCrtTmStr(String crtTmStr) {
        isBlankObj = false;
        this.crtTmStr = crtTmStr;
    }

    public String getCrtTmStr() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"crtTmStr\">");
        return crtTmStr;
    }
    
    public void setCrtBy(String crtBy) {
        isBlankObj = false;
        this.crtBy = crtBy;
    }

    public String getCrtBy() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"crtBy\">");
        return crtBy;
    }
    
    public void setUpdTm(Timestamp updTm) {
        isBlankObj = false;
        this.updTm = updTm;
    }

    public Timestamp getUpdTm() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"updTm\">");
        return updTm;
    }
    
    public void setUpdTmStr(String updTmStr) {
        isBlankObj = false;
        this.updTmStr = updTmStr;
    }

    public String getUpdTmStr() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"updTmStr\">");
        return updTmStr;
    }
    
    public void setUpdBy(String updBy) {
        isBlankObj = false;
        this.updBy = updBy;
    }

    public String getUpdBy() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"updBy\">");
        return updBy;
    }
    
    public void setEditFlag(String editFlag) {
        isBlankObj = false;
        this.editFlag = editFlag;
    }

    public String getEditFlag() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"editFlag\">");
        return editFlag;
    }
    
    public void setSyncFlag(String syncFlag) {
        isBlankObj = false;
        this.syncFlag = syncFlag;
    }

    public String getSyncFlag() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"syncFlag\">");
        return syncFlag;
    }
    
    public void setRelsNbr(String relsNbr) {
        isBlankObj = false;
        this.relsNbr = relsNbr;
    }

    public String getRelsNbr() {
        logger.trace("com.myco.model.vo.cart.RtRteVo	<includedAttr name=\"relsNbr\">");
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
