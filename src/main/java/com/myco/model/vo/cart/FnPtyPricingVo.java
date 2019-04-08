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
 * 参与方的定价策略
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
public class FnPtyPricingVo implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private boolean isBlankObj = true;
    private static final Logger logger = Logger.getLogger(FnPtyPricingVo.class);
    
    private Long id = null; // 主键    <id="fnPtyPricingVo_id" name="fnPtyPricingVo.id">
    private String idStr = null; // 主键    <id="fnPtyPricingVo_idStr" name="fnPtyPricingVo.idStr">
    private Long ctrcId = null; // 报价协议ID    <id="fnPtyPricingVo_ctrcId" name="fnPtyPricingVo.ctrcId">
    private Long ptyId = null; // 定价参与方ID    <id="fnPtyPricingVo_ptyId" name="fnPtyPricingVo.ptyId">
    private String ptyCd = null; // 定价参与方代码    <id="fnPtyPricingVo_ptyCd" name="fnPtyPricingVo.ptyCd">
    private String ptyNmCn = null; // 定价参与方中文名    <id="fnPtyPricingVo_ptyNmCn" name="fnPtyPricingVo.ptyNmCn">
    private String cd = null; // 代码，逻辑上标识一条记录，可重复。针对重复的记录，通过该记录的修订标识或状态标识进行区分。    <id="fnPtyPricingVo_cd" name="fnPtyPricingVo.cd">
    private String memo = null; // 描述    <id="fnPtyPricingVo_memo" name="fnPtyPricingVo.memo">
    private String catCd = null; // 分类代码    <id="fnPtyPricingVo_catCd" name="fnPtyPricingVo.catCd">
    private String catNmCn = null; // 分类中文名    <id="fnPtyPricingVo_catNmCn" name="fnPtyPricingVo.catNmCn">
    private String ctryCd = null; // 国家代码    <id="fnPtyPricingVo_ctryCd" name="fnPtyPricingVo.ctryCd">
    private String ctryNmCn = null; // 国家中文名    <id="fnPtyPricingVo_ctryNmCn" name="fnPtyPricingVo.ctryNmCn">
    private String stCd = null; // 省(州)代码    <id="fnPtyPricingVo_stCd" name="fnPtyPricingVo.stCd">
    private String stNmCn = null; // 省(州)中文名    <id="fnPtyPricingVo_stNmCn" name="fnPtyPricingVo.stNmCn">
    private String ctyCd = null; // 城市代码    <id="fnPtyPricingVo_ctyCd" name="fnPtyPricingVo.ctyCd">
    private String ctyNmCn = null; // 城市中文名    <id="fnPtyPricingVo_ctyNmCn" name="fnPtyPricingVo.ctyNmCn">
    private String distCd = null; // 地区代码    <id="fnPtyPricingVo_distCd" name="fnPtyPricingVo.distCd">
    private String distNmCn = null; // 地区中文名    <id="fnPtyPricingVo_distNmCn" name="fnPtyPricingVo.distNmCn">
    private String purchCatCd = null; // 采购产品（服务或商品）类别编码    <id="fnPtyPricingVo_purchCatCd" name="fnPtyPricingVo.purchCatCd">
    private String purchCatNmCn = null; // 采购产品（服务或商品）类别中文名    <id="fnPtyPricingVo_purchCatNmCn" name="fnPtyPricingVo.purchCatNmCn">
    private String sellCatCd = null; // 销售类别代码，例如按次报价、按票报价、按体量报价    <id="fnPtyPricingVo_sellCatCd" name="fnPtyPricingVo.sellCatCd">
    private String sellCatNmCn = null; // 销售类别中文名    <id="fnPtyPricingVo_sellCatNmCn" name="fnPtyPricingVo.sellCatNmCn">
    private Double ordQtyLower = null; // 订购数量下限    <id="fnPtyPricingVo_ordQtyLower" name="fnPtyPricingVo.ordQtyLower">
    private Double ordQtyUpper = null; // 订购数量上限    <id="fnPtyPricingVo_ordQtyUpper" name="fnPtyPricingVo.ordQtyUpper">
    private Double ordAmtLower = null; // 订购金额下限    <id="fnPtyPricingVo_ordAmtLower" name="fnPtyPricingVo.ordAmtLower">
    private Double ordAmtUpper = null; // 订购金额上限    <id="fnPtyPricingVo_ordAmtUpper" name="fnPtyPricingVo.ordAmtUpper">
    private Double miscPrice = null; // 综合报价    <id="fnPtyPricingVo_miscPrice" name="fnPtyPricingVo.miscPrice">
    private String miscPriceMuCd = null; // 综合报价单位代码    <id="fnPtyPricingVo_miscPriceMuCd" name="fnPtyPricingVo.miscPriceMuCd">
    private String miscPriceMuNmCn = null; // 综合报价单位中文名    <id="fnPtyPricingVo_miscPriceMuNmCn" name="fnPtyPricingVo.miscPriceMuNmCn">
    private Double heavyQtyLower = null; // 重货数量下限    <id="fnPtyPricingVo_heavyQtyLower" name="fnPtyPricingVo.heavyQtyLower">
    private Double heavyQtyUpper = null; // 重货数量上限    <id="fnPtyPricingVo_heavyQtyUpper" name="fnPtyPricingVo.heavyQtyUpper">
    private Double heavyPrice = null; // 重货报价    <id="fnPtyPricingVo_heavyPrice" name="fnPtyPricingVo.heavyPrice">
    private String heavyPriceMuCd = null; // 重货报价单位代码    <id="fnPtyPricingVo_heavyPriceMuCd" name="fnPtyPricingVo.heavyPriceMuCd">
    private String heavyPriceMuNmCn = null; // 重货报价单位中文名    <id="fnPtyPricingVo_heavyPriceMuNmCn" name="fnPtyPricingVo.heavyPriceMuNmCn">
    private Double bulkyQtyLower = null; // 泡货数量下限    <id="fnPtyPricingVo_bulkyQtyLower" name="fnPtyPricingVo.bulkyQtyLower">
    private Double bulkyQtyUpper = null; // 泡货数量上限    <id="fnPtyPricingVo_bulkyQtyUpper" name="fnPtyPricingVo.bulkyQtyUpper">
    private Double bulkyPrice = null; // 泡货报价    <id="fnPtyPricingVo_bulkyPrice" name="fnPtyPricingVo.bulkyPrice">
    private String bulkyPriceMuCd = null; // 泡货报价单位代码    <id="fnPtyPricingVo_bulkyPriceMuCd" name="fnPtyPricingVo.bulkyPriceMuCd">
    private String bulkyPriceMuNmCn = null; // 泡货报价单位中文名    <id="fnPtyPricingVo_bulkyPriceMuNmCn" name="fnPtyPricingVo.bulkyPriceMuNmCn">
    private Double discRate = null; // 折扣率    <id="fnPtyPricingVo_discRate" name="fnPtyPricingVo.discRate">
    private String url = null; // 访问资源的URL    <id="fnPtyPricingVo_url" name="fnPtyPricingVo.url">
    private Timestamp vldFrom = null; // 生效开始时间    <id="fnPtyPricingVo_vldFrom" name="fnPtyPricingVo.vldFrom">
    private String vldFromStr = null; // 生效开始时间（多值）    <id="fnPtyPricingVo_vldFromStr" name="fnPtyPricingVo.vldFromStr">
    private Timestamp vldTo = null; // 生效截止时间    <id="fnPtyPricingVo_vldTo" name="fnPtyPricingVo.vldTo">
    private String vldToStr = null; // 生效截止时间（多值）    <id="fnPtyPricingVo_vldToStr" name="fnPtyPricingVo.vldToStr">
    private String statCd = null; // 状态代码    <id="fnPtyPricingVo_statCd" name="fnPtyPricingVo.statCd">
    private String statNmCn = null; // 状态中文名    <id="fnPtyPricingVo_statNmCn" name="fnPtyPricingVo.statNmCn">
    private Short viewOrd = null; // 显示顺序    <id="fnPtyPricingVo_viewOrd" name="fnPtyPricingVo.viewOrd">
    private Short logicOrd = null; // 逻辑顺序    <id="fnPtyPricingVo_logicOrd" name="fnPtyPricingVo.logicOrd">
    private Timestamp crtTm = null; // 创建时间    <id="fnPtyPricingVo_crtTm" name="fnPtyPricingVo.crtTm">
    private String crtTmStr = null; // 创建时间（多值）    <id="fnPtyPricingVo_crtTmStr" name="fnPtyPricingVo.crtTmStr">
    private String crtBy = null; // 创建人    <id="fnPtyPricingVo_crtBy" name="fnPtyPricingVo.crtBy">
    private Timestamp updTm = null; // 更新时间    <id="fnPtyPricingVo_updTm" name="fnPtyPricingVo.updTm">
    private String updTmStr = null; // 更新时间（多值）    <id="fnPtyPricingVo_updTmStr" name="fnPtyPricingVo.updTmStr">
    private String updBy = null; // 更新人    <id="fnPtyPricingVo_updBy" name="fnPtyPricingVo.updBy">
    private String editFlag = null; // 编辑标识，“删除”代表逻辑删除    <id="fnPtyPricingVo_editFlag" name="fnPtyPricingVo.editFlag">
    private String relsNbr = null; // 发布版本标识    <id="fnPtyPricingVo_relsNbr" name="fnPtyPricingVo.relsNbr">

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public FnPtyPricingVo newEmptyCopy() {
        FnPtyPricingVo newFnPtyPricingVo = new FnPtyPricingVo();
        newFnPtyPricingVo.setId(this.id);
        newFnPtyPricingVo.setVldFrom(this.vldFrom);
        newFnPtyPricingVo.setVldTo(this.vldTo);
        newFnPtyPricingVo.setCrtTm(this.crtTm);
        newFnPtyPricingVo.setUpdTm(this.updTm);
        newFnPtyPricingVo.setEditFlag(this.editFlag);
        newFnPtyPricingVo.setRelsNbr(this.relsNbr);
        return newFnPtyPricingVo;
    }

    public void setId(Long id) {
        isBlankObj = false;
        this.id = id;
    }

    public Long getId() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"id\">");
        return id;
    }
    
    public void setIdStr(String idStr) {
        isBlankObj = false;
        this.idStr = idStr;
    }

    public String getIdStr() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"idStr\">");
        return idStr;
    }
    
    public void setCtrcId(Long ctrcId) {
        isBlankObj = false;
        this.ctrcId = ctrcId;
    }

    public Long getCtrcId() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"ctrcId\">");
        return ctrcId;
    }
    
    public void setPtyId(Long ptyId) {
        isBlankObj = false;
        this.ptyId = ptyId;
    }

    public Long getPtyId() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"ptyId\">");
        return ptyId;
    }
    
    public void setPtyCd(String ptyCd) {
        isBlankObj = false;
        this.ptyCd = ptyCd;
    }

    public String getPtyCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"ptyCd\">");
        return ptyCd;
    }
    
    public void setPtyNmCn(String ptyNmCn) {
        isBlankObj = false;
        this.ptyNmCn = ptyNmCn;
    }

    public String getPtyNmCn() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"ptyNmCn\">");
        return ptyNmCn;
    }
    
    public void setCd(String cd) {
        isBlankObj = false;
        this.cd = cd;
    }

    public String getCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"cd\">");
        return cd;
    }
    
    public void setMemo(String memo) {
        isBlankObj = false;
        this.memo = memo;
    }

    public String getMemo() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"memo\">");
        return memo;
    }
    
    public void setCatCd(String catCd) {
        isBlankObj = false;
        this.catCd = catCd;
    }

    public String getCatCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"catCd\">");
        return catCd;
    }
    
    public void setCatNmCn(String catNmCn) {
        isBlankObj = false;
        this.catNmCn = catNmCn;
    }

    public String getCatNmCn() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"catNmCn\">");
        return catNmCn;
    }
    
    public void setCtryCd(String ctryCd) {
        isBlankObj = false;
        this.ctryCd = ctryCd;
    }

    public String getCtryCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"ctryCd\">");
        return ctryCd;
    }
    
    public void setCtryNmCn(String ctryNmCn) {
        isBlankObj = false;
        this.ctryNmCn = ctryNmCn;
    }

    public String getCtryNmCn() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"ctryNmCn\">");
        return ctryNmCn;
    }
    
    public void setStCd(String stCd) {
        isBlankObj = false;
        this.stCd = stCd;
    }

    public String getStCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"stCd\">");
        return stCd;
    }
    
    public void setStNmCn(String stNmCn) {
        isBlankObj = false;
        this.stNmCn = stNmCn;
    }

    public String getStNmCn() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"stNmCn\">");
        return stNmCn;
    }
    
    public void setCtyCd(String ctyCd) {
        isBlankObj = false;
        this.ctyCd = ctyCd;
    }

    public String getCtyCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"ctyCd\">");
        return ctyCd;
    }
    
    public void setCtyNmCn(String ctyNmCn) {
        isBlankObj = false;
        this.ctyNmCn = ctyNmCn;
    }

    public String getCtyNmCn() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"ctyNmCn\">");
        return ctyNmCn;
    }
    
    public void setDistCd(String distCd) {
        isBlankObj = false;
        this.distCd = distCd;
    }

    public String getDistCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"distCd\">");
        return distCd;
    }
    
    public void setDistNmCn(String distNmCn) {
        isBlankObj = false;
        this.distNmCn = distNmCn;
    }

    public String getDistNmCn() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"distNmCn\">");
        return distNmCn;
    }
    
    public void setPurchCatCd(String purchCatCd) {
        isBlankObj = false;
        this.purchCatCd = purchCatCd;
    }

    public String getPurchCatCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"purchCatCd\">");
        return purchCatCd;
    }
    
    public void setPurchCatNmCn(String purchCatNmCn) {
        isBlankObj = false;
        this.purchCatNmCn = purchCatNmCn;
    }

    public String getPurchCatNmCn() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"purchCatNmCn\">");
        return purchCatNmCn;
    }
    
    public void setSellCatCd(String sellCatCd) {
        isBlankObj = false;
        this.sellCatCd = sellCatCd;
    }

    public String getSellCatCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"sellCatCd\">");
        return sellCatCd;
    }
    
    public void setSellCatNmCn(String sellCatNmCn) {
        isBlankObj = false;
        this.sellCatNmCn = sellCatNmCn;
    }

    public String getSellCatNmCn() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"sellCatNmCn\">");
        return sellCatNmCn;
    }
    
    public void setOrdQtyLower(Double ordQtyLower) {
        isBlankObj = false;
        this.ordQtyLower = ordQtyLower;
    }

    public Double getOrdQtyLower() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"ordQtyLower\">");
        return ordQtyLower;
    }
    
    public void setOrdQtyUpper(Double ordQtyUpper) {
        isBlankObj = false;
        this.ordQtyUpper = ordQtyUpper;
    }

    public Double getOrdQtyUpper() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"ordQtyUpper\">");
        return ordQtyUpper;
    }
    
    public void setOrdAmtLower(Double ordAmtLower) {
        isBlankObj = false;
        this.ordAmtLower = ordAmtLower;
    }

    public Double getOrdAmtLower() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"ordAmtLower\">");
        return ordAmtLower;
    }
    
    public void setOrdAmtUpper(Double ordAmtUpper) {
        isBlankObj = false;
        this.ordAmtUpper = ordAmtUpper;
    }

    public Double getOrdAmtUpper() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"ordAmtUpper\">");
        return ordAmtUpper;
    }
    
    public void setMiscPrice(Double miscPrice) {
        isBlankObj = false;
        this.miscPrice = miscPrice;
    }

    public Double getMiscPrice() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"miscPrice\">");
        return miscPrice;
    }
    
    public void setMiscPriceMuCd(String miscPriceMuCd) {
        isBlankObj = false;
        this.miscPriceMuCd = miscPriceMuCd;
    }

    public String getMiscPriceMuCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"miscPriceMuCd\">");
        return miscPriceMuCd;
    }
    
    public void setMiscPriceMuNmCn(String miscPriceMuNmCn) {
        isBlankObj = false;
        this.miscPriceMuNmCn = miscPriceMuNmCn;
    }

    public String getMiscPriceMuNmCn() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"miscPriceMuNmCn\">");
        return miscPriceMuNmCn;
    }
    
    public void setHeavyQtyLower(Double heavyQtyLower) {
        isBlankObj = false;
        this.heavyQtyLower = heavyQtyLower;
    }

    public Double getHeavyQtyLower() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"heavyQtyLower\">");
        return heavyQtyLower;
    }
    
    public void setHeavyQtyUpper(Double heavyQtyUpper) {
        isBlankObj = false;
        this.heavyQtyUpper = heavyQtyUpper;
    }

    public Double getHeavyQtyUpper() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"heavyQtyUpper\">");
        return heavyQtyUpper;
    }
    
    public void setHeavyPrice(Double heavyPrice) {
        isBlankObj = false;
        this.heavyPrice = heavyPrice;
    }

    public Double getHeavyPrice() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"heavyPrice\">");
        return heavyPrice;
    }
    
    public void setHeavyPriceMuCd(String heavyPriceMuCd) {
        isBlankObj = false;
        this.heavyPriceMuCd = heavyPriceMuCd;
    }

    public String getHeavyPriceMuCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"heavyPriceMuCd\">");
        return heavyPriceMuCd;
    }
    
    public void setHeavyPriceMuNmCn(String heavyPriceMuNmCn) {
        isBlankObj = false;
        this.heavyPriceMuNmCn = heavyPriceMuNmCn;
    }

    public String getHeavyPriceMuNmCn() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"heavyPriceMuNmCn\">");
        return heavyPriceMuNmCn;
    }
    
    public void setBulkyQtyLower(Double bulkyQtyLower) {
        isBlankObj = false;
        this.bulkyQtyLower = bulkyQtyLower;
    }

    public Double getBulkyQtyLower() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"bulkyQtyLower\">");
        return bulkyQtyLower;
    }
    
    public void setBulkyQtyUpper(Double bulkyQtyUpper) {
        isBlankObj = false;
        this.bulkyQtyUpper = bulkyQtyUpper;
    }

    public Double getBulkyQtyUpper() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"bulkyQtyUpper\">");
        return bulkyQtyUpper;
    }
    
    public void setBulkyPrice(Double bulkyPrice) {
        isBlankObj = false;
        this.bulkyPrice = bulkyPrice;
    }

    public Double getBulkyPrice() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"bulkyPrice\">");
        return bulkyPrice;
    }
    
    public void setBulkyPriceMuCd(String bulkyPriceMuCd) {
        isBlankObj = false;
        this.bulkyPriceMuCd = bulkyPriceMuCd;
    }

    public String getBulkyPriceMuCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"bulkyPriceMuCd\">");
        return bulkyPriceMuCd;
    }
    
    public void setBulkyPriceMuNmCn(String bulkyPriceMuNmCn) {
        isBlankObj = false;
        this.bulkyPriceMuNmCn = bulkyPriceMuNmCn;
    }

    public String getBulkyPriceMuNmCn() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"bulkyPriceMuNmCn\">");
        return bulkyPriceMuNmCn;
    }
    
    public void setDiscRate(Double discRate) {
        isBlankObj = false;
        this.discRate = discRate;
    }

    public Double getDiscRate() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"discRate\">");
        return discRate;
    }
    
    public void setUrl(String url) {
        isBlankObj = false;
        this.url = url;
    }

    public String getUrl() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"url\">");
        return url;
    }
    
    public void setVldFrom(Timestamp vldFrom) {
        isBlankObj = false;
        this.vldFrom = vldFrom;
    }

    public Timestamp getVldFrom() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"vldFrom\">");
        return vldFrom;
    }
    
    public void setVldFromStr(String vldFromStr) {
        isBlankObj = false;
        this.vldFromStr = vldFromStr;
    }

    public String getVldFromStr() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"vldFromStr\">");
        return vldFromStr;
    }
    
    public void setVldTo(Timestamp vldTo) {
        isBlankObj = false;
        this.vldTo = vldTo;
    }

    public Timestamp getVldTo() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"vldTo\">");
        return vldTo;
    }
    
    public void setVldToStr(String vldToStr) {
        isBlankObj = false;
        this.vldToStr = vldToStr;
    }

    public String getVldToStr() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"vldToStr\">");
        return vldToStr;
    }
    
    public void setStatCd(String statCd) {
        isBlankObj = false;
        this.statCd = statCd;
    }

    public String getStatCd() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"statCd\">");
        return statCd;
    }
    
    public void setStatNmCn(String statNmCn) {
        isBlankObj = false;
        this.statNmCn = statNmCn;
    }

    public String getStatNmCn() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"statNmCn\">");
        return statNmCn;
    }
    
    public void setViewOrd(Short viewOrd) {
        isBlankObj = false;
        this.viewOrd = viewOrd;
    }

    public Short getViewOrd() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"viewOrd\">");
        return viewOrd;
    }
    
    public void setLogicOrd(Short logicOrd) {
        isBlankObj = false;
        this.logicOrd = logicOrd;
    }

    public Short getLogicOrd() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"logicOrd\">");
        return logicOrd;
    }
    
    public void setCrtTm(Timestamp crtTm) {
        isBlankObj = false;
        this.crtTm = crtTm;
    }

    public Timestamp getCrtTm() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"crtTm\">");
        return crtTm;
    }
    
    public void setCrtTmStr(String crtTmStr) {
        isBlankObj = false;
        this.crtTmStr = crtTmStr;
    }

    public String getCrtTmStr() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"crtTmStr\">");
        return crtTmStr;
    }
    
    public void setCrtBy(String crtBy) {
        isBlankObj = false;
        this.crtBy = crtBy;
    }

    public String getCrtBy() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"crtBy\">");
        return crtBy;
    }
    
    public void setUpdTm(Timestamp updTm) {
        isBlankObj = false;
        this.updTm = updTm;
    }

    public Timestamp getUpdTm() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"updTm\">");
        return updTm;
    }
    
    public void setUpdTmStr(String updTmStr) {
        isBlankObj = false;
        this.updTmStr = updTmStr;
    }

    public String getUpdTmStr() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"updTmStr\">");
        return updTmStr;
    }
    
    public void setUpdBy(String updBy) {
        isBlankObj = false;
        this.updBy = updBy;
    }

    public String getUpdBy() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"updBy\">");
        return updBy;
    }
    
    public void setEditFlag(String editFlag) {
        isBlankObj = false;
        this.editFlag = editFlag;
    }

    public String getEditFlag() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"editFlag\">");
        return editFlag;
    }
    
    public void setRelsNbr(String relsNbr) {
        isBlankObj = false;
        this.relsNbr = relsNbr;
    }

    public String getRelsNbr() {
        logger.trace("com.myco.model.vo.cart.FnPtyPricingVo	<includedAttr name=\"relsNbr\">");
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
