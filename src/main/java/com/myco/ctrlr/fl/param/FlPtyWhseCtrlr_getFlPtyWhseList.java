/**************************************************************************************
 * 请不要编辑这个文件，在下一次脚本运行的时候，本文件内容将根据最新的数据模型和配置进行更新
 **************************************************************************************
 */
package com.myco.ctrlr.fl.param;

import java.io.Serializable;
import java.util.List;

/**
 * 查询仓库档案列表的HTTP请求参数
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
public class FlPtyWhseCtrlr_getFlPtyWhseList implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    // 请求类
    public class Reqt {
    
        private String cd = null; // 编码
        private String nmCn = null; // 名称
        private String ownerCds = null; // 所属平台CD
        private String ctyNmCn = null; // 城市
        private String addrLine1 = null; // 地址
        private String statCds = null; // 状态编码
        private String hasShortHaul = null; // 有无短驳线路
        private String hasLoadOff = null; // 有无装卸入仓
        private String hasDeliv = null; // 有无落地入仓
        private String orderBy = null; // 排序
        private String order = null; // 排序
        private Integer pageSize = null; // 页面大小
        private Integer pageNbr = null; // 当前页
        
        public void setCd(String cd) {
            this.cd = cd;
        }
        
        public String getCd() {
            return cd;
        }
        
        public void setNmCn(String nmCn) {
            this.nmCn = nmCn;
        }
        
        public String getNmCn() {
            return nmCn;
        }
        
        public void setOwnerCds(String ownerCds) {
            this.ownerCds = ownerCds;
        }
        
        public String getOwnerCds() {
            return ownerCds;
        }
        
        public void setCtyNmCn(String ctyNmCn) {
            this.ctyNmCn = ctyNmCn;
        }
        
        public String getCtyNmCn() {
            return ctyNmCn;
        }
        
        public void setAddrLine1(String addrLine1) {
            this.addrLine1 = addrLine1;
        }
        
        public String getAddrLine1() {
            return addrLine1;
        }
        
        public void setStatCds(String statCds) {
            this.statCds = statCds;
        }
        
        public String getStatCds() {
            return statCds;
        }
        
        public void setHasShortHaul(String hasShortHaul) {
            this.hasShortHaul = hasShortHaul;
        }
        
        public String getHasShortHaul() {
            return hasShortHaul;
        }
        
        public void setHasLoadOff(String hasLoadOff) {
            this.hasLoadOff = hasLoadOff;
        }
        
        public String getHasLoadOff() {
            return hasLoadOff;
        }
        
        public void setHasDeliv(String hasDeliv) {
            this.hasDeliv = hasDeliv;
        }
        
        public String getHasDeliv() {
            return hasDeliv;
        }
        
        public void setOrderBy(String orderBy) {
            this.orderBy = orderBy;
        }
        
        public String getOrderBy() {
            return orderBy;
        }
        
        public void setOrder(String order) {
            this.order = order;
        }
        
        public String getOrder() {
            return order;
        }
        
        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }
        
        public Integer getPageSize() {
            return pageSize;
        }
        
        public void setPageNbr(Integer pageNbr) {
            this.pageNbr = pageNbr;
        }
        
        public Integer getPageNbr() {
            return pageNbr;
        }
        
    }

    // 响应类
    public class Resp {
    
        private long whseId = Long.MIN_VALUE; // id
        private String cd = null; // 编码
        private String nmCn = null; // 中文名
        private String ownerNmCn = null; // 所属平台
        private long whseLocId = Long.MIN_VALUE; // id
        private String stCd = null; // 省份编码
        private String stNmCn = null; // 省份
        private String ctyCd = null; // 城市编码
        private String ctyNmCn = null; // 城市
        private String distCd = null; // 区县编码
        private String distNmCn = null; // 区县
        private String addrLine1 = null; // 地址
        private String contcNm1 = null; // 收货人
        private String telephone1 = null; // 电话
        private String mobilePhone1 = null; // 手机
        private String memo = null; // 备注
        private String hasShortHaul = null; // 有无短驳报价
        private String hasLoadOff = null; // 有无装卸入仓
        private String hasDeliv = null; // 有无落地入仓
        private String crtBy = null; // 新增人
        private String crtTm = null; // 新增时间
        private String updBy = null; // 修改人
        private String updTm = null; // 修改时间
        private String orderBy = null; // 排序
        private String order = null; // 排序
        private Integer pageSize = null; // 页面大小
        private Integer pageNbr = null; // 当前页
        
        public void setWhseId(long whseId) {
            this.whseId = whseId;
        }
        
        public long getWhseId() {
            return whseId;
        }
        
        public void setCd(String cd) {
            this.cd = cd;
        }
        
        public String getCd() {
            return cd;
        }
        
        public void setNmCn(String nmCn) {
            this.nmCn = nmCn;
        }
        
        public String getNmCn() {
            return nmCn;
        }
        
        public void setOwnerNmCn(String ownerNmCn) {
            this.ownerNmCn = ownerNmCn;
        }
        
        public String getOwnerNmCn() {
            return ownerNmCn;
        }
        
        public void setWhseLocId(long whseLocId) {
            this.whseLocId = whseLocId;
        }
        
        public long getWhseLocId() {
            return whseLocId;
        }
        
        public void setStCd(String stCd) {
            this.stCd = stCd;
        }
        
        public String getStCd() {
            return stCd;
        }
        
        public void setStNmCn(String stNmCn) {
            this.stNmCn = stNmCn;
        }
        
        public String getStNmCn() {
            return stNmCn;
        }
        
        public void setCtyCd(String ctyCd) {
            this.ctyCd = ctyCd;
        }
        
        public String getCtyCd() {
            return ctyCd;
        }
        
        public void setCtyNmCn(String ctyNmCn) {
            this.ctyNmCn = ctyNmCn;
        }
        
        public String getCtyNmCn() {
            return ctyNmCn;
        }
        
        public void setDistCd(String distCd) {
            this.distCd = distCd;
        }
        
        public String getDistCd() {
            return distCd;
        }
        
        public void setDistNmCn(String distNmCn) {
            this.distNmCn = distNmCn;
        }
        
        public String getDistNmCn() {
            return distNmCn;
        }
        
        public void setAddrLine1(String addrLine1) {
            this.addrLine1 = addrLine1;
        }
        
        public String getAddrLine1() {
            return addrLine1;
        }
        
        public void setContcNm1(String contcNm1) {
            this.contcNm1 = contcNm1;
        }
        
        public String getContcNm1() {
            return contcNm1;
        }
        
        public void setTelephone1(String telephone1) {
            this.telephone1 = telephone1;
        }
        
        public String getTelephone1() {
            return telephone1;
        }
        
        public void setMobilePhone1(String mobilePhone1) {
            this.mobilePhone1 = mobilePhone1;
        }
        
        public String getMobilePhone1() {
            return mobilePhone1;
        }
        
        public void setMemo(String memo) {
            this.memo = memo;
        }
        
        public String getMemo() {
            return memo;
        }
        
        public void setHasShortHaul(String hasShortHaul) {
            this.hasShortHaul = hasShortHaul;
        }
        
        public String getHasShortHaul() {
            return hasShortHaul;
        }
        
        public void setHasLoadOff(String hasLoadOff) {
            this.hasLoadOff = hasLoadOff;
        }
        
        public String getHasLoadOff() {
            return hasLoadOff;
        }
        
        public void setHasDeliv(String hasDeliv) {
            this.hasDeliv = hasDeliv;
        }
        
        public String getHasDeliv() {
            return hasDeliv;
        }
        
        public void setCrtBy(String crtBy) {
            this.crtBy = crtBy;
        }
        
        public String getCrtBy() {
            return crtBy;
        }
        
        public void setCrtTm(String crtTm) {
            this.crtTm = crtTm;
        }
        
        public String getCrtTm() {
            return crtTm;
        }
        
        public void setUpdBy(String updBy) {
            this.updBy = updBy;
        }
        
        public String getUpdBy() {
            return updBy;
        }
        
        public void setUpdTm(String updTm) {
            this.updTm = updTm;
        }
        
        public String getUpdTm() {
            return updTm;
        }
        
        public void setOrderBy(String orderBy) {
            this.orderBy = orderBy;
        }
        
        public String getOrderBy() {
            return orderBy;
        }
        
        public void setOrder(String order) {
            this.order = order;
        }
        
        public String getOrder() {
            return order;
        }
        
        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }
        
        public Integer getPageSize() {
            return pageSize;
        }
        
        public void setPageNbr(Integer pageNbr) {
            this.pageNbr = pageNbr;
        }
        
        public Integer getPageNbr() {
            return pageNbr;
        }
        
    }

}