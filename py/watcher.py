#
# Understanding the `watchdog` library
# Nick F - 2015-08-23
#
import sys
import time
import logging
from watchdog.observers import Observer
from watchdog.events import LoggingEventHandler
from watchdog.events import PatternMatchingEventHandler

class MyHandler(PatternMatchingEventHandler):
    patterns = ["*.duplo.json"]

#    def __init__(self, name):
#        self.name = name
#        print "name is {}".format(name)
#
    def process(self, event):
        # print now only for debug
        print "{}: {}".format(event.event_type, event.src_path)

    def on_modified(self, event):
        self.process(event)

def bruno():
    # http://brunorocha.org/python/watching-a-directory-for-file-changes-with-python.html
    path = "."
    event_handler = MyHandler("nick")
    observer = Observer()
    observer.schedule(event_handler, path, recursive=False)
    observer.start()
    try:
        while True:
            time.sleep(10)
    except KeyboardInterrupt:
        observer.stop()
    observer.join()
    print "\nDone?"
    

def example():
    logging.basicConfig(level=logging.INFO,
                        format='%(asctime)s - %(message)s',
                        datefmt='%Y-%m-%d %H:%M:%S')
    path = sys.argv[1] if len(sys.argv) > 1 else '.'
    event_handler = LoggingEventHandler()
    observer = Observer()
    observer.schedule(event_handler, path, recursive=True)
    observer.start()
    try:
        while True:
            time.sleep(1)
    except KeyboardInterrupt:
        observer.stop()
    observer.join()

if __name__ == '__main__':
    bruno()
