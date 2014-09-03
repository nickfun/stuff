import static spark.Spark.*;

import spark.*;

public class Index {

    public static void main(String[] args) {
        get( new Route("/") {
                @Override
                public Object handle(Request req, Response res) {
                    return "Hello, world!";
                }
            }
            );
        // the end?
    }
}

