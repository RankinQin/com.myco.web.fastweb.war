/**************************************************************************************
 * 请不要编辑这个文件，在下一次脚本运行的时候，本文件内容将根据最新的数据模型和配置进行更新
 **************************************************************************************
 */
package com.myco.ctrlr.fl.base;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myco.ctrlr.common.DataPack;
import com.myco.ctrlr.common.BaseController;
import com.myco.ctrlr.fl.param.*;
import com.myco.manager.fl.ext.IFlPtyWhseMgrX;
import com.myco.orm.dao.cart.ext.IFlPtyWhseDaoX;

/**
 * 仓库档案管理MVC Controller
 * Copyright © 2017-2019 MyCo Supply Chain Management Corporation Limited. All rights reserved.
 */
@Controller
@RequestMapping("/flPtyWhse")
public class FlPtyWhseCtrlr extends BaseController {

    private static final Logger logger = Logger.getLogger(FlPtyWhseCtrlr.class);
    
    @Resource
    protected IFlPtyWhseMgrX iFlPtyWhseMgrX; // 仓库档案管理
        
    @Resource
    protected IFlPtyWhseDaoX iFlPtyWhseDaoX; // 仓库档案数据管理
        

    // 查询仓库档案列表
    @RequestMapping("getFlPtyWhseList")
    @ResponseBody
    public Map<String, Object> getFlPtyWhseList(
        HttpServletRequest httpReqt,
        HttpServletResponse httpResp,
        @RequestBody FlPtyWhseCtrlr_getFlPtyWhseList.Reqt getFlPtyWhseListReqt) {
        
        logger.info("[ctrlr]=====>>> 访问开始: getFlPtyWhseList 查询仓库档案列表");
        Map<String, Object> resultMap = null;
        
        try {

            // 调用待扩展方法
            DataPack dataPack = _getFlPtyWhseList(httpReqt, httpResp, getFlPtyWhseListReqt);

            logger.info("[ctrlr]=====<<< 访问成功: getFlPtyWhseList 查询仓库档案列表");
            resultMap = formatResult("0", "查询仓库档案列表处理成功！", dataPack.getRecCnt(), dataPack.getRecList());
        } catch (Throwable t) {
            resultMap = handleException(t, "查询仓库档案列表处理失败！", logger);
		}
        return resultMap;
        
    }
    
    // 查询仓库档案列表 [这是个不含业务逻辑的样例实现，请继承此方法]
    protected DataPack _getFlPtyWhseList(
        HttpServletRequest httpServletRequest,
        HttpServletResponse httpServletResponse,
        FlPtyWhseCtrlr_getFlPtyWhseList.Reqt getFlPtyWhseListReqt) throws Throwable {
        
		// 定义返回值        
        List<FlPtyWhseCtrlr_getFlPtyWhseList.Resp> respList = new ArrayList<FlPtyWhseCtrlr_getFlPtyWhseList.Resp>();
        FlPtyWhseCtrlr_getFlPtyWhseList.Resp resp = null;
		Field[] fieldArray = null;
        
		// 构建包含10个样例返回值的列表对象
		for (int i = 0; i < 10; i++) {
			resp = new FlPtyWhseCtrlr_getFlPtyWhseList().new Resp();
			fieldArray = resp.getClass().getDeclaredFields();
			if (fieldArray != null) {
				for (Field theField : fieldArray) {
					if (theField.getType() == String.class) { // 如果是String类型的属性，则设置值
						try {
							PropertyUtils.setProperty(resp, theField.getName(), String.valueOf(i));
						} catch (NoSuchMethodException ne) {
							continue; // 对于不存在set方法的属性，不执行参数设置
						}
				    }
				}
			}
			respList.add(resp);
		}
		
        DataPack dataPack = new DataPack(respList.size(), respList);
        return dataPack;
        
    }
    
