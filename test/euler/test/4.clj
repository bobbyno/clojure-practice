(ns euler.test.4
  (:use [clojure.test]
		[euler.4]))
		
(deftest test-find-palindromes
  (is (= 9009 (palindromes 2)))
)