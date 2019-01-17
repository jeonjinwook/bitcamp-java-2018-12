package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Board;

public class BoardList {
  static final int DEFAULT_CAPACITY = 10;
  private Board[] list;
  int size = 0;

  public BoardList() {
    list  = new Board[DEFAULT_CAPACITY];
  }

  public BoardList(int initialCapacity) {
    if (initialCapacity > DEFAULT_CAPACITY)
      list = new Board[initialCapacity];
    else
      list = new Board[DEFAULT_CAPACITY];
  }

  public Board[] toArray() {
    return Arrays.copyOf(list, size);
  }

  public void add(Board board) {
    if (size >= list.length) {
      int oldCapacity = list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      list = Arrays.copyOf(list, newCapacity);

      System.out.printf("배열 증가 함: %d\n", list.length);
    }

    list[size++] = board;
  }
}
//static final int LENGTH = 3;
//Board[] arr = new Board[LENGTH];
//int size = 0;
//public Board[] toArray() {
//  Board[] a = new Board[size];
//  for (int i = 0; i < size; i++) {
//    a[i] = this.arr[i];
//  }
//  return a;
//}
//
//public void add(Board board) {
//  if (size == arr.length) {
//    arr = Arrays.copyOf(arr, arr.length + (arr.length >> 1));
//    /*
//    Board[] a = new Board[arr.length + (arr.length >> 1)];
//    for (int i = 0; i < arr.length; i++) {
//      a[i] = arr[i];
//    }
//    arr = a;
//    */
//    System.out.printf("배열 증가 함: %d\n", arr.length);
//  }
//  arr[size++] = board;
//}
//}
