package info.developia.tesstable;

import info.developia.tesstable.controller.UserController;

import static spark.Spark.get;

public class Launcher {

    private static UserController userController = new UserController();

    public static void main(String[] args){
        String email = "johndoe@user.info";
        get("/hello", (req, res) -> userController.getUser(email));
    }

}
