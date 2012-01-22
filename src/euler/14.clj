(ns euler.14)

; The memoized version
; user=> (time (count (memo-chain 10000)))
; "Elapsed time: 0.048 msecs"
; user=> (time (longest memo-chain 10000))
; "Elapsed time: 70.36 msecs"
(def memo-chain
  (memoize (fn [x] 
    (if (= x 1) 
      (list 1)
      (cons x 
        (memo-chain 
          (if (even? x) 
            (/ x 2) 
            (inc (* 3 x)))))))))
		
(defn longest [f upper-limit]
  (first (last (sort-by last (map #(vector % (count (f %))) (range 1 (inc upper-limit)))))))


; slower alternatives

; The Lazy Sequence version
; user=> (time (count (seq-chain 10000)))
; "Elapsed time: 8.273 msecs"
; user=> (time (longest seq-chain 10000))
; "Elapsed time: 1033.488 msecs"
(defn seq-chain [x]
  (letfn [(rule [y] (if (even? y) (/ y 2) (inc (* 3 y))))]
      (flatten (cons (take-while (partial not= 1) (iterate rule x)) '(1)) )))

; The TCO version
; user=> (time (count (chain 10000)))
; "Elapsed time: 0.032 msecs"
; user=> (time (longest chain 10000))
; "Elapsed time: 199.178 msecs"
(defn tco-chain [x]
  (letfn [(calc [results n]
    (if (= 1 n)
      (reverse (conj results 1))
	  (if (odd? n) 
        (recur (conj results n) (inc (* 3 n)))
        (recur (conj results n) (/ n 2)) 
		     )))]
	(calc '() x)))