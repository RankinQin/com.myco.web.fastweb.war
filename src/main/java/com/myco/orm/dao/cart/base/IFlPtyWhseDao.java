/**************************************************************************************
 * 请不要编辑这个文件，在下一次脚本运行的时候，本文件内容将根据最新的数据模型和配置进行更新
 **************************************************************************************
 */
package com.myco.orm.dao.cart.base;

import java.util.List;
import java.util.Map;
import java.lang.Long;
import org.springframework.stereotype.Component;

import com.myco.model.vo.cart.FlPtyFcltyVo;
import com.myco.model.dto.cart.ext.FlPtyWhseDtoX;
import com.myco.model.vo.cart.FlPtyFcltyLocVo;

/**
 * 
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
@Component("com.myco.orm.dao.cart.base.IFlPtyWhseDao")
public interface IFlPtyWhseDao {

    // 仓库档案 - 所有列
    public int insertFlPtyFcltyAll(FlPtyFcltyVo flPtyFcltyVo);
        
    // 仓库档案 - 选择列
    public int insertFlPtyFcltySelective(FlPtyFcltyVo flPtyFcltyVo);
        
    // 仓库档案 - 所有列 - 批量 - 包含主键 - VO个数受限
    public int insertFlPtyFcltyAllInBatchWithPK(List<FlPtyFcltyVo> flPtyFcltyVoList);
        
    // 仓库档案 - 所有列 - 无时间锁
    public int updateFlPtyFcltyAllByPK(FlPtyFcltyVo flPtyFcltyVo);
        
    // 仓库档案 - 所有列 - 有时间锁  where C1 = #{newValue.c1} and (UPD_TM = #{oldValue.updTm} or UPD_TM is null)
    public int updateFlPtyFcltyAllByPKTmLck(Map<String, FlPtyFcltyVo> flPtyFcltyVoMap);
        
    // 仓库档案 - 选择列 - 无时间锁
    public int updateFlPtyFcltySelectiveByPK(FlPtyFcltyVo flPtyFcltyVo);
        
    // 仓库档案 - 选择列 - 有时间锁  where C1 = #{newValue.c1} and (UPD_TM = #{oldValue.updTm} or UPD_TM is null)
    public int updateFlPtyFcltySelectiveByPKTmLck(Map<String, FlPtyFcltyVo> flPtyFcltyVoMap);
        
    // 仓库档案 - 所有列
    public int updateFlPtyFcltyAllBySql(FlPtyWhseDtoX flPtyWhseDtoX);
        
    // 仓库档案 - 选择列
    public int updateFlPtyFcltySelectiveBySql(FlPtyWhseDtoX flPtyWhseDtoX);
        
    // 仓库档案
    public int deleteFlPtyFcltyByPKLong(Long param0);
        
    // 仓库档案 - 无时间锁
    public int deleteFlPtyFcltyByPKVo(FlPtyFcltyVo flPtyFcltyVo);
        
    // 仓库档案 - 有时间锁  where id = #{id} and (UPD_TM = #{updTm} or UPD_TM is null), updTm要先查寻出来
    public int deleteFlPtyFcltyByPKVoTmLck(FlPtyFcltyVo flPtyFcltyVo);
        
    // 仓库档案
    public int deleteFlPtyFcltyBySql(FlPtyWhseDtoX flPtyWhseDtoX);
        
    // 仓库档案 - 所有列
    public int insertFlPtyFcltyLocAll(FlPtyFcltyLocVo flPtyFcltyLocVo);
        
    // 仓库档案 - 选择列
    public int insertFlPtyFcltyLocSelective(FlPtyFcltyLocVo flPtyFcltyLocVo);
        
    // 仓库档案 - 所有列 - 批量 - 包含主键 - VO个数受限
    public int insertFlPtyFcltyLocAllInBatchWithPK(List<FlPtyFcltyLocVo> flPtyFcltyLocVoList);
        
    // 仓库档案 - 所有列 - 无时间锁
    public int updateFlPtyFcltyLocAllByPK(FlPtyFcltyLocVo flPtyFcltyLocVo);
        
    // 仓库档案 - 所有列 - 有时间锁  where C1 = #{newValue.c1} and (UPD_TM = #{oldValue.updTm} or UPD_TM is null)
    public int updateFlPtyFcltyLocAllByPKTmLck(Map<String, FlPtyFcltyLocVo> flPtyFcltyLocVoMap);
        
    // 仓库档案 - 选择列 - 无时间锁
    public int updateFlPtyFcltyLocSelectiveByPK(FlPtyFcltyLocVo flPtyFcltyLocVo);
        
    // 仓库档案 - 选择列 - 有时间锁  where C1 = #{newValue.c1} and (UPD_TM = #{oldValue.updTm} or UPD_TM is null)
    public int updateFlPtyFcltyLocSelectiveByPKTmLck(Map<String, FlPtyFcltyLocVo> flPtyFcltyLocVoMap);
        
    // 仓库档案 - 所有列
    public int updateFlPtyFcltyLocAllBySql(FlPtyWhseDtoX flPtyWhseDtoX);
        
    // 仓库档案 - 选择列
    public int updateFlPtyFcltyLocSelectiveBySql(FlPtyWhseDtoX flPtyWhseDtoX);
        
    // 仓库档案
    public int deleteFlPtyFcltyLocByPKLong(Long param0);
        
    // 仓库档案 - 无时间锁
    public int deleteFlPtyFcltyLocByPKVo(FlPtyFcltyLocVo flPtyFcltyLocVo);
        
    // 仓库档案 - 有时间锁  where id = #{id} and (UPD_TM = #{updTm} or UPD_TM is null), updTm要先查寻出来
    public int deleteFlPtyFcltyLocByPKVoTmLck(FlPtyFcltyLocVo flPtyFcltyLocVo);
        
    // 仓库档案
    public int deleteFlPtyFcltyLocBySql(FlPtyWhseDtoX flPtyWhseDtoX);
        
    // 仓库档案 - 多表结果集
    public FlPtyWhseDtoX selectFlPtyWhsePureListByPKLong(Long param0);
        
    // 仓库档案 - 多表结果集
    public FlPtyWhseDtoX selectFlPtyWhsePureListByPKDtoX(FlPtyWhseDtoX flPtyWhseDtoX);
        
    // 仓库档案 - 多表结果集
    public List<FlPtyWhseDtoX> selectFlPtyWhsePureListBySql(FlPtyWhseDtoX flPtyWhseDtoX);
        
    // 仓库档案 - 多表记录数
    public int countFlPtyWhsePureListBySql(FlPtyWhseDtoX flPtyWhseDtoX);
        
    // 仓库档案 - 多表结果集
    public FlPtyWhseDtoX selectFlPtyWhseByPKLong(Long param0);
        
    // 仓库档案 - 多表结果集
    public FlPtyWhseDtoX selectFlPtyWhseByPKDtoX(FlPtyWhseDtoX flPtyWhseDtoX);
        
    // 仓库档案 - 多表结果集
    public List<FlPtyWhseDtoX> selectFlPtyWhseBySql(FlPtyWhseDtoX flPtyWhseDtoX);
        
    // 仓库档案 - 多表记录数
    public int countFlPtyWhseBySql(FlPtyWhseDtoX flPtyWhseDtoX);
        
    // 仓库档案 - 多表结果集
    public FlPtyWhseDtoX selectFlPtyWhseHasDelivPriceByPKLong(Long param0);
        
    // 仓库档案 - 多表结果集
    public FlPtyWhseDtoX selectFlPtyWhseHasDelivPriceByPKDtoX(FlPtyWhseDtoX flPtyWhseDtoX);
        
    // 仓库档案 - 多表结果集
    public List<FlPtyWhseDtoX> selectFlPtyWhseHasDelivPriceBySql(FlPtyWhseDtoX flPtyWhseDtoX);
        
    // 仓库档案 - 多表记录数
    public int countFlPtyWhseHasDelivPriceBySql(FlPtyWhseDtoX flPtyWhseDtoX);
        
}
