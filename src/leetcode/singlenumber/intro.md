#### 문제를 읽고 이해하기
https://leetcode.com/problems/single-number/

input</br>
[2,2,1]
[4,1,2,1,2]

output</br>
1
4

#### 재정의와 추상화<br>
-- 문제를 읽고 본인이 이해하기 쉬운 방식으로 해석<br>
배열중 한개만 출현한 숫자 구하기

#### 계획 세우기<br>
1. 새로운 배열을 생성해서 등장한 숫자 카운트 한 후 갯수 세기
2. map에 넣은 후 한번 출현한 갯수 찾기
3. 정렬후 좌우 비교하면서 일치하지 않으면 값 반환
-> 3번으로 품

#### 계획 검증하기
갓들은 같은 숫자에 대해 xor을 두번하면 자기 자신이 되는것을 사용하여, xor을 누적하여 값 반환함
 