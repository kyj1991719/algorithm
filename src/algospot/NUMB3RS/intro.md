#### 문제를 읽고 이해하기
https://algospot.com/judge/problem/read/NUMB3RS

input</br>
2
5 2 0
0 1 1 1 0
1 0 0 0 1
1 0 0 0 0
1 0 0 0 0
0 1 0 0 0
3
0 2 4
8 2 3
0 1 1 1 0 0 0 0
1 0 0 1 0 0 0 0
1 0 0 1 0 0 0 0
1 1 1 0 1 1 0 0
0 0 0 1 0 0 1 1
0 0 0 1 0 0 0 1
0 0 0 0 1 0 0 0
0 0 0 0 1 1 0 0
4
3 1 2 6


output</br>
0.83333333 0.00000000 0.16666667
0.43333333 0.06666667 0.06666667 0.06666667


#### 재정의와 추상화<br>
-- 문제를 읽고 본인이 이해하기 쉬운 방식으로 해석<br>
p번째에서 시작해서 d일 후에 q번째 마을에 있을 확률

#### 계획 세우기<br>
한 마을에서 다른마을로 갈 수 있는 경우의수 계산, 도달할 경우 1 반환, 도달하지 못한경우 0 반환<br>
n날 m에 도달하는 확률 저장

#### 계획 검증하기
