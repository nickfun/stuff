from flask import Flask
app = Flask(__name__)

@app.route("/")
def index():
    str = ""
    num = 11
    while num>1:
        num = num - 1
        str = "%s %d " % (str, num)
    str = "The http body is " + str + "\n"
    return str

@app.route("/hello")
def hello():
    return "I am static"

@app.route("/msg/<s>")
def msg(s):
    return "Your message is <b>%s</b><br>I hope you enjoyed the message!" % s

if __name__ == "__main__":
    app.run(host='0.0.0.0')

print "OK!"
