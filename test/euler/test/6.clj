(ns euler.test.6
  (:use clojure.test
	    euler.6))
	
(deftest test-sum-squares 
  (is (= 385 (sum-squares 10)))
)

(deftest test-square-sums
  (is (= 3025 (square-sums 10)))
)

(deftest test-diff
  (is (= 2640 (diff-squares 10)))
)