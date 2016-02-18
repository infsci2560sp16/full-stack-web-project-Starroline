$(function(){
	
	var gNum=0;
	var dX=0;
	var WW=$(".slider").width();
	
	var AA=Math.floor($(".slider ul").width()/WW);
	
	$(".status li").eq(gNum).addClass("now");
	
	$(".next").click(function(){
		if(gNum<AA){
			gNum++;
			dX = gNum*WW*-1;
		}else{
			gNum=0;
			dX = 0;
		}
		SS();
	});
	
	$(".prev").click(function(){
		if(gNum>0){
			gNum--;
			dX = gNum*WW*-1;
		}
		SS();
	});
	
	function SS(){
		$(".slider ul").stop().animate({left:dX}, 700);
		$(".status li").removeClass().eq(gNum).addClass("now");
	}
	
	$(".status li").click(function(){
		gNum=$(this).index();
		dX = gNum*WW*-1;
		SS();
	});
	

});




