package naver.captcha;
//네이버 캡차 API 예제 - 입력값 비교
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIExamCaptchaNkeyResult {

 public static void main(String[] args) {
     String clientId = "gGtI7QVFF_7VqiOkx5Po";//애플리케이션 클라이언트 아이디값";
     String clientSecret = "CAiL00DB1X";//애플리케이션 클라이언트 시크릿값";
     try {
         String code = "1"; // 키 발급시 0,  캡차 이미지 비교시 1로 세팅
         String key = "tGqx5ExWnszQzxZd"; // 캡차 키 발급시 받은 키값
         String value = "9C13N6TB"; // 사용자가 입력한 캡차 이미지 글자값
         String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code +"&key="+ key + "&value="+ value;

         URL url = new URL(apiURL);
         //네이버 웹서버와 통신하기 위한 클래스 생성 및 연결요청
         HttpURLConnection con = (HttpURLConnection)url.openConnection();
         con.setRequestMethod("GET");
         con.setRequestProperty("X-Naver-Client-Id", clientId);
         con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
         int responseCode = con.getResponseCode();
         BufferedReader br;
         //서버에 요청한 결과가 정상적으로 처리되면 200번 반환-HTTP상태
         if(responseCode==200) { // 정상 호출
             br = new BufferedReader(new InputStreamReader(con.getInputStream()));
         } else {  // 에러 발생
             br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
         }
         String inputLine;
         StringBuffer response = new StringBuffer();
         //읽어들인 값이 null이 아닐때까지 반복
         while ((inputLine = br.readLine()) != null) {
             response.append(inputLine);
         }
         br.close();
         System.out.println(response.toString());
     } catch (Exception e) {
         System.out.println(e);
     }
 }
}