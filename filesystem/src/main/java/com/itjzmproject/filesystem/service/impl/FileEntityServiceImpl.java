package com.itjzmproject.filesystem.service.impl;

import com.itjzmproject.filesystem.dao.entity.FileEntity;
import com.itjzmproject.filesystem.dao.mapper.FileEntityMapper;
import com.itjzmproject.filesystem.service.FileEntityService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author de
 * @description 针对表【file_entity(存储文件实体)】的数据库操作Service实现
 * @createDate 2024-01-14 14:58:13
 */
@Service
public class FileEntityServiceImpl implements FileEntityService {

    @Resource
    private FileEntityMapper fileEntityMapper;

    @Override
    public List<FileEntity> list() {
        return fileEntityMapper.list();
    }
}




