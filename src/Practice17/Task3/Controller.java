package Practice17.Task3;

import javax.swing.*;
import java.awt.event.ActionEvent;

class Controller {
	private View view;
	private Model model;

	public Controller() {
		this.model = new Model();
		this.view = new View();
		view.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.setText(view.getInputText());
				view.setLabelText(model.getTxt());
			}
		});
	}
}