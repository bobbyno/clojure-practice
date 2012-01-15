(ns euler.test.9
  (:use clojure.test
		euler.9))
		
(deftest test-pythagorean-triples
  (is (= 60  (triple-value 12)))
  (is (= 480 (triple-value 24)))
)