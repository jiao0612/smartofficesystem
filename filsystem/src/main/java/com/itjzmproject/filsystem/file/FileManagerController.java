package com.itjzmproject.filsystem.file;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: jzm
 * @CreateTime: 2024-01-08  21:24
 * @Version: 1.0
 */
@RestController
@RequestMapping("/file/")
public class FileManagerController {

    @RequestMapping("getFileName")
    public String getFileName(){
        System.out.println("true = " + true);
        return "xx";
    }
}
