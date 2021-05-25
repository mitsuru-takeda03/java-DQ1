package com.dq1.persistence.entity;

import java.time.LocalDate;

public class ReplaceData {
    SaveData newData;
    Integer oldDataId;

    public ReplaceData(){}

    public ReplaceData(SaveData newData, Integer oldDataId) {
        this.newData = newData;
        this.oldDataId = oldDataId;
    }

    public Integer getId() { return newData.getId(); }
    public void setId(Integer id) { newData.setId(id); }
    public String getName() { return newData.getName(); }
    public void setName(String name) { newData.setName(name); }
    public LocalDate getLastLoginDate() { return newData.getLastLoginDate(); }
    public void setLastLoginDate(LocalDate lastLoginDate) { newData.setLastLoginDate(lastLoginDate); }
    public Integer getPlayerLevel() { return newData.getPlayerLevel(); }
    public void setPlayerLevel(Integer playerLevel) { newData.setPlayerLevel(playerLevel); }
    public Integer getMoney() { return newData.getMoney(); }
    public void setMoney(Integer money) { newData.setMoney(money); }
    public Integer getJobId() { return newData.getJobId(); }
    public void setJobId(Integer jobId) { newData.setJobId(jobId); }
    public String getJobName() { return newData.getJobName(); }
    public void setJobName(String jobName) { newData.setJobName(jobName); }
    public Integer getOldId() { return oldDataId; }
    public void setOldId(Integer oldDataId) { this.oldDataId = oldDataId; }
}
