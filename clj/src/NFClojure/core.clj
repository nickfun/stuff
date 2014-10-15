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

(def myhash
  {:name "nick"
   :age 3456
   :place "SF Bay"
   :computer "laptop"})

(def myvec
  [1 2 3 4 5 6 7 8 9 10])

(defn four? [x] (= 0 (mod x 4)))

(defn x2 [x] (* 2 x))

(->>
  myvec
  (filter four?)
  (map x2))

(def blocks
  (-> "BO XK DQ CP NA GT" (.split " ") vec))

