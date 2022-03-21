import java.util.Scanner;

class App extends Files{

  public static void main(String [] args){

    Scanner scan = new Scanner(System.in);
    Files files = new Files();
    new Files().OpenM();

    for(int x=0; x<3;x++){

      if(x>0){
        System.out.println(x+"/2 attempts left");
      }

      System.out.println("Enter Username:");
      String username = scan.nextLine();

      System.out.println("Enter Password:");
      String password = scan.nextLine();

        if(username.equals(files.name)&&password.equals(files.pass)){

          System.out.println(files.name+" signed in");
          break;
        }else{
          if(x==2){
            System.out.println("ACCOUNT BLOCKED");
            break;
          }
          System.out.println("incorrect password");
         }
        }


  }
}
