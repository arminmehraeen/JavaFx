package View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class AddStudentView extends VBox {

    private TextField idField,nameField,lastNameField;
    private Button saveBtn,cancelBtn;

    public AddStudentView(){
        Label title = new Label("New Student Form");

        idField = new TextField();
        idField.setPromptText("Id");
        idField.setFocusTraversable(false);
        idField.setMaxWidth(150);

        nameField = new TextField();
        nameField.setPromptText("Name");
        nameField.setFocusTraversable(false);
        nameField.setMaxWidth(150);

        lastNameField = new TextField();
        lastNameField.setPromptText("LastName");
        lastNameField.setFocusTraversable(false);
        lastNameField.setMaxWidth(150);

        saveBtn = new Button("Save");
        cancelBtn = new Button("Cancel");
        HBox hBox = new HBox(saveBtn,cancelBtn);
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);

        this.getChildren().addAll(title,idField,nameField,lastNameField,hBox);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(15);
        this.setPadding(new Insets(30, 30, 30, 30));
    }

    public TextField getIdField() {
        return idField;
    }

    public Button getCancelBtn() {
        return cancelBtn;
    }

    public TextField getNameField() {
        return nameField;
    }

    public TextField getLastNameField() {
        return lastNameField;
    }

    public Button getSaveBtn() {
        return saveBtn;
    }
}
