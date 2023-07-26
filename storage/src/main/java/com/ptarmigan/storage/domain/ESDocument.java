package com.ptarmigan.storage.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "my_index")
@AllArgsConstructor
@Data
public class ESDocument {
    private String id;

    private String title;
    private String content;
}
