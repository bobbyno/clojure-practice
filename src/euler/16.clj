(ns euler.16)

(defn two-str 
  "Represent the value of raising 2 to the given power as a string with no loss of precision"
  [n]
  (.toPlainString (BigDecimal. (Math/pow 2 n))))

(defn sum-digits [n]
  (reduce + (map #(Integer/parseInt (str %)) (seq (two-str n)))))