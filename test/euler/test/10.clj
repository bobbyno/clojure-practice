(ns euler.test.10
  (:use [euler.primes]
		[clojure.test]))

(deftest test-sum-primes-below
  (is (= 17 (sum-primes-below 10)))
  (is (= 1060 (sum-primes-below 100)))
  (is (= 454396537 (sum-primes-below 1e5)))
)