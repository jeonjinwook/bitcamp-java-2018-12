// java.sql.Connectior 객체
package ch25.a;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test05 {

    public static void main(String[] args) {
      // DriverManager.getConnetion()
      // => org.mariadb.jdbc.Driver.connect()
      //
      try  (Connection con = DriverManager.getConnection(
          "jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")){
        // JDBC URL을 이용하여 등록된 java.sql.Driver 구현체를 알아낸다.
        System.out.println("DBMS에 연결된!");
        
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
}





























