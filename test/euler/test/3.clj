(ns euler.test.3
  (:use clojure.test
	    euler.3))

(deftest test-max-prime-factor
  (is (= 5 	  (slow-prime-factor 25)))
  (is (= 233  (slow-prime-factor 1631)))
  (is (= 29   (slow-prime-factor 13195)))
)

(deftest test-max-prime-factor
  (is (= 5 	  (first (prime-factors 25))))
  (is (= 233  (first (prime-factors 1631))))
  (is (= 29   (first (prime-factors 13195))))
)