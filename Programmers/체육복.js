// https://programmers.co.kr/learn/courses/30/lessons/42862

function solution(n, lost, reserve) {
  let answer = 0;
  // 1. 학생들의 체육복 갯수 현황 파악
  const students = new Array(n).fill(1);
  for (let el of lost) {
    students[el - 1]--;
  }
  for (let el of reserve) {
    students[el - 1]++;
  }
  // 2. 체육복 나눠주는 작업 = reduce 메서드 사용
  answer = students.reduce((acc, cur, idx) => {
    // 체육복을 나눠주는 과정(탐욕법 적용)
    if (cur === 0) {
      if (students[idx - 1] === 2) {
        students[idx]++;
        students[idx - 1]--;
      } else if (students[idx + 1] === 2) {
        students[idx]++;
        students[idx + 1]--;
      }
    }

    console.log(cur, students[idx])
    // 체육복을 나눠준 결과
    if (students[idx] >= 1) {
      return acc + 1;
    } else {
      return acc;
    }
  }, 0)
  return answer;
}