package com.vspringtest.dao.repo.base;

import com.vspringtest.dao.entity.Person;
import com.vspringtest.dao.entity.base.BaseEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity, PK extends Serializable> extends MongoRepository<T, PK>{

    void deleteByIdentifier(String identifier);

    Optional<T> findByIdentifier(String identifier);

}