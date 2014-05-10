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

(> 5 2)
(> 30 300)
(eq 4 nil)
(eq nil ())
