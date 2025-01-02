package com.petland.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class AnimalResponse extends AnimalRequest {
    private Integer id;
}
