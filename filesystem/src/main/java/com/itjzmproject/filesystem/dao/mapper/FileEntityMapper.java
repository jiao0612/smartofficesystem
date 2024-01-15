package com.itjzmproject.filesystem.dao.mapper;

import com.itjzmproject.filesystem.dao.entity.FileEntity;

import java.util.List;

/**
 * @author de
 * @description 针对表【file_entity(存储文件实体)】的数据库操作Mapper
 * @createDate 2024-01-14 14:58:12
 * @Entity com.itjzmproject.filesystem.dao.entity.FileEntity
 */
public interface FileEntityMapper{

    List<FileEntity> list();
}




