package com.myco.manager.fl.ext;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.myco.common.exception.AppException;
import com.myco.manager.fl.ext.IFlPtyWhseMgrX;
import com.myco.manager.fl.base.FlPtyWhseMgrImpl;
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
@Component("com.myco.manager.fl.ext.FlPtyWhseMgrXImpl")
public class FlPtyWhseMgrXImpl extends FlPtyWhseMgrImpl implements IFlPtyWhseMgrX {

    private static final Logger logger = Logger.getLogger(FlPtyWhseMgrXImpl.class);

    // 查询仓库档案列表 [请重写本方法]
    @Override
    protected List<FlPtyWhseDtoX> _findFlPtyWhseList(FlPtyWhseDtoX flPtyWhseDtoX) throws Throwable {

		// TODO Auto-generated method stub
		return super._findFlPtyWhseList(flPtyWhseDtoX);
        
    }
    
    // 统计仓库档案数量 [请重写本方法]
    @Override
    protected int _countFlPtyWhseList(FlPtyWhseDtoX flPtyWhseDtoX) throws Throwable {

		// TODO Auto-generated method stub
		return super._countFlPtyWhseList(flPtyWhseDtoX);
        
    }
    
    // 查询仓库档案列表 [请重写本方法]
    @Override
    protected FlPtyWhseDtoX _findFlPtyWhseDtl(FlPtyWhseDtoX flPtyWhseDtoX) throws Throwable {

		// TODO Auto-generated method stub
		return super._findFlPtyWhseDtl(flPtyWhseDtoX);
        
    }
    
    // 增加仓库档案 [请重写本方法]
    @Override
    protected int _addFlPtyWhse(FlPtyWhseDtoX flPtyWhseDtoX) throws Throwable {

		// TODO Auto-generated method stub
		return super._addFlPtyWhse(flPtyWhseDtoX);
        
    }
    
    // 修改仓库档案 [请重写本方法]
    @Override
    protected int _modifyFlPtyWhse(FlPtyWhseDtoX flPtyWhseDtoX) throws Throwable {

		// TODO Auto-generated method stub
		return super._modifyFlPtyWhse(flPtyWhseDtoX);
        
    }
    
    // 删除仓库档案 [请重写本方法]
    @Override
    protected int _removeFlPtyWhse(FlPtyWhseDtoX flPtyWhseDtoX) throws Throwable {

		// TODO Auto-generated method stub
		return super._removeFlPtyWhse(flPtyWhseDtoX);
        
    }
    
}
