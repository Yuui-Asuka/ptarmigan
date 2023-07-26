package com.ptarmigan.storage.service;

import com.ptarmigan.storage.domain.ESDocument;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public interface DocumentService {

    void save(ESDocument docBean);

    void saveAll(List<ESDocument> list);

    Iterator<ESDocument> findAll();

}
