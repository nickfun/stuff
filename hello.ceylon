"following tutorial - hello world"
shared void hello(String name="world") {
       print("Hello, ``name``!");
}

"The thing that runs"
shared void run() {
       if (nonempty args=process.arguments) {
          for( arg in args) {
                    hello(arg)
}}}