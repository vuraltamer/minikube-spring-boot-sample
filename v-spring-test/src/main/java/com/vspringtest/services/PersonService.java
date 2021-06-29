package com.vspringtest.services;

import com.vspringtest.dao.entity.Person;
import com.vspringtest.dao.repo.PersonRepository;
import com.vspringtest.dao.repo.base.BaseRepository;
import com.vspringtest.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class PersonService extends BaseService<Person, String> {

    @Autowired
    public PersonRepository repository;

    @Override
    public BaseRepository<Person, String> getRepository() {
        return repository;
    }

    @PostConstruct
    private void loadDummyData() {
        if (count() == 0) {
            save(new Person("", "Ahmet", "Hamdi", "5145454345", "ahmet.hamdi@hellom.com"));
            save(new Person("", "Kemal", "Tahir", "5143544334", "kemal.tahir@hellom.com"));
            save(new Person("", "Peyami", "Safa", "5143455454", "peyami.safa@hellom.com"));
        }
    }
}