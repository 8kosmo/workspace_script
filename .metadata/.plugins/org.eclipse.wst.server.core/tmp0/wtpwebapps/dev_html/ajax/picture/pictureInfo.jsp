<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.google.gson.Gson" %>
<%
//Map으로 키값 정해주고 row값 넣어주고 List에 담는다
//pictureMain.html문서에서  ajax처리 메소드에서 호출하는 url 뒤에 query string문자열값 읽어오는 메소드
	String p_no = request.getParameter("p_no");
    List<Map<String,Object>> picList = new ArrayList<>();
    Map<String,Object> picInfo = new HashMap<>();
    picInfo.put("p_no",1);
    picInfo.put("p_img","../picture/images/1.jpg");
    picInfo.put("p_info","그림설명1");
    picList.add(picInfo);
    
    picInfo = new HashMap<>();
    picInfo.put("p_no",2);
    picInfo.put("p_img","../picture/images/2.jpg");
    picInfo.put("p_info","그림설명2");
    picList.add(picInfo);
    
    picInfo = new HashMap<>();
    picInfo.put("p_no",3);
    picInfo.put("p_img","../picture/images/3.jpg");
    picInfo.put("p_info","그림설명3");
    picList.add(picInfo);
    
    picInfo = new HashMap<>();
    picInfo.put("p_no",4);
    picInfo.put("p_img","../picture/images/4.jpg");
    picInfo.put("p_info","그림설명4");
    picList.add(picInfo);
    //선택한 그림의 아이디에 대응하는 값만 가져오기
    //json포맷으로 넘겨야 하고 그 후 스크립트로 다시 파싱해야 하므로 동일한 구조로 만들어야함
    //그러면 파싱하는 부분의 코드는 수정을 안해도 되니깐...
    /*
	위에서는 모든 건을 다 조회하였다.
	그러나 그림 제목에 오버했을 때 td태그의 id속성의 값을 읽어서 그 값을 쿼리스트링으로 넘겼다.
	pictureInfo.jsp?p_no=3
	http://localhost:8000/ajax/picture/pictureInfo.jsp?p_no=1
    */
    List<Map<String,Object>> picDetail = new ArrayList<>();
    Map<String,Object> picDetailMap = null;
    for(int i=0;i<picList.size();i++){//4번 반복
    	Map<String,Object> rmap = picList.get(i);//한 건 씩 꺼낸다.
    	if(p_no.equals(rmap.get("p_no").toString())){//비교한다. p_no비교
    		//한건식 꺼낸 맵의 주소번지를 새로운 주소번지 대입하고
    		picDetailMap = rmap;//4건을 가진 맵 중에서 p_no가 같은 한개 맵만 주소번지 저장함
    		//List에 담는다.
    		picDetail.add(picDetailMap);
    	}
    }
    //구글에서 제공하는 오픈API를 사용하여 JSON포맷으로 꺼내기(String으로)
    Gson g = new Gson();
    String result = g.toJson(picDetail);
    out.print(result);
%>