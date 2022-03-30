// https://programmers.co.kr/learn/courses/30/lessons/42840

function solution(answers) {
  const answer = [];

  // 1번, 2번, 3번 수포자가 찍는 패턴을 배열 안에 나열
  let one = [1, 2, 3, 4, 5];
  let two = [2, 1, 2, 3, 2, 4, 2, 5];
  let three = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

  // 각 수포자들이 맞춘 문제의 수를 배열 안에 나열, 0으로 초기화
  const cnt = [0, 0, 0];

  // 문제 수만큼 반복하여, 수포자들이 맞춘 문제 개수를 계산
  for (let i = 0; i < answers.length; i++) {

    if (answers[i] === (one[i % one.length])) {
      cnt[0]++;
    }

    if (answers[i] === (two[i % two.length])) {
      cnt[1]++;
    }
    if (answers[i] === (three[i % three.length])) {
      cnt[2]++;
    }
  }

  // 변수 max 선언 후, Math.max() 메소드를 사용하여 가장 많이 맞춘 개수 할당
  let max = Math.max(cnt[0], cnt[1], cnt[2]);

  // cnt[i]에 저장된 맞춘 문제의 개수가 max와 같을 때, push 메소드를 사용하여 answer 배열에 추가
  for (let i = 0; i < cnt.length; i++) {
    if (max === cnt[i]) {
      // i번째 인덱스는 i + 1번 수포자임을 고려한다.
      answer.push(i + 1);
    }
  }
  // 문제를 가장 많이 맞춘 수포자를 담은 배열 answer를 반환
  return answer;
}