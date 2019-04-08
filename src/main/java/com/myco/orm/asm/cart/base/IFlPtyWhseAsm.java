/**************************************************************************************
 * 请不要编辑这个文件，在下一次脚本运行的时候，本文件内容将根据最新的数据模型和配置进行更新
 **************************************************************************************
 */
package com.myco.orm.asm.cart.base;

import java.util.List;
import java.util.Map;

import com.myco.common.exception.AppException;
import com.myco.model.dto.cart.ext.FlPtyWhseDtoX;

/**
 * 仓库档案数据操作
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
public interface IFlPtyWhseAsm {

    // [add]新增仓库档案
    public int addFlPtyWhse(FlPtyWhseDtoX flPtyWhseDtoX) throws AppException;
        
    // [change]新增仓库档案
    public int changeFlPtyWhseByPK(FlPtyWhseDtoX flPtyWhseDtoX) throws AppException;
        
}
