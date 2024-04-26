<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Detail Page</h1>
    <hr>

    <ul>
        <li>게시물 번호 : ${dto.bno}</li>
        <li>게시물 제목 : ${dto.title}</li>
        <li>게시물 내용 : ${dto.content}</li>
        <li>작성자 : ${dto.writer}</li>
        <li>작성일자 : ${dto.regdate}</li>
    </ul>

    <div><a href="delete?bno=${dto.bno}">글 삭제하기</a></div>
</body>
</html>