package sample.Scenehandler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class forsideController {
    @FXML
    private AnchorPane rootpane;
    @FXML


    public void load1(javafx.event.ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("XML/kun.fxml"));
        rootpane.getChildren().setAll(pane);
    }


    public void load2(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(
                "XML/team.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    public void load3(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(
                "XML/opgaver.fxml"));
        rootpane.getChildren().setAll(pane);
    }


    public void load4(ActionEvent actionEvent) throws IOException, InterruptedException {

        AnchorPane pane = FXMLLoader.load(getClass().getResource(
                "XML/Scrummaster.fxml"));
        rootpane.getChildren().setAll(pane);



    }

    public void musklik(MouseEvent mouseEvent) {

        System.exit(0);
    }
}


