#### 문제를 읽고 이해하기
https://programmers.co.kr/learn/courses/30/lessons/60058

input</br>
(()())()
)(
()))((()

output</br>
(()())()

()

()(())()


#### 재정의와 추상화<br>
-- 문제를 읽고 본인이 이해하기 쉬운 방식으로 해석<br>
다음과 같은 과정을 거쳐 올바른 괄호 문자열로 변경
1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다. 
2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다. 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다. 
3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다. 
  3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다. 
4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다. 
  4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다. 
  4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다. 
  4-3. ')'를 다시 붙입니다. 
  4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다. 
  4-5. 생성된 문자열을 반환합니다.

#### 계획 세우기<br>
괄호 갯수를 세면서 카운트가 0이되면 반복문 종료, 시작시 닫는 괄호로 시작하거나 닫는 괄호가 더 많은경우 올바른 괄호가 아님<br>
올바른 괄호일 경우 나머지 글자 재귀후 합쳐서 반환<br>
올바른 괄호가 아닐경우 위에 나와있는것과 같이 구현후 반환<br>

#### 계획 검증하기
