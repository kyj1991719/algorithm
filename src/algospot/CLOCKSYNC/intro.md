#### 문제를 읽고 이해하기
https://algospot.com/judge/problem/read/CLOCKSYNC

input</br>
2
12 6 6 6 6 6 12 12 12 12 12 12 12 12 12 12 
12 9 3 12 6 6 9 3 12 9 12 9 12 12 6 6


output</br>
2
9
 
#### 재정의와 추상화<br>
-- 문제를 읽고 본인이 이해하기 쉬운 방식으로 해석<br>
스위치 10개와 연결된 16개의 시계들을 돌려 모두 12시로 맞추기 위한 최소한의 스위치 수

#### 계획 세우기<br>
한 스위치를 4번누르면 원점, 최대 한개의 스위치당 누를수 있는 횟수는 4번으로 제한<br>
모든 스위치를 눌러 되지 않은경우 큰값 입력<br>
전역변수로 현재 최대값을 두어서 해당값보다 큰경우 바로 종료<br>

#### 계획 검증하기
스위치와 연결된 시계들 먼저 입력<br>
첫번째 스위치부터 한번씩 누르면서 다음 스위치로 넘어감, 먼저 시간이 맞춰졌는지 확인<br>