function fn_commas(num) { //숫자 세번째 자리에 ,콤마 체크하기
    return num.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
}
