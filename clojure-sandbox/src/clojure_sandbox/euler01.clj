(ns clojure-sandbox.core)

(reduce + (filter (fn [x] (or (= (rem x 3) 0) (= (rem x 5) 0))) (range 1000)))