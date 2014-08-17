;; Learning Emacs
;;
;; May, 2014
;;
;; Resource: http://www.gnu.org/software/emacs/manual/pdf/eintr.pdf
;; other resource: http://daemianmack.com/magit-cheatsheet.html
;;


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

(defun mult-by-7 (number)
  "Multiply passed in number by seven"
  (*+ number number number number number number number ))

(defun mult-by-7 (num)
  "Multiply a number by seven, interactive :)"
  (interactive "p")  ;; "p" flag means pass a prefix argument
  (message "The result is %d" (* num 7)))

; interactive "p" -- pass in value with C-u <number>

; whats the benefit of (interactive) with no parameters???

; (let _var list_ _body_)
(let 
    ((w 1)
     x  ; x will get the `nil` value
     (y 3))
    (message "Hello %d %s %s" w x y))
;; the nil value should be treated as a string when used with (message)
w

; special forms: defun, let

; === page 50

(if (> 5 4)
    (message "Five is greater than four"))

(defun type-of-animal (property)
  "return type of animal as string, I think"
  (if (equal property 'fierce)
      "It is a Tiger!"
    "It is a Zebra!"))

(type-of-animal 'sleepy)
(type-of-animal 'fierce)
    
(if (> 4 5) ; if...
    (message "four is bigger than five") ; then...
  (message "five is bigger than four") ; else...
)

;; false is `nil`
;; anything other than `nil` is true!!

(if 0 (message "zero is true") (message "zero is false"))

;; point is current location of cursor
;; mark is a place that the cursor was at and the user wants to remember
;; `save-excursion` is function that remembers these things so we can
;; change the point/mark and later restore it to what the user had
;; save-excursion is a special form

;; this is fun: M-x nato-region
;;                  November-Alfqa-Tango-Oscar-Dash-Romeo-Echo-Golf-India-Oscar-November

(buffer-file-name)   ; returns `nil` if no file

(defun x2 (x) "doubles a given number" (interactive) (* 2 x))
(x2 3)

(setq name "Nick") 
; begin chapter 4

;; switch/case in elisp


(pcase (downcase system-name)
  ("hosaka" (message "You are on the new laptop"))
  ("wintermute" (message "You are on the old laptop"))
  ("corto" (message "You are on the desktop"))
  ("dualscar" (message "You are on the VPS"))
  (_ (message "I don't know what computer you are on")))


