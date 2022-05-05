package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Optional;

public class Controller {



    @FXML
    private TextArea messageArea;
    @FXML
    private TextField messageField;


    public void checkButtonClick(ActionEvent actionEvent) {
        if (!messageField.getText().isEmpty()) {
            if (messageField.getText().equals("/exit"))
                System.exit(0);
            else {
                messageArea.appendText(messageField.getText() + "\n");
                messageField.clear();
            }
        }
    }

}
