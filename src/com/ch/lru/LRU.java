package com.ch.lru;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : chenhao
 */
public class LRU {

    Node head;

    Node tail;

    //缓存容量
    int capacity;

    Map<String, Node> cache = new HashMap<>();

    public LRU(int capacity) {
        this.capacity = capacity;
    }

    public void put(String key, Object value){
        if(head == null){
            head = new Node(key, value);
            tail = head;
            cache.put(key, head);
        }

        Node node = cache.get(key);
        if(node != null){
            node.value = value;
            removeAndInsert(node);
        }else{
            Node newNode = new Node(key, value);
            if(cache.size() >= capacity){
                // 先把它从哈希表中删除
                cache.remove(tail);
                // 删除尾部节点
                tail = tail.pre;
                tail.next = null;
            }else{
                head.pre = newNode;
                newNode.next = head;
                head  = node;
            }

        }

    }


    public Object get(String key){
        Node node = cache.get(key);
        if(node != null){
            removeAndInsert(node);
            return node.value;
        }
        return null;
    }


    /**
     * 删除且插入
     *
     * @param node
     */
    private void removeAndInsert(Node node) {
       if(head == node){
            return;
       }else if(tail == node){
           tail = tail.pre;
           tail.next = null;
       }else{
           node.pre.next = node.next;
           node.next.pre = node.pre;
       }

       node.next = head;
       node.pre = null;
       head.pre = node;
       head = node;

    }


}
