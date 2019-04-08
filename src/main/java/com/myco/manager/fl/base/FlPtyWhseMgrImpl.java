/**************************************************************************************
 * 请不要编辑这个文件，在下一次脚本运行的时候，本文件内容将根据最新的数据模型和配置进行更新
 **************************************************************************************
 * Mgr的谓词约定：
 * add/new: 新增
 * find/get: 查找
 * count: 计数
 * change: 修改
 * remove: 逻辑删除
 * delete: 物理删除
 */
package com.myco.manager.fl.base;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myco.common.exception.AppException;
import com.myco.common.i18n.ResourceReader;
import com.myco.manager.common.BaseMgr;
import com.myco.manager.common.SvcMsgCode;
import com.myco.manager.fl.base.IFlPtyWhseMgr;
import com.myco.orm.asm.cart.ext.IFlPtyWhseAsmX;
import com.myco.orm.dao.cart.ext.IFlPtyWhseDaoX;
import com.myco.model.dto.cart.ext.FlPtyWhseDtoX;

/**
 * 仓库档案管理
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
 @Component("com.myco.manager.fl.base.FlPtyWhseMgrImpl")
public class FlPtyWhseMgrImpl extends BaseMgr implements IFlPtyWhseMgr {

    private static final Logger logger = Logger.getLogger(FlPtyWhseMgrImpl.class);

    @Autowired
    protected IFlPtyWhseAsmX iFlPtyWhseAsmX = null; // 仓库档案数据操作
    
    @Autowired
    protected IFlPtyWhseDaoX iFlPtyWhseDaoX = null; // 仓库档案数据操作
    

    /**
     * 查询仓库档案列表 [公共访问方法]
     * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
     */
    public List<FlPtyWhseDtoX> findFlPtyWhseList(FlPtyWhseDtoX flPtyWhseDtoX) throws AppException {
        
        logger.debug("[mgr]=====>>> 访问开始: findFlPtyWhseList 查询仓库档案列表");
        List<FlPtyWhseDtoX> rtrnFlPtyWhseDtoXList = null;
        
        try {
            rtrnFlPtyWhseDtoXList = _findFlPtyWhseList(flPtyWhseDtoX);
            logger.debug("[mgr]=====<<< 访问成功: findFlPtyWhseList 查询仓库档案列表");
        } catch (Throwable t) {
            handleException(new AppException(ResourceReader.class.getPackage().getName() + ".MessageBundle", SvcMsgCode._111250, null, t), logger);
        }

        return rtrnFlPtyWhseDtoXList;
        
    }
    
    // 查询仓库档案列表 [请继承此方法]
    protected List<FlPtyWhseDtoX> _findFlPtyWhseList(FlPtyWhseDtoX flPtyWhseDtoX) throws Throwable {
        return null;
    }
    
    /**
     * 统计仓库档案数量 [公共访问方法]
     * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
     */
    public int countFlPtyWhseList(FlPtyWhseDtoX flPtyWhseDtoX) throws AppException {
        
        logger.debug("[mgr]=====>>> 访问开始: countFlPtyWhseList 统计仓库档案数量");
        int rtrnInt = 0;
        
        try {
            rtrnInt = _countFlPtyWhseList(flPtyWhseDtoX);
            logger.debug("[mgr]=====<<< 访问成功: countFlPtyWhseList 统计仓库档案数量");
        } catch (Throwable t) {
            handleException(new AppException(ResourceReader.class.getPackage().getName() + ".MessageBundle", SvcMsgCode._111251, null, t), logger);
        }

        return rtrnInt;
        
    }
    
    // 统计仓库档案数量 [请继承此方法]
    protected int _countFlPtyWhseList(FlPtyWhseDtoX flPtyWhseDtoX) throws Throwable {
        return 0;
    }
    
    /**
     * 查询仓库档案列表 [公共访问方法]
     * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
     */
    public FlPtyWhseDtoX findFlPtyWhseDtl(FlPtyWhseDtoX flPtyWhseDtoX) throws AppException {
        
        logger.debug("[mgr]=====>>> 访问开始: findFlPtyWhseDtl 查询仓库档案列表");
        FlPtyWhseDtoX rtrnFlPtyWhseDtoX = null;
        
        try {
            rtrnFlPtyWhseDtoX = _findFlPtyWhseDtl(flPtyWhseDtoX);
            logger.debug("[mgr]=====<<< 访问成功: findFlPtyWhseDtl 查询仓库档案列表");
        } catch (Throwable t) {
            handleException(new AppException(ResourceReader.class.getPackage().getName() + ".MessageBundle", SvcMsgCode._111252, null, t), logger);
        }

        return rtrnFlPtyWhseDtoX;
        
    }
    
    // 查询仓库档案列表 [请继承此方法]
    protected FlPtyWhseDtoX _findFlPtyWhseDtl(FlPtyWhseDtoX flPtyWhseDtoX) throws Throwable {
        return null;
    }
    
    /**
     * 增加仓库档案 [公共访问方法]
     * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
     */
    public int addFlPtyWhse(FlPtyWhseDtoX flPtyWhseDtoX) throws AppException {
        
        logger.debug("[mgr]=====>>> 访问开始: addFlPtyWhse 增加仓库档案");
        int rtrnInt = 0;
        
        try {
            rtrnInt = _addFlPtyWhse(flPtyWhseDtoX);
            logger.debug("[mgr]=====<<< 访问成功: addFlPtyWhse 增加仓库档案");
        } catch (Throwable t) {
            handleException(new AppException(ResourceReader.class.getPackage().getName() + ".MessageBundle", SvcMsgCode._111253, null, t), logger);
        }

        return rtrnInt;
        
    }
    
    // 增加仓库档案 [请继承此方法]
    protected int _addFlPtyWhse(FlPtyWhseDtoX flPtyWhseDtoX) throws Throwable {
        return iFlPtyWhseAsmX.addFlPtyWhse(flPtyWhseDtoX);
    }
    
    /**
     * 修改仓库档案 [公共访问方法]
     * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
     */
    public int modifyFlPtyWhse(FlPtyWhseDtoX flPtyWhseDtoX) throws AppException {
        
        logger.debug("[mgr]=====>>> 访问开始: modifyFlPtyWhse 修改仓库档案");
        int rtrnInt = 0;
        
        try {
            rtrnInt = _modifyFlPtyWhse(flPtyWhseDtoX);
            logger.debug("[mgr]=====<<< 访问成功: modifyFlPtyWhse 修改仓库档案");
        } catch (Throwable t) {
            handleException(new AppException(ResourceReader.class.getPackage().getName() + ".MessageBundle", SvcMsgCode._111254, null, t), logger);
        }

        return rtrnInt;
        
    }
    
    // 修改仓库档案 [请继承此方法]
    protected int _modifyFlPtyWhse(FlPtyWhseDtoX flPtyWhseDtoX) throws Throwable {
        return iFlPtyWhseAsmX.changeFlPtyWhseByPK(flPtyWhseDtoX);
    }
    
    /**
     * 删除仓库档案 [公共访问方法]
     * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
     */
    public int removeFlPtyWhse(FlPtyWhseDtoX flPtyWhseDtoX) throws AppException {
        
        logger.debug("[mgr]=====>>> 访问开始: removeFlPtyWhse 删除仓库档案");
        int rtrnInt = 0;
        
        try {
            rtrnInt = _removeFlPtyWhse(flPtyWhseDtoX);
            logger.debug("[mgr]=====<<< 访问成功: removeFlPtyWhse 删除仓库档案");
        } catch (Throwable t) {
            handleException(new AppException(ResourceReader.class.getPackage().getName() + ".MessageBundle", SvcMsgCode._111255, null, t), logger);
        }

        return rtrnInt;
        
    }
    
    // 删除仓库档案 [请继承此方法]
    protected int _removeFlPtyWhse(FlPtyWhseDtoX flPtyWhseDtoX) throws Throwable {
        return 0;
    }
    
}
