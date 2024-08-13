class demons_57{
    public static void main(String[] args) throws java.io.IOException{
        char choice;
        do{
            System.out.println("-:HELP ON:-");
            System.out.println("1.if");
            System.out.println("2.switch");
            System.out.println("3.while");
            System.out.println("4.do-while");
            System.out.println("5.for\n");
            System.out.println("Choose one:");
            choice=(char)System.in.read();
        }while(choice<'1' || choice>'5');

        switch(choice){
            case '1':
            System.out.println("if-else statement");
            break;

            case '2':
            System.out.println("switch -case statement");
            break;

            case '3':
            System.out.println("while loop");
            break;

            case '4':
            System.out.println("do-while statement");
            break;

            case '5':
            System.out.println("for loop statement");
            break;
        }
    }
}