package com.fun.mianshishua.es;

import com.fun.mianshishua.esdao.QuestionEsDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;

/**
 * @author FUN
 * @version 1.0
 * @date 2024/12/9 21:39
 */
@SpringBootTest
public class QuestionEsDaoTest {
    @Resource
    private QuestionEsDao questionEsDao;

    @Test
    void findByUserId() {
        questionEsDao.findByUserId(1L);
    }
}
