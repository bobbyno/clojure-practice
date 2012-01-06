(ns euler.1
  (:use [incanter.stats]
        [clojure.math.numeric-tower]))

(defn arithmetic-series [n]
  (if (< n 0) (throw (ArithmeticException. "only supports natural numbers")))
  (* n (mean [n 1])))

(defn sum-divisible-by
  [n upper]
  (let [p (floor (/ (dec upper) n))]
	(* n (arithmetic-series p))))
	
(defn fast-calc
  [upper]
  (- (+ (sum-divisible-by 3 upper) (sum-divisible-by 5 upper)) (sum-divisible-by 15 upper)))
