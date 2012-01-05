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

(deftest test-prime
  (is (false? (prime? 1)))
  (is (false? (prime? 10)))
  (is (prime? 13))
)

(deftest test-prime-factors
  (is (= #{2 3 13} (prime-factors 78)))
  (is (= #{5 7 13 29} (prime-factors 13195)))
)

(deftest test-greatest-prime-factor
  (is (= 13 (greatest-prime-factor 78)))
  (is (= 29 (greatest-prime-factor 13195)))
)