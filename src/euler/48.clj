(ns euler.48)

(defn pow [base exp]
  (letfn [(repow [base exp acc]
    (if (zero? exp)
      acc
    (recur base (dec exp) (* base acc) )))]
   (repow (bigdec base) exp 1)))

(defn geo-series [upper]
  (letfn [(exp [x acc]
    (if (= x 0)
      acc
    (recur (dec x) (+ acc (pow x x)))))]
  (exp upper 0)))


