;
; M-x ielm (use for repl)
;

(setq data '("name" . "Nick"))
(car data)
(cdr data)

(setq data1 '("amy" "ben" "chad" "david" "emily" "frank" "gene" "hector"))
(setq data2 '("one" "two" "three" "four" "five"))

(defun printrr (x)
  (if (not x) (print "done")
    (progn
      (print (car x))
      (printrr (cdr x)))))

; This adds more line breaks than I expect :(
(printrr data1)
(printrr data2)



(setq max 100)
(setq i 0)
(setq buff '())
(while
    (< i max)
  (setq i (+ 1 i))
  (add-to-list 'buff (random 999)))

(print buff)

(printrr buff)

