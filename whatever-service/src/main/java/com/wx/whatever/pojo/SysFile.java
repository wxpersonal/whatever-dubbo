package com.wx.whatever.pojo;

import java.util.Date;

public class SysFile {
    private Long fileid;

    private Long userid;

    private Long objectid;

    private Long objecttype;

    private Long type;

    private String oldname;

    private String newname;

    private Long size;

    private String path;

    private String relativepath;

    private Date uploadtime;

    private Long status;

    public SysFile(Long fileid, Long userid, Long objectid, Long objecttype, Long type, String oldname, String newname, Long size, String path, String relativepath, Date uploadtime, Long status) {
        this.fileid = fileid;
        this.userid = userid;
        this.objectid = objectid;
        this.objecttype = objecttype;
        this.type = type;
        this.oldname = oldname;
        this.newname = newname;
        this.size = size;
        this.path = path;
        this.relativepath = relativepath;
        this.uploadtime = uploadtime;
        this.status = status;
    }

    public SysFile() {
        super();
    }

    public Long getFileid() {
        return fileid;
    }

    public void setFileid(Long fileid) {
        this.fileid = fileid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getObjectid() {
        return objectid;
    }

    public void setObjectid(Long objectid) {
        this.objectid = objectid;
    }

    public Long getObjecttype() {
        return objecttype;
    }

    public void setObjecttype(Long objecttype) {
        this.objecttype = objecttype;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getOldname() {
        return oldname;
    }

    public void setOldname(String oldname) {
        this.oldname = oldname == null ? null : oldname.trim();
    }

    public String getNewname() {
        return newname;
    }

    public void setNewname(String newname) {
        this.newname = newname == null ? null : newname.trim();
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getRelativepath() {
        return relativepath;
    }

    public void setRelativepath(String relativepath) {
        this.relativepath = relativepath == null ? null : relativepath.trim();
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}