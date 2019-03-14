// 애노테이션 사용 범위
// => @Target을 사용하여 애노테이션을 붙일 수 있는 위치를 지정할 수 있다.
//
package ch28.c;

import java.lang.annotation.Annotation;

@MyAnnotation // 클래스
//@MyAnnotation2 // 필드 
//@MyAnnotation3  // 메서드
//@MyAnnotation4 // 로컬변수
public class Test01 {

  //@MyAnnotation // 클래스
  @MyAnnotation2 // 필드 
  //@MyAnnotation3  // 메서드
  //@MyAnnotation4 // 로컬변수
  int i;

  //@MyAnnotation // 클래스
  @MyAnnotation2 // 필드 
  //@MyAnnotation3  // 메서드
  //@MyAnnotation4 // 로컬변수
  static int j;
  
  //@MyAnnotation // 클래스
//@MyAnnotation2 // 필드 
@MyAnnotation3  // 메서드
//@MyAnnotation4 // 로컬변수
  public static void main(String[] args) {
  
  //@MyAnnotation // 클래스
//@MyAnnotation2 // 필드 
//@MyAnnotation3  // 메서드
@MyAnnotation4 // 로컬변수
  int local;
  }
}














