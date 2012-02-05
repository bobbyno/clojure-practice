(ns euler.test.12
  (:use euler.12
        clojure.test))

; TODO: Convert to the optimized version described in Euler
(deftest test-first-triangle-with-div-under
  (is (= 28      (first-triangle-with-div-under 5)))
  (is (= 528     (first-triangle-with-div-under 20)))
  (is (= 2162160 (first-triangle-with-div-under 300)))
)