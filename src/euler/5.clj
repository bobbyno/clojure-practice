(ns euler.5)

; brute force approach where I only consider the factors of 19

(defn divides [x]
  (= 10 (count (filter #(zero? (rem x %)) (range 11 21)))))

(defn factors []
  (take-while #(< % 4e9) (map #(* 19 %) (iterate inc 3.9e6))))

(first (filter #(divides %) (factors)))