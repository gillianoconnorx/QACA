import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

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
} 
    

