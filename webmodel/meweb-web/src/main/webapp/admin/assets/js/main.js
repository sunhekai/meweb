
$(document).ready(function(){

	$( "#headerhtml" ).load( "header.html #contentHead", function( response, status, xhr ) { 
		  $('#headerhtml').html(response);
		});
});

