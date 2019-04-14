package com.testcase.service;

import com.testcase.dto.DtoCase;
import java.util.List;
import java.util.TreeMap;

public interface CaseService {

  void insertBatch(List<DtoCase> cases);
  List<DtoCase> oneHourGet();
  List<DtoCase> noFinish();
  List<DtoCase> top5();

}
