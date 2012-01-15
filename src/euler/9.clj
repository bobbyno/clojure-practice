(ns euler.9)

(defn allnatural? [& x]
  (let [nums (seq x)]
	(= (count nums) (count (filter #(zero? (- (int %) %)) nums)))))


(defn triples [num]
	(for [a (range 1 (inc num)) 
	      b (range 1 (inc num)) 
		  :let [c (Math/sqrt (+ (* a a) (* b b)))]
		  :when (and (< a b c) 
				     (allnatural? a b c) 
					 (= (double (+ (* a a) (* b b))) (* c c)))] 
		[a b c]))
		
(defn triple-value [num]
  (int (reduce * (first (filter #(= num (int (reduce + %))) (triples num))))))