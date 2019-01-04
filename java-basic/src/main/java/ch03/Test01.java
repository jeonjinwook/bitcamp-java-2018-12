package ch03;

public class Test01 {
  public static void main(String[] args) {
    byte b1;
    byte b2;
    byte b3;
    
    b1 = -128;
    b2 = 127;
    //b3 = 128; //128은 1바이트 메모리에 담을 수 없기 때문에 컴파일 오류가 발생한다.
    short s1;
    short s2;
    short s3;
    
    s1 = -32768;
    s2 = 32767;
    //s2 = 300L; // 컴파일 오류
    //s3 = 32768; // 컴파일 오류
    
    int i1;
    int i2;
    int i3;
    
    i1 = -2100000000;
    i2 = 2100000000;
    //i3 = 2100000000L;//컴파일 오류 8바이트 값을 4바이트 메모리에 넣을 수 없다.
    //i3 = 2200000000;// 리터럴 표현 오류 4바이트를 초과하는 값을 표현
    
    long l1;
    long l2;
    long l3;
    
    l1 = 9000000000000000000L;
    // l2 = 9900000000000000000L; // 8바이트 리터럴 표현 오류
    
    float f1;
    float f2;
    
    f1 = 98765.43f;
    f2 = 98765.43456789f;// 유효 자릿수를 넘어 가는 경우 짤려서 저장된다.
                             // 정수 메모리와 달리 컴파일 오류가 발생하지 않는다.
                             // 그래서 더더욱 주의해서 사용해야 한다.
    
    System.out.println(f1);
    System.out.println(f2);
    
       
       
    double d1;
    double d2;
    
    d1 = 98765.43; // 8바이트 부동소수점은 f,F 접미사를 제거
    d2 = 98765.43456789;
    System.out.println(d1);
    System.out.println(d2);

    
    boolean bool1;
    boolean bool2;
    boolean bool3;
    
    bool1 = true;
    bool2 = false;
    // bool3 = 1; // true, false 외의 다른 값은 저장 불가
    
    char c1;
    char c2;
    char c3;
    
    c1 =44032;
    c2 = 0xac00;
    c3 = '가';
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);

   }
}