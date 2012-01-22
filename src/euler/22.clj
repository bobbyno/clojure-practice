(ns euler.22
  (:require [clojure.java.io :as io]
			[clojure.string :as string]))

(defn name-value [x]
  (+ (reduce + (map #(- (int %) 64) (seq x))) 60))

(defn read-names []
  (sort (string/split (slurp (io/resource "names.txt")) #",")))

(defn score []
  (reduce + (map-indexed #(* (inc %1) %2) (map #(name-value %) (read-names)))))
  