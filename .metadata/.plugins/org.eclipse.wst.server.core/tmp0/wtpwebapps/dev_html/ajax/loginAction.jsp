<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.util.DBConnectionMgr, java.sql.*" %>
<%
	String mem_id = request.getParameter("mem_id");//사용자가 입력한 아이디
	String mem_pw = request.getParameter("mem_pw");//사용자가 입력한 비번
	//proc_login4 프로시저의 out속성에 결과를 담을 변수
	String msg = null;
//물리적으로 떨어져 있는 서버에 연결 통로 확보하기
	Connection con = DBConnectionMgr.getConnection();
//프로시저를 오라클 서버에 전달해줄 클래스 필요
	CallableStatement cstmt = con.prepareCall("{call proc_login4(?,?,?)}");
	cstmt.setString(1,mem_id);
	cstmt.setString(2,mem_pw);
	cstmt.registerOutParameter(3, java.sql.Types.VARCHAR);
	int result = cstmt.executeUpdate();
	//OUT속성의 경우- 리턴타입을 활용하지 않고 파라미터 타입안에 값이 담김.
	msg = cstmt.getString(3);
	out.clear();//버퍼캐시에 있는 값을 비운다.
	//out.flush();//버퍼에 쌓지 않고 즉시 보낼때
	out.print(msg);
%>