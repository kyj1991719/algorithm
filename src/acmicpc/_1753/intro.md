#### 문제를 읽고 이해하기
https://www.acmicpc.net/problem/1753

input</br>
5 6
1
5 1 1
1 2 2
1 3 3
2 3 4
2 4 5
3 4 6


output</br>
0
2
3
7
INF


#### 재정의와 추상화<br>
-- 문제를 읽고 본인이 이해하기 쉬운 방식으로 해석<br>
한 정점에서 다른정점들까지의 최단거리

#### 계획 세우기<br>
다익스트라 알고리즘 사용, 모든 간선은 최소값만 저장함
큐에서 꺼낸 가중치가 현재 저장된 가중치보다 작은경우 종료
현재 정점까지의 가중치+간선의 가중치가 현재위치의 가중치보다 작으면 큐에 넣음

#### 계획 검증하기
