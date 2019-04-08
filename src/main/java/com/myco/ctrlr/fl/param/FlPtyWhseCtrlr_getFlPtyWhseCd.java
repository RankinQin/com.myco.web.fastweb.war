/**************************************************************************************
 * 请不要编辑这个文件，在下一次脚本运行的时候，本文件内容将根据最新的数据模型和配置进行更新
 **************************************************************************************
 */
package com.myco.ctrlr.fl.param;

import java.io.Serializable;
import java.util.List;

/**
 * 获取仓库编码 的HTTP请求参数
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
public class FlPtyWhseCtrlr_getFlPtyWhseCd implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    // 请求类
    public class Reqt {
    
        private String ownerId = null; // 所属平台ID
        private String ownerCd = null; // 所属平台编码
        
        public void setOwnerId(String ownerId) {
            this.ownerId = ownerId;
        }
        
        public String getOwnerId() {
            return ownerId;
        }
        
        public void setOwnerCd(String ownerCd) {
            this.ownerCd = ownerCd;
        }
        
        public String getOwnerCd() {
            return ownerCd;
        }
        
    }

    // 响应类
    public class Resp {
    
        private String flPtyWhseCd = null; // 仓库编码
        
        public void setFlPtyWhseCd(String flPtyWhseCd) {
            this.flPtyWhseCd = flPtyWhseCd;
        }
        
        public String getFlPtyWhseCd() {
            return flPtyWhseCd;
        }
        
    }

}