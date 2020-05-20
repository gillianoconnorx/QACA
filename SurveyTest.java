import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.Test;

public class SurveyTest {

	
	//Test - create an empty survey
	@Test
	public void createSurveyEmpty()
	{		
		Survey survey = new Survey();
		assertTrue("Survey",survey instanceof Survey);
	}

	
	//Test - create a survey with a name and questions
	@Test 
	public void createSurvey()
	{		
		//Creation of question 
		Questions one = new Questions("Dogs");
		//Collection to represent questions
		ArrayList<Questions> questions = new ArrayList<Questions>();
		//adding question to list
		questions.add(one);

		Survey survey = new Survey("All Animals" ,questions);
		assertTrue("Survey",survey instanceof Survey);
    }

    	//Test to check that questions are being added to the survey
		@Test
		public void addQuestion()
		{
			//Creation of question object
			Questions one = new Questions("Dogs");
			Questions two = new Questions("Cats");

			Survey s = new Survey("All Animals");
			s.add(one);
			s.add(two);

			assertEquals("Questions are 2",2 ,s.getQuestions().size());
        }
        
        //does a collection of questions exists within the survey objects
	    @Test
	    public void surveyQuestions()
	    {		
		//Question object
		Questions one = new Questions("Dogs");
		//Collection representing questions
		ArrayList<Questions> questions = new ArrayList<Questions>();
		//Add question to list
		questions.add(one);

		Survey survey = new Survey("All Animals" ,questions);
		assertTrue("ArrayList'",survey.getQuestions() instanceof ArrayList);
    }
    
	//check response class
		@Test //Test Attribute
		public void createResponse()
		{		
			//New survey response object
			Response res = new Response();
			assertTrue("Response", res instanceof Response);
        }
        
       //answers to a survey response being added
		@Test //Test Attribute
		public void responseAnswer()
		{
			//Survey response object
			Response res = new Response();
			//set an answer to the survey response
			res.setAnswer(1);
			assertNotNull("The answer should not be null" , res.getAnswer());
        }

        //responses can be gotten from questions
	    @Test
	    public void questionResponse()
	    {
		//Create survey
		Survey survey = new Survey();
        //Question objectS
		Questions one = new Questions("Dogs");
        //Add answers to question responses
		one.getResponse().setAnswer(2);
	    //get first questions response answer
		assertEquals("Value should be '2'",2,one.getResponse().getAnswer());
	}


} 
    

