package com.jpwhealth.domain.form;

import com.jpwhealth.domain.Address;
import com.jpwhealth.domain.Family;
import com.jpwhealth.domain.Sex;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class FamilyFormUpdate {

    @NotNull
    private Long id;

    @NotNull
    private String familyName;

    @NotNull
    private String familyResponsible;

    @NotNull
    private String responsibleCPF;

    @NotNull
    private String responsibleRG;

    @NotNull
    @DateTimeFormat
    private LocalDateTime dateBirth;

    private Integer adultsNumber;

    private Integer childrenNumber;

    private Integer unemployedNumber;

    @NotNull
    private Long familyFinance;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Sex responsibleSex;

    @NotNull
    private String observation;

    @NotNull
    private Address address;

    public FamilyFormUpdate(@NotNull Long id, @NotNull String familyName, @NotNull String familyResponsible, @NotNull String responsibleCPF, @NotNull String responsibleRG, @NotNull LocalDateTime dateBirth, Integer adultsNumber, Integer childrenNumber, Integer unemployedNumber, @NotNull Long familyFinance, @NotNull Sex responsibleSex, @NotNull String observation, @NotNull Address address) {
        this.id = id;
        this.familyName = familyName;
        this.familyResponsible = familyResponsible;
        this.responsibleCPF = responsibleCPF;
        this.responsibleRG = responsibleRG;
        this.dateBirth = dateBirth;
        this.adultsNumber = adultsNumber;
        this.childrenNumber = childrenNumber;
        this.unemployedNumber = unemployedNumber;
        this.familyFinance = familyFinance;
        this.responsibleSex = responsibleSex;
        this.observation = observation;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getFamilyResponsible() {
        return familyResponsible;
    }

    public String getResponsibleCPF() {
        return responsibleCPF;
    }

    public String getResponsibleRG() {
        return responsibleRG;
    }

    public LocalDateTime getDateBirth() {
        return dateBirth;
    }

    public Integer getAdultsNumber() {
        return adultsNumber;
    }

    public Integer getChildrenNumber() {
        return childrenNumber;
    }

    public Integer getUnemployedNumber() {
        return unemployedNumber;
    }

    public Long getFamilyFinance() {
        return familyFinance;
    }

    public Sex getResponsibleSex() {
        return responsibleSex;
    }

    public String getObservation() {
        return observation;
    }

    public Address getAddress() {
        return address;
    }

    public static Family convertFormToModel(FamilyFormUpdate familyFormUpdate){
        Family family = new Family();
        family.setId(familyFormUpdate.getId());
        family.setFamilyName(familyFormUpdate.getFamilyName());
        family.setFamilyResponsible(familyFormUpdate.getFamilyResponsible());
        family.setResponsibleCPF(familyFormUpdate.getResponsibleCPF());
        family.setResponsibleRG(familyFormUpdate.getResponsibleRG());
        family.setDateBirth(familyFormUpdate.getDateBirth());
        family.setAdultsNumber(familyFormUpdate.getAdultsNumber());
        family.setChildrenNumber(familyFormUpdate.getChildrenNumber());
        family.setUnemployedNumber(familyFormUpdate.getUnemployedNumber());
        family.setFamilyFinance(familyFormUpdate.getFamilyFinance());
        family.setResponsibleSex(familyFormUpdate.getResponsibleSex());
        family.setObservation(familyFormUpdate.getObservation());
        family.setAddress(familyFormUpdate.getAddress());
        return family;
    }

    @Override
    public String toString() {
        return "FamilyFormUpdate{" +
                "id=" + id +
                ", familyName='" + familyName + '\'' +
                ", familyResponsible='" + familyResponsible + '\'' +
                ", responsibleCPF='" + responsibleCPF + '\'' +
                ", responsibleRG='" + responsibleRG + '\'' +
                ", dateBirth=" + dateBirth +
                ", adultsNumber=" + adultsNumber +
                ", childrenNumber=" + childrenNumber +
                ", unemployedNumber=" + unemployedNumber +
                ", familyFinance=" + familyFinance +
                ", responsibleSex=" + responsibleSex +
                ", address=" + address +
                '}';
    }
}
