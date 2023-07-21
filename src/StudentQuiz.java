import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class StudentQuiz implements ActionListener
{
JFrame fr;
JRadioButton rb1,rb2,rb3,rb4;
JButton b1,b2,b3;
JLabel lb1,lb2;
ButtonGroup bg;
String ques[]={"Who developed Java?","Capital of Italy","Taj Mahal is located"};
String op1[]={"Tim Cook","Paris","Agra"};
String op2[]={"Steve Burner","Delhi","Mumbai"};
String op3[]={"Mark Hardy","Rome", "Aurangabad"};
String op4[]={"James","Berlin","Rajasthan"};
String ans[]={"James","Rome","Agra"};
int cn;
StudentQuiz()
{
fr=new JFrame();
fr.setLayout(null);
fr.setSize(600,600);
Container c=fr.getContentPane();
c.setBackground(Color.cyan);
lb1=new JLabel(ques[0]);
lb1.setBounds(50,50,300,30);
fr.add(lb1);
lb1.setFont(new Font("Times New Roman",Font.BOLD,30));
rb1=new JRadioButton(op1[0]);
rb1.setBounds(100,120,100,30);
fr.add(rb1);
rb2=new JRadioButton(op2[0]);
rb2.setBounds(350,120,100,30);
fr.add(rb2);
rb3=new JRadioButton(op3[0]);
rb3.setBounds(100,200,100,30);
fr.add(rb3);
rb4=new JRadioButton(op4[0]);
rb4.setBounds(350,200,100,30);
fr.add(rb4);
bg =new ButtonGroup();
bg.add(rb1);
bg.add(rb2);
bg.add(rb3);
bg.add(rb4);
rb1.addActionListener(this);
rb2.addActionListener(this);
rb3.addActionListener(this);
rb4.addActionListener(this);
b1=new JButton("Submit");
b1.setBounds(100,400,100,30);
fr.add(b1);
b2=new JButton("Next");
b2.setBounds(250,400,100,30);
fr.add(b2);
b3=new JButton("Complete");
b3.setBounds(400,400,100,30);
fr.add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
fr.setVisible(true);
}
public static void main(String s[])
{
new StudentQuiz();
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
String en="";
if(rb1.isSelected())
en=rb1.getText();
if(rb2.isSelected())
en=rb2.getText();
if(rb3.isSelected())
en=rb3.getText();
if(rb4.isSelected())
en=rb4.getText();
if(en.equals(ans[cn]))
JOptionPane.showMessageDialog(null,"Right Answer");
else
JOptionPane.showMessageDialog(null,"Wrong Answer");
}
if (e.getSource()==b2)
{
cn++;
lb1.setText(ques[cn]);
rb1.setText(op1[cn]);
rb2.setText(op2[cn]);
rb3.setText(op3[cn]);
rb4.setText(op4[cn]);
}
if(e.getSource()==b3)
{
    StudentInterface s=new StudentInterface();
    s.show();    
    JOptionPane.showMessageDialog(null,"Quiz Attempted Successfully");
    
 
}    
}

    void show() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}