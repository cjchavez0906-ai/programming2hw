    import java.awt.*;
    import javax.swing.*;

            public class SimpleFrame extends JFrame
            {
                public  SimpleFrame()
                {
                    this.setSize(500,500);
                    this.setLocation(500, 500);
                    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    JLabel label = new JLabel("Hello, I'm Clint Jude Chavez from BSIT 1a!!!");
                    label.setHorizontalAlignment(JLabel.CENTER);
                    label.setVerticalAlignment(JLabel.CENTER);
                    this.add(label);
                }
                public void showIt(){
                    this.setVisible(true);

                }
                public void showIt(String Title){
                    this.setTitle(Title);
                    this.setVisible(true);

                }
                public void showIt(String title,int x,int y){
                    this.setTitle(title);
                    this.setLocation(x,y);
                    this.setVisible(true);

                }
                public void hideIt(){
                    this.setVisible(false);
                }

            }