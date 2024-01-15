package com.itjzmproject.filesystem.controller;

import com.itjzmproject.filesystem.common.util.LoggerUtil;
import com.itjzmproject.filesystem.dao.entity.FileEntity;
import com.itjzmproject.filesystem.service.FileEntityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 文件管理
 * @Author: jzm
 * @CreateTime: 2024-01-08  21:24
 * @Version: 1.0
 */
@RestController
@RequestMapping("/file/")
public class FileManagerController {

    /**
     * logger
     */
    private final static Logger LOGGER = LoggerFactory.getLogger(FileManagerController.class);

    @Autowired
    private FileEntityService fileEntityService;

    @RequestMapping("getFileName")
    public String getFileName(){
        LoggerUtil.info(LOGGER, "【文件管理系统】获取文件名称");
        List<FileEntity> list = fileEntityService.list();
        return list.toString();
    }
}
