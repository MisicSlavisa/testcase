package com.testcase.web;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;
import com.testcase.dto.DtoCase;
import com.testcase.service.CaseService;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RootController extends AbstractCaseController{

  private static final Logger logger = LoggerFactory.getLogger(RootController.class);

  @Autowired
  private CaseService service;

  @GetMapping("/")
  public String root() {
    return "index";
  }

  @GetMapping("/lasthour")
  public String lastHour() {
    return "lasthour";
  }

  @GetMapping("/nofinish")
  public String noFiish() {
    return "nofinish";
  }

  @GetMapping("/top5")
  public String top5() {
    return "top5";
  }

  @GetMapping("/upload")
  public String upload() {
    return "upload";
  }

  @PostMapping("/upload")
  public String singleFileUpload(@RequestParam("filePath") String filePath,
      RedirectAttributes redirectAttributes) {

    if (filePath.isEmpty()) {
      redirectAttributes.addFlashAttribute("message", "Please, enter file path!");
      return "redirect:uploadStatus";
    }

    CsvToBean<DtoCase> csv = new CsvToBean<DtoCase>();
    List<DtoCase> cases = new ArrayList<>();
    try {
      CSVReader csvReader = new CSVReader(new FileReader(filePath),';','"',1);

      //Set column mapping strategy
      List<String[]> list = csvReader.readAll();
      list.forEach(row ->
          cases.add(new DtoCase(row[0], row[1], row[2], row[3], row[4],
              row[5], row[6], row[7], row[8], row[9], row[10], row[11])));

    } catch (IOException e) {
      e.printStackTrace();
    }

    service.insertBatch(cases);
    redirectAttributes.addFlashAttribute("message", "File successfully uploaded!");
    return "redirect:uploadStatus";
  }

  @GetMapping("/uploadStatus")
  public String uploadStatus() {
    return "uploadStatus";
  }

  @GetMapping("/index")
  public String index() {
    return "index";
  }

}
