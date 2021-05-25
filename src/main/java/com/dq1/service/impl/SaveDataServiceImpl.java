package com.dq1.service.impl;

import com.dq1.persistence.entity.ReplaceData;
import com.dq1.persistence.entity.SaveData;
import com.dq1.persistence.mapper.SaveDataMapper;
import com.dq1.service.SaveDataService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaveDataServiceImpl implements SaveDataService {

    private final SaveDataMapper saveDataMapper;

    public SaveDataServiceImpl(SaveDataMapper saveDataMapper) { this.saveDataMapper = saveDataMapper; }

    @Override
    @Transactional(readOnly = true)
    public List<SaveData> findAll() {
        List<SaveData> saveDataList = saveDataMapper.findAll();
        return saveDataList;
    }

    @Override
    @Transactional(readOnly = true)
    public SaveData findId(Integer saveDataId) {
        List<SaveData> saveDataList = saveDataMapper.findId(saveDataId);
        return saveDataList.get(0);
    }

    @Override
    @Transactional(readOnly = false)
    public void insert(SaveData saveData) { saveDataMapper.insert(saveData); }

    @Override
    @Transactional(readOnly = false)
    public void update(ReplaceData replaceData) { saveDataMapper.update(replaceData); }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer deleteDataId) { saveDataMapper.delete(deleteDataId); }

}