    // 查询仓库档案详情
    @RequestMapping("getFlPtyWhseDtl")
    @ResponseBody
    public Map<String, Object> getFlPtyWhseDtl(
        @RequestBody FlPtyWhseCtrlr_getFlPtyWhseDtl.Reqt getFlPtyWhseDtlReqt) {
        
        logger.info("[ctrlr]=====>>> 访问开始: getFlPtyWhseDtl 查询仓库档案详情");
        Map<String, Object> resultMap = null;
        
        try {

            // 调用待扩展方法
            DataPack dataPack = _getFlPtyWhseDtl(getFlPtyWhseDtlReqt);

            logger.info("[ctrlr]=====<<< 访问成功: getFlPtyWhseDtl 查询仓库档案详情");
            resultMap = formatResult("0", "查询仓库档案详情处理成功！", dataPack.getRecCnt(), dataPack.getRecList());
        } catch (Throwable t) {
            resultMap = handleException(t, "查询仓库档案详情处理失败！", logger);
		}
        return resultMap;
        
    }
    
    // 查询仓库档案详情 [这是个不含业务逻辑的样例实现，请继承此方法]
    protected DataPack _getFlPtyWhseDtl(
        FlPtyWhseCtrlr_getFlPtyWhseDtl.Reqt getFlPtyWhseDtlReqt) throws Throwable {
        
		// 定义返回值        
        List<FlPtyWhseCtrlr_getFlPtyWhseDtl.Resp> respList = new ArrayList<FlPtyWhseCtrlr_getFlPtyWhseDtl.Resp>();
        FlPtyWhseCtrlr_getFlPtyWhseDtl.Resp resp = null;
		Field[] fieldArray = null;
        
		// 构建包含10个样例返回值的列表对象
		for (int i = 0; i < 10; i++) {
			resp = new FlPtyWhseCtrlr_getFlPtyWhseDtl().new Resp();
			fieldArray = resp.getClass().getDeclaredFields();
			if (fieldArray != null) {
				for (Field theField : fieldArray) {
					if (theField.getType() == String.class) { // 如果是String类型的属性，则设置值
						try {
							PropertyUtils.setProperty(resp, theField.getName(), String.valueOf(i));
						} catch (NoSuchMethodException ne) {
							continue; // 对于不存在set方法的属性，不执行参数设置
						}
				    }
				}
			}
			respList.add(resp);
		}
		
        DataPack dataPack = new DataPack(respList.size(), respList);
        return dataPack;
        
    }
    
    // 新增仓库档案
    @RequestMapping("addFlPtyWhse")
    @ResponseBody
    public Map<String, Object> addFlPtyWhse(
        HttpServletRequest httpReqt,
        HttpServletResponse httpResp,
        @RequestBody FlPtyWhseCtrlr_addFlPtyWhse.Reqt addFlPtyWhseReqt) {
        
        logger.info("[ctrlr]=====>>> 访问开始: addFlPtyWhse 新增仓库档案");
        Map<String, Object> resultMap = null;
        
        try {

            // 调用待扩展方法
            DataPack dataPack = _addFlPtyWhse(httpReqt, httpResp, addFlPtyWhseReqt);

            logger.info("[ctrlr]=====<<< 访问成功: addFlPtyWhse 新增仓库档案");
            resultMap = formatResult("0", "新增仓库档案处理成功！", dataPack.getRecCnt(), dataPack.getRecList());
        } catch (Throwable t) {
            resultMap = handleException(t, "新增仓库档案处理失败！", logger);
		}
        return resultMap;
        
    }
    
    // 新增仓库档案 [这是个不含业务逻辑的样例实现，请继承此方法]
    protected DataPack _addFlPtyWhse(
        HttpServletRequest httpServletRequest,
        HttpServletResponse httpServletResponse,
        FlPtyWhseCtrlr_addFlPtyWhse.Reqt addFlPtyWhseReqt) throws Throwable {
        
		// 定义返回值        
        List<FlPtyWhseCtrlr_addFlPtyWhse.Resp> respList = new ArrayList<FlPtyWhseCtrlr_addFlPtyWhse.Resp>();
        FlPtyWhseCtrlr_addFlPtyWhse.Resp resp = null;
		Field[] fieldArray = null;
        
		// 构建包含10个样例返回值的列表对象
		for (int i = 0; i < 10; i++) {
			resp = new FlPtyWhseCtrlr_addFlPtyWhse().new Resp();
			fieldArray = resp.getClass().getDeclaredFields();
			if (fieldArray != null) {
				for (Field theField : fieldArray) {
					if (theField.getType() == String.class) { // 如果是String类型的属性，则设置值
						try {
							PropertyUtils.setProperty(resp, theField.getName(), String.valueOf(i));
						} catch (NoSuchMethodException ne) {
							continue; // 对于不存在set方法的属性，不执行参数设置
						}
				    }
				}
			}
			respList.add(resp);
		}
		
        DataPack dataPack = new DataPack(respList.size(), respList);
        return dataPack;
        
    }
    
