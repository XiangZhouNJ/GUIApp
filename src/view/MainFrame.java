package view;

import shape.AShape;
import shape.Circle;
import shape.Oval;
import shape.Composite;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import shape.Rectangle;

/**
 * The main frame
 * 
 * @author Xiang Zhou, Eleni Litsa
 *
 */
public class MainFrame extends JFrame {

	/**
	 * Launch the application.
	 * 
	 * @param args array of command-line arguments passed to the main method
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					// call the method to set the frame visible
					frame.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * <pre>
	 *           1..1     1..1
	 * MainFrame ------------------------AShape
	 *                   &gt;       aShape
	 * </pre>
	 */
	private AShape aShape = new Rectangle(0, 0, 0, 0);

	//	public void setAShape(AShape value) {
	//		this.aShape = value;
	//	}
	//
	//	public AShape getAShape() {
	//		return this.aShape;
	//	}

	private static final long serialVersionUID = 6609680027612102654L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Set frame visible
	 */
	public void start() {
		this.setVisible(true);
	}

	/**
	 * Constructs the mainFrame, call initGUI()
	 */
	public MainFrame() {
		//call the method to initialize the GUI 
		initGUI();
	}

	/**
	 * Create the frame.
	 */
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		//add centerPanel
		JPanel centerPanel = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 9162968205652839109L;

			/**
			 * overridden paintComponent method to paint a shape in the panel.
			 * @param g The graphics object to paint on.
			 */
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				//draw an oval and fill it with red
				g.setColor(Color.RED);
				g.fillOval(75, 100, 20, 40);

//				AShape rectangle = new Rectangle(0, 0, 15, 30);
//				AShape oval = new Oval(30, 30, 40, 20);
//				AShape circle = new Circle(150, 80, 30);
//									
//				rectangle.paint(g);
//				oval.paint(g);
//			    circle.paint(g);

				aShape.paint(g);
			}

		};
		centerPanel.setBackground(Color.ORANGE);
		contentPane.add(centerPanel, BorderLayout.CENTER);

		//add north panel
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.RED);
		contentPane.add(northPanel, BorderLayout.NORTH);

		//add label
		JLabel myLbl = new JLabel("MyLabel");
		northPanel.add(myLbl);

		//add text field
		textField = new JTextField();
		textField.setToolTipText("type the name you like to set the label on the left");
		northPanel.add(textField);
		textField.setColumns(10);

		//add a button to set label
		JButton btnClick = new JButton("setLbl");
		btnClick.setToolTipText("click to set the label name");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("clicked setLabl");

				myLbl.setText(textField.getText());
			}
		});
		northPanel.add(btnClick);

		//add southPanel
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.GREEN);
		contentPane.add(southPanel, BorderLayout.SOUTH);

		//add a button to choose rectangle
		JButton btnRectangle = new JButton("Rectangle");
		btnRectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("clicked rectangle!");
				//draw a rectangle
				aShape = new Rectangle(200, 40, 20, 30);
				centerPanel.repaint();
			}
		});
		southPanel.add(btnRectangle);

		//add a button choose circle
		JButton btnCircle = new JButton("Circle");
		btnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("clicked circle!");
				//draw a circle
				aShape = new Circle(200, 40, 30);
				centerPanel.repaint();
			}
		});
		southPanel.add(btnCircle);

		//add a button to choose oval
		JButton btnOval = new JButton("Oval");
		btnOval.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("clicked oval!");
				//draw an oval
				aShape = new Oval(200, 40, 20, 30);
				centerPanel.repaint();
			}
		});
		southPanel.add(btnOval);

		//add a button to choose compound shape
		JButton btnNewButton = new JButton("Composite");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("clicked composite!");
				Composite compst = new Composite(0, 0);
				AShape circle = new Circle(200, 40, 30);
				AShape rec = new Rectangle(170, 10, 60, 60);
				compst.add(circle);
				compst.add(rec);
				aShape = compst;
				centerPanel.repaint();
			}
		});
		southPanel.add(btnNewButton);

	}

}
