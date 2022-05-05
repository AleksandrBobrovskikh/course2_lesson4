package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Optional;

public class Controller {

//    private Game game;

//    private int step;

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


//    public Controller() {
//        this.game = new Game();
//        step = 0;
//    }

//    @FXML
//    private void checkButtonClick(ActionEvent actionEvent) {
//        String playerNumber = messageField.getText();
//        if(playerNumber.isEmpty()){
//            return;
//        }
//        Game.BullCowCount count = game.calcBullsAndCows(playerNumber);
//        String text = String.format("%d. Введено число %s, быков %d, коров %d", ++step, playerNumber, count.getBulls(), count.getCows());
//        messageArea.appendText(text + "\n");
//        messageField.clear();
//        messageField.requestFocus();
//        if(count.getBulls() == 4) {
//            if (isWantToPlayAgain()){
//                step = 0;
//                messageArea.clear();
//                this.game = new Game();
//            } else {
//                System.exit(0);
//            }
//        }
//    }

//    private boolean isWantToPlayAgain() {
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Поздравляю с победой\n" + "Загаданное число " + game.getGuessNumber() + "Еще раз",
//                new ButtonType("Yes", ButtonBar.ButtonData.YES),
//                new ButtonType("No", ButtonBar.ButtonData.NO));
//        alert.setTitle("Вопрос");
//        ButtonType answer = alert.showAndWait().get();
//        return answer.getButtonData() == ButtonBar.ButtonData.YES;
//
//    }

//    public void menuExit(ActionEvent actionEvent) {
//        System.exit(0);
//    }
}
