module com.jp.hospital {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jp.hospital to javafx.fxml;
    exports com.jp.hospital;
}
