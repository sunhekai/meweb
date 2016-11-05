var pathName = window.location.pathname;
var hostinfo = window.location.host;
var contextPath = window.location.protocol + "//" + hostinfo + "/" + pathName.split("/", 2)[1];
(function($) {
	$.fn.extend({
		initForm : function(options) {
			var form = this;  
			var inputattr = form.find("input");
			$.each(inputattr,function(i,iteme){
				alert("第"+i+"个元素"+":"+JSON.stringify(iteme.val()));
			});
		}
	});
})(jQuery);
