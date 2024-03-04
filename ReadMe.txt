*****************************************************PROJECT DESCRIPTION*****************************************************************

Problem Statement : Featured News
1.Login into Be.cognizant
2.Verify the Username
3.Extract the News Data available in be.cognizant page
  
Detailed Description: CAS Project

1.Navigating to the be.cognizant URL
2.Capture the user information
3.Verify the user User Information
4.Print the number of news displayed in the page(Count)
5.Print the Title of the News
6.Verify and compare the Title with the Tooldip(Whether it is same or not)
7.Click on each and every news  and verify whether we are navigated to the intended page or not.
8.After clicking each and every extract the data
9.After Extracting the data Click on Be.Cognizant and verify whether you are navigating to the correct url 
10.repeat the steps for all the news
11.Verify whether Apps And Tools are present are not
12.Print all the data under the Apps and Tools in the be.cognizant page.
13.Quit

Key Automation Scope:

Capturing the screenshot
Printing all the values in console and excel sheet

*******************************************************FILES DESCRIPTION**************************************************************

1.src/test/java - There are Five packages present in this folder.
->   config.properties : In this File we have to give from user to use which browser chrome
The packages are:
com.PageObjects
com.StepDefinations
com.TestRunner
Factory
utilies
    
2.src/test/resources- In this folder, there is one Excel folder, Which will store the values which are printed in the console
		    -config.properties
		    -extent.properties

3.JRE System Library: In this File we have all dependencies of JAR.files.         

4.Maven Dependencies: In this File we have all the directory on the local machine, where all the project artifacts are stored. when a Maven build is executed,
Maven automatically downloads all the dependency jars into the local repository. Usually, this directory is named.

5.Report: In this folder the Report.html is present which is the report of the project

6.Features Folder-which contains all the Scenarios of our project

7.test-output-it contains the sparkreports and the screenshots.

8.src: In this, there are two folders
	-main:It is an empty folder
	-test:It is an empty folder

9.target: It is an empty folder
 
10.pom.xml: The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies,
build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, then executes the goal.

***************************************************************************************************************************************

                                                        OUTPUT ON CONSOLE

***************************************************************************************************************************************

Number of featured news are: 5
Impact Awards 2024: Here is the list of final winners!
Top 10 takeaways from our Q4 2023 earnings
Gender equity and women in technology
Cognizant shines at the Times Group Global Business Summit (GBS)
CEO blog: Thank you for an exciting and memorable Impact Awards
Heading is :Apps and Tools
OneCognizant
ESA Timesheet
TruTime
MyService Portal

Engage (Yammer)

Holiday Calendars

Bluebolt Central

Employee Assistance Program (EAP)

All Apps & Tools

===============================================
Suite
Total tests run: 10, Passes: 10, Failures: 0, Skips: 0
===============================================

***************************************************************************************************************************************

                                                        DATA ON EXCEL

***************************************************************************************************************************************
News Displayed
"Our first companywide awards program, the Impact Awards, was a momentous occasion where we celebrated the exceptional achievements of our employees around the world and across the company.
 We are excited to share the names of the winners of these awards:
 Growth Award: Global Large Deals Team
Corporate Team of the Year: Marketing and Legal
Service Line of the Year: IOA
Account of the Year – GGM: Rabobank (Benelux)
Account of the Year – Americas: TIAA
Win of the Year – GGM: IKEA (Nordics)
Win of the Year – Americas: Gilead Sciences
Large Deal of the Year: Gainwell
Social Impact Project of the Year: Outreach Project Dhyeya team
Spirit Award: Sumita Biswal
  Global Project of the Year Awards:
 Digital Transformation:  Qualcomm Aware (Americas-CMT-IOT)
Digital App Support & Infra: Merck Digital EUC - Digital Workplace Services (Americas-Life sciences-CIS)
Client Engagement of the Year Americas: Nike-Bedrock (RCGTH-ADM, CIS, IOA, EPS, DE-DX, AIA & IOT)
Client Engagement of the Year GGM: TELEFONICA O2 UK-VMO2 Digital Assurance (CMT - QEA, CIS & AIA)
IOA: Nationwide Mutual Insurance Company- P&C Policy Servicing (Americas – Insurance)
ISG: Manulife Japan - Phoenix - Unisys Migration (GGM-APJ – Insurance)
Internal Program of the Year: Cognizant Data Intelligence Toolkit (CDIT)-Product Management (AIA Platform Team)
 Visit Be.Cognizant for more to come on the Impact Awards 2024 winners!"
