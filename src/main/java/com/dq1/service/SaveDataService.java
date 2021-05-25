package com.dq1.service;

import com.dq1.persistence.entity.ReplaceData;
import com.dq1.persistence.entity.SaveData;

import java.util.List;

public interface SaveDataService {

    List<SaveData> findAll();

    SaveData findId(Integer saveDataId);

    void insert(SaveData saveData);

    void update(ReplaceData replaceData);

    void delete(Integer deleteDataId);

}
