package gs.nick;

import static spark.Spark.*;

import spark.*;

public class Index {

    public static void main(String[] args) {
        System.out.println("Define: GET /");
        get( new Route("/") {
                @Override
                public Object handle(Request req, Response res) {
                    System.out.println("A request to / is happening");
                    return "Hello, world!";
                }
            }
            );
        // the end?
    }
}

