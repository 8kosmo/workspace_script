package naver.captcha;
//네이버 캡차 API 예제 - 캡차 이미지 수신
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.StringTokenizer;

public class APIExamCaptchaImage {
	String clientId = null;
	String clientSecret = null;
	String key = null;
	public APIExamCaptchaImage(String clientId,String clientSecret,String key) {
		try {
//			String key = "tGqx5ExWnszQzxZd"; // https://openapi.naver.com/v1/captcha/nkey 호출로 받은 키값
			this.clientId = clientId;
			this.clientSecret = clientSecret;
			this.key = key;
			String apiURL = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + key;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if(responseCode==200) { // 정상 호출
				InputStream is = con.getInputStream();
				int read = 0;
				byte[] bytes = new byte[1024];
				// 랜덤한 이름으로 파일 생성
				String tempname = Long.valueOf(new Date().getTime()).toString();
				File f = new File("tempname" + ".jpg");
				f.createNewFile();
				OutputStream outputStream = new FileOutputStream(f);
				while ((read =is.read(bytes)) != -1) {
					outputStream.write(bytes, 0, read);
				}
				is.close();
			} else {  // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();
				while ((inputLine = br.readLine()) != null) {
					response.append(inputLine);
				}
				br.close();
				System.out.println(response.toString());
			}
		} catch (Exception e) {
			System.out.println(e);
		}	
	}
//     String clientId = "gGtI7QVFF_7VqiOkx5Po";//애플리케이션 클라이언트 아이디값";
//     String clientSecret = "CAiL00DB1X";//애플리케이션 클라이언트 시크릿값";
}