On Tuesday’s earnings call, Ravi and Jatin discussed our recent performance in the fourth quarter and the full-year (FY) 2023. Here are the top 10 takeaways, covering both the numbers and company news.
"The International Day for Women and Girls in Science is celebrated every year on February 11 to recognize the critical role that women and girls play in Science, Technology, Engineering and Mathematics (STEM). The day was established by the United Nations General Assembly in 2015 to promote full and equal access to and participation in science for women and girls, and to achieve gender equity and the empowerment of women and girls.
 According to UNESCO, only 35% of all students in STEM-related fields of study are women, and only 33.3% of researchers worldwide are women. Moreover, women face barriers such as gender stereotypes, lack of role models, mentoring and networking opportunities, and discrimination and bias in the workplace. And so that we can see developments not only in the number of women in the field, but to achieve better results in innovation that this diversity offers, we always need to remember what our part is in the change.
 To address these challenges and increase the number of women in technology, several initiatives have been launched by governments, institutions, civil society organizations and private sector. At Cognizant in addition to promoting inclusion, we are committed to clear goals of increasing representation of women in leadership roles, which are driven by programs like Propel, our exclusive female leadership development program for mid- and senior-level women leaders across the world that has benefited more than 1700 associates up till end 2023, and the Cognizant® Returnship Program, a 3-month paid experience for talented technology professionals transitioning back into the workforce.
 Women in technology are essential for the advancement and sustainability of the field and you can help:
 Recognize: It is not new that we have women developing groundbreaking algorithms, software, hardware, and systems that have shaped the history and future of computing, such as Ada Lovelace, Grace Hopper, Katherine Johnson, Radia Perlman, Shafi Goldwasser, and many others. So, remember to recognize women for their achievements, most of them may not have yet realized how great they are. They deserve recognition, respect, and support for their work and potential.
 Support: Whether it’s presenting programs and training to co-workers, promoting women, or Outreach to teach technology to girls, there are many ways you can not only show your support, but take action. Extra tip: get to know some important institutions such as Girl Start, Girls Inc., Code First Girls, National Center for Women and Information Technology, Ada Developers Academy, or contact the Outreach team and find out how to contribute.
 Improve your knowledge: Take one of the D&I trainings, such as Allyship in Action.
 Be an Ally: Join Women Empowered, Cognizant women’s Affinity Group that elevates the experience of work for women and creates impact for the business. 
 By empowering women and girls in technology, we can unleash their potential to create innovative solutions for the global challenges we face today. As the UN Secretary-General António Guterres said: ""We can all do our part to unleash our world’s enormous untapped talent – starting with filling classrooms, laboratories, and boardrooms with women scientists."""
"The ET Now Global Business Summit 2024 brought together some of the world’s leading CEOs, heads of state and policymakers to deliberate on and discuss critical issues of our time and map the future. The theme of the summit was Disruption, Development and Diversification.
 Addressing the summit in his keynote, our CEO, Ravi Kumar spoke on Generative AI's power to shape the future of work and later in the day spoke at a panel discussion on the topic Fissures, Faultlines and Future.
 Highlights from Ravi's keynote:
  “Cognizant is at the forefront of leveraging technological advancements. Generative AI represents a departure from past technological shifts, fundamentally altering the landscape of jobs, skills, tasks, and occupations while fostering upward social mobility. Unlike its predecessors, Generative AI follows a steeper S-curve trajectory, significantly transforming various industries,” he said. 

Comparing the Generative AI’s impact to historical computing changes, Ravi added, “Businesses must adapt by reorganizing operations, prioritizing safety, trust, and equity to ensure a fair and inclusive future. Its rapid diffusion and bidirectional understanding between humans and machines mirror past technological revolutions.”
 He concluded by highlighting Cognizant’s focus on technological continuity, emphasizing the imperative for businesses to adapt their strategies alongside advancing technologies to cultivate a prosperous and inclusive future workforce.
  Ravi also participated in a panel discussion on the topic Fissures, Faultlines and Future – In Search of an Equilibrium, along with other eminent industry leaders including Bill Winters, CEO, Standard Chartered, Jenny Johnson, President and CEO, Franklin Templeton, Rizwan Sajan, Founder and Chairman, Danube Group and Suneeta Reddy, MD, Apollo Hospitals. The leaders discussed some of the most critical problems faced by the world today, the role of AI, and the growth roadmap for India.
   Before concluding the day, Ravi met India’s Hon'ble Prime Minister, Narendra Modi and Hon’ble PM of Guyana, H.E Brigadier (Retd.), Indian ministers and industry leaders from across the world.
  To watch the full recording of the summit, click here.
Timestamps:
Ravi’s keynote: 2:36 (mins) till 2:52 (mins)
Panel discussion: 3:04 (mins) till 3:33 (mins)
 To know more about GBS, click here."
"February 14
Thank you for an exciting and memorable Impact Awards
 I want to take this opportunity to thank each one of you for your participation in our Impact Awards 2024 event. Your presence, contributions and support made the evening truly memorable, and I couldn't be more proud of what we have accomplished together.
 For the first time in our company’s history, we developed an award program to recognize excellence across our business. We livestreamed that program from Chennai, London and New York, and thousands of you participated in watch parties around the world to recognize our employees. It was a pleasure to share this special occasion with you and to acknowledge the outstanding contributions each and every one of you bring to our teams. From the inspiring projects recognized with the Social Impact Project of the Year Award to the individuals honoured with the Spirit Award, your contributions continue to drive our organization forward. You can read more about our 2024 winners and their outstanding contributions here.
 If you happened to miss the event, you may watch it here. Feel free to share your own experiences and moments from the program using the hashtag #CognizantImpactAwards. You can also catch up on all our social media updates here.
 Thank you for making the event the success that it was. Your support makes a huge difference.
 Congratulations again to all of our 2024 winners! Let’s continue to strive for greatness, together. "

