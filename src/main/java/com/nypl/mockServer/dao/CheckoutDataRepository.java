package com.nypl.mockServer.dao;

import com.nypl.mockServer.model.CheckoutData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by giris on 30/3/20.
 */
public interface CheckoutDataRepository extends JpaRepository<CheckoutData,Integer>{
    CheckoutData findByItemBarcode(String itemBarcode);
    CheckoutData findByPatronBarcode(String patronBarcode);
    int deleteByItemBarcode(String itemBarcode);

}
