/**************************************************************************************
 * 请不要编辑这个文件，在下一次脚本运行的时候，本文件内容将根据最新的数据模型和配置进行更新
 * 每次生成DTO，其中的VO一部分从现有文件系统中读取；另一部分来自对数据访问的配置
 **************************************************************************************/
package com.myco.model.dto.cart.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.myco.model.common.BaseDto;
import com.myco.model.vo.cart.FlPtyFcltyVo;
import com.myco.model.vo.cart.FlPtyFcltyLocVo;
import com.myco.model.vo.cart.RtRteVo;
import com.myco.model.vo.cart.FnPtyLoadoffPricingVo;
import com.myco.model.vo.cart.FnPtyPricingVo;
import com.myco.model.vo.cart.LcLocVo;

/**
 * 
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
public class FlPtyWhseDto extends BaseDto implements Cloneable, Serializable {
    
    private static final long serialVersionUID = 1L;
    private static final Logger logger = Logger.getLogger(FlPtyWhseDto.class);

    protected FlPtyFcltyVo flPtyFcltyVo = new FlPtyFcltyVo(); // [select] 参与方与设施间关系，可以用来表示多个PTY共享FCLTY的情况。
    protected FlPtyFcltyLocVo flPtyFcltyLocVo = new FlPtyFcltyLocVo(); // [select] 参与方设施与位置关系
    protected FlPtyFcltyVo newFlPtyFcltyVo = null; // [change] 参与方与设施间关系，可以用来表示多个PTY共享FCLTY的情况。
    protected FlPtyFcltyLocVo newFlPtyFcltyLocVo = null; // [change] 参与方设施与位置关系
    protected RtRteVo rtRteVo = new RtRteVo(); // [select] 线路
    protected FnPtyLoadoffPricingVo fnPtyLoadoffPricingVo = new FnPtyLoadoffPricingVo(); // [select] 参与卸货费报价
    protected FnPtyPricingVo loadOffFnPtyPricing = new FnPtyPricingVo(); // [select] 参与方的定价策略
    protected LcLocVo lcLocVo = new LcLocVo(); // [select] 位置
    protected FnPtyPricingVo delivFnPtyPricing = new FnPtyPricingVo(); // [select] 参与方的定价策略

    public void setFlPtyFcltyVo(FlPtyFcltyVo flPtyFcltyVo) {
        this.flPtyFcltyVo = flPtyFcltyVo;
    }

    public FlPtyFcltyVo getFlPtyFcltyVo() {
        return flPtyFcltyVo;
    }
    
    public void setFlPtyFcltyLocVo(FlPtyFcltyLocVo flPtyFcltyLocVo) {
        this.flPtyFcltyLocVo = flPtyFcltyLocVo;
    }

    public FlPtyFcltyLocVo getFlPtyFcltyLocVo() {
        return flPtyFcltyLocVo;
    }
    
    public void setNewFlPtyFcltyVo(FlPtyFcltyVo newFlPtyFcltyVo) {
        this.newFlPtyFcltyVo = newFlPtyFcltyVo;
    }

    public FlPtyFcltyVo getNewFlPtyFcltyVo() {
        return newFlPtyFcltyVo;
    }
    
    public void setNewFlPtyFcltyLocVo(FlPtyFcltyLocVo newFlPtyFcltyLocVo) {
        this.newFlPtyFcltyLocVo = newFlPtyFcltyLocVo;
    }

    public FlPtyFcltyLocVo getNewFlPtyFcltyLocVo() {
        return newFlPtyFcltyLocVo;
    }
    
    public void setRtRteVo(RtRteVo rtRteVo) {
        this.rtRteVo = rtRteVo;
    }

    public RtRteVo getRtRteVo() {
        return rtRteVo;
    }
    
    public void setFnPtyLoadoffPricingVo(FnPtyLoadoffPricingVo fnPtyLoadoffPricingVo) {
        this.fnPtyLoadoffPricingVo = fnPtyLoadoffPricingVo;
    }

    public FnPtyLoadoffPricingVo getFnPtyLoadoffPricingVo() {
        return fnPtyLoadoffPricingVo;
    }
    
    public void setLoadOffFnPtyPricing(FnPtyPricingVo loadOffFnPtyPricing) {
        this.loadOffFnPtyPricing = loadOffFnPtyPricing;
    }

    public FnPtyPricingVo getLoadOffFnPtyPricing() {
        return loadOffFnPtyPricing;
    }
    
    public void setLcLocVo(LcLocVo lcLocVo) {
        this.lcLocVo = lcLocVo;
    }

    public LcLocVo getLcLocVo() {
        return lcLocVo;
    }
    
    public void setDelivFnPtyPricing(FnPtyPricingVo delivFnPtyPricing) {
        this.delivFnPtyPricing = delivFnPtyPricing;
    }

    public FnPtyPricingVo getDelivFnPtyPricing() {
        return delivFnPtyPricing;
    }
    
}