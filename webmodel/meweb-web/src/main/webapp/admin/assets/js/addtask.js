
$(document).ready(function(){
	
	$('#schstartdate').datetimepicker({
		dayOfWeekStart : 1,
		lang:'en',
		format:'Y-m-d H:i:s',
		disabledDates:['1986/01/08','1986/01/09','1986/01/10'],
		startDate:	'1986/01/05'
	});
	 $("#btn").click(function () { 
	        var formData = $("#mainForm").serializeArray();  
	        var d ={};  
	       $.each(formData, function() {  
	           d[this.name] = this.value;  
	        });  
	       console.log(JSON.stringify(d))  
	        $.ajax({  
	           type: "post",  
	            url: contextPath + "/admin/testtask",  
	            data: JSON.stringify(d),  
	           dataType: "json",  
	           headers: {'Content-type': 'application/json;charset=UTF-8'},
	           success: function (data) {  
	               if (data && data.success == "true") {  
	                    window.location.href = data.view;  
	                } else {  
	                   alert("error");  
	               }  
	            }  ,
	            error :function (data){
	            	alert(data);
	            }
	        });  
	    }) ; 
	
});

