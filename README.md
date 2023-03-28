pre {
  display: block;
  font-family: monospace;
  white-space: pre;
  margin: 1em 0;
}
<h1>Ch.2 스프링 부트에서 테스트 코드를 작성해보자 <h1>
 <br>
  <ul>
    <li> test 코드의 중요성 증가
    <li> 단위 테스트를 필수 조건으로 달아둠
    <li> 테스트 코드 작성의 기본을 배울 예정
   </ul>
  <br>
  <h1>2.1 테스트 코드 소개 </h1>
  <br>
  <p>TDD (Test-Driven-Development)란 테스트가 주도하는 개발이다. 테스트 코드를 먼저 작성하는 것 부터 시작. 선 개발 후 테스트 형식이 아니라 선 테스트 후 개발 방식의 프로그래밍 방법론을 일컫는다.<br>
    반면 단위 테스트는 기능 단위의 테스트 코드를 작성하는 것이다. 단위 테스트 코드를 작성함으로써 얻는 이점으로는 다음과 같다. 
    <ol>
      <li> 개발단계 초기에 문제를 발견하게 도와준다.
      <li> 기능에 대한 불확실성을 감소시킬 수 있다.
      <li> 시스템에 대한 실제 문서를 제공한다.
  </ol>
  대중적인 테스트 프레임워크로는 xUnit이 있다.
  <ul>
   <li> <bold>Junit</bold> - Java
   <li> <bold>DBUnit</bold> - DB
   <li> <bold> CppUnit</bold> - C++
   <li> <bold>NUnit</bold> - .net
  </ul>
  이 강의에서는 JUnit 사용
  </p>
  <h1>2.2 Hello Controller 테스트 코드 작성하기</h1>
 <br>
 <p>
  프로젝트 -> src -> main -> java 디렉토리에 패키지를 추가하고, 패키지안에 "Application"의 이름을 가진 클래스를 생성 후 클래스 안에 예제 코드를 작성했습니다.
  <img width="1440" alt="Screen Shot 2023-03-28 at 2 22 41 PM" src="https://user-images.githubusercontent.com/87971454/228136168-01e3aba6-42ef-4fb8-963f-2e29679c498e.png">
  코드의 내용은 다음과 같습니다.
  <pre>
  <ul>
   <li> <strong><bold>@SpringBootApplication</bold></strong> : 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정되게 도와주는 키워드, 항상 프로젝트의 최상단에 위치.
   <li> <strong><bold>SpringApplcation.run()</bold></strong> : 내장 WAS(Web Application Server)를 실행하는 함수, 서버에 Tomcat를 설치할 필요가 없고, 스프링 부트로 만들어진 Jar파일을 실행하면 된다.
  </ul>
  </pre>
 다음으로는 테스트를 위한 Controller를 생성하겠습니다. 
 
 <img width="1440" alt="Screen Shot 2023-03-28 at 7 24 02 PM" src="https://user-images.githubusercontent.com/87971454/228207347-47760f02-93b2-4ccb-bcac-0b1b8dc5e355.png">
 </p>

