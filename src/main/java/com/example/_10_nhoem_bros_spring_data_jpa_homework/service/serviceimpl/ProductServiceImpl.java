package com.example._10_nhoem_bros_spring_data_jpa_homework.service.serviceimpl;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.DTO.ProductDTO;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Product;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.request.ProductRequest;
import com.example._10_nhoem_bros_spring_data_jpa_homework.repository.ProductRepository;
import com.example._10_nhoem_bros_spring_data_jpa_homework.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;


    @Override
    public List<Product> getAllProducts(Pageable pageable) {
        return null;
    }

    @Override
    public ProductDTO saveProduct(ProductRequest productRequest) {
        ProductDTO productDTO = productRepository.save(productRequest.toEntity()).toRespone();
        return productDTO;
    }
    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
    @Override
    public String deleteProduct(Long id) {
        productRepository.deleteById(id);
        return "deleted sucessfully";
    }

    @Override
    public Product updateProduct(Long id, ProductRequest productRequest) {
        return productRepository.save(productRequest.toEntity(Math.toIntExact(id)));
    }

    @Override
    public List<Product> getAllProduct(Pageable pageable) {
        return productRepository.findAll(pageable).getContent();
    }
}
