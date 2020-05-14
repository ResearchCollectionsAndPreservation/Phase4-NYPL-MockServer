package com.nypl.mockServer.dao;

import com.nypl.mockServer.model.Patron;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by giris on 27/3/20.
 */
public interface PatronRepository extends JpaRepository<Patron,Integer> {
    Patron findByPatronIdentifier(String patronIdentifier);
}
