package com.instar_management.instagram_management_back.insta.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instar_management.instagram_management_back.insta.dao.InstaMapper;
import com.instar_management.instagram_management_back.insta.domain.comment.dataRequestDTO;
import com.instar_management.instagram_management_back.insta.domain.comment.dataResponseDTO;
import com.instar_management.instagram_management_back.insta.domain.comment.userInfoRequestDTO;
import com.instar_management.instagram_management_back.insta.domain.comment.userInfoResponseDTO;

@Service
public class InstaService {
    
    @Autowired
    private InstaMapper instaMapper;

    public void saveUserInfo(userInfoRequestDTO params){
        System.out.println("debug >>> service saveUserInfo" + instaMapper);
        instaMapper.saveUserInfoRow(params);
    }

    public Optional<userInfoResponseDTO> getUserInfo(Map<String, String> map){
        System.out.println("debug >>> service getUserInfo" + instaMapper);
        return instaMapper.getUserInfoRow(map);
    }

    // public List<userInfoResponseDTO> getUserInfo(){
    //     System.out.println("debug >>> service getUserInfo" + instaMapper);

    //     return instaMapper.getUserInfoRow();
    // }

    public void saveOnlyFollower(dataRequestDTO params){
        System.out.println("debug >>> service saveOnlyFollower" + instaMapper);
        instaMapper.saveOnlyFollowerRow(params);
    }

    public void saveOnlyFollowing(dataRequestDTO params){
        System.out.println("debug >>> service saveOnlyFollowing" + instaMapper);
        instaMapper.saveOnlyFollowingRow(params);
    }

    public List<dataResponseDTO> getOnlyFollower(Map<String, String> map){
        System.out.println("debug >>> service getOnlyFollower" + instaMapper);
        return instaMapper.getOnlyFollowerRow(map);
    }

    public List<dataResponseDTO> getOnlyFollowing(Map<String, String> map){
        System.out.println("debug >>> service getOnlyFollower" + instaMapper);
        return instaMapper.getOnlyFollowingRow(map);
    }

    public void saveFollower(dataRequestDTO params){
        System.out.println("debug >>> service saveFollower" + instaMapper);
        instaMapper.saveFollowerRow(params);
    }

    public void saveFollowing(dataRequestDTO params){
        System.out.println("debug >>> service saveFollowing" + instaMapper);
        instaMapper.saveFollowingRow(params);
    }

    public List<dataResponseDTO> getFollower(Map<String, String> map){
        System.out.println("debug >>> service getFollower" + instaMapper);
        return instaMapper.getFollowerRow(map);
    }

    public List<dataResponseDTO> getFollowing(Map<String, String> map){
        System.out.println("debug >>> service getFollowing" + instaMapper);
        return instaMapper.getFollowingRow(map);
    }

}
