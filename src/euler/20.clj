(ns euler.20
  (:use euler.common))

(defn ! [x]
  (letfn [(factorial [x product]
    (if (zero? x)
      product
      (recur (dec x) (* x product))))]
    (factorial (bigint x) 1)))

(defn sum-! [x]
  (sum-digits (str (! x))))