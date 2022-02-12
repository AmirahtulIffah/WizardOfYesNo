package project01;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import java.util.Random;
import javafx.scene.text.*;

public class WizardOfYesNo extends Application {

//	private static final String ANSWER = "No";
	private static final String[] ANSWER = {
			"Yes",
			"Go for it!",
			"Yes, definitely.",
			"For sure!",
			"I would say yes.",
			"Most likely yes.",
			"No.",
			"I wouldn't.",
			"In my opinion, no.",
			"Definitely not!",
			"Probably not.",
			"It is very doubtful."
	};
	
	@Override
	public void start(Stage arg0) throws Exception {
		arg0.setResizable(false);
		arg0.setTitle("Wizard of Yes/No");
		//Create the Label object
//		Label label = new Label("Yes");
		
//		Label label = new Label();
//		label.setText(ANSWER);
		
		Random rand = new Random();
		int numberOfAnswers = ANSWER.length;
		int pick = rand.nextInt(numberOfAnswers);
		String answer = ANSWER[pick];
		
		Label label = new Label();
		label.setText(answer);
		
		//This font is set to Times New Roman Font Family
		//FontWeight to NORMAL or BOLD
		//Size to 32
		//Add FontPosture.ITALIC to make Bold/Normal with Italic
		Font font = Font.font("Times New Roman", FontWeight.BOLD,FontPosture.ITALIC, 32);
		label.setFont(font);
		
		
		//Create the Scene object and add Label object into it.
		Scene root = new Scene(label);
		//to add width and height
//		Scene root = new Scene(label, 200, 100);
		
		//Set Stage to use the Scene object
		arg0.setScene(root);
		//Size to fit
		arg0.sizeToScene();
		//Disable Resizing
		arg0.setResizable(false);
		
		arg0.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}

