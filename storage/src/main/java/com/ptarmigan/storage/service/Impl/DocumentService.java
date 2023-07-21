package com.ptarmigan.storage.service.Impl;

import com.ptarmigan.storage.domain.ESDocument;
import com.ptarmigan.storage.service.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

    private final DocumentRepository documentRepository;

    @Autowired
    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public void saveDocument(ESDocument document) {
        documentRepository.save(document);
    }

    public List<ESDocument> findByTitle(String title) {
        return documentRepository.findByTitle(title);
    }
}
