package calculadora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Calculadora extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		FlowPane fp = new FlowPane();
		Scene scn = new Scene(fp, 200, 126);
		
		String st = "789/456*123-0.=+";
		Button[] btns = new Button[st.length()+1];
		for(int i=0; i<st.length(); i++) {
			btns[i+1] = new Button(st.substring(i, i+1));
		}
		btns[0] = new Button("CE");
		
		TextField txt = new TextField("0");
		
		fp.getChildren().add(txt);
		for(int i=0; i<btns.length; i++) {
			btns[i].setPrefWidth(50);
			fp.getChildren().add(btns[i]);
		}
		
		stage.setTitle("Calculadora");
		stage.setScene(scn);
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(Calculadora.class, args);
	}

}
