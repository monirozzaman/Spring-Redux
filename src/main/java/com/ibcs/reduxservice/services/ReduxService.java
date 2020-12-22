package com.ibcs.reduxservice.services;

import com.ibcs.reduxservice.dto.request.DataRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReduxService {

    private List<DataRequest> store = new ArrayList<>();

    public ResponseEntity<Void> save(DataRequest dataRequest) {
        store.add(dataRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity<List<DataRequest>> getSavedData() {
        return new ResponseEntity(store,HttpStatus.OK);
    }

    public void refresh() {
        store = new ArrayList<>();
    }
}
