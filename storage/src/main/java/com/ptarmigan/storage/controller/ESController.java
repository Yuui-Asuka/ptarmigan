package com.ptarmigan.storage.controller;

import com.google.gson.Gson;
import com.ptarmigan.storage.domain.ESDocument;
import com.ptarmigan.storage.service.DocumentRepository;
import com.ptarmigan.storage.service.DocumentService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RequestMapping("log/api/v1")
@RestController
public class ESController {

    @Autowired
    private DocumentService documentService;

    @Autowired
    private DocumentRepository documentRepository;

    @PostMapping("save_doc")
    private void saveDoc(@RequestParam String id, @RequestParam String title, @RequestParam String content){
        ESDocument esDocument = new ESDocument(id, title, content);
        documentService.save(esDocument);
    }

    @GetMapping("get_doc")
    private ESDocument getDoc(@RequestParam String title){
        System.out.println(title);
        System.out.println(documentRepository.findByTitle(title));
//        ESDocument esDocument = documentRepository.findByTitle(title);
//        String id = esDocument.getId();
//        Gson gson = new Gson();


       return documentRepository.findByTitle(title);
    }
}
