//최초 진입시 default값 세팅
$(document).ready(function(){
	if($('input:radio[name=HCRadio00]:checked').val()==undefined){//라디오버튼은 체크하지 않은 상태기 때문에 check된 value는 undefined
		$('input:radio[name="HCRadio00"]').eq(0).attr('checked', true); //첫번째를 check한다.
		fn_selectHotelCondoList($('input:radio[name=HCRadio00]:checked').val()); //ajax에 태워서 처리
		$('.tabstyle02 a').eq(0).trigger('click'); //이후 나오는 첫번째 탭 클릭 처리
	}
});
