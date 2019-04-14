package com.testcase.web;

import com.testcase.dto.DtoCase;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/case")
public class CaseRestController extends AbstractCaseController {

  @Override
  @GetMapping(value = "/lasthour", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<DtoCase> lastHourGet() {
    return super.lastHourGet();
  }

  @Override
  @GetMapping(value = "/nofinish", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<DtoCase> noFinishGet() {
    return super.noFinishGet();
  }

  @Override
  @GetMapping(value = "/top5", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<DtoCase> top5Get() {
    return super.top5Get();
  }

}
