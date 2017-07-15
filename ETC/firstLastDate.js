//년,월을 함수에 넣으면 해당 년월의 처음날짜와 마지막 날짜를 구한다.
function fn_firstDate(yyyy, mm){ 첫번째 날이기 때문에 그냥 1로 해도 될듯.
	var firstDate = new Date(yyyy, mm-1, 1);
	var firstMm = firstDate.getMonth()+1;
	var firstDd = firstDate.getDate();
	return firstDate.getFullYear() + '' + (firstMm < 10 ? '0'+ firstMm : firstMm) + '' + (firstDd < 10 ? '0'+ firstDd : firstDd);
}
function fn_lastDate(yyyy, mm){
	var lastDate = new Date(yyyy, mm, 0);
	var lastMm = lastDate.getMonth()+1;
	var lastDd = lastDate.getDate();
	return lastDate.getFullYear() + '' + (lastMm < 10 ? '0'+ lastMm : lastMm) + '' + (lastDd < 10 ? '0'+ lastDd : lastDd);
}