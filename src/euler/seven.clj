(ns euler.seven)

(defn is-prime [x]
  (or (= x 2) (not-any? #(zero? (rem x %)) (range 2 (inc (Math/sqrt x))))))

(defn nth-prime [n]
  (nth (filter #(is-prime %) (iterate inc 1)) n))