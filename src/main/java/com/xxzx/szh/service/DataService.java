package com.xxzx.szh.service;
// package com.example.dream_house.service;

import com.xxzx.szh.mapper.DataMapper;
import com.xxzx.szh.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject:dream_house
 * @BelongsPackage:com.example.dream_house.service
 * @Author:Uestc_Xiye
 * @CreateTime:2023-12-17 17:04:45
 */

@Service
public class DataService {

    @Autowired
    private DataMapper dataMapper;

    /**
     * 新增信息
     *
     * @param ip
     * @param province
     * @param time
     * @param str
     * @param likes
     * @return
     */
    public String insert(String ip, String province, String time, String str, int likes) {
        dataMapper.insert(ip, province, time, str, likes);
        return "succeed";
    }

    /**
     * 查询id对应的信息
     *
     * @param id
     * @return
     */
    public Data findById(int id) {
        return dataMapper.findById(id);
    }

    /**
     * 更新信息
     *
     * @param data
     */
    public void update(Data data) {
        dataMapper.update(data);
    }

    /**
     * 删除id对应的信息
     *
     * @param id
     */
    public void delete(int id) {
        dataMapper.delete(id);
    }
}
