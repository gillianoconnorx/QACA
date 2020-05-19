import java.util.ArrayList;

public class Survey {

    public Survey(){
        
    }

	//Survey
	private String name;
	//Collection of questions
	private ArrayList<Questions> questions = new ArrayList<Questions>();

	//Constructor - name and list of questions
	public Survey(String name, ArrayList<Questions> questions) {
		this.name = name;
		this.questions = questions;
    }
    
	//Add questions
	public void add(Questions q)
	{
		this.questions.add(q);
	}


	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Questions> getQuestions() {
		return questions;
	}
	public void setQuestions(ArrayList<Questions> questions) {
		this.questions = questions;
	}

} 