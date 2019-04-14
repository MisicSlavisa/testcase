package com.testcase.repository;

import com.testcase.dto.DtoCase;
import com.testcase.model.Cases;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FlushModeType;
import javax.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CaseRepositoryImpl implements CaseRepository{
  private static final int BATCH_SIZE = 50;

  @Autowired
  private CrudCaseRepository caseRepository;

  @Override
  public void insertBatch(List<Cases> casesList) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("mnf-pu");
    EntityManager em = emf.createEntityManager();
    em.setFlushMode(FlushModeType.COMMIT);

    em.getTransaction().begin();

    int i = 0;
    for (Cases cas : casesList) {
      em.persist(cas);

      if (i % BATCH_SIZE == 0 && i > 0) {
        em.flush();
        em.clear();
      }
      i++;
    }
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public List<Cases> noFinish() {
    /*return caseRepository.noFinish();*/
    return Collections.emptyList();
  }

  @Override
  public List<Cases> oneHour() {
    return caseRepository.oneHour();
  }

  @Override
  public List<DtoCase> top5() {
    List<Object[]> list = caseRepository.top5();
    TreeMap<Integer, String> map = new TreeMap<>();
    list.forEach(el -> map.put(Integer.parseInt(el[1].toString()), el[0].toString()));
    List<DtoCase> list1 = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      Entry<Integer, String> entry = map.lastEntry();
      map.remove(entry.getKey());
      list1.add(new DtoCase(entry.getValue(), entry.getKey().toString()));
    }
    return list1;
  }

}
