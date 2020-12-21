package Eventhandler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void start(Stage arg0) throws Exception {
		HBox root = new HBox();
		root.setPrefSize(200, 50);
		root.setAlignment(Pos.CENTER);		//���� �߾� ����
		root.setSpacing(20);
		
		Button btn1 = new Button("��ư1");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("��ư1 Ŭ��");
				
			}
		});
		
		Button btn2 = new Button("��ư2");
		btn2.setOnAction(event->System.out.println("��ư2 Ŭ��"));
		
		root.getChildren().addAll(btn1, btn2); //HBox�� btn1�� btn2�� �߰�
		Scene scene = new Scene(root);
		
		arg0.setTitle("AppMain");
		arg0.setScene(scene);
		arg0.setOnCloseRequest(event->System.out.println("���� Ŭ��"));
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	
}
