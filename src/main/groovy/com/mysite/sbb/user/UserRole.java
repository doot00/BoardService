package com.mysite.sbb.user;

import lombok.Getter;

@Getter // 값을 변경할 필요가 없어 Getter만 사용
public enum UserRole { // 열거 자료형
    ADMIN("ROLE_ADMIN"), // ADMIN과 사용자를 의미하는 USER라는 상수를 만들었다.
    USER("ROLE_USER");

    UserRole(String value){
        this.value=value;
    }
    private String value;
}
