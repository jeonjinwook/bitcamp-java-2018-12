package algorithm.data_structure.array;

public class ArrayList2 {
  static final int DEFAULT_SIZE = 5;
  int size;
  Object[] arr;
  public ArrayList2() {
    this(0);
  }
  public ArrayList2(int number) {
    if (number > DEFAULT_SIZE) {
      arr = new Object[number];
    } else {
      arr = new Object[DEFAULT_SIZE];
    }
  }
  public Object[] toArray() {
    Object[] list = new Object[size];
    for (int i = 0; i <list.length ; i++) {
      list[i] = this.arr[i];
    }
    return list;
  }
  public void add(Object value) {
    if(arr.length == size) {
      int old = arr.length;
      int nld = old + (old >> 1);
      Object[] temp = new Object[nld];
      for (int i = 0 ; i < size ; i++) {
        temp[i] = arr[i];
      }
      arr = temp;
    }
  }

  public Object get(int index) {
    if (index < 0 || index >= size) {
      return null;
    }
    return arr[index];
  }

  public Object set(int index, Object value) {
    if (index < 0 || index >= size) {
      return null;
    }
    Object old = arr[index];
    arr[index] = value;
    return old;
  }

  public int insert(int index, Object value) {
    if (index < 0 || index >= size) {
      return -1;
    }
    if (arr.length == size) {
      int old = arr.length;
      int nld = old + (old >> 1);
      Object[] temp = new Object[nld];
      for (int i = 0 ; i < size; i++ ) {
        temp[i] = arr[i];
      }
      arr = temp;
    }

    for (int i = size -1 ; i < index; i--) {
      arr[i + 1] = arr[i];
    }
    arr[index] = value;
    size++;
    return 0;
  }


  public Object remove(int index) {
    if (index < 0 || index > size) {
      return null;
    }
    Object old = arr[index];
    
    for (int i = index ; i < size - 1 ; i++) {
      arr[i] = arr[i + 1];
    }
    size--;
    return old;
  }

  public int size() {
    return this.size;
  }
}
