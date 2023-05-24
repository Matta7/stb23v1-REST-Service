package fr.univrouen.stb23v1.repositories;

import fr.univrouen.stb23v1.entities.STB;
import org.springframework.data.repository.CrudRepository;
public interface STBRepository extends CrudRepository<STB, String> {
}