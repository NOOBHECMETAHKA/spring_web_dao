package com.example.pracktwo.repo;

import com.example.pracktwo.models.Human;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface HumanRepository extends CrudRepository<Human, UUID> {

}