    // 修改仓库档案
    @RequestMapping("modifyFlPtyWhse")
    @ResponseBody
    public Map<String, Object> modifyFlPtyWhse(
        HttpServletRequest httpReqt,
        HttpServletResponse httpResp,
        @RequestBody FlPtyWhseCtrlr_modifyFlPtyWhse.Reqt modifyFlPtyWhseReqt) {
        
        logger.info("[ctrlr]=====>>> 访问开始: modifyFlPtyWhse 修改仓库档案");
        Map<String, Object> resultMap = null;
        
        try {

            // 调用待扩展方法
            DataPack dataPack = _modifyFlPtyWhse(httpReqt, httpResp, modifyFlPtyWhseReqt);

            logger.info("[ctrlr]=====<<< 访问成功: modifyFlPtyWhse 修改仓库档案");
            resultMap = formatResult("0", "修改仓库档案处理成功！", dataPack.getRecCnt(), dataPack.getRecList());
        } catch (Throwable t) {
            resultMap = handleException(t, "修改仓库档案处理失败！", logger);
		}
        return resultMap;
        
    }
    
    // 修改仓库档案 [这是个不含业务逻辑的样例实现，请继承此方法]
    protected DataPack _modifyFlPtyWhse(
        HttpServletRequest httpServletRequest,
        HttpServletResponse httpServletResponse,
        FlPtyWhseCtrlr_modifyFlPtyWhse.Reqt modifyFlPtyWhseReqt) throws Throwable {
        
		// 定义返回值        
        List<FlPtyWhseCtrlr_modifyFlPtyWhse.Resp> respList = new ArrayList<FlPtyWhseCtrlr_modifyFlPtyWhse.Resp>();
        FlPtyWhseCtrlr_modifyFlPtyWhse.Resp resp = null;
		Field[] fieldArray = null;
        
		// 构建包含10个样例返回值的列表对象
		for (int i = 0; i < 10; i++) {
			resp = new FlPtyWhseCtrlr_modifyFlPtyWhse().new Resp();
			fieldArray = resp.getClass().getDeclaredFields();
			if (fieldArray != null) {
				for (Field theField : fieldArray) {
					if (theField.getType() == String.class) { // 如果是String类型的属性，则设置值
						try {
							PropertyUtils.setProperty(resp, theField.getName(), String.valueOf(i));
						} catch (NoSuchMethodException ne) {
							continue; // 对于不存在set方法的属性，不执行参数设置
						}
				    }
				}
			}
			respList.add(resp);
		}
		
        DataPack dataPack = new DataPack(respList.size(), respList);
        return dataPack;
        
    }
    
    // 移除仓库档案
    @RequestMapping("removeFlPtyWhse")
    @ResponseBody
    public Map<String, Object> removeFlPtyWhse(
        HttpServletRequest httpReqt,
        HttpServletResponse httpResp,
        @RequestBody FlPtyWhseCtrlr_removeFlPtyWhse.Reqt removeFlPtyWhseReqt) {
        
        logger.info("[ctrlr]=====>>> 访问开始: removeFlPtyWhse 移除仓库档案");
        Map<String, Object> resultMap = null;
        
        try {

            // 调用待扩展方法
            DataPack dataPack = _removeFlPtyWhse(httpReqt, httpResp, removeFlPtyWhseReqt);

            logger.info("[ctrlr]=====<<< 访问成功: removeFlPtyWhse 移除仓库档案");
            resultMap = formatResult("0", "移除仓库档案处理成功！", dataPack.getRecCnt(), dataPack.getRecList());
        } catch (Throwable t) {
            resultMap = handleException(t, "移除仓库档案处理失败！", logger);
		}
        return resultMap;
        
    }
    
