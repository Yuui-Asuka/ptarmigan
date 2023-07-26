package com.ptarmigan.storage.service;

import com.ptarmigan.storage.domain.ESDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface DocumentRepository extends ElasticsearchRepository<ESDocument, String> {

    ESDocument findByTitle(String title);


}