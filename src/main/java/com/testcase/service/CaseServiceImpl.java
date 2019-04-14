package com.testcase.service;

import com.testcase.dto.DtoCase;
import com.testcase.model.Cases;
import com.testcase.repository.CaseRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaseServiceImpl implements CaseService {

  private final CaseRepository caseRepository;

  @Autowired
  public CaseServiceImpl(CaseRepository caseRepository) {
    this.caseRepository = caseRepository;
  }

  @Override
  public void insertBatch(List<DtoCase> cases) {
    List<Cases> list = new ArrayList<>();
    cases.forEach(c -> list.add(new Cases (c)));
    caseRepository.insertBatch(list);
  }

  @Override
  public List<DtoCase> oneHourGet() {
    List<DtoCase> list = new ArrayList<>();
    caseRepository.oneHour().forEach(c -> list.add(new DtoCase(c)));
    return list;
  }

  @Override
  public List<DtoCase> noFinish() {
    List<DtoCase> list = new ArrayList<>();
    caseRepository.noFinish().forEach(c -> list.add(new DtoCase(c)));
    return list;
  }

  @Override
  public List<DtoCase> top5() {
    return caseRepository.top5();
  }
}
