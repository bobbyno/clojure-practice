(ns euler.test.two
  (:use [euler.two]
		[clojure.test]))
		
; http://projecteuler.net/problem=2		

(deftest test-fibonacci
  (is (= 0 (fibonacci 0)))
  (is (= 1 (fibonacci 1)))
  (is (= 1 (fibonacci 2)))
  (is (= 2 (fibonacci 3)))
  (is (= 3 (fibonacci 4)))
  (is (= 5 (fibonacci 5)))
  (is (= 6765 (fibonacci 20)))
)