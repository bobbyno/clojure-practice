(ns euler.test.1
  (:use clojure.test
		euler.1
		euler.common))

(deftest test-arithmetic-series
  (is (thrown? ArithmeticException (arithmetic-series -1)))
  (is (= 0.0 (arithmetic-series 0)))
  (is (= 1.0 (arithmetic-series 1)))
  (is (= 3.0 (arithmetic-series 2)))
  (is (= 5050.0 (arithmetic-series 100)))
)

(deftest test-sum-divisible-by
  (is (= 18.0 (sum-divisible-by 3 10)))
  (is (= 5.0  (sum-divisible-by 5 10)))
  (is (= 30.0 (sum-divisible-by 5 20)))
)

; with the fast impl, all will run in essentially constant time
(deftest test-calc
  (testing "sum of natural numbers below x that are multiples of 3 or 5"
    (is (= 23.0 (time (fast-calc 10))))
    (is (= 233168.0 (time (fast-calc 1000))))
    (is (= 233333166668.0 (time (fast-calc 1e6))))    
    (is (= 23333331666668.0 (time (fast-calc 1e7))))
    (is (= 2333333316666668.0 (time (fast-calc 1e8))))
))