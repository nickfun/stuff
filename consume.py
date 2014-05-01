#!/usr/bin/env python
import pika

connection = pika.BlockingConnection(pika.ConnectionParameters(host='localhost'))
channel = connection.channel()

channel.queue_declare(queue='hello')

print ' [*] Waiting for message. Use ctrl-C to exit'

def callback(ch, method, prop, body):
    print " [*} Received Message! `%r`" % (body,)

channel.basic_consume(callback, queue='hello',no_ack=True)

channel.start_consuming()

