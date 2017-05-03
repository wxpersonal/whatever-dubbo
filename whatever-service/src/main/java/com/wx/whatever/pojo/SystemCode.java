package com.wx.whatever.pojo;

import java.util.Date;

public class SystemCode {
    private String code;

    private String codeDescEn;

    private String codeDescZh;

    private String codeDescTr;

    private Integer priority;

    private Boolean disabled;

    private Boolean needControl;

    private String parentCode;

    private String other1;

    private String other2;

    private String other3;

    private String other4;

    private String other5;

    private String other6;

    private String other7;

    private String other8;

    private String other9;

    private Integer version;

    private Date createdDtm;

    private Integer createdBy;

    private Date lastModifiedDtm;

    private Integer lastModifiedBy;

    private Boolean deleted;

    public SystemCode(String code, String codeDescEn, String codeDescZh, String codeDescTr, Integer priority, Boolean disabled, Boolean needControl, String parentCode, String other1, String other2, String other3, String other4, String other5, String other6, String other7, String other8, String other9, Integer version, Date createdDtm, Integer createdBy, Date lastModifiedDtm, Integer lastModifiedBy, Boolean deleted) {
        this.code = code;
        this.codeDescEn = codeDescEn;
        this.codeDescZh = codeDescZh;
        this.codeDescTr = codeDescTr;
        this.priority = priority;
        this.disabled = disabled;
        this.needControl = needControl;
        this.parentCode = parentCode;
        this.other1 = other1;
        this.other2 = other2;
        this.other3 = other3;
        this.other4 = other4;
        this.other5 = other5;
        this.other6 = other6;
        this.other7 = other7;
        this.other8 = other8;
        this.other9 = other9;
        this.version = version;
        this.createdDtm = createdDtm;
        this.createdBy = createdBy;
        this.lastModifiedDtm = lastModifiedDtm;
        this.lastModifiedBy = lastModifiedBy;
        this.deleted = deleted;
    }

    public SystemCode() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCodeDescEn() {
        return codeDescEn;
    }

    public void setCodeDescEn(String codeDescEn) {
        this.codeDescEn = codeDescEn == null ? null : codeDescEn.trim();
    }

    public String getCodeDescZh() {
        return codeDescZh;
    }

    public void setCodeDescZh(String codeDescZh) {
        this.codeDescZh = codeDescZh == null ? null : codeDescZh.trim();
    }

    public String getCodeDescTr() {
        return codeDescTr;
    }

    public void setCodeDescTr(String codeDescTr) {
        this.codeDescTr = codeDescTr == null ? null : codeDescTr.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Boolean getNeedControl() {
        return needControl;
    }

    public void setNeedControl(Boolean needControl) {
        this.needControl = needControl;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    public String getOther3() {
        return other3;
    }

    public void setOther3(String other3) {
        this.other3 = other3 == null ? null : other3.trim();
    }

    public String getOther4() {
        return other4;
    }

    public void setOther4(String other4) {
        this.other4 = other4 == null ? null : other4.trim();
    }

    public String getOther5() {
        return other5;
    }

    public void setOther5(String other5) {
        this.other5 = other5 == null ? null : other5.trim();
    }

    public String getOther6() {
        return other6;
    }

    public void setOther6(String other6) {
        this.other6 = other6 == null ? null : other6.trim();
    }

    public String getOther7() {
        return other7;
    }

    public void setOther7(String other7) {
        this.other7 = other7 == null ? null : other7.trim();
    }

    public String getOther8() {
        return other8;
    }

    public void setOther8(String other8) {
        this.other8 = other8 == null ? null : other8.trim();
    }

    public String getOther9() {
        return other9;
    }

    public void setOther9(String other9) {
        this.other9 = other9 == null ? null : other9.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreatedDtm() {
        return createdDtm;
    }

    public void setCreatedDtm(Date createdDtm) {
        this.createdDtm = createdDtm;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastModifiedDtm() {
        return lastModifiedDtm;
    }

    public void setLastModifiedDtm(Date lastModifiedDtm) {
        this.lastModifiedDtm = lastModifiedDtm;
    }

    public Integer getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(Integer lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}