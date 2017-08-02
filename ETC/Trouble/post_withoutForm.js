//form없이 post방식으로 보내는 방법
function fn_withoutPost() {
	var url = "<c:url value='/hb/insertSample.do' />";
	var form = document.createElement('form');

	//jquery는 array처럼 javascript dom을 들고있어서 [0]을 붙여서 JS DOM만 들고나와야한다.
	form.appendChild($("#SAMPLE1")[0]);
	form.appendChild($("#SAMPLE2")[0]);
	form.appendChild($("#SAMPLE3")[0]);
		
	form.setAttribute('method', 'post');
	form.setAttribute('action', url);
	document.body.appendChild(form);
	form.submit();
}
