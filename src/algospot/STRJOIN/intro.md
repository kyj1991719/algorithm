#### 문제를 읽고 이해하기
https://algospot.com/judge/problem/read/STRJOIN

input</br>
3
3
2 2 4
5
3 1 3 4 1
8
1 1 1 1 1 1 1 2


output</br>
12
26
27


#### 재정의와 추상화<br>
-- 문제를 읽고 본인이 이해하기 쉬운 방식으로 해석<br>
모든 문자열을 합칠 때 필요한 최소비용

#### 계획 세우기<br>
작은순서대로 정렬 후 제일작은 두개를 합침<br>

#### 계획 검증하기
a,b,c를 순서대로 합칠경우 총 비용은 a+b+a+b+c=2a+2b+c <br>
MAX ...(n개) x순으로 합치는경우 총비용은 Max*(n+1)보다 큼<br>
역순으로 합치는 경우 x*(n+1)+MAX로 총합이 더 적음