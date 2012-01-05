(ns euler.three)

(defn factors [x]
  (loop [divisor (dec x) results (conj #{1} x)]
    (if (zero? divisor)
	  results
	  (if (zero? (rem x divisor))
	   	(recur (dec divisor) (conj results (/ x divisor) divisor))
		(recur (dec divisor) results)
))))