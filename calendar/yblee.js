function fn_firstDate(yyyy, mm){
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

function fn_LoadmonCal(yyyy, mm){
	var serializer = new XMLSerializer();
	var now = new Date();
	var firstDate = fn_firstDate(yyyy, mm);
	var lastDate = fn_lastDate(yyyy, mm);
	var sendData = { "ST_DT": firstDate, "ED_DT": lastDate, "NGT": "2", "BSDV_TYP_CD": "BS045001", "RM_TYP_CD": "JSD", "SLST_ID": "1101",};
	var innerContents ="";
	var OmonthCounter = 0;
	var NmonthCounter;
	var weekCounter;
	var dayCounter;
	var rscnt;
	var result;

	$.ajax({
		type:"post",
		datatype:"json",
		contentType:"application/json; UTF-8",
		url:"/hb/HBIR020003CalendarList.do",
		data:JSON.stringify(sendData),
		success : function(data) {
			rscnt = 0;
			$('#h1cal').empty();
			$.each(data, function( key, slist ) {
				var secDate= ''+slist.AVLB_DT;
				var year = secDate.substr(0,4);
				var month = secDate.substr(4,2);
				var day = secDate.substr(6,2);
				var date = new Date(year, month-1, day);
				var ddd = date.getDate();
				var wd = date.getDay();

				NmonthCounter = date.getMonth()+1;

				if(rscnt<1){

					innerContents = innerContents + "<div class=\"month\" id=\"month\">";
					innerContents = innerContents + "<button class=\"btn_prev\" type=\"button\" onclick=\"fn_LoadmonCal(" + parseInt(year) + "," + (parseInt(month)-1) + ")\";>이전</button>";
					innerContents = innerContents + "<span><span>"+year+"년  "+month+"월</span></span>";
					innerContents = innerContents + "<button class=\"btn_next\" type=\"button\" onclick=\"fn_LoadmonCal(" + parseInt(year) + "," + (parseInt(month)+1) + ")\";>다음</button>";
					innerContents = innerContents + "</div>";
					innerContents = innerContents + "<div class=\"week_wrap\">";
					innerContents = innerContents + "<span class=\"sun\">일</span><span>월</span><span>화</span><span>수</span><span>목</span><span>금</span><span class='sat'>토</span>";
					innerContents = innerContents + "</div>";
					innerContents = innerContents + "<div class='date_box' id='h1cal_dayInfo'>";

					for(var i =0;i<wd;i++){
						innerContents = innerContents + "<div></div>";
					}
				}
				
				//오늘날짜 이전은 예약 마감 혹은 안뜨도록
				innerContents = innerContents + "<div>";
				if(slist.AVLB_YN=="Y"){
				//innerContents = innerContents + "<a href='#none' onclick=\"fn_LoadTimeArea(" + secDate + ", 'cal')\"; title='"+year+"년 "+month+"월 "+day+"일("+slist.RCNT+" 팀 예약가능) '><span>"+ddd+"</span>";
				innerContents = innerContents + "<span>"+ddd+"</span>";
				innerContents = innerContents + "<a href='#none' class='btn_possible'>예약가능</a>";
				}else if(slist.AVLB_YN=="N"){
					innerContents = innerContents + "<span>"+ddd+"</span>";
					innerContents = innerContents + "<a href='#none' class='btn_standby'>대기예약</a>";
				}else{
					innerContents = innerContents + "<span>"+ddd+"</span>";
					innerContents = innerContents + "<a href='#none' class='btn_end'>예약마감</a>";
				}
				innerContents = innerContents + "</div>";
				OmonthCounter = NmonthCounter;
				rscnt = rscnt+1;
				weekCounter = wd;
			});

			for(var i =6;i>weekCounter;i--){
				innerContents = innerContents + "<div></div>";
			}
				innerContents = innerContents + "</div>";
				innerContents = innerContents + "<div class=\"legend_bottom\">";
				innerContents = innerContents + "<span><img alt=\"하늘색버튼\" src=\"<c:url value='/images/hotel_legend_blue.png' />\">예약가능</span>";
				innerContents = innerContents + "<span><img alt=\"녹색버튼\" src=\"<c:url value='/images/hotel_legend_green.png' />\">대기예약</span>";
				innerContents = innerContents + "<span class=\"line_gap\"><img alt=\"회색버튼\" src=\"<c:url value='/images/hotel_legend_gray.png' />\">예약마감</span>";
				innerContents = innerContents + "<span><img alt=\"노랑색\" src=\"<c:url value='/images/golf_legend02.png' />\">성수기</span>";
				innerContents = innerContents + "<span><img alt=\"하늘색\" src=\"<c:url value='/images/golf_legend03.png' />\">준성수기</span>";
				innerContents = innerContents + "<span><img alt=\"흰색\" src=\"<c:url value='/images/golf_legend04.png' />\">비수기</span";
				innerContents = innerContents + "</div>";
				$('#h1cal').append(innerContents);
		},
		error : function(req, status, error) {
			alert("ERROR!!!");
		}
	});
}