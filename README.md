# springboot2-webservice

우아한형제들 개발자 이동욱님의 스프링부트와 AWS로 혼자 구현하는 웹 서비스 책을 읽으며 공부하기

Chapter 1
1. IntelliJ Toolbox 설치 후 IntelliJ IDEA 커뮤니티 버전(무료) 설치
2. IntelliJ Toolbox에서 사양에 맞는 JVM RAM사용량 설정 해주기(16GB= 2048~4096)
3. 프로젝트를 그레들로 생성 후 bulid.gradle 셋팅
4. IntelliJ 와 Github 연결 해주기 command + Shift + A 를 눌러 Share Project on GitHub를 검색 후 깃허브 Login
5. GitHub에 프로젝트 생성 후 .idea를 제외한 파일들을 동기화
6. .ignore를 IntelliJ Plugin에서 다운 받은 후 .gitignore에 .gradle과 .idea를 작성하여 자동으로 github에 동기화 목록에 제외 (commit후 push)

Chapter2
1. TDD와 단위테스트차이 (단위테스트를 더 많이 사용)
2. JUnit을 이용한 HelloController의 hello메소드 테스트
3. lombok plugin설치 및 Preferences - Build,Execution, Deployment - Compiler - Annotation Processors에서 Enable annotation processing 체크
* gradle version이 4.10.2 이상인경우 dto test error MAC(./gradlew wrapper --gradle-version 4.10.2) Windows(gradlew wrapper --gradle-version 4.10.2)를 사용하여 다운그레이드
(관련 이슈 : https://github.com/jojoldu/freelec-springboot2-webservice/issues/2)
