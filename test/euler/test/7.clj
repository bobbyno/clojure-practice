(ns euler.test.7
  (:use [clojure.test]
		[euler.primes]))
		

(deftest test-is-prime
  (is (true?  (is-prime 2)))
  (is (true?  (is-prime 3)))
  (is (true?  (is-prime 5)))
  (is (true?  (is-prime 7)))
  (is (true?  (is-prime 31)))
  (is (false? (is-prime 30)))
)

(deftest test-nth-prime
  (is (= 13  	(nth-prime 6)))
  (is (= 541 	(nth-prime 100)))
  (is (= 224737 (nth-prime 20000)))
)