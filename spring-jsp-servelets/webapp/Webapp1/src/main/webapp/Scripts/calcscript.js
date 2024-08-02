/**
 * 

function add(){
    var num1 = parseFloat(document.getElementById("num1").value);
    var num2 = parseFloat(document.getElementById("num2").value);
    document.getElementById("result").innerHTML=" Result is :"+(num1+num2);
    alert(num1 + num2);
}
function sub(){
    var num1 = parseFloat(document.getElementById("num1").value);
    var num2 = parseFloat(document.getElementById("num2").value);
    document.getElementById("result").innerHTML=" Result is :"+(num1-num2);
    alert(num1 - num2);
}
 */

 
 function calculate(option){
	var num1 = parseFloat(document.getElementById("num1").value);
    var num2 = parseFloat(document.getElementById("num2").value);
    if(isNaN(num1) ||isNaN(num2)){
		alert("Please enter proper values");
		return
	}
	switch(option){
		case 'A':result=num1+num2;
				break;
			    
    	case 'S':
			   result=num1-num2;
				break;
    	case 'M':
			    result=num1*num2;
				break;
    	case 'D':
			    result=num1/num2;
				break;
	}
	document.getElementById("result").innerHTML=" Result is :"+result;
    			alert(result);
    		
	

 }
 
 function clearvalue(){
  document.getElementById("num1").value="";
   document.getElementById("num2").value="";
    document.getElementById("result").innerHTML="";
   
}