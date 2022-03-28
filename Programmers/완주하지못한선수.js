// https://programmers.co.kr/learn/courses/30/lessons/42576

function solution(participant, completion) {
  let answer = '';
  // 알파벳 순으로 정렬하여 같은 index 끼리 비교를 할 수 있게 한다.
  participant.sort();
  completion.sort();
  // 모든 Index에서 비교를 하기 위해 for문을 사용한다.
  for(let i = 0; i < participant.length; i++) {
      if(participant[i] !== completion[i]) {
          answer = participant[i];
          return answer;        
      }
  }
}