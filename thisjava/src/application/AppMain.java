package application;


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();				//HBox �����̳� ����
		hbox.setPadding(new Insets(10));	//���� ���� ����
		hbox.setSpacing(10);				//��Ʈ�� ���� ���� ���� ����
		
		TextField textField = new TextField();	//TextField ��Ʈ�� ����
		textField.setPrefWidth(200);		//TextField�� �� ����
		
		Button button = new Button();		//Button ��Ʈ�� ����
		button.setText("Ȯ��");				//Button ���� ����
		
		ObservableList list = hbox.getChildren();	//HBox�� ObservableLIst ���
		list.add(textField);				//TextField ��Ʈ�� ��ġ
		list.add(button);					//Button ��Ʈ�� ��ġ
		
		Scene scene = new Scene(hbox);		//��� ����
		
		arg0.setTitle("AppMain");			//������ â ���� ����
		arg0.setScene(scene);				//������ â�� ��� ����
		arg0.show();						//������ â �����ֱ�
	}

	public static void main(String[] args) {
		launch(args);
	}


}
