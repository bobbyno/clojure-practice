(ns euler.test.14
  (:use clojure.test
		euler.14))
		
(deftest test-longest
  (letfn [(run-all [x]
	(map #(time (longest % x)) [memo-chain tco-chain seq-chain]))]
	  (is (= '(9 9 9) (run-all 10)))
	  (is (= '(97 97 97) (run-all 100)))
	  (is (= '(871 871 871) (run-all 1000)))
))


