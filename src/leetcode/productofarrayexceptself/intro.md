#### 문제를 읽고 이해하기
https://leetcode.com/problems/product-of-array-except-self/

input</br>
[1,2,3,4]


output</br>
[24,12,8,6]


#### 재정의와 추상화<br>
-- 문제를 읽고 본인이 이해하기 쉬운 방식으로 해석<br>
해당수를 제외한 나머지수들의 곱

#### 계획 세우기<br>
1. 뒤에서부터 곱한 수, 앞에서 부터 곱한 수의 배열을 구해 해당수를 제외한 나머지 수들의 곱을 구함
2. 1에서 앞에서부터 곱한 수를 구하고, 뒤에서 부터 곱한 수는 for문 하나 더 수행하면서 곱해나감. 이때 해당수를 앞에서부터 곱한 수와 곱하면 답임

#### 계획 검증하기