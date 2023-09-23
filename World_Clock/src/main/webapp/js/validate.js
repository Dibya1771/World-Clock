function validate(){
	var a = document.getElementById("mob").value;
	/*if(a==""){
		alert("Please fill mob");
		return false;
	}*/
	
	if(isNaN(a) || a.length != 10){
		swal("Sorry!", "Please enter a 10 digit valid mobile number", "error");
		return false;
	}
	
}