(ns euler.test.13
  (:use clojure.test
		euler.13))

(deftest test-first-ten-of-sum
  (is (= "5537376230" (first-ten)))
)