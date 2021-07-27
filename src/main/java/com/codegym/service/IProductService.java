package com.codegym.service;

import com.codegym.model.Product;
import jdk.nashorn.internal.runtime.options.Option;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
