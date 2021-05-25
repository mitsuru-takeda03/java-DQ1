package com.dq1.web.controller;

import com.dq1.persistence.entity.SaveData;
import com.dq1.service.SaveDataService;
import com.dq1.web.form.SaveDataForm;
import com.dq1.web.form.SaveDataIdForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/saveData")
public class SaveDataController {
    private final SaveDataService saveDataService;

    public SaveDataController(SaveDataService saveDataService) { this.saveDataService = saveDataService; }

    @GetMapping("/index")
    public String index(Model model) {
        return "saveData/index";
    }

    @GetMapping("/load")
    public String load(Model model) {
        List<SaveData> saveDataList = saveDataService.findAll();
        model.addAttribute("saveDataList", saveDataList);
        return "saveData/load";
    }
    @GetMapping("/loadComplete")
    public String loadComplete(@ModelAttribute("id") Integer loadDataId, Model model){
        SaveData saveData = saveDataService.findId(loadDataId);
        model.addAttribute("saveData", saveData);
        return "redirect:/field/king";
    }

    @GetMapping("/init")
    public String init(Model model) {
        return "saveData/init";
    }

    @PostMapping("/initComplete")
    public String initComplete(SaveDataForm saveDataForm, Model model) {
        SaveData saveData = saveDataForm.convertToEntity();
        saveDataService.insert(saveData);
        model.addAttribute("saveData", saveData);
        return "redirect:/field/king";
    }

    @GetMapping("/delete")
    public String delete(Model model) {
        List<SaveData> saveDataList = saveDataService.findAll();
        model.addAttribute("saveDataList", saveDataList);
        return "saveData/delete";
    }

    @GetMapping("/deleteComplete")
    public String deleteComplete(@ModelAttribute("id") Integer deleteDataId, Model model) {
        saveDataService.delete(deleteDataId);
        return "redirect:/saveData/index";
    }

}
