package com.dq1.persistence.mapper;

import com.dq1.persistence.entity.ReplaceData;
import com.dq1.persistence.entity.SaveData;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SaveDataMapper {

    @Select("SELECT s.id AS id, " +
            "s.name AS name, " +
            "s.last_login_date AS last_login_date, " +
            "s.player_level AS player_level, " +
            "s.money AS money, " +
            "j.id AS job_id, " +
            "j.name AS job_name " +
            "FROM save_data s " +
            "JOIN job j on s.job_id = j.id " +
            "ORDER BY s.id")
    List<SaveData> findAll();

    @Select("SELECT s.id AS id, " +
            "s.name AS name, " +
            "s.last_login_date AS last_login_date, " +
            "s.player_level AS player_level, " +
            "s.money AS money, " +
            "j.id AS job_id, " +
            "j.name AS job_name " +
            "FROM save_data s " +
            "JOIN job j on s.job_id = j.id " +
            "WHERE id = #{saveDataId}")
    List<SaveData> findId(Integer saveDataId);


    @Insert("INSERT INTO " +
            "save_data(name, last_login_date, player_level, money, job_id) " +
            "VALUES(#{name}, #{lastLoginDate}, #{playerLevel}, " +
            "#{money}, #{jobId})")
    void insert(SaveData saveData);

    @Update("UPDATE save_data SET " +
            "name = #{name}, " +
            "last_login_date = #{lastLoginDate}, " +
            "player_level = #{playerLevel}, " +
            "money = #{money}, " +
            "job_id = #{jobId} " +
            "WHERE id = #{oldId}")
    void update(ReplaceData replaceData);

    @Delete("DELETE FROM save_data WHERE id = #{deleteDataId}")
    void delete(Integer deleteDataId);

}
