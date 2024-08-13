import java.io.*;
import java.awt.*;

public class studentfile extends Frame
{
    //Defining Window Components
    TextField number, name, marks;
    Button Done, Enter;
    Label numLabel, nameLabel, markslabel;
    DataOutputStream dos;

    //Initialize the Frame
    public studentfile(){
        super("Create Student File");
    }

    public void setup(){
        resize(400, 200);
        setLayout(new GridLayout(4, 2));
        // setVisible(true);

        // Create the Components of the frame
        number=new TextField(25);
        // number=new TextField(25);
        numLabel=new Label("Roll Number");
        name=new TextField(25);
        nameLabel=new Label("Student Name");
        marks=new TextField(25);
        markslabel=new Label("Marks");
        Done=new Button("Done");
        Enter=new Button("Enter");
        add(numLabel);
        add(number);
        add(nameLabel);
        add(name);
        add(markslabel);
        add(marks);
        add(Enter);
        add(Done);

        add WindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        Enter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    dos=new DataOutputStream(new FileOutputStream("student.dat", true));
                    dos.writeUTF(number.getText());
                    dos.writeUTF(name.getText());
                    dos.writeUTF(marks.getText());
                    dos.close();
    }catch(Exception ex){
        System.out.println(ex);
    }
            }
        });
        Done.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });
    }
    public static void main(String[] args) 
    {
        new studentfile();
    }
}