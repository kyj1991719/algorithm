#### 문제를 읽고 이해하기
https://codingcompetitions.withgoogle.com/codejam/round/000000000019fd27/000000000020bdf9?show=progress

input</br>
4
3
360 480
420 540
600 660
3
0 1440
1 3
2 4
5
99 150
1 100
100 301
2 5
150 250
2
0 720
720 1440


output</br>
Case #1: CJC
Case #2: IMPOSSIBLE
Case #3: JCCJJ
Case #4: CC
 
#### 재정의와 추상화<br>
-- 문제를 읽고 본인이 이해하기 쉬운 방식으로 해석<br>
시간이 겹치지 않는 한에서 액티비티를 수행하는 사람 순서 출력

#### 계획 세우기<br>
시작 순서대로 정렬, 각 사람마다 시간대별로 할 수 있는 활동 저장, 둘다 할수없는 활동이 있는 경우 실패 반환<br>
입력순서대로 시간을 정렬하여 해당 활동을 하는 사람의 이름을 붙여서 반환<br>

#### 계획 검증하기