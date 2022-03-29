function solution(array, commands) {
  // 1. n번째 부터 m번째까지 자르기
  // 2. 정렬 (오름차순)
  // 3. k번째수 반환
  var answer = [];
  // 반복문 이용
  for (let i = 0; i < commands.length; i++) {
    let from = commands[i][0];
    let to = commands[i][1];
    let k = commands[i][2];
    // ! slice 메소드 index !== index + 1번 째
    let slicedArr = array.slice(from - 1, to);
    // ! sort 메소드 안에 CompareFunction 파라미터를 꼭 넣어야 합니다.
    slicedArr.sort((a, b) => a - b);
    // 3. k번째 수 반환
    answer.push(slicedArr[k - 1]);
  }
  return answer;
}

// 레퍼런스 블로그 https://brunch.co.kr/@swimjiy/12
// sort() | mdn https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Array/sort#%EC%84%A4%EB%AA%85