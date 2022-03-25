package group.project;
/*Create Registration Class in which you would have variables as email, userName and password that
have an access scope only within its own class. After creating an object of the class user should be able to
call methods and in each method separately pass values to set users email, username and password.
Requirements:
A.Valid email consider to be only yahoo
B.Valid userName and password cannot be empty and
should be of length larger than 6 characters. Also valid password cannot contain userName*/

public class Registration {
   private String email;
   private String userName;
   private String password;

   public void setEmail(String email){
       this.email=email;
       if(email.equals("yahoo.com")){
          System.out.println("valid email");
       }else{
          System.out.println("Valid email is only considered to be yahoo.com");
       }
   }
   public void setUserName(String userName) {
       this.userName=userName;
       if (userName.isEmpty()||userName.length() < 6) {
           System.out.println("username could not be empty or less than 6 characters");
       }
       else {
           System.out.println("valid username");
       }
   }
   public void password(String password){
       this.password=password;
       if(password.isEmpty()||password.length()<6||password.contains(userName)){

           System.out.println("password could not be empty or less than 6 characters or contain username");
       }else {
           System.out.println("valid password account registered");
       }
   }

   public static void main(String[] args) {
      Registration user=new Registration();
      user.setEmail("yahoo");
      user.setUserName("saminar");
      user.password("azlankhan");
   }


}
