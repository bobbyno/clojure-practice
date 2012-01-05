(ns euler.test.two
  (:use [euler.two]
		[clojure.test]))

(deftest test-fibonacci-terms
  (is (= 0 (fibonacci 1)))
  (is (= 1 (fibonacci 2)))
  (is (= 1 (fibonacci 3)))
  (is (= 2 (fibonacci 4)))
  (is (= 3 (fibonacci 5)))
  (is (= 5 (fibonacci 6)))
  (is (= 4181 (fibonacci 20)))
)

(deftest test-fib-under
  (is (= '(0 1 1 2 3 5 8 13 21 34) (fib-values-under 50)))
)

(deftest test-fib-terms
  (is (= '(0 1 1 2 3 5 8 13 21 34) (k-fib-terms 10)))
)

(deftest test-sum-even-valued-terms-under
  (is (= 44 (sum-even-valued-terms-under 50)))
  (is (= 4613732 (sum-even-valued-terms-under 4e6)))
)