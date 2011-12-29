(ns euler.test.one
  (:use [euler.one])
  (:use [clojure.test]))

; http://projecteuler.net/problem=1

(deftest problem
  (testing "sum of natural numbers below x that are multiples of 3 or 5"
    (is (= 23 (calc 10)))
    (is (= 233168 (calc 1000)))))