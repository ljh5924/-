package com.zhy.service;

import com.zhy.model.FeedBack;
import com.zhy.utils.DataMap;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: ljh123
 * 2023/7/23 17:21
 * Describe:反馈业务操作
 */
public interface FeedBackService {

    /**
     * 保存反馈信息
     * @param feedBack
     * @return
     */
    @Transactional
    void submitFeedback(FeedBack feedBack);

    /**
     * 获得所有的反馈
     * @return
     */
    DataMap getAllFeedback(int rows, int pageNum);

}
