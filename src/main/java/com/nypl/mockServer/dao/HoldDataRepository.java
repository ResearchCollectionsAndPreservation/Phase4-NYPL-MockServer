package com.nypl.mockServer.dao;

import com.nypl.mockServer.model.HoldData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by giris on 31/3/20.
 */
public interface HoldDataRepository extends JpaRepository<HoldData,Integer> {
    int deleteByItemBarcode(String itemBarcode);
    HoldData findByTrackingId(String trackingId);

}
