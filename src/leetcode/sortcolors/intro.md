#### 문제를 읽고 이해하기
https://leetcode.com/problems/sort-colors/

input</br>
[2,0,2,1,1,0]


output</br>
[0,0,1,1,2,2]


#### 재정의와 추상화<br>
-- 문제를 읽고 본인이 이해하기 쉬운 방식으로 해석<br>
입력을 정렬함

#### 계획 세우기<br>
1. 전체를 순회하면서 해당아이템 다음에 큰값이 있는경우 바꿈
2. 0,1,2에 대한 인덱스를 생성하고 하나씩 움직이면서 이동함. 1을 만난경우 1에대한 인덱스만 증가시켜 0이 나올경우 0의 인덱스와 바꿈.

#### 계획 검증하기
n번을 돌면서 최소값을 구하고, 그 최소값과 최대차익을 계산함