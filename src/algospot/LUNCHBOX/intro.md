#### 문제를 읽고 이해하기
https://algospot.com/judge/problem/read/LUNCHBOX

input</br>
2
3
2 2 2
2 2 2
3
1 2 3
1 2 1


output</br>
8
7
 
#### 재정의와 추상화<br>
-- 문제를 읽고 본인이 이해하기 쉬운 방식으로 해석<br>
최소의 점심시간 출력

#### 계획 세우기<br>
도시락을 먹는시간이 오래걸리는 순으로 정렬, 먹기 시작하는 시간은 다 데워진 시간+먹는데 걸리는 시간

#### 계획 검증하기
1) 데우는 시간이 오래걸리는 순서대로 데우는 경우
MAX  x<br>
 A   B<br>
-> 총 시간은 MAX+x+먹는데 걸린 시간, 순서를 바꿔 데우는 경우 x+MAX+먹는시간 이므로 A와B에 의해 정해짐<br>

2) 먹는데 시간이 오래걸리는 순서대로 데우는 경우
 A   x<br>
MAX  B<br>
-> 총 시간은  A+MAX, 순서를 바꿔 데우는 경우 x+A+MAX이므로 시간이 더 늘어남<br>  
따라서 먹는시간이 길수록 먼저 데워야 함
