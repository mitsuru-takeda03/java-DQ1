package com.dq1.persistence.mapper;

import com.dq1.Application;
import com.dq1.persistence.entity.ReplaceData;
import com.dq1.persistence.entity.SaveData;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;

import java.time.LocalDate;
import java.util.List;

public class SaveDataMapperTest {

    public static void main(String[] args) {
        // create DI container
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.NONE); // Webアプリケーション環境を無効化
        ApplicationContext context = application.run(args);

        // get SaveDataMapper's Bean
        SaveDataMapper saveDataMapper = context.getBean(SaveDataMapper.class);

        // test of findAll
        System.out.println("====全件検索====");
        List<SaveData> saveDataList1 = saveDataMapper.findAll();
        for (SaveData saveData : saveDataList1) {
            System.out.println(saveData);
        }

        // test of insert
        System.out.println("====新規追加====");
        saveDataMapper.insert(new SaveData("ミツル", LocalDate.of(2021, 5, 25), 10));

        saveDataList1 = saveDataMapper.findAll();
        for (SaveData saveData : saveDataList1) {
            System.out.println(saveData);
        }

        System.out.println("====変更====");
        saveDataMapper.update(new ReplaceData(
                new SaveData("ミツル", LocalDate.of(2021, 5, 26), 15),
                saveDataList1.get(saveDataList1.size()-1).getId()));

        saveDataList1 = saveDataMapper.findAll();
        for (SaveData saveData : saveDataList1) {
            System.out.println(saveData);
        }

        System.out.println("====削除====");
        saveDataMapper.delete(saveDataList1.get(saveDataList1.size()-1).getId());

        saveDataList1 = saveDataMapper.findAll();
        for (SaveData saveData : saveDataList1) {
            System.out.println(saveData);
        }

    }
}
