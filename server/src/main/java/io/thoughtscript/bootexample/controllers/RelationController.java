package io.thoughtscript.bootexample.controllers;

import io.thoughtscript.bootexample.domain.OneToManyRelation;
import io.thoughtscript.bootexample.domain.OneToOneRelation;
import io.thoughtscript.bootexample.services.OneToManyRelationService;
import io.thoughtscript.bootexample.services.OneToOneRelationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/api/relations")
public class RelationController {

    @Autowired
    OneToManyRelationService oneToManyRelationService;

    @Autowired
    OneToOneRelationService oneToOneRelationService;

    @GetMapping("/one/all")
    @ResponseBody
    public ResponseEntity getAllOneRelations() {
        List<OneToOneRelation> result = oneToOneRelationService.getAllOneRelations();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/many/all")
    @ResponseBody
    public ResponseEntity getAllManyRelations() {
        List<OneToManyRelation> result = oneToManyRelationService.getAllManyRelations();
        return ResponseEntity.ok(result);
    }
}
