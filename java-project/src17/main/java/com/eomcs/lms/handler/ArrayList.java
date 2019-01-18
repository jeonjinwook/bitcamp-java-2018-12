package com.eomcs.lms.handler;

import java.util.Arrays;

public class ArrayList {
  static final int LENGTH = 3;
  Object[] list = new Object[LENGTH]; //최상위 오브젝트 배열
  int size = 0;

  public Object[] toArray() {
    Object[] a = new Object[size];
  for (int i = 0; i < size; i++) {
    a[i] = this.list[i];
  }
  return a;
  }

  public void add(Object abj) {
    if (size >= list.length) {
      list = Arrays.copyOf(list, list.length + (list.length >> 1));

      System.out.printf("배열 증가 함: %d\n", list.length);
    }

    list[size++] = abj;
  }
}
