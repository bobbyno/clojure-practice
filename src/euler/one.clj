(ns euler.one)

(defn calc
  [upper]
  (let [multiple? (fn [x] (or (zero? (mod x 3)) (zero? (mod x 5))))]
    (->> (range upper) 
         (filter multiple?) 
         (reduce +))))