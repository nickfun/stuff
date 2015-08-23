(use-modules (web server))
(use-modules (web request)
	     (web response)
	     (web uri))

(define (request-path-components request)
  (split-and-decode-uri-path (uri-path (request-uri request))))

(define (hello-hacker-handler request body)
  (display "got a request!\n")
  (if (equal? (request-path-components request)
	      '("hacker"))
      (values '((content-type . (text/plain)))
	      "Hello hacker!\n")
      (not-found request)))

(run-server hello-hacker-handler)
