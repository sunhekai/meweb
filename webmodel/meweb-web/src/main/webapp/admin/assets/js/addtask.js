
$(document).ready(function(){
	
//	$('#schstartdate').datetimepicker({
//		dayOfWeekStart : 1,
//		lang:'en',
//		format:'Y-m-d H:i:s',
//		disabledDates:['1986/01/08','1986/01/09','1986/01/10'],
//		startDate:	'1986/01/05'
//	});
//	$('#schenddate').datetimepicker({
//		dayOfWeekStart : 1,
//		lang:'en',
//		format:'Y-m-d H:i:s',
//		disabledDates:['1986/01/08','1986/01/09','1986/01/10'],
//		startDate:	'1986/01/05'
//	});
//	$('#startdate').datetimepicker({
//		dayOfWeekStart : 1,
//		lang:'en',
//		format:'Y-m-d H:i:s',
//		disabledDates:['1986/01/08','1986/01/09','1986/01/10'],
//		startDate:	'1986/01/05'
//	});
//	$('#enddate').datetimepicker({
//		dayOfWeekStart : 1,
//		lang:'en',
//		format:'Y-m-d H:i:s',
//		disabledDates:['1986/01/08','1986/01/09','1986/01/10'],
//		startDate:	'1986/01/05'
//	});
		$("#mainForm").initForm();
		
		$('#schstartdate').datetimepicker({
			timeFormat: "hh:mm",
			dateFormat:"yy-mm-dd"
		});
		$('#schenddate').datetimepicker({
			timeFormat: "hh:mm",
			dateFormat:"yy-mm-dd"
		});
		
	 $("#btn").click(function () { 

			
			
	        var formData = $("#mainForm").serializeArray();  
	        var d ={};  
//	       $.each(formData, function() {  
//	           d[this.name] = this.value;  
//	        });  
	        d[formData[0].name] = formData[0].value;
	        d[formData[1].name] = formData[1].value;
//	        d[formData[2].name] = new Date(formData[2].value);
//	        d[formData[3].name] = new Date(formData[3].value);
	        d[formData[2].name] = formData[2].value;
	        d[formData[3].name] = formData[3].value;
	        d[formData[4].name] = new Date(formData[4].value);
	        d[formData[5].name] = new Date(formData[5].value);
	       console.log(JSON.stringify(d))  
	        $.ajax({  
	           type: "post",  
	            url: contextPath + "/admin/testtask",  
	            data: JSON.stringify(d),  
	           dataType: "json" ,  
	           contentType : "application/json;charset=UTF-8",
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
	 $("#btnExport").click(function () { 
		 var url = contextPath + "/admin/testexport";
		 var form = $('<form method="post" action="' + url + '"></form>');
		 taskid = 123;
		 var parameter = $('<input type="text" name="taskid" value="'+taskid+'" />');
		 form.appendTo('body').submit().remove();
	 });
	
	 
	 $("#btn2").click(function () {
		 $("#prodcutDetailSrc").attr("src","addtask.html");
		 $("#dialog").dialog({
			 bgiframe: true,
		        resizable: true, //是否可以重置大小
		        height: 283, //高度
		        width: 626, //宽度
		        draggable: false, //是否可以拖动。
		        title: "公司产品编辑",
		        modal: true,
		        open: function (e) {  //打开的时候触发的事件
		          
		          
		          document.body.style.overflow = "hidden"; //隐藏滚动条

		        },
		        close: function () { //关闭Dialog时候触发的事件
		          document.body.style.overflow = "visible";  //显示滚动条
		          alert(1234);
		        }
		 });
	 });
	
});

