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

(defn fibonacci-seq 
  []
  (let [infinity (iterate #(inc %) 0)]
	(map fibonacci infinity)))

(defn fib-values-under
  [max]  
  (take-while #(< % max) (fibonacci-seq)))

(defn k-fib-terms
  [k]
  (take k (fibonacci-seq)))

(defn sum-even-valued-terms-under
  [n]
  (reduce + (filter even? (fib-values-under n))))