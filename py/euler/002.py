# Problem 2

class Fibber():
    database = []
    def __init__(self):
        Fibber.database[0] = 0
        Fibber.database[1] = 1

    def fib(self, x):
        if x in Fibber.database:
            return Fibber.database[x]
        value = fib(x-2) + fib(x-1)
        Fibber.database[x] = value
        return value

total = 0
i = 2
fib = Fibber()
while True:
    x = fib.fib(i)
    if x > 4000000:
        break
    total += x
    i += 2

print "Answer is {}".format(total)
