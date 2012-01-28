(ns euler.11
  (:require [clojure.java.io :as io]
			[clojure.string :as string])
  (:use [incanter.core]))

; TODO: dirty, 2AM solution. Replay!

(def read-grid
  ; split on newlines using multiline mode
  (map #(string/split (string/trim %) #"\s") 
	(string/split (slurp (io/resource "grid.txt")) #"(?m)$")))

(def the-matrix
  (matrix 
    (into [] (map (fn [x] (into [] (map #(Integer/parseInt %) x))) read-grid))))

(defn chooser [k n]
  (map #(partition k 1 %) n))

(defn rows []
  (chooser 4 the-matrix))

(defn cols []
  (chooser 4 (trans the-matrix)))

(defn diag-row [a x y n result op]
  (if (zero? n) 
   (reverse result)
   (diag-row a (op x) (inc y) (dec n) (conj result (sel a x y)) op)))

(defn diagonals []
  (let [n 20 k 4 lim (inc (- n k))]
    (for [x (range 0 lim) y (range 0 lim)]
      (diag-row the-matrix x y k '() inc))))

(defn ldiagonals []
  (let [n 20 k 4]
    (for [x (range 3 21) y (range 0 17)]
      (diag-row the-matrix x y k '() dec))))

(defn max-product []
  (letfn [(calc [x] (apply max (flatten (map (fn [quad] (map #(reduce * %) quad)) (take 20 (x))))))]
    (max (calc rows) (calc cols) )))

(defn max-diags []
  (apply max (flatten (map #(reduce * %) (diagonals)))))

(defn max-ldiags []
  (apply max (flatten (map #(reduce * %) (ldiagonals)))))
