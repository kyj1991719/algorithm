#### 문제를 읽고 이해하기
https://www.acmicpc.net/problem/1963

input</br>
3
1033 8179
1373 8017
1033 1033

output</br>
6
7
0

#### 재정의와 추상화<br>
-- 문제를 읽고 본인이 이해하기 쉬운 방식으로 해석<br>
입력받은 숫자를 자릿수만 바꿔 소수로 바꿀때 바꾸는 최소횟수

#### 계획 세우기<br>
10000까지의 소수를 미리 계산하여 저장
bfs를 사용하여 각 자리수를 모두 바꿔 최소횟수 검색
바꾸지 못하는 경우 impossible 출력

#### 계획 검증하기
