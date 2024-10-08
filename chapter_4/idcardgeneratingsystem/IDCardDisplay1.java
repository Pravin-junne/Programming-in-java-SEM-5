package idcardgeneratingsystem;

package idcardgeneratingsystem;

import javax.swing.*;
import java.awt.*;

public class IDCardDisplay1 extends JFrame {

    public IDCardDisplay1(String name, String country, String address, String gender, String info, String birthdate, String issuedate, String nic) {
        setTitle("ID Card Display");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2));
        panel.setBackground(new Color(173, 216, 230));

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setForeground(Color.BLUE);
        panel.add(nameLabel);
        panel.add(new JLabel(name) {{ setForeground(Color.BLUE); }});

        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setForeground(Color.BLUE);
        panel.add(countryLabel);
        panel.add(new JLabel(country) {{ setForeground(Color.BLUE); }});

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setForeground(Color.BLUE);
        panel.add(addressLabel);
        panel.add(new JLabel(address) {{ setForeground(Color.BLUE); }});

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setForeground(Color.BLUE);
        panel.add(genderLabel);
        panel.add(new JLabel(gender) {{ setForeground(Color.BLUE); }});

        JLabel infoLabel = new JLabel("Info:");
        infoLabel.setForeground(Color.BLUE);
        panel.add(infoLabel);
        panel.add(new JLabel(info) {{ setForeground(Color.BLUE); }});

        JLabel birthdateLabel = new JLabel("Birth Date:");
        birthdateLabel.setForeground(Color.BLUE);
        panel.add(birthdateLabel);
        panel.add(new JLabel(birthdate) {{ setForeground(Color.BLUE); }});

        JLabel issuedateLabel = new JLabel("Issue Date:");
        issuedateLabel.setForeground(Color.BLUE);
        panel.add(issuedateLabel);
        panel.add(new JLabel(issuedate) {{ setForeground(Color.BLUE); }});

        JLabel nicLabel = new JLabel("NIC:");
        nicLabel.setForeground(Color.BLUE);
        panel.add(nicLabel);
        panel.add(new JLabel(nic) {{ setForeground(Color.BLUE); }});

        setContentPane(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Sample input data
        String name = "John Doe";
        String country = "USA";
        String address = "1234 Elm Street";
        String gender = "Male";
        String info = "Some info";
        String birthdate = "1990-01-01";
        String issuedate = "2024-10-09";
        String nic = "220199-1234567";

        SwingUtilities.invokeLater(() -> new IDCardDisplay(name, country, address, gender, info, birthdate, issuedate, nic));
    }
}
