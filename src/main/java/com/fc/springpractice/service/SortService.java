package com.fc.springpractice.service;

import com.fc.springpractice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {

    // 생성자에서 생성 시 값을 대입하므로 final
    private final Sort<String> sort;

    // sort 가 주입될 수 있도록 생성자를 만듦
    public SortService(@Qualifier("BSort") Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }

    // 정렬 구현체와 분리되어 정렬을 수행.
    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
