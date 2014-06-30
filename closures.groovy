// Groovy is fun
name = "Nick"
msg = "Hello, ${name}"

fnGreet = { println msg } // closure!
fnGreet();

//fnDouble = { it * 2 }
fnDouble = { x -> x * 2 }
start = [ 10, 100, 1000 ]
finish = start.collect(fnDouble)

println "START:"
for (i in start) {
	println i
}

println "FINISH:"
for (i in finish) {
	println i
}

