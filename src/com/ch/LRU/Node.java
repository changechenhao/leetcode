package com.ch.LRU;

/**
 * @author : chenhao
 */
public class Node {

    String key;
    Object value;
    Node next;
    Node pre;

    public Node(String key, Object value) {
        this.key = key;
        this.value = value;
    }
}
