#### 문제를 읽고 이해하기
https://www.acmicpc.net/problem/1713

input</br>
3
9
2 1 4 3 5 6 2 7 2


output</br>
2 6 7


#### 재정의와 추상화<br>
-- 문제를 읽고 본인이 이해하기 쉬운 방식으로 해석<br>
n개중에 추천수가 적거나, 같을경우 오래된 사진을 지울때 마지막에 남는 사진

#### 계획 세우기<br>
해당 사진이 있는경우 카운트 증가<br>
사진이 없는경우 n개 미만인 경우 추가<br>
n개 이상일 때 맨마지막 사진 지우고 추가<br>
정렬 기준은 추천수 내림차순이며, 추천수가 같을경우 들어온순 오름차순으로 정렬<br>
끝난후 학생번호 오름차순으로 정렬 후 학생번호 출력

#### 계획 검증하기
