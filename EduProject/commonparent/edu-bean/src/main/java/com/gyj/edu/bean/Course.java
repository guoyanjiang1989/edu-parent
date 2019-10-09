package com.gyj.edu.bean;

import java.util.Date;

public class Course {
    private Integer id;

    private String courseName;

    private String courseTime;

    private Long coursePrice;

    private String courseAddress;

    private String teacherName;

    private Date expectedStartdate;

    private Date expectedEnddate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime == null ? null : courseTime.trim();
    }

    public Long getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(Long coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseAddress() {
        return courseAddress;
    }

    public void setCourseAddress(String courseAddress) {
        this.courseAddress = courseAddress == null ? null : courseAddress.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Date getExpectedStartdate() {
        return expectedStartdate;
    }

    public void setExpectedStartdate(Date expectedStartdate) {
        this.expectedStartdate = expectedStartdate;
    }

    public Date getExpectedEnddate() {
        return expectedEnddate;
    }

    public void setExpectedEnddate(Date expectedEnddate) {
        this.expectedEnddate = expectedEnddate;
    }
}