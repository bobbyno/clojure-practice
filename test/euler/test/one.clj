(ns euler.test.one
  (:use [euler.one])
  (:use [clojure.test]))

; http://projecteuler.net/problem=1

(deftest problem
  (testing "sum of natural numbers below x that are multiples of 3 or 5"
    (is (= 23 (time (calc 10))))
    (is (= 233168 (time (calc 1000))))
    (is (= 233333166668 (time (calc 1e6))))
    (is (= 23333331666668 (time (calc 1e7))))
	; one billion will take almost 2 mins in the current impl!
	; (is (= 233333333166666668 (time (calc 1e9))))
))

; target=999
; Function SumDivisibleBy(n)
;  p=target div n
;  return n*(p*(p+1)) div 2
; EndFunction
; Output SumDivisibleBy(3)+SumDivisibleBy(5)-SumDivisibleBy(15) 