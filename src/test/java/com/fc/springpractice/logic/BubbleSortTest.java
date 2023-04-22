package com.fc.springpractice.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {

    @DisplayName("BubbleSort - 리스트를 넣으면 오름차순 정렬결과를 반환")
    @Test
    void bubbleSortTest() {
        // given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        // when
        List<Integer> actual = bubbleSort.sort(List.of(3, 2, 4, 5, 1));

        // then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }
}