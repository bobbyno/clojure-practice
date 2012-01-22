(ns euler.test.22
  (:use clojure.test
        euler.22))

(deftest test-score
  (is (= 871198282 (score)))
)