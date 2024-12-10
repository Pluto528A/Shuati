package com.fun.mianshishua.model.dto.question;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 批量移除题目请求对象
 *
 * @author FUN
 * @version 1.0
 * @date 2024/12/10 19:35
 */
@Data
public class QuestionBatchDeleteRequest implements Serializable {

    /**
     * 题目 id 列表
     */
    private List<Long> questionIdList;

    private static final long serialVersionUID = 1L;
}
