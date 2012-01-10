(ns euler.test.20
  (:use clojure.test
	    euler.common
	    euler.20))
	
(deftest test-!
  (is (= 1 (! 0)))
  (is (= 1 (! 1)))
  (is (= 6 (! 3)))
)

(deftest test-sum-!
  (is (= 27 (sum-! 10)))
  (is (= 648 (sum-! 100)))
)