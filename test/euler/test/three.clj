(ns euler.test.three
  (:use [clojure.test]
	    [euler.three]))

(deftest test-factors
  (is (= #{1} (factors 1)))
  (is (= #{1 2} (factors 2)))
  (is (= #{1 2 4} (factors 4)))
  (is (= #{1 2 5 10} (factors 10)))
  (is (= #{1 2 3 6 9 18} (factors 18)))
  (is (= #{1 2 3 4 6 9 12 18 36} (factors 36)))
)