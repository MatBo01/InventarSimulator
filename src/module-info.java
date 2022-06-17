module InventarSimulator {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.base;
	requires javafx.graphics;
	requires javafx.web;
	requires javafx.media;
	requires javafx.swing;
	requires java.sql;
	
	opens main to javafx.graphics, javafx.fxml;
	opens hauptmenue to javafx.graphics, javafx.fxml;
	opens inventarAnsicht to javafx.graphics, javafx.fxml;
	opens itemAnsicht to javafx.graphics, javafx.fxml;
	opens itemErstellen to javafx.graphics, javafx.fxml;
	opens itemLoeschen to javafx.graphics, javafx.fxml;
	opens itemView to javafx.graphics, javafx.fxml;
	
	opens POJO to javafx.base;
}
