package com.mytrain.all.com.storeTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StoreRepository extends JpaRepository<Store, String> {
    Store findByTitle(String title);

    List<Store> findByUserId(String userId);

}
