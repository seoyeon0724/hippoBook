package com.example.hippobookproject.controller.mypage;

import com.example.hippobookproject.dto.mypage.IntProfileDto;
import com.example.hippobookproject.service.mypage.MypageService;
import com.example.hippobookproject.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/mypage")
@RequiredArgsConstructor
public class MyPageController {
    private final UserService userService;
    private final MypageService mypageService;

    @GetMapping("/int")
    public String myPageInt(Model model/*@SessionAttribute("userId") Long userId*/){
        Long userId = 1L;
        IntProfileDto profileDto = mypageService.findProfile(userId);
        model.addAttribute("profileDto", profileDto);
        log.info("profileDto={}",profileDto);
        return "/mypage/myPageInt";
    }



    @GetMapping("/book/container")
    public String bookContainer(){
        return "/mypage/myPageBookContainer";
    }

    @GetMapping("/book/write-content")
    public String bookWriteContent() {
        return "/mypage/myWriteContent";
    }

    @GetMapping("/sticker")
    public String myPageSticker(){
        return "mypage/myPageInt_stiker";
    }

    @GetMapping("/manage")
    public String myPageManage(){
        return "mypage/myPageInt_manage";
    }

    @GetMapping("/modify")
    public String myPageModify(){
        return "mypage/myPageInt_modify";
    }

    @GetMapping("/secession")
    public String myPageSecession(){
        return "mypage/myPageInt_secession";
    }
}
