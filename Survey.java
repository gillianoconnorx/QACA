import java.util.ArrayList;
import java.util.Collections; 

public class Survey {
//average etc
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
    
    public int getMinValue()
	{
		int minValue = 0;
		ArrayList<Integer> valueList = new ArrayList<Integer>();
            //iterating
		for(Questions quest : this.questions) 
		{
			valueList.add(quest.getAns()); 
		}
		minValue = Collections.min(valueList); 
		return minValue; 
	}
    
    public int getMaxValue()
	{
		int maxValue = 0;
		ArrayList<Integer> valueList = new ArrayList<Integer>(); 
            //iterating 
		for(Questions quest : this.questions)
		{
			valueList.add(quest.getAns()); 
        }
        //returning max
		maxValue = Collections.max(valueList); 
		return maxValue; 
    }

    public double getAverage()
	{
    //The sum of all question values - the starting value must be 0
		int total = 0;
		for(Questions quest:this.questions)
		{
            //value
			total+= quest.getAns();
		}

		//Calculate the mean
        double mean = (float)total/this.questions.size();
        return mean;  
    }


} 