package com.itjzmproject.filesystem.service;

import com.itjzmproject.filesystem.dao.entity.FileEntity;

import java.util.List;

/**
 * @author de
 * @description 针对表【file_entity(存储文件实体)】的数据库操作Service
 * @createDate 2024-01-14 14:58:13
 */
public interface FileEntityService {

    List<FileEntity> list();

}
