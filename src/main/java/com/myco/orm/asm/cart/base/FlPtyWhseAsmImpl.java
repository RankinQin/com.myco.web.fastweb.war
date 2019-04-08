/**************************************************************************************
 * 请不要编辑这个文件，在下一次脚本运行的时候，本文件内容将根据最新的数据模型和配置进行更新
 **************************************************************************************
 * Asm的谓词约定：
 * add: 新增
 * change: 修改
 * remove: 逻辑删除
 * delete: 物理删除
 */
package com.myco.orm.asm.cart.base;

import java.util.List;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myco.common.lang.CmCatSysCode;
import com.myco.common.lang.CmCatSysCode2;
import com.myco.common.exception.AppException;
import com.myco.orm.common.BaseAsm;
import com.myco.orm.asm.cart.base.IFlPtyWhseAsm;
import com.myco.model.dto.cart.ext.FlPtyWhseDtoX;
import com.myco.model.vo.cart.FlPtyFcltyVo;
import com.myco.orm.dao.cart.ext.IFlPtyWhseDaoX;
import com.myco.model.vo.cart.FlPtyFcltyLocVo;

/**
 * 仓库档案数据操作
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
public class FlPtyWhseAsmImpl extends BaseAsm implements IFlPtyWhseAsm {

    private static final Logger logger = Logger.getLogger(FlPtyWhseAsmImpl.class);

    @Autowired
    protected IFlPtyWhseDaoX iFlPtyWhseDaoX = null; // 
        

    /**
     * [add]新增仓库档案
     * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
     */
    public int addFlPtyWhse(FlPtyWhseDtoX flPtyWhseDtoX) throws AppException {
        
        logger.info("[asm]=====>>> 访问开始: addFlPtyWhse [add]新增仓库档案");
        
        int theInt = 0;

        try {

            // 仓库档案
            FlPtyFcltyVo flPtyFcltyVo = flPtyWhseDtoX.getFlPtyFcltyVo();
            if (flPtyFcltyVo != null) {
                copyStr2Tm(flPtyFcltyVo, logger);
                flPtyFcltyVo.setCatCd(CmCatSysCode.FacilityWhseB2CPlatform);
                flPtyFcltyVo.setEditFlag(CmCatSysCode.RevisionNew.cd());
                flPtyFcltyVo.setCrtTm(flPtyWhseDtoX.getTrxTime());
                flPtyFcltyVo.setCrtBy(flPtyWhseDtoX.getUserIdentity().getPtyAcctLoginName());
                flPtyFcltyVo.setUpdTm(flPtyWhseDtoX.getTrxTime());
                flPtyFcltyVo.setUpdBy(flPtyWhseDtoX.getUserIdentity().getPtyAcctLoginName());
                flPtyFcltyVo.setEditFlag(CmCatSysCode.RevisionNew.cd());
                theInt = iFlPtyWhseDaoX.insertFlPtyFcltySelective(flPtyFcltyVo);
            }

            // 仓库档案
            FlPtyFcltyLocVo flPtyFcltyLocVo = flPtyWhseDtoX.getFlPtyFcltyLocVo();
            if (flPtyFcltyLocVo != null) {
                copyStr2Tm(flPtyFcltyLocVo, logger);
                flPtyFcltyLocVo.setPtyFcltyId(flPtyFcltyVo.getId());
                flPtyFcltyLocVo.setCatCd(CmCatSysCode.FacilityWhseB2CPlatform);
                flPtyFcltyLocVo.setEditFlag(CmCatSysCode.RevisionNew.cd());
                flPtyFcltyLocVo.setCrtTm(flPtyWhseDtoX.getTrxTime());
                flPtyFcltyLocVo.setCrtBy(flPtyWhseDtoX.getUserIdentity().getPtyAcctLoginName());
                flPtyFcltyLocVo.setUpdTm(flPtyWhseDtoX.getTrxTime());
                flPtyFcltyLocVo.setUpdBy(flPtyWhseDtoX.getUserIdentity().getPtyAcctLoginName());
                flPtyFcltyLocVo.setEditFlag(CmCatSysCode.RevisionNew.cd());
                iFlPtyWhseDaoX.insertFlPtyFcltyLocSelective(flPtyFcltyLocVo);
            }

        } catch (Throwable t) {
            handleException(new AppException("[add]新增仓库档案失败", t), logger);
        }

        logger.debug("[asm]=====<<< 访问成功: addFlPtyWhse [add]新增仓库档案");
        return theInt;

    }
    
    /**
     * [change]新增仓库档案
     * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
     */
    public int changeFlPtyWhseByPK(FlPtyWhseDtoX flPtyWhseDtoX) throws AppException {
        
        logger.info("[asm]=====>>> 访问开始: changeFlPtyWhseByPK [change]新增仓库档案");
        
        int theInt = 0;

        try {

            // 仓库档案
            FlPtyFcltyVo oldFlPtyFcltyVo = flPtyWhseDtoX.getFlPtyFcltyVo();
            FlPtyFcltyVo newFlPtyFcltyVo = flPtyWhseDtoX.getNewFlPtyFcltyVo();
            if (newFlPtyFcltyVo != null && oldFlPtyFcltyVo != null) {
                if (oldFlPtyFcltyVo.getId() == null) {
                    handleException(new AppException("[change]新增仓库档案失败"), logger);
                }
                copyStr2Tm(oldFlPtyFcltyVo, logger);
                copyStr2Tm(newFlPtyFcltyVo, logger);
                newFlPtyFcltyVo.setEditFlag(CmCatSysCode.RevisionUpdated.cd());
                newFlPtyFcltyVo.setUpdTm(flPtyWhseDtoX.getTrxTime());
                newFlPtyFcltyVo.setUpdBy(flPtyWhseDtoX.getUserIdentity().getPtyAcctLoginName());
                HashMap<String, FlPtyFcltyVo> voMap = new HashMap<String, FlPtyFcltyVo>();
                voMap.put("oldValue", oldFlPtyFcltyVo);
                voMap.put("newValue", newFlPtyFcltyVo);
                theInt = iFlPtyWhseDaoX.updateFlPtyFcltySelectiveByPKTmLck(voMap);
            } else if (oldFlPtyFcltyVo != null) {
                if (oldFlPtyFcltyVo.getId() == null) {
                    handleException(new AppException("[change]新增仓库档案失败"), logger);
                }
                copyStr2Tm(oldFlPtyFcltyVo, logger);
                oldFlPtyFcltyVo.setEditFlag(CmCatSysCode.RevisionUpdated.cd());
                oldFlPtyFcltyVo.setUpdTm(flPtyWhseDtoX.getTrxTime());
                oldFlPtyFcltyVo.setUpdBy(flPtyWhseDtoX.getUserIdentity().getPtyAcctLoginName());
                theInt = iFlPtyWhseDaoX.updateFlPtyFcltySelectiveByPK(oldFlPtyFcltyVo);
            }

            // 仓库档案
            FlPtyFcltyLocVo oldFlPtyFcltyLocVo = flPtyWhseDtoX.getFlPtyFcltyLocVo();
            FlPtyFcltyLocVo newFlPtyFcltyLocVo = flPtyWhseDtoX.getNewFlPtyFcltyLocVo();
            if (newFlPtyFcltyLocVo != null && oldFlPtyFcltyLocVo != null) {
                if (oldFlPtyFcltyLocVo.getId() == null) {
                    handleException(new AppException("[change]新增仓库档案失败"), logger);
                }
                copyStr2Tm(oldFlPtyFcltyLocVo, logger);
                copyStr2Tm(newFlPtyFcltyLocVo, logger);
                newFlPtyFcltyLocVo.setEditFlag(CmCatSysCode.RevisionUpdated.cd());
                newFlPtyFcltyLocVo.setUpdTm(flPtyWhseDtoX.getTrxTime());
                newFlPtyFcltyLocVo.setUpdBy(flPtyWhseDtoX.getUserIdentity().getPtyAcctLoginName());
                HashMap<String, FlPtyFcltyLocVo> voMap = new HashMap<String, FlPtyFcltyLocVo>();
                voMap.put("oldValue", oldFlPtyFcltyLocVo);
                voMap.put("newValue", newFlPtyFcltyLocVo);
                iFlPtyWhseDaoX.updateFlPtyFcltyLocSelectiveByPKTmLck(voMap);
            } else if (oldFlPtyFcltyLocVo != null) {
                if (oldFlPtyFcltyLocVo.getId() == null) {
                    handleException(new AppException("[change]新增仓库档案失败"), logger);
                }
                copyStr2Tm(oldFlPtyFcltyLocVo, logger);
                oldFlPtyFcltyLocVo.setEditFlag(CmCatSysCode.RevisionUpdated.cd());
                oldFlPtyFcltyLocVo.setUpdTm(flPtyWhseDtoX.getTrxTime());
                oldFlPtyFcltyLocVo.setUpdBy(flPtyWhseDtoX.getUserIdentity().getPtyAcctLoginName());
                iFlPtyWhseDaoX.updateFlPtyFcltyLocSelectiveByPK(oldFlPtyFcltyLocVo);
            }

        } catch (Throwable t) {
            handleException(new AppException("[change]新增仓库档案失败", t), logger);
        }

        logger.debug("[asm]=====<<< 访问成功: changeFlPtyWhseByPK [change]新增仓库档案");
        return theInt;

    }
    
}
