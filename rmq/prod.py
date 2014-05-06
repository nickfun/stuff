#!/usr/bin/env python
import pika
import time
import random

random.seed()

connection = pika.BlockingConnection(pika.ConnectionParameters(
        host='localhost'))
channel = connection.channel()

channel.queue_declare(queue='hello')

def send(seq):
    msg = "Hello world! (%d) %s" % (seq, "." * random.randint(1,4))
    channel.basic_publish(exchange='',
                          routing_key='hello',
                          body=msg)
    print " [x] Sent %r" % msg

x=20
while x > 0:
    send(x)
    x = x-1

connection.close()

print " [x] Done sending!"

