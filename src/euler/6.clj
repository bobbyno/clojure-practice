(ns euler.6
  (:use [euler.common]))

(defn sum-squares [n]
 (/ (* n (inc (* 2 n)) (inc n)) 6))

(defn square-sums [n]
  (int (Math/pow (arithmetic-series n) 2)))

(defn diff-squares [n]
  (- (square-sums n) (sum-squares n)))