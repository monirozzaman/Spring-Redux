package com.ibcs.reduxservice.controller;

import com.ibcs.reduxservice.dto.request.DataRequest;
import com.ibcs.reduxservice.services.ReduxService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/redux")
public class ReduxController {

    private ReduxService reduxService;

    @PostMapping("/save")
    public ResponseEntity<Void> save(@RequestBody DataRequest dataRequest){

       return reduxService.save(dataRequest);
    }

    @GetMapping("")
    public void refresh(){
         reduxService.refresh();
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<DataRequest>> getSavedData(){
        return reduxService.getSavedData();
    }

}
