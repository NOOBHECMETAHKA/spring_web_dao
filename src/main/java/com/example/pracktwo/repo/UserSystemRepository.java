package com.example.pracktwo.repo;

import com.example.pracktwo.models.UserSystem;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserSystemRepository extends CrudRepository<UserSystem, UUID> {

}
