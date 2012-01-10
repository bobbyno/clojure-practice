(ns euler.test.16
  (:use euler.16
		euler.common
        clojure.test))

(deftest test-two-str
  (is (= "1024" (two-str 10)))
  (is (= "1267650600228229401496703205376" (two-str 100)))
)

(deftest test-sum-digits
  (is (= 26 (sum-digits (two-str 15))))
  (is (= 1366 (sum-digits (two-str 1000))))
)
