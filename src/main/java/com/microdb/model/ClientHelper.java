package com.microdb.model;

import com.microdb.model.dbfile.DbFile;
import com.microdb.model.page.Page;

import java.io.File;

/**
 * 访问客户地段helper，用于调试
 *
 * @author zhangjw
 * @version 1.0
 */
public class ClientHelper {
    public static void main(String[] args) {

        // 创建数据库文件
        DbFile dbFile = new DbFile(new File("/db_file.txt"));

        Page page = new Page(0, new byte[]{});

        // 数据写入file
        dbFile.writePageToDisk(page);
    }
}
