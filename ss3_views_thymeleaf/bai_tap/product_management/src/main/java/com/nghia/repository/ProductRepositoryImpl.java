package com.nghia.repository;

import com.nghia.entity.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository

public class ProductRepositoryImpl implements IProductRepository {
    //    public static Map<Integer, Product> productList;
//
//    static {
//        productList = new HashMap<>();
//        productList.put(1, new Product(1, "mouse", 3000, "mouse", "dareU"));
//        productList.put(2, new Product(2, "keyboard", 4000, "keyboard", "logitech"));
//        productList.put(3, new Product(3, "light", 5000, "light", "logitech"));
//    }
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        List<Product> productList = entityManager
                .createQuery("select p from product p")
                .getResultList();
        return productList;
    }
// mới list hoạt động được 
    @Override
    public void save(Product product) {
        if (product.getName() == null) {
            entityManager.persist(product);
        } else {
            entityManager.merge(product);
        }
    }

    @Override
    public void update(int id, Product product) {
    }

    @Override
    public void remove(int id) {
        Product product = findById(id);
        entityManager.remove(id);
    }

    @Override
    public Product findById(int id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> productList = new ArrayList<>();
        List<Product> productListSearch = new ArrayList<>();
        for (Product product : productList) {
            if (name.equals(product.getName())) {
                productListSearch.add(product);
            }
        }
        return productListSearch;
    }
}
