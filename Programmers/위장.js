// https://programmers.co.kr/learn/courses/30/lessons/42578

function solution(clothes) {
  var answer = 1;
  // let obj = clothes.reduce((acc, cur, idx) => {
  //     acc[cur[1]] = acc[cur[1]] ? acc[cur[1]] + 1 : 1;
  //     return acc;
  // }, {})
  let obj = {};
  for (let i = 0; i < clothes.length; i++) {
    if (obj[clothes[i][1]]) {
      obj[clothes[i][1]]++;
    } else {
      obj[clothes[i][1]] = 1;
    }
  }
  for (let key in obj) {
    answer *= obj[key] + 1
  }
  return answer - 1; // 하루에 최소 한 개의 의상은 입습니다.

}

// 객체(obj)를 생성 === 의상 종류별 갯수에 대한 객체
// 각 경우의 수 곱을 계산 반환
// 얼굴	[동그란 안경, 검정 선글라스] : 경우의 수: 2 + 1 개 
// 아무것도 착용하지 않은 경우도 세어줘야 하기 때문입니다.