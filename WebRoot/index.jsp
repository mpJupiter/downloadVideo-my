<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>欢迎光临视频下载网站</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="shortcut icon" href="<%=basePath%>images/logo.png">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/font-awesome.css">
	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/base.css">


  </head>
  
  <body>
  <header>
   <div class="logo">影视资源下载</div>
      <div class="account">
          <c:choose>
            <c:when test="${customer.customerName==null}">
               <a href="login.jsp">登录</a>
               <a href="reg.jsp">用户注册</a>
            </c:when>
            <c:otherwise>
               <c:out value="${customer.customerName}"></c:out>，欢迎您！
            </c:otherwise>
          </c:choose>
    </div>
  </header>
  
  
  <div class="header">
    <ul>
         <li class="active"><a href="index.jsp">首页</a></li>
         <li class=""><a href="index.jsp">电影</a></li>
         <li class=""><a href="index.jsp">电视剧</a></li>
         <li class=""><a href="index.jsp">节目</a></li>
   </ul>
<s:form action = "video/video_queryVideo" method = "post">
<div class="search_box">
        <div class="input-group input-group-sm btn-group">
        <input class="search" type="text" name="keyWords" placeholder="请输入关键词">
        <s:submit value="查询" cssClass="search"></s:submit>
        </div>
</div>

  

 
<main>
   <div>  
    <a href = addVideo.jsp>添加影片</a>
    <table class="table table-bordered">
      <tr> 
         <th>资源名</th> 
         <th>操作</th>
         <th>操作</th>
         <th>操作</th> 
         <th>操作</th>
     </tr>

      <c:forEach var="video" items="${videoList}" varStatus="status">
         <tr>   
            <td><a href="video/video_showDetail?video.videoId=${video.videoId}"><c:out value="${video.videoName}"></c:out></a></td>
            <td><a href="video/video_showDetail?video.videoId=${video.videoId}">详情</a></td>
            <td><a href="video/video_showEdit?video.videoId=${video.videoId}">编辑</a></td>
            <td><a href="video/video_deleteVideo?video.videoId=${video.videoId}">删除</a></td>
            <td><a href="${video.path}">链接</a></td>
            <!-- video/video_downloadVideo?video.path=${video.path} -->
        </tr>	             
      </c:forEach>
      
    </table>
        </div>
      </s:form>
     </main>
  </body>
</html>
