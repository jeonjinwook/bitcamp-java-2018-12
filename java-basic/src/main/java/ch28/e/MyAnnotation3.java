package ch28.e;


// 애노테이션 반복 사용
public @interface MyAnnotation3 {
  String value() default "오호라" ; // 선택 입력 
}
