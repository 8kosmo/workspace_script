package naver.captcha;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
/*
 * gGtI7QVFF_7VqiOkx5Po
 * CAiL00DB1X
 */
public class APIExamCaptchaAll {
	 String clientId = "gGtI7QVFF_7VqiOkx5Po";//애플리케이션 클라이언트 아이디값";
	 String clientSecret = "CAiL00DB1X";//애플리케이션 클라이언트 시크릿값";.
	 JDialog jdl = null;
	//키 발급 메소드 선언
	public void getKey() {
		String key = null;
		try {
			String code = "0"; // 키 발급시 0,  캡차 이미지 비교시 1로 세팅
			String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if(responseCode==200) { // 정상 호출
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {  // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			StringBuffer response = new StringBuffer();
			//반복문에서 null이 아닐때 까지 읽어서 저장
			while ((inputLine = br.readLine()) != null) {
				//StringBuffer에 담긴 문자열을 붙인다.
				response.append(inputLine);
			}
			br.close();
			//우리가 필요한 키값만 썰어서 저장
			key = response.toString().substring(8, 24);
			System.out.println(key);
		} catch (Exception e) {
			System.out.println(e);
		}
		makeImage(key);
	}
	//발급된 키로 캡차이미지 생성
	public void makeImage(String key) {
		try {
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
				//네이버 서버에서 생성한 이미지 정보를 받아옴.
				//저장할 공간 생성
				byte[] bytes = new byte[1024];
				// 랜덤한 이름으로 파일 생성
				String tempname = Long.valueOf(new Date().getTime()).toString();
//File은 파일명을 클래스로 만들어 주는 객체이다.
//그러나 파일만 생성되는 것이지 내용까지 담기는 건 아니다.
				String captchaname = "tempname" + ".jpg";
				File f = new File("tempname" + ".jpg");
				//파라미터로 받은 이름으로 파일 생성
				f.createNewFile();
				OutputStream outputStream = new FileOutputStream(f);
				while ((read =is.read(bytes)) != -1) {
					//1)읽어들인 내용을 담을 저장소 주소번지, 2)0, 3)read
					outputStream.write(bytes, 0, read);
				}
				is.close();
				jdl = new JDialog();
				String imgPath = "D:\\workspace_script\\dev_html\\";
				JButton jbtn_captcha = new JButton(new ImageIcon(imgPath+captchaname));
				jdl.add("Center",jbtn_captcha);
				jdl.setTitle(clientId);
				jdl.pack();
				jdl.setVisible(true);
			} else {  // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();
				while ((inputLine = br.readLine()) != null) {
					response.append(inputLine);
				}
				br.close();
				//만일 이미지 생성실패 하면 에러 메시지가 출력
				System.out.println(response.toString());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		captchaAccount(key);
	}
	//값을 비교해서 처리결과를 받아오기
	public void captchaAccount(String key) {// 캡차 키 발급시 받은 키값
		try {
	         String code = "1"; // 키 발급시 0,  캡차 이미지 비교시 1로 세팅
	         String value = null; // 사용자가 입력한 캡차 이미지 글자값
	         value = JOptionPane.showInputDialog(value);
	         jdl.setVisible(false);
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

	 public static void main(String[] args) {
		 APIExamCaptchaAll apiCaptcha = new APIExamCaptchaAll();
		 apiCaptcha.getKey();
		 
	 }
}
