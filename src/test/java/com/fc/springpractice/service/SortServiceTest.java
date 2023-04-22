package com.fc.springpractice.service;

import com.fc.springpractice.logic.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortServiceTest {

    // sut : system under test
    private final SortService sut = new SortService(new BubbleSort<>());

    @Test
    void test() {
        // given


        // when
        List<String> actual = sut.doSort(List.of("3", "1", "2"));

        // then
        assertEquals(List.of("1", "2", "3"), actual);
    }
}