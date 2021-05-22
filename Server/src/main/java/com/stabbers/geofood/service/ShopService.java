package com.stabbers.geofood.service;

import com.stabbers.geofood.entity.ShopEntity;
import com.stabbers.geofood.entity.StockEntity;
import com.stabbers.geofood.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public ShopEntity saveShop(ShopEntity shop) {
        final String lorem = "Lorem ipsum";
        shop.setLocation(lorem);
        return shopRepository.save(shop);
    }

    public List<ShopEntity> getAllShops() {
        return shopRepository.findAll();
    }

    public ShopEntity findById(int id){
        return  shopRepository.findById(id).orElse(new ShopEntity());
    }

}