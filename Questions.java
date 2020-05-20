public class Questions {

	//Question
    private String question;
    private Response response; 
    private int ans;

	public Questions(String question) {
        this.question = question;
        this.response = new Response();
    }
    
    public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

  
	public String getQuestions() {
		return question;
	}

	public void setQuestions(String question) {
		this.question = question;
    }
    public int getAns() {
		return ans;
	}
    
    public void setAns(int ans) {
		if(ans < 1 || ans > 5)
		{
			 throw new IllegalArgumentException("Value must be between 1 and 5" + ans );
		}
		else
		{
			this.ans = ans;
		}
        }
}