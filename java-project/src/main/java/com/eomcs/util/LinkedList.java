package com.eomcs.util;

public class LinkedList {
  protected Node head;
  protected Node tail;
  protected int size = 0;
  
  public LinkedList() {
    head = new Node();
    tail = head;
    size = 0;
  }
  
  public void add(Object value) {
    tail.value = value;
    
    Node node = new Node();
    
    tail.next = node;
    
    node.prev = tail;
    
    tail = node;
    
    size++;
  }
  
  public int size() {
    return this.size;
  }
  
  // ArrayList와 달리 해당 인덱스를 찾아 가려면 링크를 따라가야 하기 때문에
  // 조회 속도가 느리다.
  public Object get(int index) {
    if (index < 0 || index >= size)
      return null;
    
    Node cursor = head;
    for (int i = 1 ; i <= index ; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }
  
  public Object[] toArray() {
    Object[] arr = new Object[size()];
    
    Node cursor = head;
    int i = 0;
    while (cursor != tail) {
      arr[i++] = cursor.value;
      cursor = cursor.next;
    }
    
    return arr;
  }
  
  public Object set(int index, Object value) {
    if (index < 0 || index >=size) {
      return null;
    }
    Node cursor = head;
    
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    
    Object old = cursor.value;
    
    cursor.value = value;
    
    return old;
  }
  
  public int insert(int index,Object value) {
    if (index < 0 || index >= size)
      return -1;
    
    Node node = new Node(value);
    
    Node cursor = head;
    
    for (int i = 1 ; i <= index ; i++) {
      cursor = cursor.next;
    }
    
    node.next = cursor;
    
    node.prev = cursor.prev;
    
    cursor.prev = node;
    
    if (node.prev != null) {
    node.prev.next = node;
    } else {
      head = node;
    }
    size++;
    
    return 0;
  }
  
  public Object remove(int index) {
    if (index < 0 || index >= size)
      return null;
    
    Node cursor = head;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    if (cursor.prev != null) {
    cursor.prev.next = cursor.next;
    } else {
      
      head = cursor.next;
    }
    
    cursor.next.prev = cursor.prev;
    
    Object old = cursor.value;
    cursor.value = null;
    cursor.prev = null;
    cursor.next = null;
    
    size--;
    return old;
  }
}
