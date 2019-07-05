<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.google.gson.Gson" %>
<%
    String log_id = request.getParameter("log_id");
    List<Map<String,Object>> logList = new ArrayList<>();
    Map<String,Object> logInfo = new HashMap<>();
    logInfo.put("log_id","test1");
    logInfo.put("log_pw","123");
    logInfo.put("log_name","씹초보");
    logList.add(logInfo);
    logInfo = new HashMap<>();
    logInfo.put("log_id","test2");
    logInfo.put("log_pw","123");
    logInfo.put("log_name","초보개발자");
    logList.add(logInfo);
    logInfo = new HashMap<>();
    logInfo.put("log_id","test3");
    logInfo.put("log_pw","123");
    logInfo.put("log_name","초보김리아");
    logList.add(logInfo);
    logInfo = new HashMap<>();
    logInfo.put("log_id","test4");
    logInfo.put("log_pw","123");
    logInfo.put("log_name","초보남자");
    logList.add(logInfo);

    List<Map<String,Object>> logDetail = new ArrayList<>();
    Map<String,Object> logDetailMap = null;
    for(int i=0;i<logList.size();i++){
        Map<String,Object> rmap = logList.get(i);
        if(log_id.equals(rmap.get("log_id").toString())){
            logDetailMap = rmap;
            logDetail.add(logDetailMap);
        }
    }
    Gson g = new Gson();
    String result = g.toJson(logDetail);
    out.print(result);
%>