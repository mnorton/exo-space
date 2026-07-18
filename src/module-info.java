module exospace {
	requires javafx.controls;
	requires javafx.fxml;
	
	exports com.nolaria.exospace.application;
	opens com.nolaria.exospace.application to javafx.graphics, javafx.fxml;

}
