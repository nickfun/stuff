#
# Understanding the `watchdog` library
# Nick F - 2015-08-23
#
import sys
import time
import logging
from watchdog.observers import Observer
from watchdog.events import LoggingEventHandler

def bruno():
    # http://brunorocha.org/python/watching-a-directory-for-file-changes-with-python.html
    somehow_invoke_MyHandler_from_below()

 class MyHandler(PatternMatchingEventHandler):
    patterns = ["*.duplo.json"]

    def process(self, event):
        """
        event.event_type 
            'modified' | 'created' | 'moved' | 'deleted'
        event.is_directory
            True | False
        event.src_path
            path/to/observed/file
        """
        # the file will be processed there
        print event.src_path, event.event_type  # print now only for debug

    def on_modified(self, event):
        self.process(event)

# ==========================
# ==========================
# ==========================

def example():
    if __name__ == "__main__":
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
