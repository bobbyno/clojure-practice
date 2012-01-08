(ns euler.primes)

(defn is-prime [x]
  (or (= x 2) (not-any? #(zero? (rem x %)) (range 2 (inc (Math/sqrt x))))))

(defn nth-prime [n]
  (nth (filter #(is-prime %) (iterate inc 1)) n))

(defn sum-primes-below [n]
  (reduce + (filter #(is-prime %) (range 2 n))))