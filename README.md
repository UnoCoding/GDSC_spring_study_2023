
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
  
  <ul>
   <li> <strong><bold>@SpringBootApplication</bold></strong> : 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정되게 도와주는 키워드, 항상 프로젝트의 최상단에 위치.
   <li> <strong><bold>SpringApplcation.run()</bold></strong> : 내장 WAS(Web Application Server)를 실행하는 함수, 서버에 Tomcat를 설치할 필요가 없고, 스프링 부트로 만들어진 Jar파일을 실행하면 된다.
  </ul>
  
 다음으로는 간단한 API 생성하겠습니다. 
 
 <img width="1440" alt="Screen Shot 2023-03-28 at 7 24 02 PM" src="https://user-images.githubusercontent.com/87971454/228207347-47760f02-93b2-4ccb-bcac-0b1b8dc5e355.png">
  코드의 내용은 다음과 같습니다.
  <ul>
    <li><strong><bold>@RestController</bold></strong> : 컨트롤러를 JSON을 변환하는 컨트롤러로 만들어준다. 
   <li> <strong><bold>@GetMapping</bold></strong> : HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어준다.
  </ul>
  그 후 작성한 코드가 제대로 작동하는지 테스트를 하겠습니다.
  현재 파일위에서 오른쪽 클릭 -> generate -> Test를 클릭합니다. (이 부분은 책과 다르게 진행했습니다.)그 후 Rename을 통해 "HelloControllerTest"로 파일명을 변경했습니다. 
  <img width="1440" alt="Screen Shot 2023-03-28 at 8 10 03 PM" src="https://user-images.githubusercontent.com/87971454/228229541-47724289-b652-4c4b-9ec8-d91c926865eb.png">
  코드의 내용은 다음과 같습니다.
  <ul>
    <li><strong><bold>@RunWith(SpringRunner.class)</bold></strong> : 테스트를 진행할 때 JUnit에 내장된 실행자 외에 다른 실행자를 실행시켜야합니다. 여기서는 SpringRunner라는 스프링 실행자를 사용합니다. 즉,스프링 부트 테스트와 JUnit 사이에 연결자 역할을 합니다.
   <li> <strong><bold>@WebMvcTest</bold></strong> : 여러 스프링 테스트 어노테이션중, Web에 집중할 수 있는 어노테이션입니다.
   <li> <strong><bold>@Autowired</bold></strong>  스프링이 관리하는 빈을 주입 받습니다. (빈 = 자바가 관리하는 클래스)
    <li> <strong><bold>private MockMvc mvc</bold></strong> <ul><li>웹 API를 테스트할 때 사용한다.</li><li>테스트의 시작점이다.</li><li>이 클래스를 통해 HTTP GET, POST등에 대한 API 테스트를 할 수 있다. </li></ul>
       <li> <strong><bold>.andExpect()</bold></strong> mvc.perform의 결과를 검증한다. 
  </ul>
  테스트 코드를 실행하기 위해 return_hello 메소드 라인 왼쪽에 초록색 실행 버튼을 누르고 가장 위에 있는 Run을 클릭한다. 
  <img width="1440" alt="Screen Shot 2023-03-28 at 9 11 36 PM" src="https://user-images.githubusercontent.com/87971454/228232218-a1a3fe10-522b-4235-826c-acd37f9cc5db.png">
  테스트를 통과했음을 알 수 있다.
  <img width="1440" alt="Screen Shot 2023-03-28 at 9 11 50 PM" src="https://user-images.githubusercontent.com/87971454/228232817-f7592a91-d8a9-4fc1-8864-b80467ed7b4e.png">
 </p>
  <h1>롬복 소개 및 설치하기</h1>
  <p> 롬복(Lombok)이란 자바 개발자들의 필수 라이브러리이자, Getter, Setter, 기본생성자,toString 등을 어노테이션으로 자동 생성해줍니다. "build.gradle" 파일에서 다음의 코드를 추가합니다.
  <pre>dependenccies{
  complie('org.projectlombok:lombok')
  }</pre>
 + Gradle 5.x 버전 이하에서는 책과 동일, <br> Gradle 5.x 버전 이상에서는 다음과 같이 설정해야한다.<pre>dependencies {
    compileOnly 'org.projectlombok:lombok'
    annotationProcessor 'org.projectlombok:lombok'
    }</pre>
  그 후 "HelloResponseDto" 파일을 생성.
    <img width="1440" alt="Screen Shot 2023-03-29 at 4 54 00 PM" src="https://user-images.githubusercontent.com/87971454/228465015-6a7265e0-c6a3-4998-8098-58ee568d395d.png">
 코드의 내용은 다음과 같다.
<ul>
   <li> <bold>@Getter</bold> - 선언된 모든 필드의 변수들에 대한 get메소드를 생성해준다.
   <li> <bold>@RequiredArgsController</bold> - final로 선언된 모든 필드가 포함된 생성자를 생성해준다.
  </ul>
  <img width="1440" alt="Screen Shot 2023-03-29 at 4 53 28 PM" src="https://user-images.githubusercontent.com/87971454/228465835-ba824ae3-f95e-4d40-aecb-3c289bed4890.png"> 그 후 테스트 진행.


    

