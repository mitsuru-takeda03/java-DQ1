package com.dq1.persistence.services;

import com.dq1.Application;
import com.dq1.persistence.entity.ReplaceData;
import com.dq1.persistence.entity.SaveData;
import com.dq1.service.SaveDataService;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;

import java.time.LocalDate;
import java.util.List;

public class SaveDataServicesTest {

    public static void main(String[] args) {
        // create DI container
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.NONE); // Webアプリケーション環境を無効化
        ApplicationContext context = application.run(args);

        // get SaveDataMapper's Bean
        SaveDataService saveDataService = context.getBean(SaveDataService.class);

        // test of findAll
        System.out.println("====全件検索====");
        List<SaveData> saveDataList = saveDataService.findAll();
        for (SaveData saveData : saveDataList) {
            System.out.println(saveData);
        }

        // test of insert
        System.out.println("====新規追加====");
        saveDataService.insert(new SaveData("ミツル", LocalDate.of(2021, 5, 25), 10));

        saveDataList = saveDataService.findAll();
        for (SaveData saveData : saveDataList) {
            System.out.println(saveData);
        }

        System.out.println("====変更====");
        saveDataService.update(new ReplaceData(
                new SaveData("ミツル", LocalDate.of(2021, 5, 26), 15),
                saveDataList.get(saveDataList.size()-1).getId()));

        saveDataList = saveDataService.findAll();
        for (SaveData saveData : saveDataList) {
            System.out.println(saveData);
        }

        System.out.println("====削除====");
        saveDataService.delete(saveDataList.get(saveDataList.size()-1).getId());

        saveDataList = saveDataService.findAll();
        for (SaveData saveData : saveDataList) {
            System.out.println(saveData);
        }

    }
}
