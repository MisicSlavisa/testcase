package com.testcase.repository;

import com.testcase.dto.DtoCase;
import com.testcase.model.Cases;
import java.util.List;

public interface CaseRepository {
  void insertBatch(List<Cases> cases);
  List<Cases> oneHour();
  List<Cases> noFinish();
  List<DtoCase> top5();
}
