(ns clj-workshop.core-test
  (:require [clojure.test :refer :all]
            [clj-workshop.core :refer :all]))

(deftest crazy-fun-test
  (testing "crazy-fun"
    (is (= 4 (crazy-fun 1 2)))
    (is (thrown? java.lang.RuntimeException (crazy-fun nil 2)))))