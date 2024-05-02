package com.example.hippobookproject.dto.mypage;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
@NoArgsConstructor
public class IntProfileDto {
    private Long userId;
    private String userNickName;
    private Long followingCnt;
    private Long followerCnt;
}
