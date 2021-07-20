package View;

import Model.Student;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainView extends BorderPane {

    private TableView<Student> tableView;
    private Button addBtn;
    private Button deleteBtn;
    private Button exitBtn;

    public MainView(){

        tableView = new TableView<>();
        addBtn = new Button("Add Student");
        addBtn.setMaxWidth(Double.MAX_VALUE);
        deleteBtn = new Button("Delete Student");
        deleteBtn.setMaxWidth(Double.MAX_VALUE);
        exitBtn = new Button("Exit");
        exitBtn.setMaxWidth(Double.MAX_VALUE);

        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        TableColumn<Student,String> idColumn = new TableColumn<>("Id");
        TableColumn<Student,String> nameColumn = new TableColumn<>("Name");
        TableColumn<Student,String> lastNameColumn = new TableColumn<>("LastName");

        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        tableView.getColumns().addAll(idColumn,nameColumn,lastNameColumn);
        VBox vBox = new VBox(addBtn,deleteBtn,exitBtn);
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.BOTTOM_CENTER);
        vBox.setPadding(new Insets(10, 10, 10, 10));

        this.setLeft(vBox);
        this.setCenter(tableView);
    }

    public TableView<Student> getTableView() {
        return tableView;
    }

    public Button getAddBtn() {
        return addBtn;
    }

    public Button getDeleteBtn() {
        return deleteBtn;
    }

    public Button getExitBtn() {
        return exitBtn;
    }
}
