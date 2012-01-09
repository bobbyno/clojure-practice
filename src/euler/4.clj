(ns euler.4
  (:use [clojure.string]))

(defn limit [n]
  (range (int (Math/pow 10 (dec n))) (Math/pow 10 n)))

(defn candidates [n]
  (seq (set (for [x (limit n) y (limit n)] (* x y)))))

(defn palindromes [n]
  (last (sort (filter #(= (str %) (reverse (str %))) (candidates n)))))