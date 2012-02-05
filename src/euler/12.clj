(ns euler.12
  (:use euler.common))

(def triangle-series
  (map #(arithmetic-series %) (iterate inc 1)))

(defn divisors [n]
  (letfn [(calc [k n limit results]
    (if (>= k limit) 
      results
      (if (zero? (rem n k))
        (recur (bigint (inc k)) (bigint n) (bigint (/ n k)) (conj results k (bigint (/ n k))))
        (recur (bigint (inc k)) (bigint n) limit results))))]  
  (sort (distinct (calc 2 (bigint n) (bigint n) [1 (bigint n)])))))

(defn first-triangle-with-div-under [n]
  (int (first (drop-while #(> (bigint n) (count (divisors %))) triangle-series))))