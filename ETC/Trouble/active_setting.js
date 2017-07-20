//달력 클릭시 active
//.calender_box내의 .date_box내의 div들중에서 click이벤트 발생시 active를 없애고 클릭한 엘레먼트를 active상태로 바꾼다.
$('.calender_box .date_box > div').on('click', function(){
	$('.calender_box .date_box > div').removeClass('active');
	$(this).addClass('active');
});