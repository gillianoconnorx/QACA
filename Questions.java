public class Questions {

	//Question
    private String question;
    private Response response; 

	
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

}