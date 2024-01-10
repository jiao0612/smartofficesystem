package com.itjzmproject.filsystem.file;

import com.itjzmproject.filsystem.FilsystemApplication;
import com.itjzmproject.filsystem.common.util.LoggerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


    @RequestMapping("getFileName")
    public String getFileName(){
        LoggerUtil.info(LOGGER, "【文件管理系统】获取文件名称");
        return "xx";
    }
}
