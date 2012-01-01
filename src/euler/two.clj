(ns euler.two)

(defn calculate-fib 
  [first second k n]
  (if (= k n) 
    second
	(recur second (+ first second) (inc k) n)))

(defn fibonacci
  [n]
  (if (or (= n 0) (= n 1))
	n
    (calculate-fib 0 1 1 n)))