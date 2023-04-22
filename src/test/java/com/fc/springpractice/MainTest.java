package com.fc.springpractice;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void mainTest() {
        // given
        String[] args = {"3", "1", "2", "4"};

        // when & Then
        Main.main(args);
    }
}