    // 移除仓库档案 [这是个不含业务逻辑的样例实现，请继承此方法]
    protected DataPack _removeFlPtyWhse(
        HttpServletRequest httpServletRequest,
        HttpServletResponse httpServletResponse,
        FlPtyWhseCtrlr_removeFlPtyWhse.Reqt removeFlPtyWhseReqt) throws Throwable {
        
		// 定义返回值        
        List<FlPtyWhseCtrlr_removeFlPtyWhse.Resp> respList = new ArrayList<FlPtyWhseCtrlr_removeFlPtyWhse.Resp>();
        FlPtyWhseCtrlr_removeFlPtyWhse.Resp resp = null;
		Field[] fieldArray = null;
        
		// 构建包含10个样例返回值的列表对象
		for (int i = 0; i < 10; i++) {
			resp = new FlPtyWhseCtrlr_removeFlPtyWhse().new Resp();
			fieldArray = resp.getClass().getDeclaredFields();
			if (fieldArray != null) {
				for (Field theField : fieldArray) {
					if (theField.getType() == String.class) { // 如果是String类型的属性，则设置值
						try {
							PropertyUtils.setProperty(resp, theField.getName(), String.valueOf(i));
						} catch (NoSuchMethodException ne) {
							continue; // 对于不存在set方法的属性，不执行参数设置
						}
				    }
				}
			}
			respList.add(resp);
		}
		
        DataPack dataPack = new DataPack(respList.size(), respList);
        return dataPack;
        
    }
    
    // 获取仓库编码 
    @RequestMapping("getFlPtyWhseCd")
    @ResponseBody
    public Map<String, Object> getFlPtyWhseCd(
        HttpServletRequest httpReqt,
        HttpServletResponse httpResp,
        @RequestBody FlPtyWhseCtrlr_getFlPtyWhseCd.Reqt getFlPtyWhseCdReqt) {
        
        logger.info("[ctrlr]=====>>> 访问开始: getFlPtyWhseCd 获取仓库编码 ");
        Map<String, Object> resultMap = null;
        
        try {

            // 调用待扩展方法
            DataPack dataPack = _getFlPtyWhseCd(httpReqt, httpResp, getFlPtyWhseCdReqt);

            logger.info("[ctrlr]=====<<< 访问成功: getFlPtyWhseCd 获取仓库编码 ");
            resultMap = formatResult("0", "获取仓库编码 处理成功！", dataPack.getRecCnt(), dataPack.getRecList());
        } catch (Throwable t) {
            resultMap = handleException(t, "获取仓库编码 处理失败！", logger);
		}
        return resultMap;
        
    }
    
    // 获取仓库编码  [这是个不含业务逻辑的样例实现，请继承此方法]
    protected DataPack _getFlPtyWhseCd(
        HttpServletRequest httpServletRequest,
        HttpServletResponse httpServletResponse,
        FlPtyWhseCtrlr_getFlPtyWhseCd.Reqt getFlPtyWhseCdReqt) throws Throwable {
        
		// 定义返回值        
        List<FlPtyWhseCtrlr_getFlPtyWhseCd.Resp> respList = new ArrayList<FlPtyWhseCtrlr_getFlPtyWhseCd.Resp>();
        FlPtyWhseCtrlr_getFlPtyWhseCd.Resp resp = null;
		Field[] fieldArray = null;
        
		// 构建包含10个样例返回值的列表对象
		for (int i = 0; i < 10; i++) {
			resp = new FlPtyWhseCtrlr_getFlPtyWhseCd().new Resp();
			fieldArray = resp.getClass().getDeclaredFields();
			if (fieldArray != null) {
				for (Field theField : fieldArray) {
					if (theField.getType() == String.class) { // 如果是String类型的属性，则设置值
						try {
							PropertyUtils.setProperty(resp, theField.getName(), String.valueOf(i));
						} catch (NoSuchMethodException ne) {
							continue; // 对于不存在set方法的属性，不执行参数设置
						}
				    }
				}
			}
			respList.add(resp);
		}
		
        DataPack dataPack = new DataPack(respList.size(), respList);
        return dataPack;
        
    }
    
}