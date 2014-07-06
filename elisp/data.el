;
;
;

(setq data '("name" . "Nick"))
(car data)
(cdr data)

(setq data1 '("amy" "ben" "chad" "david" "emily" "frank" "gene" "hector"))

(defun printrr (x)
  (if (not x) (print "done")
    (progn
      (print (car x))
      (printrr (cdr x)))))

(printrr data1)
