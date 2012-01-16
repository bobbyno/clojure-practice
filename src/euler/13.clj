(ns euler.13
  (:require [clojure.string  :as string]
			[clojure.java.io :as io]))
			
(defn first-ten []
  (apply str (take 10 (str (reduce + (map bigint (string/split (slurp (.getFile (io/resource "numbers.txt"))) #"\n")))))))