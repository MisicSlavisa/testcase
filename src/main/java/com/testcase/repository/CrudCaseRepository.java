package com.testcase.repository;

import com.testcase.model.Cases;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CrudCaseRepository extends JpaRepository<Cases, Integer> {

  /*@Override
  Cases saveAndFlush(Cases item);*/

  /*@Query("SELECT b FROM Cases b, (SELECT DISTINCT d.ssoid, d.grp FROM Cases d EXCEPT"
      + "  SELECT DISTINCT c.ssoid, c.grp FROM c WHERE cases.subtype = 'send') a "
      + "WHERE b.ssoid = a.ssoid AND b.grp = a.grp ORDER BY b.ts ASC")
  List<Cases> noFinish();*/

  @Query("SELECT m FROM Cases m WHERE m.ts > ((SELECT max (n.ts) FROM Cases n) - 3600) ORDER BY m.ts DESC")
  List<Cases> oneHour();

  @Query("SELECT a.formid, count(a.formid)  FROM Cases a WHERE a.formid <> '' GROUP BY a.formid ORDER BY count(a.formid) DESC")
  List<Object[]> top5();

}