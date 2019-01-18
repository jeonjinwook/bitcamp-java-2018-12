package com.eomcs.lms.handler;

import java.util.Arrays;

public class ArrayList<E> {
  static final int DEFAULT_CAPACITY = 10;
  Object[] list;
  int size = 0;
  
  public ArrayList() {
  list = new Object[DEFAULT_CAPACITY]; 
  }
  
  public ArrayList(int initialCapacity) {
    if (initialCapacity > DEFAULT_CAPACITY)
      list = new Object[initialCapacity];
    else
      list = new Object[DEFAULT_CAPACITY];
  }

  @SuppressWarnings("unchecked")
  public E[] toArray(E[] sampleArr) {
    return (E[]) Arrays.copyOf(list, size, sampleArr.getClass());
    /*E[] arr = Arrays.copyOf(sampleArr, size);
    for (int i = 0 ; i < size ; i++) {
      arr[i] = (E) list[i];
    }
    return arr;
    */
  }

  public void add(E abj) {
    if (size >= list.length) {
      int oldCapacity = list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      list = Arrays.copyOf(list, newCapacity);
    }

    list[size++] = abj;
  }
  
  @SuppressWarnings("unchecked")
  public E get(int index) {
    return (E) list[index] ;
  }
  
  public E set(int index, E valuse) {
    // value : 해당 위치에 있는 값을 대체할 값
    // 리턴 값 : 대체되기 전의 값
    return null;
    
  }
  
  public E remover(int index) {
    // index : 삭제할 배열의 항목 위치
    // 리턴 값 : 삭제된 이전 값
    // 힌트 : System.Arraycopy() 참
    return null;
  }
  public int size() {
    return size;
  }
}
