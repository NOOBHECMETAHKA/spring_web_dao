package com.example.pracktwo.repo;

import com.example.pracktwo.models.Cat;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CatRepository extends CrudRepository<Cat, UUID> {

}
