package com.spring_study.springboot.web.dto;

import junit.framework.TestCase;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void Response_Test(){
        String name = "hello";
        int amount = 1000;
        HelloResponseDto dto = new HelloResponseDto(name,amount);
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}