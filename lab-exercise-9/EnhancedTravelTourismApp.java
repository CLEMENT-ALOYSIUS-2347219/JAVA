import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class EnhancedTravelTourismApp extends JFrame {
    private JComboBox<String> destinationComboBox;
    private JTextArea informationTextArea;
    private JLabel imageLabel;

    private String[] destinations = {"Paris", "New York", "Tokyo", "Rome", "Sydney"};

    private Map<String, String> destinationImages = new HashMap<String, String>() {{
        put("Paris", "paris.jpg");
        put("New York", "new_york.jpg");
        put("Tokyo", "tokyo.jpg");
        put("Rome", "rome.jpg");
        put("Sydney", "sydney.jpg");
    }};

    private Map<String, String> destinationLinks = new HashMap<String, String>() {{
        put("Paris", "https://en.parisinfo.com/");
        put("New York", "https://www.nycgo.com/");
        put("Tokyo", "https://www.gotokyo.org/en/");
        put("Rome", "http://www.turismoroma.it/");
        put("Sydney", "https://www.sydney.com/");
    }};

    public EnhancedTravelTourismApp() {
        super("Enhanced Travel and Tourism App");

        destinationComboBox = new JComboBox<>(destinations);
        informationTextArea = new JTextArea(10, 30);
        informationTextArea.setEditable(false);

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JButton showInfoButton = new JButton("Show Information");
        showInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedDestination = (String) destinationComboBox.getSelectedItem();
                displayInformation(selectedDestination);
            }
        });

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(exitItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        // Layout
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Select Destination: "));
        topPanel.add(destinationComboBox);
        topPanel.add(showInfoButton);

        JScrollPane textAreaScrollPane = new JScrollPane(informationTextArea);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(imageLabel, BorderLayout.CENTER);

        add(topPanel, BorderLayout.NORTH);
        add(textAreaScrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void displayInformation(String destination) {
        // Display text information
        String information = "Information about " + destination + ":\n"
                + "This is a fantastic travel destination!\n"
                + "Learn more: " + destinationLinks.get(destination);
        informationTextArea.setText(information);

        // Display image
        String imagePath = destinationImages.get(destination);
        if (imagePath != null) {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(imagePath));
            imageLabel.setIcon(imageIcon);
        } else {
            imageLabel.setIcon(null);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EnhancedTravelTourismApp();
            }
        });
    }
}
