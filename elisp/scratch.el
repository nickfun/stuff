'(hello world)

; form is used as a synonym for expresson and s-expression

;; numbers, symbols

'(hello world "hello world!")

(+ 2 3)

(this is an unqoted list. use C-x C-e at the end)
; press 'q' to close the debugger

(+ 2 (+ 3 3))

;; a symbol can have both a function and a value associated with it. these are seperate.

(concat "first"
	" "
	"last")

(substring "1234567890" 0 3)

;; note to self: tango-dark is a pretty good built-in theme :)
(quote hello)
(eq 'hello (quote hello))

(listp '(hello world my name is nick))
(eq nil ())
(eq t 1)

(message "Hello, %s!!" "nick")
(message "The current buffer is called '%s'" (buffer-name))

(set 'flowers '(rose violet daisy tuilp))

;; `set` vs `setq`
(set 'animals '(cat horse dog lion))
animals
(setq animals '(cat horse dog lion))
animals

;; done for today. Line 33 in pdf.    2014-05-09

"stuff, day two"
(> 5 2)
(> 30 300)
(eq 4 nil)
(eq nil ())
(setq counter 1)
(message "Counter is %d" counter)
(setq counter (+ counter 1))
(message "counter is now %d" counter)

(buffer-name)
(buffer-file-name)
(current-buffer)
(other-buffer)
(ido-switch-buffer)
(switch-to-buffer (other-buffer))


;; end saturday, 2014-05-10

switch-to-buffer ;; make a buffer the current buffer for the human operator to use
set-buffer ;; make a buffer active for emacs to manip via elisp code
(buffer-size)
(point)
(point-min)  ;; earliest position in the buffer we can edit?


;; special form: when a function does not evaluate its arguments in the normal way

(defun mult-by-7 (number)
  "Multiply given number by 7"   ; use `C-h f` to see the docs
  (* 7 number))

(mult-by-7 100)

;; parts of defun
;; 1 name of function
;; 2 argument list
;; 3 documentation -- optional
;; 4 (interactive) -- optional
;; 5 body of function

;; === page 44

;; zenburn theme
;; solarized theme
;; solarized-dark theme

;; 2014-07-05, I need a different place to learn elisp, I dont like the pdfx
