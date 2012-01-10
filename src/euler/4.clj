(ns euler.4
  (:require [clojure.string :as string]))

(defn limit [n]
  (range (int (Math/pow 10 (dec n))) (Math/pow 10 n)))

(defn candidates [n]
  (seq (set (for [x (limit n) y (limit n)] (* x y)))))

(defn palindromes [n]
  (last (sort (filter #(= (str %) (string/reverse (str %))) (candidates n)))))