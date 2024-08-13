public class demons_431{

    public static void main(String[] args){
        for(String val:args){
            System.out.println("Argument: "+val);
            if(isInteger(val)){
                int a=Integer.parseInt(val);
                System.out.println(a);
            }else if(isBoolean(val)){
                System.out.println("Type: Boolean\nCAN'T PRINT IT'S INTEGER VALUE!\n");
            }else if(isDouble(val)){
                System.out.println("Type: Double\nCAN'T PRINT IT'S INTEGER VALUE!\n");
            }else{
                System.out.println("Type: String\nCAN'T PRINT IT'S INTEGER VALUE!\n");
            }
            
        }
    }


static boolean isInteger(String arg){
    try{
        Integer.parseInt(arg);
        return true;
    }catch(NumberFormatException e){
        return false;
    }
}

static boolean isBoolean(String arg){
    return "true".equalsIgnoreCase(arg) || "false".equalsIgnoreCase(arg);
}

static boolean isDouble(String arg){
    try{
        Double.parseDouble(arg);
        return true;
    }catch(NumberFormatException e){
        return false;
    }
}
}