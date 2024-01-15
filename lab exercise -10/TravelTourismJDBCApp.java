import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TravelTourismJDBCApp extends JFrame {
    private JComboBox<String> destinationComboBox;
    private JTextArea informationTextArea;

    public TravelTourismJDBCApp() {
        super("Travel and Tourism App with JDBC");

        destinationComboBox = new JComboBox<>();
        informationTextArea = new JTextArea(10, 30);
        informationTextArea.setEditable(false);

        JButton showInfoButton = new JButton("Show Information");
        showInfoButton.addActionListener(e -> {
            String selectedDestination = (String) destinationComboBox.getSelectedItem();
            displayInformation(selectedDestination);
        });

        // Layout
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Select Destination: "));
        topPanel.add(destinationComboBox);
        topPanel.add(showInfoButton);

        JScrollPane textAreaScrollPane = new JScrollPane(informationTextArea);

        add(topPanel, BorderLayout.NORTH);
        add(textAreaScrollPane, BorderLayout.CENTER);

        // Load destinations from the database
        loadDestinations();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void loadDestinations() {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database (replace URL, username, and password)
            String url = "jdbc:mysql://localhost:3306/travel_tourism";
            String username = "your_username";
            String password = "your_password";
            Connection connection = DriverManager.getConnection(url, username, password);

            // Query the database for destinations
            String query = "SELECT destination_name FROM destinations";
            try (PreparedStatement statement = connection.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    String destinationName = resultSet.getString("destination_name");
                    destinationComboBox.addItem(destinationName);
                }
            }

            // Close the connection
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error connecting to the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void displayInformation(String destination) {
        try {
            // Connect to the database (replace URL, username, and password)
            String url = "jdbc:mysql://localhost:3306/travel_tourism";
            String username = "your_username";
            String password = "your_password";
            Connection connection = DriverManager.getConnection(url, username, password);

            // Query the database for information about the selected destination
            String query = "SELECT information FROM destinations WHERE destination_name = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, destination);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        String information = resultSet.getString("information");
                        informationTextArea.setText(information);
                    }
                }
            }

            // Close the connection
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error connecting to the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TravelTourismJDBCApp::new);
    }
}
