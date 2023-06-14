# kotlin-racingcar

### 기능 요구 사항

- 각 자동차에 이름을 부여할 수 있다. 
- 자동차 이름은 5자를 초과할 수 없다.
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- 이름과 쉼표 사이에 공백문자는 무시되도록 한다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 
- 우승자는 한 명 이상일 수 있다.

### 기능 구현 목록
- [x] 자동차는 이름과 위치를 가진다.
- [x] 자동차의 처음 위치는 0이다.
- [x] 자동자의 이름은 5자를 초과할 수 없다.
- [x] 랜덤 숫자가 4 이상이면 자동차는 이동할 수 있다. 
- [x] 경주할 자동자의 이름을 입력받고 이름의 수만큼 자동차가 생성된다
- [x] 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- [x] 시도할 횟수를 입력받는다. 횟수는 양수만 입력하도록 한다.
- [x] 생성된 자동차를 시도할 횟수만큼 경기를 진행할 수 있다.
- [x] 실행 결과는 시도 횟수가 끝날 때마다 출력한다.
- [x] 경주 종료 후 position 이 가장 높은 자동차가 최종 우승이다.
- [x] position 이 같을 경우 모두 최종 우승자가 된다.

### 용어사전
- Car : 자동차
- RacingField : 경기장
- GameCount : 경기수, 사용자에게 입력받은 시도할 횟수
- racing : 경주, 모든 경기수를 실행
- winner : 최종 우승자, 경주 종료 후 position 값이 가장 높은 자동차