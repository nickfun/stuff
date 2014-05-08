from flask import Flask
app = Flask(__name__)

@app.route("/")
def hello():
    str = ""
    num = 11
    while num>1:
        num = num - 1
        str = "%s %d " % (str, num)
    str = str + "\n"
    return str

if __name__ == "__main__":
    app.run(host='0.0.0.0')

print "OK!"
