package com.dq1.web.form;

import com.dq1.persistence.entity.SaveData;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class SaveDataForm {


    private String name;
    @DateTimeFormat(pattern="uuuu-MM-dd")
    private LocalDate lastLoginDate;
    private Integer playerLevel;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public LocalDate getLastLoginDate() { return lastLoginDate; }
    public void setLastLoginDate(LocalDate lastLoginDate) { this.lastLoginDate = lastLoginDate; }
    public Integer getPlayerLevel() { return playerLevel; }
    public void setPlayerLevel(Integer playerLevel) { this.playerLevel = playerLevel; }

    public SaveData convertToEntity() { return new SaveData(name, lastLoginDate, playerLevel);
    }
}
