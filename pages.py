# hello

def pages(cur,total,step):
    if cur < step:
        return range(0,step)
    if cur-step < 0:
        return range(cur,step)
    return None

tests = []

tests.append( pages(0,5,3))
tests.append( pages(2,5,3))
tests.append( pages(4,5,3))

for results in tests:
    print "%r" % results

print "Done"

            
