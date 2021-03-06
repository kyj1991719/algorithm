#### 문제를 읽고 이해하기
https://codingcompetitions.withgoogle.com/codejam/round/000000000019fd27/0000000000209a9e?show=progress

input</br>



output</br>

 
#### 재정의와 추상화<br>
-- 문제를 읽고 본인이 이해하기 쉬운 방식으로 해석<br>
B개의 비트를 해당 비트의 값을 150번 질의할 수 있을떄 원래 숫자, 질의할 때 query%10=1이면 변환방식이 바뀜
- 변환방식
1. 비트 반전
2. 비트 역순
3. 비트 반전+역순
4. 아무것도 안함

#### 계획 세우기<br>


#### 계획 검증하기

테스트 세트 3
가능성이 천문학적으로 클 수 있으므로 위의 전략은 100 자 문자열에는 적용되지 않습니다. 다행히도 훨씬 간단한 방법이 있습니다.

우리가 문자열의 중심으로부터 등거리에 있고 같은 값을 갖는 두 개의 위치를 ​​찾을 수 있다면, 양자 변동이 (반전의 유무에 관계없이) 보완을 포함했을 때 이를 탐지하는 데 사용할 수 있습니다. 예를 들어, 문자열의 양 끝이 양자 변동 직전에 0이라고 가정하자. 변동 후 첫 번째를 확인할 수 있습니다. 1이면 보완이있었습니다. 그렇지 않다면 없었습니다. 이는 양자 변동이 반전을 포함했는지 여부에 관계없이 적용됩니다.

이제 한 번에 한 단계 씩 안쪽으로 이동하면서 이러한 방식으로 위치 쌍을 계속 확인한다고 가정합니다. 모든 양자 변동 후, 우리는 하나의 쿼리를 사용하여 보완을 점검해야하는데, 문자열에 대한 기존 지식이있을 경우이를 업데이트 할 수 있습니다. 모든 쌍이 첫 번째 쌍과 같은 "동일한 쌍"으로 판명되면 어쨌든 반전을 신경 쓸 필요가 없었습니다 (문자열은 회문형이므로).

그러나이 과정에서 "다른 쌍"을 찾으면 어떻게해야합니까? 그러한 쌍은 그들 자신의 방식으로 도움이됩니다! 양자 변동 후 "다른 쌍"의 첫 번째 위치를 쿼리하고 그 비트가 변경된 것을 발견하면 보완 또는 반전이 발생했음을 알 수 있습니다.

이러한 "다른 쌍"을 가지면 "동일한 쌍"과 함께 사용하여 10 개의 쿼리 중 2 개를 각 양자 변동에서 발생한 것을 정확히 학습하는 데 사용할 수 있습니다. 예를 들어, "동일한 쌍"의 첫 번째 위치는 동일하게 유지되었지만 "다른 쌍"의 첫 번째 위치는 그렇지 않은 경우 양자 변동이 반전을 포함하지만 보완은 포함하지 않았다는 것을 알고 있습니다.

위의 분석에서 우리는 "동일한 쌍"이 먼저 발생한다고 가정했습니다. 첫 번째 쌍이 다르면 "같은 쌍"이 나올 때까지 진행할 수 있습니다. 우리가 하나를 만나지 않으면, 연산은 특정 문자열과 동일하기 때문에 보완과 반전의 구별에 신경 쓰지 않습니다. 그러나 "동일한 쌍"이 발생하면 위와 같이 진행할 수 있습니다.

최악의 경우 몇 개의 쿼리가 필요합니까? 문제가 시작될 때 양자 변동에서 발생한 모든 것을 알 수없고 중요하지 않기 때문에 처음 10 개를 모두 사용하여 데이터를 수집 할 수 있습니다. 그런 다음 나머지 8 개의 수집 데이터를 사용하기 전에 10 개의 쿼리 중 최대 2 개를 사용하여 방향을 다시 조정해야 할 수도 있습니다. 따라서 전체 문자열을 찾으려면 10 개의 쿼리와 10 개의 쿼리 세트가 11 개 더 필요하며 매번 8 개의 위치를 ​​알 수 있습니다 (98 개의 위치를 ​​알 수 있음). 마지막 방향을 바꾸고 마지막 두 위치를 얻으려면 2 더하십시오. 총 124 개이며 허용 된 한계 인 150도 내에 있습니다.


---

동일한쌍이 처음값과 다름 -> 비트반전
다른쌍이 처음값과 다름 -> 비트 반전 일어나지 않음 -> 위치 반전
               -> 비트 반전 일어남 -> 둘다