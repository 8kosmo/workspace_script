<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int x = 1;
	public String newsList(String news[]){
		StringBuilder sb = new StringBuilder();
		sb.append("<table width = '650px' border='1'>");
		sb.append("<tr><td>"+news[0]+" > "+news[1]+"</td></tr>");
		sb.append("</table>");
		return sb.toString();
	}
%>
<%
	String news1[] = {"KOSMO늬우스","KOSMO 52기 프로젝트로 시작된 KIN톡 상용화 서비스 시작"};
	String news2[] = {"KOSMO늬우스","MVC패턴, Server, Socket정보 마스터"};
	String news3[] = {"KOSMO늬우스","정재현 식권100장으로 중도탈락 벗어나 취업까지 성공일기"};
	String news4[] = {"KOSMO늬우스","KOSMO 52기 현태호 정보처리기사'취득' 7전8기 성공비결 밝혀내.."};
	String news5[] = {"KOSMO늬우스","김리아 DVD대여점 시스템설계에 차질이 생겨 오픈 늦어져.."};
	String datas = "";
	switch(x){
	case 1:
		datas = newsList(news1);
		x++;
		break;
	case 2:
		datas = newsList(news2);
		x++;
		break;
	case 3:
		datas = newsList(news3);
		x++;
		break;
	case 4:
		datas = newsList(news4);
		x++;
		break;
	case 5:
		datas = newsList(news5);//메소드 호출시 파라미터로 뉘우스 정보 넘김.
		x=1;//기사 내보낸 후 다음 기사 정보를 가져오기 위해서 1씩 증가시킴
		break;//case문을 탈출함. 다음 조건으로 넘어가면 안되니까
	}//end of switch
	//이전요청에서 가지고 있던 정보 지우기
	//아래코드를 생략하면 이전 정보를 계속 유지하므로 새로운 기사 처리 안됨.
	out.clear();
	//새로 읽어들인 정보 출력하기
	out.print(datas);
%>