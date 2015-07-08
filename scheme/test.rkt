#lang planet neil/sicp

(define (abs x)
        (cond ((> x 0) x)
              ((< x 0) (- x))
              ((= x 0) x)))

