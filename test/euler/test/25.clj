(ns euler.test.25
  (:use [clojure.test] 
        [euler.fibs]))


(deftest test-fib-with-term-sized
  (is (= 12 (fib-with-term-sized 3)))
  (is (= 45 (fib-with-term-sized 10)))
  (is (= 476 (fib-with-term-sized 100)))
)