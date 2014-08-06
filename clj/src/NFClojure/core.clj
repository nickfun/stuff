(ns NFClojure.core)

(defn whoami [] "I am Nick F")

(defn -main [] (println (whoami)))

(defn inc-more [nums]
  (if (first nums)
    ; nums is a list
    (cons (inc (first nums))
          (inc-more (rest nums)))
    ; ELSE: nums is empty, return empty list
    (list)))
