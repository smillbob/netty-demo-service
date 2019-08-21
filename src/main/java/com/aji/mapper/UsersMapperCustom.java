package com.aji.mapper;

import java.util.List;

import com.aji.pojo.Users;
import com.aji.pojo.vo.FriendRequestVO;
import com.aji.pojo.vo.MyFriendsVO;
import com.aji.utils.MyMapper;

public interface UsersMapperCustom extends MyMapper<Users> {
	
	public List<FriendRequestVO> queryFriendRequestList(String acceptUserId);
	
	public List<MyFriendsVO> queryMyFriends(String userId);
	
	public void batchUpdateMsgSigned(List<String> msgIdList);
	
}