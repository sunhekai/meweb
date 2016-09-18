package org.sunhk.meweb.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Task{
    private Long taskid;

    private String taskname;
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date schstartdate;
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date schenddate;
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date startdate;
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date enddate;

    private Long fzr;

    private String fzrname;

    private String persons;

    public Long getTaskid() {
        return taskid;
    }

    public void setTaskid(Long taskid) {
        this.taskid = taskid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }
   
    public Date getSchstartdate() {
        return schstartdate;
    }

    public void setSchstartdate(Date schstartdate) {
        this.schstartdate = schstartdate;
    }
    public Date getSchenddate() {
        return schenddate;
    }

    public void setSchenddate(Date schenddate) {
        this.schenddate = schenddate;
    }
    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }
    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Long getFzr() {
        return fzr;
    }

    public void setFzr(Long fzr) {
        this.fzr = fzr;
    }

    public String getFzrname() {
        return fzrname;
    }

    public void setFzrname(String fzrname) {
        this.fzrname = fzrname;
    }

    public String getPersons() {
        return persons;
    }

    public void setPersons(String persons) {
        this.persons = persons;
    }
}