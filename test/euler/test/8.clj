(ns euler.test.8
  (:use [clojure.test]
		[euler.8]))
		
(deftest test-take-five
  (is (= 2 (take-five 1111111112)) )
)