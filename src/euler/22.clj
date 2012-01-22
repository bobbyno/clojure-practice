(ns euler.22
  (:require [clojure.java.io :as io]
			[clojure.string :as string]))

(defn name-value [x]
  (+ (reduce + (map #(- (int %) 64) (seq x))) 60))

(defn read-names []
  (sort (string/split (slurp (io/resource "names.txt")) #",")))

(defn score []
  (let [values (into [] (map #(name-value %) (read-names)))]
     (reduce + 
       (for [x (range 1 (inc (count values)))]
         (* x (get values (dec x)))))))