package com.gyj.edu.bean;

import java.util.Date;

public class SalaryDetail {
    private String id;

    private Long totalSalary;

    private Long socialSalary;

    private Long houseSalary;

    private Long tax;

    private Long basicSalary;

    private Long rewardMoney;

    private Long punishMoney;

    private Long helpMoney;

    private Long actualMoney;

    private Integer empId;

    private Date salaryDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(Long totalSalary) {
        this.totalSalary = totalSalary;
    }

    public Long getSocialSalary() {
        return socialSalary;
    }

    public void setSocialSalary(Long socialSalary) {
        this.socialSalary = socialSalary;
    }

    public Long getHouseSalary() {
        return houseSalary;
    }

    public void setHouseSalary(Long houseSalary) {
        this.houseSalary = houseSalary;
    }

    public Long getTax() {
        return tax;
    }

    public void setTax(Long tax) {
        this.tax = tax;
    }

    public Long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Long getRewardMoney() {
        return rewardMoney;
    }

    public void setRewardMoney(Long rewardMoney) {
        this.rewardMoney = rewardMoney;
    }

    public Long getPunishMoney() {
        return punishMoney;
    }

    public void setPunishMoney(Long punishMoney) {
        this.punishMoney = punishMoney;
    }

    public Long getHelpMoney() {
        return helpMoney;
    }

    public void setHelpMoney(Long helpMoney) {
        this.helpMoney = helpMoney;
    }

    public Long getActualMoney() {
        return actualMoney;
    }

    public void setActualMoney(Long actualMoney) {
        this.actualMoney = actualMoney;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }
}