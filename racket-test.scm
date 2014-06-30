#lang planet neil/sicp

(define (square x) (* x x))

(define (abs x)
  (cond ((> x 0) x)
        ((= x 0) 0)
        ((< x 0) (- x))))

(define (mist z)
  (cond ((> z 100) 2)
        ((> z 50) 1)))