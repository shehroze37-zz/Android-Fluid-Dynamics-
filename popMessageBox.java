public class popUpMessage {

  private String messageTitle ;	
	private String message ;
	private String button1Text  ;
	private String button2Text ;
	private boolean buttons ;
	private String buttonClose = "Close" ;
	
	public popUpMessage(String messageT, String messageToBeDisplayed)
	{
		message = messageToBeDisplayed ;
		messageTitle = messageT ;
		buttons = false ;
		
		//close button is to be displayed
		
	}
	
	public popUpMessage(String messageT, String messageToBeDisplayed, String textButton1, String textButton2){
		message = messageToBeDisplayed ;
		messageTitle = messageT ;
		button1Text = textButton1 ;
		button2Text = textButton2 ;
		buttons = true ;
		
	}

}
