(ns euler.17)

; total shitshow...red, green, refactor, baby! 
; just need to make time for step 3...

(def numbers {
  1 "one"
  2 "two"
  3 "three"
  4 "four"
  5 "five"
  6 "six"
  7 "seven"
  8 "eight"
  9 "nine"
  10 "ten"
  11 "eleven"
  12 "twelve"
  13 "thirteen"
  14 "fourteen"
  15 "fifteen"
  16 "sixteen"
  17 "seventeen"
  18 "eighteen"
  19 "nineteen"})


(def teens (map #(numbers %) (range 1 20)))

(def mults ["twenty" "thirty" "forty" "fifty" "sixty" "seventy" "eighty" "ninety"])

; print 21 - 99
(def adults
  (flatten (for [x (range 8)] 
    (conj (map #(str (get mults x) (get numbers %)) (range 1 10))
		  (get mults x)))))
		
; merge these two generations to get 1 - 99		
(reduce + (map #(count %) (flatten (conj oldgen teens))))
=> 854
; this will appear 10 times up to 1000, contributing 8540

; account for all of the xhundredand values...
(reduce + (map #(count (str (get numbers %) "hundredand")) (range 1 10)))
=> 126
; each of these occurrences will happen 100 times, so this contributes 12600
; this counts 'and' too many times, however, so subtract 9 instances of 'and'...27
; add 11 for "onethousand"
; (+ 12600 8540 11 -27)