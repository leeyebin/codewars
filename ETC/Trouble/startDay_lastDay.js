//기준년월일이 들어왔을 경우 몇일 이후를 구하는 방법
function fn_roomSummary(yyyymmdd, i){
	var startday = yyyymmdd;
	var lastdate = new Date(startday.substr(0,4), startday.substr(4,2), startday.substr(6,2));
	var tempDd = lastdate.getDate();
	var lastDd = lastdate.setDate(tempDd + i);//몇일 후인지
	var lastMm = lastdate.getMonth();
	var lastDd = lastdate.getDate();
	var lastday = lastdate.getFullYear() + '' + (lastMm < 10 ? '0'+ lastMm : lastMm) + '' + (lastDd < 10 ? '0'+ lastDd : lastDd);

	return lastday;
}

//오늘 날짜 구하는 방법
var today = new Date();
var yyyymmdd = today.getFullYear() + '' + ((today.getMonth()+1) < 10 ? '0'+ (today.getMonth()+1) : (today.getMonth()+1)) + '' + (today.getDate() < 10 ? '0'+ today.getDate() : today.getDate());

//yyy-mm-dd 포맷 '-'제거하기
//replace를 사용하되 일반 문자를 사용하면 첫번째 '-'만 제거 되기때문에 정규표현식을 사용하자
var str_text = "2017-08-08";
str_text.replace( "-", ""); //첫번째만 제거됨 201708-08
str_text.replace( /-/gi, ""); //20170808
