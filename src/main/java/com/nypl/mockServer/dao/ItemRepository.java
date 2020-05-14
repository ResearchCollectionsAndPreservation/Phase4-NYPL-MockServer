package com.nypl.mockServer.dao;

import com.nypl.mockServer.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by giris on 27/3/20.
 */
public interface ItemRepository extends JpaRepository<Item,Integer> {
    Item findByItemIdentifier(String itemIdentifier);
}
