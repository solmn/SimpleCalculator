<%--
  Created by IntelliJ IDEA.
  User: solmn
  Date: 1/30/20
  Time: 2:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
      <link href="css/style.css" rel="stylesheet">
  </head>
  <body>
  <div class="container">
      <h2>Simple Calculator</h2>
     <form action="/simple-calculator/simple-calc" method="post" >
         <input  type="text" name="num1Add"/> + <input  type="text" name="num2Add"/><br />
         <input  type="text" name="num1Mul"/> * <input  type="text" name="num2Mul"/><br />
         <input  type="submit" value="Submit">
     </form>
  </div>

  <div class="container">
      <h2>Improved Calculator</h2>
      <form action="/simple-calculator/improved-calc" method="post" >
          <input  type="text" name="num1Add"/> + <input  type="text" name="num2Add"/> = <input  type="text" name="addResult"/><br />
          <input  type="text" name="num1Mul"/> * <input  type="text" name="num2Mul"/> = <input  type="text" name="mulResult"/><br />
          <input  type="submit" value="Submit">
      </form>
  </div>
  </body>
</html>
