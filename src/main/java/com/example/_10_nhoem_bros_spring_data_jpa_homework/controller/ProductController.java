package com.example._10_nhoem_bros_spring_data_jpa_homework.controller;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.DTO.ProductDTO;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Product;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.request.ProductRequest;
import com.example._10_nhoem_bros_spring_data_jpa_homework.service.ProductService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping()
    private ProductDTO saveProduct(@RequestBody ProductRequest productRequest){
         ProductDTO product = productService.saveProduct(productRequest);
        return product;
    }
    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
       return productService.deleteProduct(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody ProductRequest productRequest) {
        return productService.updateProduct(id, productRequest);
    }
    //end
    @GetMapping("all")
    public List<Product> getAllProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "2") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "desc") String direction
    ) {
        Sort sort = direction.equalsIgnoreCase(Sort.Direction.ASC.name())
                ? Sort.by(sortBy).ascending()
                : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        return productService.getAllProduct(pageable);
    }
}
