package com.nt.Repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Coustomer;

public interface CustomerRepo extends CrudRepository< Coustomer,Integer> {

}
