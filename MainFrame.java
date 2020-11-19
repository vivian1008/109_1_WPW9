import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;

public class MainFrame extends Frame{
    private TextField tf1 = new TextField("");
    private TextField tf2 = new TextField("");
    private TextField tf3 = new TextField("");
    private Button btn = new Button("=");
    private Label lab = new Label("");
    private double a; 
    private double b;

public MainFrame(){
    init();
}

private void init(){
    this.setBounds(100,100,500,400);
    this.setLayout(null);
    this.setBackground(new Color(0,255,0));
    this.setFont(new Font("Tahoma",Font.PLAIN,20));
    tf1.setBounds(50,170,60,30);
    tf2.setBounds(120,170,60,30);
    tf3.setBounds(190,170,60,30);
    btn.setBounds(260,170,60,30);
    lab.setBounds(330,170,100,30);

    this.add(tf1);
    this.add(tf2);
    this.add(tf3);
    this.add(btn);
    this.add(lab);

    this.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    });

    btn.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            double a = Double.parseDouble(tf1.getText());
            double b = Double.parseDouble(tf3.getText());
            if(tf2.getText().equals("+")){
                lab.setText(Double.toString(a + b));
            }
            if(tf2.getText().equals("-")){
                lab.setText(Double.toString(a - b));
            }
            if(tf2.getText().equals("*") || tf2.getText().equals("x")){
                lab.setText(Double.toString(a * b));
            }
            if(tf2.getText().equals("/")){
                lab.setText(Double.toString(a / b));
            }
            if(tf2.getText().equals("^")){
                lab.setText(Double.toString(Math.pow(a,b)));
            }
            if(tf2.getText().equals("sqrt") || tf2.getText().equals("Sqrt")){
                lab.setText(Double.toString(Math.pow(a,(1/b))));
            }
            if(tf2.getText().equals("%")){
                lab.setText(Double.toString(a % b));
            }
        }
    });
}
}