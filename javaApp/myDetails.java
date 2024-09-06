public class myDetails {
    String userName;
    int userAge;
    boolean isUserDisble;
    String userCarrer;
    boolean isUserHasAFamily;


    void tellAboutUser() {
        System.out.println(this.userName + " is " + this.userAge +" years old");
        System.out.println("The marrige status is " + this.isUserHasAFamily);
        System.out.println(this.userName + " is a " + this.userCarrer);
        System.out.println("Status of disability is " + this.isUserDisble);
    }
}
