(ns euler.three
  (:use [clojure.set]))

(defn factors [x]
  (loop [divisor (dec x) results (sorted-set 1 x)]
    (if (zero? divisor)
	  results
	  (if (zero? (rem x divisor))
	   	(recur (dec divisor) (conj results (/ x divisor) divisor))
		(recur (dec divisor) results)))))

(defn prime? [x]
  (and (> x 1) (= #{1 x} (factors x))))

(defn prime-factors [x]
  (select prime? (factors x)))

(defn greatest-prime-factor [x]
  (last (prime-factors x))
)

