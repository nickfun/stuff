from flask import Flask
app = Flask(__name__)

#
# General Functions
#

def getData():
    data = {
        "frank@gmail.com": "123-123-123",
        "sam@yahoo.com": "321-321-321",
        "hello@runbox.com": "753-753-753",
    }
    return data

#
# Routes
#
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

@app.route("/mail/<key>")
def webProxyData(key):
    mydata = getData();
    return "<b>%s</b> : %s" % (key, mydata[key])

@app.route("/mail")
def webProxyDataKeys():
    mydata = getData()
    return keys(myData)

#
# Execute
#
if __name__ == "__main__":
    app.run(host='0.0.0.0')

print "OK!"
