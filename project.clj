(defproject mvxcvi/arrangement "2.0.1-SNAPSHOT"
  :description "Total-order comparator for Clojure(Script)."
  :url "https://github.com/greglook/clj-arrangement"
  :license {:name "Public Domain"
            :url "http://unlicense.org/"}

  :deploy-branches ["main"]

  :aliases
  {"kaocha" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner"]
   "coverage" ["with-profile" "+test,+coverage" "cloverage"]}

  :profiles
  {:dev
   {:dependencies
    [[org.clojure/clojure "1.11.1"]
     [org.clojure/clojurescript "1.11.60"]
     [org.clojure/test.check "1.1.1"]
     [criterium "0.4.6"]]}

   :kaocha
   {:dependencies
    [[lambdaisland/kaocha "1.71.1119"]
     [lambdaisland/kaocha-cljs "1.4.130"]]}

   :coverage
   {:plugins [[lein-cloverage "1.2.4"]]
    :dependencies [[org.clojure/tools.reader "1.3.6"]]}})
