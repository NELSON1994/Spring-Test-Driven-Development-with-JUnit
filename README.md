# Spring-Test-Driven-Development-with-JUnit
Testing spring application on both service,controller and repository level,, including full test with @Test Suite

#######################################################
TDD-> Test driven development  /Test First Development."
-a process of modifying the code in order to pass a test designed previously.
- software development approach in which test cases are developed to specify and validate what the code will do. 
- starts with designing and developing tests for every small functionality of an application.
	1.Acceptance TDD->Behavioral Driven Development (BDD)
		- you write a single acceptance test.
		- fulfills the requirement of the specification or satisfies the behavior of the system. 
	2.Developer TDD(UNIT TEST)
		-unit test focuses on every small functionality of the system.
		- just in time (JIT) basis. JIT means taking only those requirements in consideration that are needed in the system

Advantages of TDD
1. Early bug notification->you build up, over time, a suite of automated tests that you and any other developer can rerun at will.
2.Better Designed, cleaner and more extensible code->results in better design decision and more maintainable code.
3.Confidence to Refactor-> results in faster, more extensible code with fewer bugs that can be updated with minimal risks.
4.Good for teamwork->other team members can easily pick up and work on the code
5.Good for Developers-> write cleaner, less complicated code.
6.Shorter development cycles
7.Code proven to meet requirements

Test Maturity Model? capability maturity model(CMM) specifies an increasing series of levels of a software development organization
Levels of CMM
1.Initial-> software process is characterized as inconsistent, and occasionally even chaotic
2.Managed->a basic and consistent project management processes to track cost, schedule, and functionality.
3.Defined->activities are documented, standardized, and integrated into a standard software process
4.Measured-> set a quantitative quality goal for both software process and software maintenance
5.Optimization->changes to the process are to improve the process performance

Test Strategy
1.Proactive->the test design process is initiated as early as possible in order to find and fix the defects before the build is created
2.Reactive-> testing is not started until after design and coding are completed.

steps=====
1. Test Plan-> which type of test do you need   ( Unit or Integration Test) ?
		-Integration Test-> Test interaction between units 
		-Unit Test-> Test a single unit
2.Test Objectives :
				a. Integration test objectives:
						1.testAdd(aContact)-Integration Test Code
						2.add(aContact)-Contact Management Service
						3.save(aContact)-Contact Management Data Access
						
						        // verify the addition  by JUNIT
									-assertNotNull(c); // check if the new contact is not null, i.e Smoke Test
									-assertNotNull(c.getContactId());
									-assertEquals("Nelson",c.getFirstName()); // just a simple comparison
		a.Test @Service
		     instruct JUnit to do the following:
				- no need to load @RestControllers or @Controllers components
				-only load @Service components and @Repository
				
		b. Test @Controller/@RestController
				1. what kind of controllers are involved :
						a. mvc controllers-> returns View Model objects
						b. Rest controllers-> returns json/xml objects
				2.Write Integration test and Unit Test for the controllers
						1. integration test
							-load @Controllers
							-load @Service
							-load @Repository
							
		c. tEST ONLY Repository
						-load only repositories
						@DataJpaTest
						@AutoConfigureTestDatabase(replace=Replace.NONE)
						
						@Autowire    - private TestEntityManager e
									- repository to test
									
									e.persist(whatTOSAVE);
									
	
	
	Smoke Test-> Test that indicates basic health of the system
	Iteration Suite-Test related to a project iterations
	Feature Suite-Test that combines testing of several features
	
	Test Suites--> Running several tests all at once incase there several classes you have written the tests
	
	-create a general class
	-annotate it with :
			@RunWith(Suite.class)
			@Suite.SuiteClasses({TestClass1.class,TestClass2.class,TestClass3.class})
	-leave the class blank then run it
	
						
						
						
						
						
						
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
