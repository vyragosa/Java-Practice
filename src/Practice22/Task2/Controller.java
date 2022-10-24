package Practice22.Task2;

import javax.swing.*;
import java.awt.event.ActionEvent;

class Controller {
	private Viewer viewer;
	private Model model;

	public Controller() {
		model = new Model();
		this.viewer = new Viewer();
	}

	public void execute() {
		viewer.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					model.doAction(e.getActionCommand());
				} catch (Exception ex) {
					viewer.errorMessage(ex.getMessage());
				}
				viewer.update(model.getTemp());
			}
		});
	}
}
