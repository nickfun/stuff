#!/usr/bin/env python
import pika
import random
import time

random.seed()
num = random.randint(0,100)

connection = pika.BlockingConnection(pika.ConnectionParameters(host='localhost'))
channel = connection.channel()

channel.queue_declare(queue='hello')

print ' [*] Waiting for message. Use ctrl-C to exit. A number is %d' % (num,)

def callback(ch, method, prop, body):
    rnum = body.count('.')
    print " [*] Received Message! `%r` now sleep %d seconds" % (body,rnum)
    time.sleep(rnum)
    #print " [*] Sleep is over!"

channel.basic_consume(callback, queue='hello',no_ack=True)

channel.start_consuming()

