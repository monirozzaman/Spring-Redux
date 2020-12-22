package com.ibcs.reduxservice.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DataRequest {
    private String id;
    private String symbolName;
    private String isVoted;
}
