package com.example.springboot.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @author Yao.Jie
 * @description ${DESCRIPTION}
 * @create 2018-04-11 16:42
 **/
public class ListUtils {


    /**
     * use java.utils.Stream java8
     *
     * iterator -> list
     * @param iterator
     * @param <T>
     * @return
     */
    public static <T> ArrayList<T> toArrayList(final Iterator<T> iterator) {

     return StreamSupport.stream(Spliterators
             .spliteratorUnknownSize(iterator, Spliterator.ORDERED), false)
             .collect(Collectors.toCollection(ArrayList::new));
    }


//    public static void main(String[] args) {
//
//
//    }
}
