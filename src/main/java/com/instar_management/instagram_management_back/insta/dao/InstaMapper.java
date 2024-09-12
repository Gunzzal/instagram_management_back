package com.instar_management.instagram_management_back.insta.dao;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.instar_management.instagram_management_back.insta.domain.comment.dataRequestDTO;
import com.instar_management.instagram_management_back.insta.domain.comment.dataResponseDTO;
import com.instar_management.instagram_management_back.insta.domain.comment.userInfoRequestDTO;
import com.instar_management.instagram_management_back.insta.domain.comment.userInfoResponseDTO;

@Mapper
public interface InstaMapper {
    
    public void saveUserInfoRow(userInfoRequestDTO params);

    public Optional<userInfoResponseDTO> getUserInfoRow(Map<String, String> map);

    // public List<userInfoResponseDTO> getUserInfoRow();

    public void saveOnlyFollowerRow(dataRequestDTO params);
    
    public void saveOnlyFollowingRow(dataRequestDTO params);

    public List<dataResponseDTO> getOnlyFollowerRow(Map<String, String> map);

    public List<dataResponseDTO> getOnlyFollowingRow(Map<String, String> map);

    public void saveFollowerRow(dataRequestDTO params);

    public void saveFollowingRow(dataRequestDTO params);

    public List<dataResponseDTO> getFollowerRow(Map<String, String> map);

    public List<dataResponseDTO> getFollowingRow(Map<String, String> map);
}
