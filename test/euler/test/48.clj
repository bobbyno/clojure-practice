(ns euler.test.48
  (:use clojure.test
		euler.48))
		
(deftest test-geo-series
  (is (= 10405071317M (geo-series 10)))
)