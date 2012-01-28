(ns euler.test.11
  (:use clojure.test
		euler.11))

(deftest test-pythagorean-triples
  (is (= 7.0600674E7 (max-ldiags)))
)