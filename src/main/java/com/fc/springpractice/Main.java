package com.fc.springpractice;

import com.fc.springpractice.logic.JavaSort;
import com.fc.springpractice.service.SortService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SortService sortService = new SortService(new JavaSort<>());

        System.out.println("[result] " + sortService.doSort(Arrays.asList(args)));
    }
}
