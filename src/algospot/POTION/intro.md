#### 문제를 읽고 이해하기
https://algospot.com/judge/problem/read/POTION

input</br>
3
4
4 6 2 4
6 4 2 4
4 
4 6 2 4
7 4 2 4
3
4 5 6 
1 2 3 


output</br>
0 5 1 2
1 8 2 4
3 3 3
 
#### 재정의와 추상화<br>
-- 문제를 읽고 본인이 이해하기 쉬운 방식으로 해석<br>
각 재료마다 더 넣어야 하는 양

#### 계획 세우기<br>
들어가야하는 재료의 최대공약수 계산, gcd(a,b)=a%b==0?b:gcd(b, a%b)<br>
현재들어간양/(들어가야하는양/최대공약수)의 최대값 계산, 비율당 재료가 들어가야하는 배수<br>
각 재료당 들어가야하는배수*들어가야하는양/최대공약수-들어간양 계산<br>

#### 계획 검증하기

