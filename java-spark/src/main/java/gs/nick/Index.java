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

        get( new Route("/test") {
                @Override
                public Object handle(Request req, Response res) {
                    System.out.println("Request: /test");
                    return "<h1>This is the <code>/test</code> resource</h1>";
                }
            });
        // end route defintions
        after( new Filter("/") {
                @Override
                public void handle(Request req, Response res) {
                    res.header("x-x-powered-by","SparkWeb - after filter /");
                }
            });
        after( new Filter() {
                @Override
                public void handle(Request req, Response res) {
                    res.header("x-nickfun","This filter should match all requests");
                }
            });
        // done
    }
}

