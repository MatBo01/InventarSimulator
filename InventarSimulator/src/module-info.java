module InventarSimulator {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens main to javafx.graphics, javafx.fxml;
}
