package com.zhy.service;

import com.zhy.model.FriendLink;
import com.zhy.utils.DataMap;

/**
 * @author: ljh123
 * @Date: 2023/5/16 17:08
 * Describe:
 */
public interface FriendLinkService {

    DataMap addFriendLink(FriendLink friendLink);

    DataMap getAllFriendLink();

    DataMap updateFriendLink(FriendLink friendLink, int id);

    DataMap deleteFriendLink(int id);

    DataMap getFriendLink();
}
