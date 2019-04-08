package com.myco.manager.common;

// ########################################
// ##  系统提示信息分类原则
// ########################################
// ##
// ##  1. 根据头两位区分业务类别
// ##    000000 - 099999: 预留区段
// ##
// ##    110000 - 119999: 参与方管理 Party Service
// ##    140000 - 149999: 社区管理 Community Service
// ##    170000 - 179999: 商品管理 Goods Service
// ##    180000 - 189999: 采购管理 Purchase Service
// ##    190000 - 199999: 销售管理 Sales Service
// ##    200000 - 209999: 库存管理 Inventory Service
// ##    230000 - 239999: 运输管理 Transportation Service
// ##    260000 - 269999: 设备管理 Facility Service
// ##    290000 - 299999: 路线管理 Route Service
// ##
// ##    300000 - 809999: 预留区段 Reserved
// ##
// ##    810000 - 819999: 基础服务 Base Service
// ##    820000 - 999999: 预留区段 Reserved
// ##
// ##  2. 每个业务类别内部，系统的提示信息分三个层次（不强制要求）
// ##    XX2XXX - XX2XXX: 信息
// ##    XX4XXX - XX4XXX: 警告
// ##    XX6XXX - XX6XXX: 错误
// ########################################

/**
 * 系统提示信息
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
public class SvcMsgCode {

    public static final String _111250 = "111250"; // 查询仓库档案列表失败
    public static final String _111251 = "111251"; // 统计仓库档案数量失败
    public static final String _111252 = "111252"; // 查询仓库档案列表失败
    public static final String _111253 = "111253"; // 增加仓库档案失败
    public static final String _111254 = "111254"; // 修改仓库档案失败
    public static final String _111255 = "111255"; // 删除仓库档案失败

}