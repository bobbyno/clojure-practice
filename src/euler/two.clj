(ns euler.two)

; from Programming Clojure, p. 157
(defn fibonacci-seq []
  (map first (iterate (fn [[a b]] [(bigint b) (bigint (+ a b))]) [0 1])))

(defn fib-values-under [max]  
  (take-while #(< % max) (fibonacci-seq)))

(defn k-fib-terms [k]
  (take k (fibonacci-seq)))

(defn sum-even-valued-terms-under [n]
  (reduce + (filter even? (fib-values-under n))))

(defn fibonacci [k]
  (last (take k (fibonacci-seq))))

