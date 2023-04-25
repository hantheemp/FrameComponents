package appPackage;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.MouseInfo;
import javax.swing.*;

public class Frame extends JFrame {

	private JPanel coordinatePanel;

	private JPanel sizePanel;

	private JPanel mouseLocationPanel;

	private JButton coordinateButton;

	private JButton sizeButton;

	private JButton mouseLocationButton;

	private double width;

	private double height;

	private double xCoord;

	private double yCoord;

	private MouseInfo mousePointer;

	private JLabel coordinateLabel;

	private JLabel coordinate;

	private JLabel sizeLabel;

	private JLabel size;

	private JLabel mouseCoordinateLabel;

	private JLabel mouseCoordinate;

	private int xCoordOfMouse;

	private int yCoordOfMouse;

	public Frame() {

		this.coordinateButton = new JButton("Pick!");

		this.sizeButton = new JButton("Pick!");

		this.mouseLocationButton = new JButton("Pick!");

		this.coordinatePanel = new JPanel(new FlowLayout());

		this.sizePanel = new JPanel(new FlowLayout());

		this.mouseLocationPanel = new JPanel(new FlowLayout());

		this.sizePanel = new JPanel(new FlowLayout());

		this.mouseLocationPanel = new JPanel(new FlowLayout());

		this.coordinateLabel = new JLabel("Coordinate : ");

		this.coordinate = new JLabel("");

		this.sizeLabel = new JLabel("Size : ");

		this.size = new JLabel("");

		this.mouseCoordinateLabel = new JLabel("Mouse Coordinate : ");

		this.mouseCoordinate = new JLabel("");

		setLayout(new GridLayout(3, 1));

		this.coordinatePanel.add(coordinateLabel);

		this.coordinatePanel.add(coordinate);

		this.coordinatePanel.add(coordinateButton);

		this.sizePanel.add(sizeLabel);

		this.sizePanel.add(size);

		this.sizePanel.add(sizeButton);

		this.mouseLocationPanel.add(mouseCoordinateLabel);

		this.mouseLocationPanel.add(mouseCoordinate);

		this.mouseLocationPanel.add(mouseLocationButton);

		add(coordinatePanel);

		add(sizePanel);

		add(mouseLocationPanel);

		setSize(400, 400);

		setLocationRelativeTo(null);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);

	}

	public void updateMouseLabel() {

		while (true) {

			this.xCoordOfMouse = mousePointer.getPointerInfo().getLocation().x;

			this.yCoordOfMouse = mousePointer.getPointerInfo().getLocation().y;

			this.mouseCoordinate.setText(this.xCoordOfMouse + ":" + this.yCoordOfMouse);

		}

	}

	public void updateSizeLabel() {

		while (true) {

			this.height = getHeight();

			this.width = getWidth();

			this.size.setText(height + ":" + width);

		}

	}

	public void updateCoordinateLabel() {

		while (true) {

			this.xCoord = getX();

			this.yCoord = getY();

			this.coordinate.setText(xCoord + ":" + yCoord);

		}

	}
}
