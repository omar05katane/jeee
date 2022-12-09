package org.sid.orderservice.services;

import org.sid.orderservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "PRODUCT-SERVICE")
public interface InventoryRestClientService {
    @GetMapping("/products/{id}")
    Product productById(@PathVariable Long id);
    @GetMapping("/products")
    PagedModel<Product> allProducts();
}
