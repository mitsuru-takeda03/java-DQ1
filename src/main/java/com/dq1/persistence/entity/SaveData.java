package com.dq1.persistence.entity;

import java.time.LocalDate;

public class SaveData {
    private Integer id;
    private String name;
    private LocalDate lastLoginDate;
    private Integer playerLevel;
    private Integer money;
    private Integer jobId;
    private String jobName;

    public SaveData(){}

    public SaveData(String name, LocalDate lastLoginDate, Integer playerLevel){
        this.name = name;
        this.lastLoginDate = lastLoginDate;
        this.playerLevel = playerLevel;
        this.money = 120;
        this.jobId = 10;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public LocalDate getLastLoginDate() { return lastLoginDate; }
    public void setLastLoginDate(LocalDate lastLoginDate) { this.lastLoginDate = lastLoginDate; }
    public Integer getPlayerLevel() { return playerLevel; }
    public void setPlayerLevel(Integer playerLevel) { this.playerLevel = playerLevel; }
    public Integer getMoney() { return money; }
    public void setMoney(Integer money) { this.money = money; }
    public Integer getJobId() { return jobId; }
    public void setJobId(Integer jobId) { this.jobId = jobId; }
    public String getJobName() { return jobName; }
    public void setJobName(String jobName) { this.jobName = jobName; }

    @Override
    public String toString() {
        return "SaveData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastLoginDate=" + lastLoginDate +
                ", playerLevel=" + playerLevel +
                ", money=" + money +
                ", jobId=" + jobId +
                ", jobName='" + jobName + '\'' +
                '}';
    }

}
