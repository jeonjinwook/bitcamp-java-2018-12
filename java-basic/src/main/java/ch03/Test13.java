package ch03;

public class Test13 {
  public static void main(String[] args) {

    
    int[] arr1;
    arr1 = new int[5];
    arr1[0] = 100;
    arr1[1] = 90;
    arr1[2] = 80;
    arr1[3] = 70;
    arr1[4] = 60;
     
    // 2.변수선언할때 배열생성
    int[] arr2 = new int[5];
    // 3/레퍼런스 변수를 선언할때 배열 생성과 값 초기화
    // 배열의 개수를 지정하면 안됨
    int[] arr3 = new int [] {100, 100, 90, 90, 60};
    //4.배열 생성과 동시에 값을 초기화 시킬때 배열 생성 문법 생략가능
    int[] arr4 = {100, 90, 80, 70, 60};
    //5.레퍼런스를 별도로 선언한 경우에는 4번 방식처럼 배열 생성문장을 생략할수 없다.
    int[] arr5;
    arr5 = new int[]{90,90,90,90,90};
    
  } // main
} // class