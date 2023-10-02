import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator {
    private double th1 = 0.0;
    private double th2 = 0.0;
    private char pilih_hitung;
    private JPanel Kalkulator;
    private JTextField tfHitungan;
    private JButton a1Button;
    private JButton cButton;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a0Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton pointButton;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton equalButton;
    private JButton PButton;
    private JButton minButton;
    private JButton xButton;
    private JButton DButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator");
        frame.setContentPane(new Kalkulator().Kalkulator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void operatorKalkulator(String tombolHitung) {
        pilih_hitung = tombolHitung.charAt(0);
        th1 = th1 + Double.parseDouble(tfHitungan.getText());
        tfHitungan.setText("");
    }



    public Kalkulator() {
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tombolHitung = tfHitungan.getText() + a0Button.getText();
                tfHitungan.setText(tombolHitung);
            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tombolHitung = tfHitungan.getText() + a1Button.getText();
                tfHitungan.setText(tombolHitung);
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tombolHitung = tfHitungan.getText() + a2Button.getText();
                tfHitungan.setText(tombolHitung);
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tombolHitung = tfHitungan.getText() + a3Button.getText();
                tfHitungan.setText(tombolHitung);
            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tombolHitung = tfHitungan.getText() + a4Button.getText();
                tfHitungan.setText(tombolHitung);
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tombolHitung = tfHitungan.getText() + a5Button.getText();
                tfHitungan.setText(tombolHitung);
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tombolHitung = tfHitungan.getText() + a6Button.getText();
                tfHitungan.setText(tombolHitung);
            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tombolHitung = tfHitungan.getText() + a7Button.getText();
                tfHitungan.setText(tombolHitung);
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tombolHitung = tfHitungan.getText() + a8Button.getText();
                tfHitungan.setText(tombolHitung);
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tombolHitung = tfHitungan.getText() + a9Button.getText();
                tfHitungan.setText(tombolHitung);
            }
        });


        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                th2 = 0;
                tfHitungan.setText("");

            }
        });


        pointButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (tfHitungan.getText().equals("")) {
                    tfHitungan.setText("0.");
                } else if (tfHitungan.getText().contains(".")) {
                    pointButton.setEnabled(false);
                } else {
                    String tombolKoma = tfHitungan.getText() + pointButton.getText();
                    tfHitungan.setText(tombolKoma);
                }
                pointButton.setEnabled(true);
            }
        });


        PButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String tombolHitung = PButton.getText();
                operatorKalkulator(tombolHitung);
            }
        });

        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String tombolHitung = xButton.getText();
                operatorKalkulator(tombolHitung);

            }
        });

        minButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String tombolHitung = minButton.getText();
                operatorKalkulator(tombolHitung);

            }
        });

        DButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String tombolHitung = DButton.getText();
                operatorKalkulator(tombolHitung);

            }
        });


        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switch (pilih_hitung) {
                    case '-':
                        th2 = th1 - Double.parseDouble(tfHitungan.getText());
                        break;

                    case '+':
                        th2 = th1 + Double.parseDouble(tfHitungan.getText());
                        break;

                    case '/':
                        th2 = th1 / Double.parseDouble(tfHitungan.getText());
                        break;

                    case 'x':
                        th2 = th1 * Double.parseDouble(tfHitungan.getText());
                        break;

                }

                tfHitungan.setText(Double.toString(th2));
            }
        });
    }
}
