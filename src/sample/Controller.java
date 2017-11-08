package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Controller {
    public ObservableList<String> list = FXCollections.observableArrayList();
    public TableView<String> table=new TableView<>();
    public TextField txt;

    @FXML
    public void initialize() {
        TableColumn<String, String> column = (TableColumn<String, String>) table.getColumns().get(0);
        if (column.getCellValueFactory() == null) {
            column.setCellValueFactory((param) -> new SimpleStringProperty(param.getValue()));
        }

    }


    public void handleClick(ActionEvent actionEvent) {

        if (txt.getText()!=null) {
            list.add(txt.getText());
        }
        table.setItems(list);
    }
}
