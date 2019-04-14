package com.testcase.web;

import com.testcase.dto.DtoCase;
import com.testcase.service.CaseService;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractCaseController {

  private final Logger log = LoggerFactory.getLogger(getClass());

  @Autowired
  private CaseService service;

  public List<DtoCase> lastHourGet() {
    log.info("lastHourGet");
    List<DtoCase> list = new ArrayList<>();
    service.oneHourGet().forEach(e -> {
      e.setTs(LocalDateTime
          .ofEpochSecond(Long.parseLong(e.getTs()), 0, ZoneOffset.UTC).toString()
      .replace("T", " "));
      list.add(e);
    });
    return list;
  }

  public void insertBatch(List<DtoCase> cases) {
    log.info("insertBatch");
    service.insertBatch(cases);
  }

  public List<DtoCase> noFinishGet(){
    log.info("noFinishGet");
    List<DtoCase> list = new ArrayList<>();
    service.noFinish().forEach(e -> {
      e.setTs(LocalDateTime
          .ofEpochSecond(Long.parseLong(e.getTs()), 0, ZoneOffset.UTC).toString()
          .replace("T", " "));
      list.add(e);
    });
    return list;
  }

  public List<DtoCase> top5Get() {
    log.info("top5Get");
    return service.top5();
  }
}
