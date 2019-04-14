package com.testcase.model;

import com.testcase.dto.DtoCase;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cases")
public class Cases extends AbstractBaseEntity implements Serializable {

  @Column(name = "ssoid", nullable = false)
  @NotNull
  private String ssoid;

  @Column(name = "ts", nullable = false)
  @NotNull
  private Integer ts;

  @Column(name = "grp", nullable = false)
  @NotNull
  private String grp;

  @Column(name = "type", nullable = false)
  @NotNull
  private String type;

  @Column(name = "subtype", nullable = false)
  @NotNull
  private String subtype;

  @Column(name = "url", nullable = false)
  private String url;

  @Column(name = "orgid")
  private String orgid;

  @Column(name = "formid")
  private String formid;

  @Column(name = "code")
  private String code;

  @Column(name = "ltpa")
  private String ltpa;

  @Column(name = "sudirresponse")
  private String sudirresponse;

  @Column(name = "ymdh", nullable = false)
  @NotNull
  private String ymdh;

  public Cases() {
  }

  public Cases(@NotNull String ssoid, @NotNull Integer ts,
      @NotNull String grp, @NotNull String type, @NotNull String subtype, String url, String orgid,
      String formid, String code, @NotNull String ymdh) {
    this.id = null;
    this.ssoid = ssoid;
    this.ts = ts;
    this.grp = grp;
    this.type = type;
    this.subtype = subtype;
    this.url = url;
    this.orgid = orgid;
    this.formid = formid;
    this.code = code;
    this.ltpa = null;
    this.sudirresponse = null;
    this.ymdh = ymdh;
  }

  public Cases(@NotNull String ssoid, @NotNull Integer ts, @NotNull String grp,
      @NotNull String type, @NotNull String subtype, String url, String orgid,
      String formid, String code, String ltpa, String sudirresponse,
      @NotNull String ymdh) {
    this.id = null;
    this.ssoid = ssoid;
    this.ts = ts;
    this.grp = grp;
    this.type = type;
    this.subtype = subtype;
    this.url = url;
    this.orgid = orgid;
    this.formid = formid;
    this.code = code;
    this.ltpa = ltpa;
    this.sudirresponse = sudirresponse;
    this.ymdh = ymdh;
  }

  public Cases(DtoCase dtoCase){
    this.id = null;
    this.ssoid = dtoCase.getSsoid();
    this.ts = Integer.parseInt(dtoCase.getTs());
    this.grp = dtoCase.getGrp();
    this.type = dtoCase.getType();
    this.subtype = dtoCase.getSubtype();
    this.url = dtoCase.getUrl();
    this.orgid = dtoCase.getOrgid();
    this.formid = dtoCase.getFormid();
    this.code = dtoCase.getCode();
    this.ltpa = dtoCase.getLtpa();
    this.sudirresponse = dtoCase.getSudirresponse();
    this.ymdh = dtoCase.getYmdh();
  }

  public String getSsoid() {
    return ssoid;
  }

  public void setSsoid(String ssoid) {
    this.ssoid = ssoid;
  }

  public Integer getTs() {
    return ts;
  }

  public void setTs(Integer ts) {
    this.ts = ts;
  }

  public String getGrp() {
    return grp;
  }

  public void setGrp(String grp) {
    this.grp = grp;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getSubtype() {
    return subtype;
  }

  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getOrgid() {
    return orgid;
  }

  public void setOrgid(String orgid) {
    this.orgid = orgid;
  }

  public String getFormid() {
    return formid;
  }

  public void setFormid(String formid) {
    this.formid = formid;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getLtpa() {
    return ltpa;
  }

  public void setLtpa(String ltpa) {
    this.ltpa = ltpa;
  }

  public String getSudirresponse() {
    return sudirresponse;
  }

  public void setSudirresponse(String sudirresponse) {
    this.sudirresponse = sudirresponse;
  }

  public String getYmdh() {
    return ymdh;
  }

  public void setYmdh(String ymdh) {
    this.ymdh = ymdh;
  }

  @Override
  public String toString() {
    return "Case{" +
        "id=" + id +
        ", ssoid='" + ssoid + '\'' +
        ", ts=" + ts +
        ", grp='" + grp + '\'' +
        ", type='" + type + '\'' +
        ", subtype='" + subtype + '\'' +
        ", url='" + url + '\'' +
        ", orgid='" + orgid + '\'' +
        ", formid='" + formid + '\'' +
        ", code='" + code + '\'' +
        ", ltpa='" + ltpa + '\'' +
        ", sudirresponse='" + sudirresponse + '\'' +
        ", ymdh=" + ymdh +
        '}';
  }

}
