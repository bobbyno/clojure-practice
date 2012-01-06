(ns euler.1
  (:use [clojure.math.numeric-tower]
		[euler.common]))

(defn sum-divisible-by
  [n upper]
  (let [p (floor (/ (dec upper) n))]
	(* n (arithmetic-series p))))
	
(defn fast-calc
  [upper]
  (- (+ (sum-divisible-by 3 upper) (sum-divisible-by 5 upper)) (sum-divisible-by 15 upper)))
