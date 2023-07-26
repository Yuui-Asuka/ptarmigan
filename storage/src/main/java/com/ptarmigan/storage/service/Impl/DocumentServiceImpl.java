package com.ptarmigan.storage.service.Impl;

import com.ptarmigan.storage.domain.ESDocument;
import com.ptarmigan.storage.service.DocumentRepository;
import com.ptarmigan.storage.service.DocumentService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    private DocumentRepository elasticRepository;




    @Override
    public void save(ESDocument docBean) {
        elasticRepository.save(docBean);
    }

    @Override
    public void saveAll(List<ESDocument> list) {
        elasticRepository.saveAll(list);
    }

    @Override
    public Iterator<ESDocument> findAll() {
        return elasticRepository.findAll().iterator();
    }

}
