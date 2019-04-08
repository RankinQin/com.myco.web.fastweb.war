package com.myco.ctrlr.fl.ext;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.myco.ctrlr.common.DataPack;
import com.myco.ctrlr.fl.base.FlPtyWhseCtrlr;
import com.myco.ctrlr.fl.param.*;

/**
 * 仓库档案管理
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
public class FlPtyWhseCtrlrX extends FlPtyWhseCtrlr {

    private static final Logger logger = Logger.getLogger(FlPtyWhseCtrlrX.class);

    // 查询仓库档案列表 [请重写本方法]
    @Override
    protected DataPack _getFlPtyWhseList(
        HttpServletRequest httpReqt,
        HttpServletResponse httpResp,
        FlPtyWhseCtrlr_getFlPtyWhseList.Reqt getFlPtyWhseListReqt
        ) throws Throwable {
        
		// 默认实现是调用父类的同名方法
		return super._getFlPtyWhseList(httpReqt, httpResp, getFlPtyWhseListReqt);
        
    }
    
    // 查询仓库档案详情 [请重写本方法]
    @Override
    protected DataPack _getFlPtyWhseDtl(
        FlPtyWhseCtrlr_getFlPtyWhseDtl.Reqt getFlPtyWhseDtlReqt
        ) throws Throwable {
        
		// 默认实现是调用父类的同名方法
		return super._getFlPtyWhseDtl(getFlPtyWhseDtlReqt);
        
    }
    
    // 新增仓库档案 [请重写本方法]
    @Override
    protected DataPack _addFlPtyWhse(
        HttpServletRequest httpReqt,
        HttpServletResponse httpResp,
        FlPtyWhseCtrlr_addFlPtyWhse.Reqt addFlPtyWhseReqt
        ) throws Throwable {
        
		// 默认实现是调用父类的同名方法
		return super._addFlPtyWhse(httpReqt, httpResp, addFlPtyWhseReqt);
        
    }
    
    // 修改仓库档案 [请重写本方法]
    @Override
    protected DataPack _modifyFlPtyWhse(
        HttpServletRequest httpReqt,
        HttpServletResponse httpResp,
        FlPtyWhseCtrlr_modifyFlPtyWhse.Reqt modifyFlPtyWhseReqt
        ) throws Throwable {
        
		// 默认实现是调用父类的同名方法
		return super._modifyFlPtyWhse(httpReqt, httpResp, modifyFlPtyWhseReqt);
        
    }
    
    // 移除仓库档案 [请重写本方法]
    @Override
    protected DataPack _removeFlPtyWhse(
        HttpServletRequest httpReqt,
        HttpServletResponse httpResp,
        FlPtyWhseCtrlr_removeFlPtyWhse.Reqt removeFlPtyWhseReqt
        ) throws Throwable {
        
		// 默认实现是调用父类的同名方法
		return super._removeFlPtyWhse(httpReqt, httpResp, removeFlPtyWhseReqt);
        
    }
    
    // 获取仓库编码  [请重写本方法]
    @Override
    protected DataPack _getFlPtyWhseCd(
        HttpServletRequest httpReqt,
        HttpServletResponse httpResp,
        FlPtyWhseCtrlr_getFlPtyWhseCd.Reqt getFlPtyWhseCdReqt
        ) throws Throwable {
        
		// 默认实现是调用父类的同名方法
		return super._getFlPtyWhseCd(httpReqt, httpResp, getFlPtyWhseCdReqt);
        
    }
    
}
