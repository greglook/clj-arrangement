(ns arrangement.core-test
  (:require
    #?(:clj [clojure.test :refer :all]
       :cljs [cljs.test :refer-macros [deftest is testing]])
    [arrangement.core :as order]))


(defn- is-sorted
  [& values]
  (dotimes [_ 10]
    (is (= values (sort order/rank (shuffle values))))))


(deftest primitive-ordering
  (is-sorted
    nil false true 0 \a "a" :a 'a))


(deftest number-ordering
  (is-sorted
    -123 0.0 3.14159M #?(:clj 37/8) 4096N))


(deftest string-ordering
  (is-sorted
    "alpha" "alphabet" "beta" "omega"))


(deftest keyword-ordering
  (is-sorted
    :foo :zap :a-ns/baz :my-ns/bar))


(deftest symbol-ordering
  (is-sorted
    'x 'y 'aaa/foo 'z/bar))


(deftest sequence-ordering
  (is-sorted
    '(1 2 3) [1 2 3] [1 2 3 4] [1 2 4] [1 \2 "3"] [\1] #{\1}))


(deftest set-ordering
  (is-sorted
    #{:one} #{:two} #{:zzz} #{:one :two} #{:one :zzz} #{:a :e :f} #{:b :c :d}))


(deftest map-ordering
  (is-sorted
    {:a 1 :b 2} {:a 1 :b 8.0 :c 'x} {:a 1 :b :*} {:x 1 :y 2}))


(deftest class-ordering
  #?(:clj
      (is-sorted
        (java.util.Currency/getInstance "JPY")
        (java.util.Currency/getInstance "USD")
        (java.util.Date. 1234567890)
        (java.util.Date. 1234567891))
     :cljs
      ; TODO: cljs type tests
      []))
