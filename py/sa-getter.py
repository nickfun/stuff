import subprocess

for i in range(1,10):
    sUrl = "http://forums.somethingawful.com/showthread.php?threadid=3376083&userid=0&perpage=40&pagenumber=" + str(i)
    proc = subprocess.popen(['wget', sUrl])j

