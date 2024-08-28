package com.jsa.springbasic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsa.springbasic.entity.SampleUserEntity;

@Repository
public interface SampleUserRepository
extends JpaRepository<SampleUserEntity, String>{

    // Query Method
    // - Repository의 메서드 선언시에 특정 패턴에 따라 메서드를 작성하면 JPA가 SQL을 만들어주는 방법
    // - findBy : 필드명을 기준으로 모든 컬럼을 조회할 때 사용, findBy 뒤에 필드명을 붙여서 작성, 필드명의 첫 글자는 대문자이어야함
    List<SampleUserEntity> findByName(String name);

    SampleUserEntity findByTelNumber(String telNumber);

    // - AND / OR / NOT : 논리 연산에 사용, 필드와 필드 사이에 사용
    // AND / OR의 우선순위 주의!
    List<SampleUserEntity> findByNameAndAddress(String name, String address);

    // - Like, NotLike, StartingWith, EndingWith, Containing : Like 연산에서 사용하며 필드 뒤에 사용
    List<SampleUserEntity> findByAddressContaining(String addresss);

    // - OrderBy : 정령을 사용할 필드를 지정하여 DESC, ASC 지정
    List<SampleUserEntity> findByNameOrderByTelNumberDesc(String name);


    // ORM(JPA) 단점 - 복잡한 쿼리 제한, 결합도 증가
}
