(ns euler.common
  (:use [incanter.stats]))

(defn arithmetic-series [n]
  (if (< n 0) (throw (ArithmeticException. "only supports natural numbers")))
  (* n (mean [n 1])))

(defn sum-digits [n]
  (reduce + (map #(Integer/parseInt (str %)) (seq n))))