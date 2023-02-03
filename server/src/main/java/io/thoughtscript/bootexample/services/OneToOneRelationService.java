package io.thoughtscript.bootexample.services;

import io.thoughtscript.bootexample.domain.OneToOneRelation;
import io.thoughtscript.bootexample.repositories.OneToOneRelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OneToOneRelationService {

    @Autowired
    OneToOneRelationRepository oneToOneRelationRepository;

    public List<OneToOneRelation> getAllOneRelations() {
        return (List<OneToOneRelation>) oneToOneRelationRepository.findAll();
    }

}
