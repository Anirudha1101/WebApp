<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
 <head>
 <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
 <title>
     Todo page
 </title>
 </head>
 
 <body> 
  <div class="container">
                     <h1>Welcome ${name} todo page 
    </h1>
    <h1> your todos are:</h1>
  
    <div class="table">
      <table>   
         <thead>
              <tr>
                     <th>Id</th> 
                     <th> Description</th>
                     <th> Target Date</th>
                     <th> Is done ?</th>   
                     <th> </th> 
                     <th> </th> 
              </tr>
         </thead>
     </div>
     
         <tbody>
            <c:forEach items="${todos}" var="todo">
               <tr>
                   <td>${todo.id}</td>
                   <td>${todo.description}</td>
                   <td>${todo.targetDate}</td>
                   <td>${todo.done}</td>
                   <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete </a></td>
                   <td><a href="update-todo" class="btn btn-success">update</a></td>
               </tr>
            </c:forEach>   
         </tbody>
     </table>
    
     <a href="addtodo" class="btn btn-success"> Add Todo</a>
  </div>
   
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
   
 </body>
</html>