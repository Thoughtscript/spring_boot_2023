package io.thoughtscript.bootexample.prepopulate;

import io.thoughtscript.bootexample.domain.Example;
import io.thoughtscript.bootexample.domain.OneToManyRelation;
import io.thoughtscript.bootexample.domain.OneToOneRelation;
import io.thoughtscript.bootexample.repositories.ExampleRepository;
import io.thoughtscript.bootexample.repositories.OneToManyRelationRepository;
import io.thoughtscript.bootexample.repositories.OneToOneRelationRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DatabaseInitialization {

    @Autowired
    ExampleRepository exampleRepository;

    @Autowired
    OneToOneRelationRepository oneToOneRelationRepository;

    @Autowired
    OneToManyRelationRepository oneToManyRelationRepository;


    @PostConstruct
    private void postConstruct() {
        // TODO Fix PK's
        OneToOneRelation a = new OneToOneRelation(1, "test");
        oneToOneRelationRepository.save(a);

        Example b = new Example(1, "test" , a);
        exampleRepository.save(b);

        OneToOneRelation c = new OneToOneRelation(2, "test");
        oneToOneRelationRepository.save(c);

        Example d = new Example(2, "test" , c);
        exampleRepository.save(d);

        OneToManyRelation e = new OneToManyRelation(1, "test", 1);
        oneToManyRelationRepository.save(e);

        log.info("Pre-populating complete!");
    }
}
