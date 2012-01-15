(ns euler.3
  (:use euler.primes)
  (:require [clojure.math.numeric-tower :as math]))

; if a prime factor exists that is > than the square root of the number, 
; then there must be one < than the square root
	
(defn prime-factors [x]
  (let [limit (inc (Math/sqrt x))]
    (letfn [(factorize [x divisor factors]
      (if (> divisor limit)
		(if (> x 1)
		  (conj factors x)
		  factors)	
        (if (zero? (rem x divisor))
		  (recur (/ x divisor) divisor (conj factors divisor) )
		  (recur x (inc divisor) factors))))]
  (factorize x 2 `()))))


; I initially interpreted this problem to mean find the largest of the factors that are prime. 
; That turns out to be much harder than finding the first member of the prime factorization. :-P

(defn slow-prime-factor [x]
  (let [limit (math/floor (Math/sqrt x))]
    (letfn [(calc [champion candidates] 
 	  (let [challenger (first candidates)]
		(if (nil? challenger)
		  (if (zero? champion) x champion)
		  (if (zero? (rem x challenger))
		    (if (is-prime (/ x challenger))
		      (/ x challenger)
		      (recur challenger (rest candidates)))
		    (recur champion (rest candidates))))))]
	 (calc 0 (primes-below limit)))))