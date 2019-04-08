/**************************************************************************************
 * 请不要编辑这个文件，在下一次脚本运行的时候，本文件内容将根据最新的数据模型和配置进行更新
 **************************************************************************************
 */
package com.myco.ctrlr.fl.param;

import java.io.Serializable;
import java.util.List;

/**
 * 移除仓库档案的HTTP请求参数
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
public class FlPtyWhseCtrlr_removeFlPtyWhse implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    // 请求类
    public class Reqt {
    
        private long whseId = Long.MIN_VALUE; // id
        private long whseLocId = Long.MIN_VALUE; // id
        
        public void setWhseId(long whseId) {
            this.whseId = whseId;
        }
        
        public long getWhseId() {
            return whseId;
        }
        
        public void setWhseLocId(long whseLocId) {
            this.whseLocId = whseLocId;
        }
        
        public long getWhseLocId() {
            return whseLocId;
        }
        
    }

    // 响应类
    public class Resp {
    }

}