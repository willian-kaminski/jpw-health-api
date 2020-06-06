package com.jpwhealth.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Family {

    private static final long serialVersionUID = -1905907502453138175L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String familyName;
    private String familyResponsible;
    private String responsibleCPF;
    private String responsibleRG;
    private LocalDateTime dateBirth;
    private Integer adultsNumber;
    private Integer childrenNumber;
    private Integer unemployedNumber;
    private Long familyFinance;
    private Sex responsibleSex = Sex.UNDEFINED;
    private String uf;
    private String city;

    @Column(precision = 10, scale = 4)
    @Type(type = "big_decimal")
    private BigDecimal latitude;

    @Column(precision = 10, scale = 4)
    @Type(type = "big_decimal")
    private BigDecimal longitude;

    private LocalDateTime dateRegister = LocalDateTime.now();

    public Family() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyResponsible() {
        return familyResponsible;
    }

    public void setFamilyResponsible(String familyResponsible) {
        this.familyResponsible = familyResponsible;
    }

    public String getResponsibleCPF() {
        return responsibleCPF;
    }

    public void setResponsibleCPF(String responsibleCPF) {
        this.responsibleCPF = responsibleCPF;
    }

    public String getResponsibleRG() {
        return responsibleRG;
    }

    public void setResponsibleRG(String responsibleRG) {
        this.responsibleRG = responsibleRG;
    }

    public LocalDateTime getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDateTime dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Integer getAdultsNumber() {
        return adultsNumber;
    }

    public void setAdultsNumber(Integer adultsNumber) {
        this.adultsNumber = adultsNumber;
    }

    public Integer getChildrenNumber() {
        return childrenNumber;
    }

    public void setChildrenNumber(Integer childrenNumber) {
        this.childrenNumber = childrenNumber;
    }

    public Integer getUnemployedNumber() {
        return unemployedNumber;
    }

    public void setUnemployedNumber(Integer unemployedNumber) {
        this.unemployedNumber = unemployedNumber;
    }

    public Long getFamilyFinance() {
        return familyFinance;
    }

    public void setFamilyFinance(Long familyFinance) {
        this.familyFinance = familyFinance;
    }

    public Sex getResponsibleSex() {
        return responsibleSex;
    }

    public void setResponsibleSex(Sex responsibleSex) {
        this.responsibleSex = responsibleSex;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public LocalDateTime getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(LocalDateTime dateRegister) {
        this.dateRegister = dateRegister;
    }

}