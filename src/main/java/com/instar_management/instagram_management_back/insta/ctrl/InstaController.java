package com.instar_management.instagram_management_back.insta.ctrl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instar_management.instagram_management_back.insta.domain.comment.dataRequestDTO;
import com.instar_management.instagram_management_back.insta.domain.comment.dataResponseDTO;
import com.instar_management.instagram_management_back.insta.domain.comment.userInfoRequestDTO;
import com.instar_management.instagram_management_back.insta.domain.comment.userInfoResponseDTO;
import com.instar_management.instagram_management_back.insta.service.InstaService;




@RestController
@RequestMapping("/insta")
public class InstaController {
    
    @Autowired
    private InstaService instaService;

    @PostMapping("/saveUserInfo")
    public ResponseEntity<Void> saveUserInfo(@RequestBody userInfoRequestDTO params) {
        System.out.println("client endpoint /insta/userInfoSave"+instaService);
        System.out.println("params = "+params);
        instaService.saveUserInfo(params);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getUserInfo/{id}")
    public ResponseEntity<Object> getMethodName(@PathVariable String id) {
        System.out.println("client endpoint /insta/getUserInfo"+instaService);
        Map<String, String>map = new HashMap<>();
        map.put("id", id);
        Optional<userInfoResponseDTO> response = instaService.getUserInfo(map);
        if(response.isPresent()){
            return new ResponseEntity<>(response.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // @GetMapping("/getUserInfo")
    // public ResponseEntity<List<userInfoResponseDTO>> getMethodName() {
    //     System.out.println("client endpoint /insta/getUserInfo"+instaService);
    //     List<userInfoResponseDTO> list = instaService.getUserInfo();
    //     return new ResponseEntity<>(list,HttpStatus.OK);
    // }
    
    @PostMapping("/saveOnlyFollower")
    public ResponseEntity<Void> saveOnlyFollower(@RequestBody dataRequestDTO params) {
        System.err.println("client endpoint /insta/saveOnlyFollower"+instaService);
        System.err.println("params = "+params);
        instaService.saveOnlyFollower(params);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/saveOnlyFollowing")
    public ResponseEntity<Void> saveOnlyFollowing(@RequestBody dataRequestDTO params) {
        System.err.println("client endpoint /insta/saveOnlyFollowing"+instaService);
        System.err.println("params = "+params);
        instaService.saveOnlyFollowing(params);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getOnlyFollower/{id}")
    public ResponseEntity<Object> getOnlyFollower(@PathVariable String id) {
        System.out.println("client endpoint /insta/getOnlyFollower"+instaService);
        Map<String, String>map = new HashMap<>();
        map.put("id", id);
        List<dataResponseDTO> response = instaService.getOnlyFollower(map);
        
        return new ResponseEntity<>(response, HttpStatus.OK);
        
    }
    
    @GetMapping("/getOnlyFollowing/{id}")
    public ResponseEntity<Object> getOnlyFollowing(@PathVariable String id) {
        System.out.println("client endpoint /insta/getOnlyFollowing"+instaService);
        Map<String, String>map = new HashMap<>();
        map.put("id", id);
        List<dataResponseDTO> response = instaService.getOnlyFollowing(map);
        
        return new ResponseEntity<>(response, HttpStatus.OK);
        
    }

    @PostMapping("/saveFollower")
    public ResponseEntity<Void> saveFollower(@RequestBody dataRequestDTO params) {
        System.out.println("client endpoint /insta/saveFollower"+instaService);
        System.out.println("params = "+params);
        instaService.saveFollower(params);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PostMapping("/saveFollowing")
    public ResponseEntity<Void> saveFollowing(@RequestBody dataRequestDTO params) {
        System.out.println("client endpoint /insta/saveFollowing"+instaService);
        System.out.println("params = "+params);
        instaService.saveFollowing(params);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getFollower/{id}")
    public ResponseEntity<Object> getFollower(@PathVariable String id) {
        System.out.println("client endpoint /insta/getFollower"+instaService);
        Map<String, String>map = new HashMap<>();
        map.put("id", id);
        List<dataResponseDTO> response = instaService.getFollower(map);
        
        return new ResponseEntity<>(response, HttpStatus.OK);
        
    }
    
    @GetMapping("/getFollowing/{id}")
    public ResponseEntity<Object> getFollowing(@PathVariable String id) {
        System.out.println("client endpoint /insta/getFollowing"+instaService);
        Map<String, String>map = new HashMap<>();
        map.put("id", id);
        List<dataResponseDTO> response = instaService.getFollowing(map);
        
        return new ResponseEntity<>(response, HttpStatus.OK);
        
    }
}
