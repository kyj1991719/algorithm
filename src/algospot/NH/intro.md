#### 문제를 읽고 이해하기
https://algospot.com/judge/problem/read/NH

input</br>
3
2 2
rm
dd
4 4
a
b
c
d
100 4
aa
ba
ab
cd


output</br>
674 
4095
5293 


#### 재정의와 추상화<br>
-- 문제를 읽고 본인이 이해하기 쉬운 방식으로 해석<br>
n자리의 문자열을 만드는데 다음 단어의 패턴이 들어가지 않는 단어들의 갯수

#### 계획 세우기<br>
현재위치에서 다음 글자로 넘어갈때 이동할 노드를 정하면, 동적 계획법으로 들어가지 않는 문자열의 갯수를 셀 수 있음<br>
아호코라식으로 입력에 대한 트라이 생성 및 실패함수 연결<br>
다음 글자로 넘어갈 때의 노드는 현재 노드에서 다음 글자에 대한 실패연결을 검색하여 저장<br>
예) 패턴이 ab,cd인 경우<br>

```
              다음상태
a - ab - aba -> a
       - abc -> c

  - ac       -> c

c - ca       -> a

  - cd - cda -> a
       - cdc -> c
```
위의 예에서 ca의 다음노드를 a로 만듦으로써 ab를 검출할 수 있음<br>

#### 계획 검증하기

