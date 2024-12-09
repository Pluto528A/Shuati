package com.fun.mianshishua.esdao;

import com.fun.mianshishua.model.dto.question.QuestionEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * 存放对 Elasticsearch 的操作
 *
 * @author FUN
 * @version 1.0
 * @date 2024/12/9 21:37
 */
public interface QuestionEsDao extends ElasticsearchRepository<QuestionEsDTO, Long> {
    /**
     * 根据用户 id 查询
     * @param userId
     * @return
     */
    List<QuestionEsDTO> findByUserId(Long userId);

}
