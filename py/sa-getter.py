import subprocess

for i in range(1,341):
    sUrl = "http://forums.somethingawful.com/showthread.php?threadid=3376083&userid=0&perpage=40&pagenumber=" + str(i)
    proc = subprocess.call(['wget', '-nc', sUrl])

