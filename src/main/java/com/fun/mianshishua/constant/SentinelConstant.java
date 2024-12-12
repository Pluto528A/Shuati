package com.fun.mianshishua.constant;

/**
 * Sentinel 限流熔断常量
 *
 * @author FUN
 * @version 1.0
 * @date 2024/12/11 21:06
 */
public interface SentinelConstant {

    /**
     * 分页获取题库列表接口限流
     */
    String listQuestionBankVOByPage = "listQuestionBankVOByPage";

    /**
     * 分页获取题目列表接口限流
     */
    String listQuestionVOByPage = "listQuestionVOByPage";
}