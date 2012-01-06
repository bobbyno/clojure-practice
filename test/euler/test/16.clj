(ns euler.test.16
  (:use [euler.16]
        [clojure.test]))

(deftest test-two-str
  (is (= "1024" (two-str 10)))
  (is (= "1267650600228229401496703205376" (two-str 100)))
)

(deftest test-sum-digits
  (is (= 26 (sum-digits 15)))
  (is (= 1366 (sum-digits 1000)))
)
