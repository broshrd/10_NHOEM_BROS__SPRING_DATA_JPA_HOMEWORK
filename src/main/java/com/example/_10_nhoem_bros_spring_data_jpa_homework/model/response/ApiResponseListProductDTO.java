package com.example._10_nhoem_bros_spring_data_jpa_homework.model.response;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.DTO.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponseListProductDTO {
    private String status;
    private Enum anEnum;
    private String message;
    private List<ProductDTO> productDTOList;
}
