(ns fibonacci-challenge.core)

;; [1 2 2 4 8 32 256 8192]

;; Imagine an infinite series of integers each one is calculated by
;; F(N) = F(N-1) * F(N-2), with F(0) = 1 and F(1) = 2 where N is the
;; position in series. Write a function which, given N, prints F(N).
 (require '[clojure.test :as t :refer [is]])

#_(defn multi-fib
  [n]
  (cond
    (<= n 0) 1
    (= n 1) 2
    :else
    (let [mf-1 (multi-fib (dec n))
          mf-2 ]
      (* val (multi-fib (- n 2))))))

(defn multi-fib 
  [n]
  (cond
    (<= n 0) 1
    (= n 1) 2
    :else
    (loop [n n
           _last 2
           _last-1 1]
      (if (= n 0)
        _last        
        (recur (dec n)
               (* (multi-fib (dec n))
                  (multi-fib (- n 2)))
                _last)
        )))
  
  
  )

(t/deftest of-zero
  (is (= 1 (multi-fib 0))))

(t/deftest of-one
  (is (= 2 (multi-fib 1))))

(t/deftest of-two
  (is (= 2 (multi-fib 2))))

(t/run-tests)
