<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
 <head>
 <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
 <title>
     Add Todo page
 </title>
 </head>
 
 <body> 
  <div class="container" align="center">              
    <h1>Enter todos :</h1>
      <form method="post" modelAttribute="todo">
        <b>Description: <input type="text" name="description"  required="required"/>
        <input type="submit" class="btn btn-success"/>
     </form>
   </div>
   
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
   
 </body>
</html>