/**************************************************************************************
 * 请不要编辑这个文件，在下一次脚本运行的时候，本文件内容将根据最新的数据模型和配置进行更新
 **************************************************************************************
 */
package com.myco.ctrlr.fl.param;

import java.io.Serializable;
import java.util.List;

/**
 * 查询仓库档案详情的HTTP请求参数
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
public class FlPtyWhseCtrlr_getFlPtyWhseDtl implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    // 请求类
    public class Reqt {
    
        private Long whseId = null; // 仓库ID
        
        public void setWhseId(Long whseId) {
            this.whseId = whseId;
        }
        
        public Long getWhseId() {
            return whseId;
        }
        
    }

    // 响应类
    public class Resp {
    
        private long whseId = Long.MIN_VALUE; // id
        private String cd = null; // 编码
        private String nmCn = null; // 中文名
        private String ownerCd = null; // 所属平台编码
        private String ownerNmCn = null; // 所属平台名称
        private long whseLocId = Long.MIN_VALUE; // id
        private String statCd = null; // 状态
        private String stCd = null; // 省份编码
        private String stNmCn = null; // 省份名称
        private String ctyCd = null; // 城市编码
        private String ctyNmCn = null; // 城市名称
        private String distCd = null; // 区县编码
        private String distNmCn = null; // 区县名称
        private String addrLine1 = null; // 地址
        private String contcNm1 = null; // 收货人
        private String telephone1 = null; // 电话
        private String mobilePhone1 = null; // 手机
        private String memo = null; // 备注
        
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
        
        public void setOwnerCd(String ownerCd) {
            this.ownerCd = ownerCd;
        }
        
        public String getOwnerCd() {
            return ownerCd;
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
        
        public void setStatCd(String statCd) {
            this.statCd = statCd;
        }
        
        public String getStatCd() {
            return statCd;
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
        
    }

}