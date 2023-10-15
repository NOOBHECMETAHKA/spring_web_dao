package com.example.pracktwo.repo;

import com.example.pracktwo.models.Pencil;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PencilRepository extends CrudRepository<Pencil, UUID> {

}
