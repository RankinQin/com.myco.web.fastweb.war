/**************************************************************************************
 * 请不要编辑这个文件，在下一次脚本运行的时候，本文件内容将根据最新的数据模型和配置进行更新
 **************************************************************************************/
package com.myco.manager.fl.base;

import java.util.List;

import com.myco.common.exception.AppException;
import com.myco.model.dto.cart.ext.FlPtyWhseDtoX;

/**************************************************************************************************
 * 仓库档案管理
 * Creation time: 2017-6-11 14:33:43
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 **************************************************************************************************
 * Mgr的谓词约定：
 * add/new: 新增
 * find/get: 查找
 * count: 计数
 * change: 修改
 * remove: 逻辑删除
 * delete: 物理删除
 */
public interface IFlPtyWhseMgr {

    // 查询仓库档案列表
    public List<FlPtyWhseDtoX> findFlPtyWhseList(FlPtyWhseDtoX flPtyWhseDtoX) throws AppException;
        
    // 统计仓库档案数量
    public int countFlPtyWhseList(FlPtyWhseDtoX flPtyWhseDtoX) throws AppException;
        
    // 查询仓库档案列表
    public FlPtyWhseDtoX findFlPtyWhseDtl(FlPtyWhseDtoX flPtyWhseDtoX) throws AppException;
        
    // 增加仓库档案
    public int addFlPtyWhse(FlPtyWhseDtoX flPtyWhseDtoX) throws AppException;
        
    // 修改仓库档案
    public int modifyFlPtyWhse(FlPtyWhseDtoX flPtyWhseDtoX) throws AppException;
        
    // 删除仓库档案
    public int removeFlPtyWhse(FlPtyWhseDtoX flPtyWhseDtoX) throws AppException;
        
}
