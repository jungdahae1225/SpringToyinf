package com.example.springtoyinf.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A") //싱글테이블 전략을 선택했으므로 DB가 현재 무엇이 들어왔는지 알려주기 위함
@Getter @Setter
public class Album extends Item {
    private String artist;
    private String etc; //기타정보
}
