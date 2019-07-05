/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.20
 * Generated at: 2019-06-25 04:20:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.easyui_005flayout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layout_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Add and Remove Layout - jQuery EasyUI Demo</title>\r\n");
      out.write("<!-- easyui.css는 jeasyui가 제공하는 콤포넌트(예:datafrid,layout 등)에\r\n");
      out.write("    디자인을 입힐 때 사용됨 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/themes/default/easyui.css\">\r\n");
      out.write("<!-- icon.css는 아이콘 이미지 처리하는데 사용됨. -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/themes/icon.css\">\r\n");
      out.write("<!-- jeasyui 데모페이지에 사용되는 css임 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/demo/demo.css\">\r\n");
      out.write("<!-- jeasyui가 jquery기반이므로 호환성을 검증한 스크립트 코드만 따로 모아둠. -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://www.jeasyui.com/easyui/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://www.jeasyui.com/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/*\r\n");
      out.write("입력화면에서 저장 버튼 클릭했을 때\r\n");
      out.write("사용자가 입력한 정보를 서버로(Tomcat) 전송해야함.\r\n");
      out.write("get 인터셉트를 한다. 브라우저->서버로 요청이 전송되지 않음.\r\n");
      out.write("\r\n");
      out.write("*/\r\n");
      out.write("var db_name=\"김유신\";\r\n");
      out.write("function add(){\r\n");
      out.write("    $(\"#f_add\").submit();//전송. 어디로 가는거지? 전송방식??\r\n");
      out.write("}\r\n");
      out.write("function cancel(){\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("//이름으로 검색하기\r\n");
      out.write("function nameSearch(){\r\n");
      out.write("    alert(\"nameSearch호출 성공\");\r\n");
      out.write("}\r\n");
      out.write("//입력 다이얼로그 창열기\r\n");
      out.write("function addForm(){\r\n");
      out.write("    $('#dlg_add').dialog('open');\r\n");
      out.write("}\r\n");
      out.write("//수정 다이얼로그 창열기\r\n");
      out.write("function updForm(){\r\n");
      out.write("    var row = $(\"#dg_member\").datagrid(\"getSelected\");\r\n");
      out.write("    //datagrid초기화시 소문자로 작성하였으므로 반드시 소문자로 접근해야함\r\n");
      out.write("    //만일 대문자로 작성하면 undefine\r\n");
      out.write("    var c_id = row.id;\r\n");
      out.write("    //톰캣 서버로 이 아이디와 같은 상세정보를 조회하면 화면에 출력해야함\r\n");
      out.write("    location.href=\"./memberUpdate.jsp?id=\"+c_id;\r\n");
      out.write("}\r\n");
      out.write("//로그인 요청시 구현\r\n");
      out.write("function LoginAction(){\r\n");
      out.write("    //front-end언어는 오라클 서버와 연동할 수 없다. -상수처리한다\r\n");
      out.write("    var db_id = \"test\";\r\n");
      out.write("    var db_pw = \"123\";\r\n");
      out.write("    var u_id = $(\"#tb_id\").val();\r\n");
      out.write("    var u_pw = $(\"#tb_pw\").val();\r\n");
      out.write("    if(db_id==u_id){//아이디가 존재하니\r\n");
      out.write("        if(db_pw==u_pw){//비번까지 같은거니\r\n");
      out.write("            //로그인폼 숨기가 대신 로그인 성공화면 show\r\n");
      out.write("            $(\"#d_login\").hide();\r\n");
      out.write("            $(\"#d_logout\").show();\r\n");
      out.write("            //span태그에 메세지를 추가 - 김유신님 환영합니다.\r\n");
      out.write("            $(\"#s_msg\").html(\"<b>\"+db_name+\"</b>님 환영합니다.\");\r\n");
      out.write("        }\r\n");
      out.write("        else{//비번이 틀린거 같아\r\n");
      out.write("            alert(\"비번이 틀렸습니다.\");\r\n");
      out.write("            $(\"#tb_pw\").textbox(\"setValue\",\"\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    else{//아이디가 존재하지 않아\r\n");
      out.write("        alert(\"아이디가 존재하지않습니다.\");\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("//로그아웃 요청시 구현\r\n");
      out.write("function LogoutAction(){\r\n");
      out.write("    $(\"#d_logout\").hide();\r\n");
      out.write("    $(\"#d_login\").show();\r\n");
      out.write("    $(\"#tb_id\").textbox(\"setValue\",\"\");\r\n");
      out.write("    $(\"#tb_pw\").textbox(\"setValue\",\"\");\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<style>\r\n");
      out.write("    #d_login{\r\n");
      out.write("        /* border: 1px solid red; */\r\n");
      out.write("        width: 190;\r\n");
      out.write("        height: 120px;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("//날짜 포맷 형식을 디폴트에서 사용자 정의로 변경하므로\r\n");
      out.write("//body태그 안에 해당 콤포넌트가 정의되기 전에 처리함\r\n");
      out.write("//datebox에 대한 날짜 포맷 재정의함\r\n");
      out.write("$.fn.datebox.defaults.formatter = function(date){\r\n");
      out.write("\tvar y = date.getFullYear();\r\n");
      out.write("\tvar m = date.getMonth()+1;\r\n");
      out.write("\tvar d = date.getDate();\r\n");
      out.write("\treturn y+'-'+(m<10 ? \"0\"+m:m)+'-'+(d<10?\"0\"+d:d);//10보다 작으면 01~09로 표현\r\n");
      out.write("}\r\n");
      out.write("$.fn.datebox.defaults.parser = function(s){\r\n");
      out.write("\tvar t = Date.parse(s);\r\n");
      out.write("\tif (!isNaN(t)){\r\n");
      out.write("\t\treturn new Date(t);\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\treturn new Date();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    /*회원관리에 필요한 데이터그리드 추가 - 설정*/\r\n");
      out.write("    $(\"#dg_member\").datagrid({\r\n");
      out.write("        columns:[[\r\n");
      out.write("            {field:'id',title:'아이디',width:100}/* 아이디 */\r\n");
      out.write("            ,{field:'name',title:'이름',width:120}/* 이름 */\r\n");
      out.write("            ,{field:'address',title:'주소',width:300}/* 주소 */\r\n");
      out.write("            ,{field:'hp',title:'핸드폰번호',width:140}/*핸드폰번호*/\r\n");
      out.write("        ]]\r\n");
      out.write("        ,url:'./jsonMember.json'\r\n");
      out.write("        ,singleSelect:'true'\r\n");
      out.write("        ,toolbar:'#tbar_member'\r\n");
      out.write("    });///////////////////////////////////////end of dg_member\r\n");
      out.write("    $(\"#dg_emp\").datagrid({\r\n");
      out.write("        url:'jsonEmp.json'\r\n");
      out.write("        ,columns:[[\r\n");
      out.write("            {field:'empno',title:'사원번호',width:100}/* 아이디 */\r\n");
      out.write("            ,{field:'ename',title:'사원명',width:120,editor:'text'}/* 이름 */\r\n");
      out.write("            ,{field:'hiredate',title:'입사일자',width:300}/* 주소 */\r\n");
      out.write("            ,{field:'deptno',title:'부서번호',width:140\r\n");
      out.write("                ,formatter:function(value,row){\r\n");
      out.write("                    return row.deptno||value;}\r\n");
      out.write("                ,edior:{\r\n");
      out.write("                    type:'combobox'\r\n");
      out.write("                    ,options:{\r\n");
      out.write("                        valueField:'deptno'\r\n");
      out.write("                        ,textField:'dname'\r\n");
      out.write("                        ,url:'/jsonDept.son'\r\n");
      out.write("                    }///////////////end of option\r\n");
      out.write("                }///////////////////end of editor\r\n");
      out.write("            }/*핸드폰번호*/\r\n");
      out.write("        ]]\r\n");
      out.write("        ,singleSelect:'true'\r\n");
      out.write("        ,toolbar:'#tbar_emp'\r\n");
      out.write("        ,url:'./jsonEmp.json'\r\n");
      out.write("    });///////////////////////////////////////end of dg_emp\r\n");
      out.write("    $(\"#d_emp\").hide();\r\n");
      out.write("    $(\"#d_member\").hide();\r\n");
      out.write("    $(\"#d_dvd\").hide();\r\n");
      out.write("    $(\"#d_rental\").hide();\r\n");
      out.write("    //로그인 성공했을 때 화면을 숨기자\r\n");
      out.write("    $(\"#d_logout\").hide();\r\n");
      out.write("//easyui에서 제공하는 tree객체에 onClick이벤트 처리하기 시작\r\n");
      out.write("    $('#te_menu').tree({//따로 함수 선언하지 않고 즉시 처리\r\n");
      out.write("\t    onClick: function(node){//트리 메누 선택했을때 이벤트 처리\r\n");
      out.write("\t\t// alert(node.text);  // alert node text property when clicked\r\n");
      out.write("        //node.text하면 선택한 노드문자열 가져옴\r\n");
      out.write("            if(\"회원관리\"==node.text){\r\n");
      out.write("            $(\"#d_emp\").hide();\r\n");
      out.write("            $(\"#d_member\").show();\r\n");
      out.write("            $(\"#d_dvd\").hide();\r\n");
      out.write("            $(\"#d_rental\").hide();\r\n");
      out.write("            }\r\n");
      out.write("            else if(\"사원관리\"==node.text){\r\n");
      out.write("            $(\"#d_emp\").show();\r\n");
      out.write("            $(\"#d_member\").hide();\r\n");
      out.write("            $(\"#d_dvd\").hide();\r\n");
      out.write("            $(\"#d_rental\").hide();\r\n");
      out.write("            }\r\n");
      out.write("            else if(\"DVD관리\"==node.text){\r\n");
      out.write("            $(\"#d_emp\").hide();\r\n");
      out.write("            $(\"#d_member\").hide();\r\n");
      out.write("            $(\"#d_dvd\").show();\r\n");
      out.write("            $(\"#d_rental\").hide();\r\n");
      out.write("            }\r\n");
      out.write("            else if(\"대여관리\"==node.text){\r\n");
      out.write("            $(\"#d_emp\").hide();\r\n");
      out.write("            $(\"#d_member\").hide();\r\n");
      out.write("            $(\"#d_dvd\").hide();\r\n");
      out.write("            $(\"#d_rental\").show();\r\n");
      out.write("            }\r\n");
      out.write("\t    }\r\n");
      out.write("    });///////////////////////////////////////end of tree\r\n");
      out.write("});///////////////////////////////////////////end of ready DOM\r\n");
      out.write("</script>\r\n");
      out.write("<div id=\"cc\" class=\"easyui-layout\" style=\"width:1000px;height:550px;\">      \r\n");
      out.write("    <div data-options=\"region:'west',split:true\" title=\"코딩놀이\" style=\"width:200px;\">\r\n");
      out.write("        <div style=\"margin:20px 0;\"></div>\r\n");
      out.write("<!-- ==============================로그인화면처리 시작============================== -->\r\n");
      out.write("        <div id=\"d_login\" align=\"center\">\r\n");
      out.write("            <input id=\"tb_id\" name=\"mem_id\">\r\n");
      out.write("            <div style=\"margin:5px 0;\"></div>\r\n");
      out.write("            <input id=\"tb_pw\" name=\"mem_pw\">\r\n");
      out.write("            <div style=\"margin:5px 0;\"></div>\r\n");
      out.write("            <a href=\"javascript:LoginAction()\" class=\"easyui-linkbutton\">로그인</a>\r\n");
      out.write("            <a href=\"javascript:memberAction()\" class=\"easyui-linkbutton\">회원가입</a>\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("            $('#tb_id').textbox({\r\n");
      out.write("            iconCls:'icon-man',\r\n");
      out.write("            iconAlign:'right',\r\n");
      out.write("            prompt: 'id'\r\n");
      out.write("            });\r\n");
      out.write("            $('#tb_pw').textbox({\r\n");
      out.write("            iconCls:'icon-lock',\r\n");
      out.write("            iconAlign:'right',\r\n");
      out.write("            prompt:'password'\r\n");
      out.write("            });\r\n");
      out.write("            </script>\r\n");
      out.write("        </div>\r\n");
      out.write("<!-- ==============================로그인화면처리 끝============================== -->\r\n");
      out.write("<!-- ==============================로그아웃화면처리 시작============================== -->\r\n");
      out.write("        <div id=\"d_logout\" align=\"center\">\r\n");
      out.write("            <span id=\"s_msg\"></span>\r\n");
      out.write("            <div style=\"margin:5px 0;\"></div>\r\n");
      out.write("            <a href=\"javascript:LogoutAction()\" class=\"easyui-linkbutton\">로그아웃</a>\r\n");
      out.write("            <a href=\"javascript:memberUpdate()\" class=\"easyui-linkbutton\">정보수정</a>\r\n");
      out.write("        </div>\r\n");
      out.write("<!-- ==============================로그아웃화면처리 끝============================== -->\r\n");
      out.write("<!-- ==============================메뉴 트리 시작============================== -->\r\n");
      out.write("        <ul id=\"te_menu\" class=\"easyui-tree\">\r\n");
      out.write("            <li data-options=\"state:'closed'\">\r\n");
      out.write("                <span>사원관리</span>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><span>사원 상세목록</span></li>\r\n");
      out.write("                    <li><span>사원 등록</span></li>\r\n");
      out.write("                    <li><span>사원 정보수정</span></li>\r\n");
      out.write("                    <li><span>사원 삭제</span></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li data-options=\"state:'closed'\">\r\n");
      out.write("                <span>회원관리</span>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><span>회원 상세목록</span></li>\r\n");
      out.write("                    <li><span>회원 등록</span></li>\r\n");
      out.write("                    <li><span>회원 정보수정</span></li>\r\n");
      out.write("                    <li><span>회원 삭제</span></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li data-options=\"state:'closed'\">\r\n");
      out.write("                <span>DVD관리</span>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><span>DVD 목록</span></li>\r\n");
      out.write("                    <li><span>DVD 등록</span></li>\r\n");
      out.write("                    <li><span>DVD 수정</span></li>\r\n");
      out.write("                    <li><span>DVD 삭제</span></li>\r\n");
      out.write("                </ul >\r\n");
      out.write("            </li>\r\n");
      out.write("            <li data-options=\"state:'closed'\">\r\n");
      out.write("                <span>대여관리</span>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><span>대여목록</span></li>\r\n");
      out.write("                    <li><span>대여등록</span></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- ==============================DVD관리시스템============================== -->\r\n");
      out.write("    <div data-options=\"region:'center',title:'DVD관리시스템'\">\r\n");
      out.write("<!-- 사원관리 -->\r\n");
      out.write("<!--=========================================================\r\n");
      out.write("    사원 관리 페이지 구현\r\n");
      out.write("=========================================================-->\r\n");
      out.write("        <div id=\"d_emp\">\r\n");
      out.write("        Home - 사원관리<br>\r\n");
      out.write("        <div style=\"margin:10px 0;\"></div>\r\n");
      out.write("<!-- ==============================회원관리화면 시작============================== -->\r\n");
      out.write("        <table title=\"사원목록\" id=\"dg_emp\" width=\"700px\" height=\"450px\" class=\"easyui-datagrid\"></table>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"/easyui/datagrid-cellediting.js\"></script>\r\n");
      out.write("<!-- ==============================조건검색화면 시작============================== -->\r\n");
      out.write("        <div id=\"d_emp_search\">\r\n");
      out.write("            이름 : textbox\r\n");
      out.write("            h.p : textbox\r\n");
      out.write("        </div>\r\n");
      out.write("<!-- ==============================조건검색화면 끝============================== -->\r\n");
      out.write("<!-- ==============================회원관리화면에 필요한 툴바 시작============================== -->\r\n");
      out.write("        <div id=\"tbar_emp\">\r\n");
      out.write("            <table align=\"left\" border=\"1\" width=\"690\">\r\n");
      out.write("            <!-- 조건 검색 추가 -->\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <label>이름: </label>\r\n");
      out.write("                        <input class=\"easyui-searchbox\" data-options=\"prompt:'이름을 입력하세요', searcher:nameSearch\" style=\"width:140;\">\r\n");
      out.write("                        <label>H.P</label>\r\n");
      out.write("                        <input class=\"easyui-maskedbox\" mask=\"999-9999-9999\" style=\"width:140px;\">\r\n");
      out.write("                        <label>생년월일 : </label>\r\n");
      out.write("                        <input class=\"easyui-datebox\" style=\"width:140px;\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <!-- 툴바 버튼 추가 -->\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td style=\"padding:2px 5px;\" align=\"left\">\r\n");
      out.write("                        <a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" plain=\"true\">조회</a>\r\n");
      out.write("                        <a href=\"javascript:addForm()\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\">입력</a>\r\n");
      out.write("                        <a href=\"javascript:updForm()\" class=\"easyui-linkbutton\" iconCls=\"icon-edit\" plain=\"true\">수정</a>\r\n");
      out.write("                        <a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\" plain=\"true\">삭제</a>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("<!-- ==============================회원관리화면에 필요한 툴바 끝============================== -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 회원관리 -->\r\n");
      out.write("<!--=========================================================\r\n");
      out.write("    회원 관리 페이지 구현\r\n");
      out.write("    =========================================================-->\r\n");
      out.write("        <div id=\"d_member\">\r\n");
      out.write("            Home - 회원관리<br>\r\n");
      out.write("            <div style=\"margin:10px 0;\"></div>\r\n");
      out.write("<!-- ==============================회원관리화면 시작============================== -->\r\n");
      out.write("            <table title=\"회원목록\" id=\"dg_member\" width=\"700px\" height=\"450px\" class=\"easyui-datagrid\"></table>\r\n");
      out.write("<!-- ==============================조건검색화면 시작============================== -->\r\n");
      out.write("            <div id=\"d_member_search\">\r\n");
      out.write("                이름 : textbox\r\n");
      out.write("                h.p : textbox\r\n");
      out.write("            </div>\r\n");
      out.write("<!-- ==============================조건검색화면 끝============================== -->\r\n");
      out.write("<!-- ==============================회원관리화면에 필요한 툴바 시작============================== -->\r\n");
      out.write("            <div id=\"tbar_member\">\r\n");
      out.write("                <table align=\"left\" border=\"1\" width=\"690\">\r\n");
      out.write("                <!-- 조건 검색 추가 -->\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <label>이름: </label>\r\n");
      out.write("                            <input class=\"easyui-searchbox\" data-options=\"prompt:'이름을 입력하세요', searcher:nameSearch\" style=\"width:140;\">\r\n");
      out.write("                            <label>H.P</label>\r\n");
      out.write("                            <input class=\"easyui-maskedbox\" mask=\"999-9999-9999\" style=\"width:140px;\">\r\n");
      out.write("                            <label>생년월일 : </label>\r\n");
      out.write("                            <input class=\"easyui-datebox\" style=\"width:140px;\">\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <!-- 툴바 버튼 추가 -->\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td style=\"padding:2px 5px;\" align=\"left\">\r\n");
      out.write("                            <a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" plain=\"true\">조회</a>\r\n");
      out.write("                            <a href=\"javascript:addForm()\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\">입력</a>\r\n");
      out.write("                            <a href=\"javascript:updForm()\" class=\"easyui-linkbutton\" iconCls=\"icon-edit\" plain=\"true\">수정</a>\r\n");
      out.write("                            <a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\" plain=\"true\">삭제</a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("<!-- ==============================회원관리화면에 필요한 툴바 끝============================== -->\r\n");
      out.write("<!-- ==============================회원정보 등록 화면 시작============================== -->\r\n");
      out.write("            <div id=\"dlg_add\" data-options=\"footer:'#tbar_add',closed:true,cache:false\" class=\"easyui-dialog\" title=\"회원등록\" style=\"width:300;height:450;padding:10px\">\r\n");
      out.write("                <form id=\"f_add\" method=\"get\" action=\"memberAdd.jsp\">\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>ID</td>\r\n");
      out.write("                            <td><input class=\"easyui-textbox\" style=\"width:100%;\" data-options=\"prompt:'필수입력사항'\" ></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>NAME</td>\r\n");
      out.write("                            <td><input class=\"easyui-textbox\" style=\"width:100%;\" data-options=\"prompt:'필수입력사항'\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>ADDRESS</td>\r\n");
      out.write("                            <td><input class=\"easyui-textbox\" style=\"width:100%;\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>HP</td>\r\n");
      out.write("                            <td><input class=\"easyui-textbox\" style=\"width:100%;\" data-options=\"prompt:'필수입력사항'\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>GENDER</td>\r\n");
      out.write("                            <td>남자</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>BIRHDAY</td>\r\n");
      out.write("                            <td><input class=\"easyui-textbox\" style=\"width:100%;\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>COMMENTS</td>\r\n");
      out.write("                            <td><input class=\"easyui-textbox\" style=\"width:100%;\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"tbar_add\">\r\n");
      out.write("                <a href=\"javascript:add()\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" plain=\"true\">저장</a>\r\n");
      out.write("                <a href=\"javascript:cancel()\" class=\"easyui-linkbutton\" iconCls=\"icon-undo\" plain=\"true\">취소</a>\r\n");
      out.write("            </div>\r\n");
      out.write("<!-- ==============================회원정보 등록 화면 끝============================== -->\r\n");
      out.write("<!-- ==============================회원정보 수정 화면 시작============================== -->\r\n");
      out.write("<!-- ==============================회원정보 수정 화면 끝============================== -->\r\n");
      out.write("<!-- ==============================회원정보 삭제 화면 시작============================== -->\r\n");
      out.write("<!-- ==============================회원정보 삭제 화면 끝============================== -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- DVD관리 -->\r\n");
      out.write("        <div id=\"d_dvd\">\r\n");
      out.write("            DVD\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 대여관리 -->\r\n");
      out.write("        <div id=\"d_rental\">\r\n");
      out.write("            대여\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}