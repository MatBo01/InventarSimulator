module InventarSimulator {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.base;
	requires javafx.graphics;
	requires javafx.web;
	requires java.sql;
	
	opens Sortieralgorithmen to javafx.graphics, javafx.fxml, javafx.controls, javafx.base, javafx.media, javafx.swing,javafx.swt, javafx.web;
	opens main to javafx.graphics, javafx.fxml;
	opens POJO to javafx.base;
}
