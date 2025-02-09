## 🔍 다리 건너기 - 기능 목록

- [x] 게임 시작 문구 출력
  - [x] "다리 건너기 게임을 시작합니다."라는 게임 시작 문구 출력


- [x] 다리 길이 입력
  - [x] "다리의 길이를 입력해주세요."라는 입력 안내 문구 출력
  - [x] 자동으로 생성할 다리 길이를 입력 받는다.
  - [x] 3 이상 20 이하의 숫자를 입력할 수 있으며 올바른 값이 아니면 예외 처리한다.


- [x] 다리 생성
  - [x] 다리를 생성할 때 위 칸과 아래 칸 중 건널 수 있는 칸은 0과 1 중 무작위 값을 이용해서 정한다.
  - [x] 무작위 값이 0인 경우 아래 칸, 1인 경우 위 칸이 건널 수 있는 칸이 된다.


- [x] 이동할 칸 입력
  - [x] "이동할 칸을 선택해주세요. (위: U, 아래: D)"라는 입력 안내 문구 출력
  - [x] 라운드마다 플레이어가 이동할 칸을 입력 받는다.
  - [x] "U"(위 칸)와 "D"(아래 칸) 중 하나의 문자를 입력할 수 있으며 올바른 값이 아니면 예외 처리한다.


- [x] 다리 이동 결과 출력
  - [x] 이동할 수 있는 칸을 선택한 경우 O 표시
  - [x] 이동할 수 없는 칸을 선택한 경우 X 표시
  - [x] 선택하지 않은 칸은 공백 한 칸으로 표시
  - [x] 다리의 시작은 [, 다리의 끝은 ]으로 표시
  - [x] 다리 칸의 구분은 | (앞뒤 공백 포함) 문자열로 구분
  - [x] 현재까지 건넌 다리를 모두 출력


- [ ] 게임 종료 판단
  - [ ] 다리를 끝까지 건너면 게임이 종료된다.
  - [ ] 다리를 건너다 실패하면 게임을 재시작하거나 종료할 수 있다.
    - [ ] 재시작해도 처음에 만든 다리로 재사용한다.


- [x] 게임 재시작 여부 입력
  - [x] "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)"라는 입력 안내 문구 출력
  - [x] 게임 재시작/종료 여부를 입력 받는다.
  - [x] R(재시작)과 Q(종료) 중 하나의 문자를 입력할 수 있으며 올바른 값이 아니면 예외 처리한다.


- [x] 최종 게임 결과 출력
  - [x] "최종 게임 결과"라는 안내 문구 출력
  - [x] 현재까지 건넌 다리를 모두 출력
  - [x] 게임 성공 여부 출력
  - [x] 총 시도한 횟수 출력