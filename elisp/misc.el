(point)
(point-max)
(point-min)
(point)

;; from Xah
(defun insert-p-tag ()
  "Insert the <p> tag where the cursor is"
  (interactive) ;; no argument to interactive?
  (insert "<p></p>")
  (backward-char 4))



