package com.ufc.estudo.services;


import com.ufc.estudo.dto.CategoryDTO;
import com.ufc.estudo.dto.ProductDTO;
import com.ufc.estudo.entities.Category;
import com.ufc.estudo.entities.Product;
import com.ufc.estudo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional
    public ProductDTO insert(ProductDTO dto){
        Product entity = new Product();
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());

        for(CategoryDTO catDto: dto.getCategories()){
            Category cat = new Category();
            cat.setId(catDto.getId());
            entity.getCategories().add(cat);
        }
        entity = repository.save(entity);
        return new ProductDTO(entity);
    }
}
