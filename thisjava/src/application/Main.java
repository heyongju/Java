package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();				//Parent ���� ��ü�� VBox ����
		root.setPrefWidth(350);				// VBox�� �� ����
		root.setPrefHeight(150);			// VBox�� ���� ����
		root.setAlignment(Pos.CENTER);		// ��Ʈ���� �߾����� ����
		root.setSpacing(20);				// ��Ʈ���� ���� ����
		
		Label label = new Label();			// Label ��ƲȦ ����
		label.setText("Hello JavaFX");		// text �Ӽ� ����
		label.setFont(new Font(50));		// font �Ӽ� ����
		
		Button button = new Button();		// Button ��Ʈ�� ����
		button.setText("Ȯ��");				// text �Ӽ� ����
		button.setOnAction(event->Platform.exit()); // Ŭ�� �̺�Ʈ ó��
		
		root.getChildren().add(label);		//VBox�� �ڽ����� LAbel ��Ʈ�� �߰�
		root.getChildren().add(button);		//VBox�� �ڽ����� Button ��Ʈ�� �߰�
		
		Scene scene = new Scene(root); 		//VBox�� ��Ʈ �����̳ʷ� �ؼ� SCene ����
		
		primaryStage.setTitle("AppMain");	//�������� ���� ����
		primaryStage.setScene(scene);		//�����쿡 ��� ����
		primaryStage.show();				//������ �����ֱ�
	}
	
	public static void main(String[] args) {
		launch(args); // Main ��ü ���� �� ���� ������ ����
	}


}
