//마우스 over,out
$('#htcdList ul li').mouseover(function() {
		$(this).addClass(active);
	}).mouseout(function() {
		$(this).removeClass(active);
	});