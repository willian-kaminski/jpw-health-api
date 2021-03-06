package com.jpwhealth.controller;

import com.jpwhealth.domain.CovidGeneralData;
import com.jpwhealth.domain.form.CovidGeneralDataForm;
import com.jpwhealth.service.CovidGeneralDataService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class CovidGeneralDataController {

    @Autowired
    private CovidGeneralDataService covidGeneralDataService;

    @ApiOperation(value = "Lista o registro de dados da COVID-19 no Brasil, a atualização dos dados é realizada diariamente em nossa base de dados", notes = "Lista os números da COVID-19", response = CovidGeneralData.class, responseContainer = "List")
    @GetMapping("/covid-19/BR")
    public ResponseEntity<Object> getAll(Pageable pageable){
        return ResponseEntity.ok(covidGeneralDataService.getAll(pageable));
    }

    @ApiOperation(value = "Insere o cadastro de informações da COVID-19 na nossa base de dados", notes = "Lista os números da COVID-19", response = CovidGeneralData.class, responseContainer = "List")
    @PostMapping("/covid-19")
    public ResponseEntity<CovidGeneralData> register(@RequestBody CovidGeneralDataForm covidGeneralDataForm){
        return ResponseEntity.status(HttpStatus.CREATED).body(covidGeneralDataService.registerByRequest(covidGeneralDataForm));
    }

    @ApiOperation(value = "Deleta o registro de dados da COVID-19 no Brasil por id", notes = "Removel o dado da COVID-19 informado.", response = CovidGeneralData.class, responseContainer = "List" )
    @DeleteMapping("/covid-19/BR/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        return covidGeneralDataService.delete(id);
    }

}
