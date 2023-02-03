package io.thoughtscript.bootexample.services;

import io.thoughtscript.bootexample.domain.OneToManyRelation;
import io.thoughtscript.bootexample.repositories.OneToManyRelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OneToManyRelationService {

    @Autowired
    OneToManyRelationRepository oneToManyRelationRepository;

    public List<OneToManyRelation> getAllManyRelations() {
        return (List<OneToManyRelation>) oneToManyRelationRepository.findAll();
    }
}
