import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fever implements ActionListener{
 JButton b1,add,order;
 JFrame f1;
 JTextField tf,tf1;
 JComboBox jc;
 Fever()
 {
 Font myfont2=new Font(Font.SERIF,Font.BOLD,20);
 f1=new JFrame();
 f1.setBounds(400,120,570,570);
 f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JLabel l=new JLabel("Tablets");
 l.setBounds(30,70,120,40);
 f1.add(l);
 l.setFont(myfont2);
 b1=new JButton("Back");
 b1.setBounds(470,470,80,40);
 jc=new JComboBox();
 jc.setBounds(200,70,240,30);
 jc.addItem("Paracetamol - 550/box");
 jc.addItem("Crocin - 670/box");
 jc.addItem("JEXID - 130/box");
 jc.addItem("Etofit - 1150/pack");
 f1.add(jc);
 
 b1.addActionListener(this);
 f1.add(b1);
 f1.setLayout(null);
 f1.setVisible(true);
 JLabel price = new JLabel("Price");
 price.setBounds(30,130,100,30);
 f1.add(price);
 price.setFont(myfont2);
 JLabel quantity = new JLabel("Quantity");
 quantity.setBounds(30,190,100,30);
 f1.add(quantity);
 quantity.setFont(myfont2);
 tf = new JTextField();
 tf.setBounds(200,130,240,30);
 f1.add(tf);
 tf1 = new JTextField();
 tf1.setBounds(200,190,240,30);
 f1.add(tf1);
 add = new JButton("Add");
 add.setBounds(370,470,80,40);
 f1.add(add);
 order = new JButton("Order");
 order.setBounds(270,470,80,40);
 f1.add(order);
 add.addActionListener(this);
 order.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e)
 {
 if(e.getSource()==b1)
 {
 f1.dispose();
 new MediStore();
 }
 if(e.getSource()==add)
 {
 int sum=0;
 try {
 int a = Integer.parseInt(tf.getText());
 int b = Integer.parseInt(tf1.getText());
 int c = a * b;
 sum=sum+c;
 MediStore.TotalPrice = MediStore.TotalPrice + c;
 System.out.println(MediStore.TotalPrice);
 }
 catch(NumberFormatException ne)
 {
 }
 MediStore.msg = MediStore.msg + jc.getSelectedItem() + " * "+ tf1.getText()+ " = "+sum+"\n";
 System.out.println(MediStore.msg);
 tf.setText("");
 tf1.setText("");
 }
 if(e.getSource()==order)
 {
 MediStore.msg=MediStore.msg+"-------------------------------
"+"\n"+"Total price is : "+MediStore.TotalPrice;
 System.out.println(MediStore.msg);
 new billsystem();
 }
 }
}
