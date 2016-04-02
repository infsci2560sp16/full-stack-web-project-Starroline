function login(){
	
	var username=$("#username").val();
	var password=$("#password").val();
	$.get("/login",{"username":username,"password":password},function(data){
	alert("successfully logged in")
	//alert(typeof(data));
	window.location.href="/myIndex?username="+JSON.parse(data).username;

  }); 

}


function register(){
	var firstname = $("#firstname").val();
	var lastname = $("#lastname").val();
	var username = $("#username").val();
	var password = $("#password").val();
	var confirmPassword = $("#confirmpassword").val();
	var email = $("#email").val();
	$.post("/register",{"firstname":firstname,"lastname":lastname,"username":username,"password":password,"confirmPassword":confirmPassword,"email":email},function(data){
	alert("successfully accepted");
	window.location.href="/myIndex?username="+JSON.parse(data).username;
  }); 
}




