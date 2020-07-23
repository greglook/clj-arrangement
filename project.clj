(defproject mvxcvi/arrangement "1.2.1"
  :description "Total-order comparator for Clojure(Script)."
  :url "https://github.com/greglook/clj-arrangement"
  :license {:name "Public Domain"
            :url "http://unlicense.org/"}

  :deploy-branches ["master"]

  :aliases
  {;"cljs:repl" ["run" "-m" "clojure.main" "dev/cljs_repl.clj"]
   "kaocha" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner"]
   "coverage" ["with-profile" "+test,+coverage" "cloverage"]}

  :profiles
  {:dev
   {:dependencies
    [[org.clojure/clojure "1.10.1"]
     [org.clojure/clojurescript "1.10.773"]
     [org.clojure/test.check "1.1.0"]
     [criterium "0.4.6"]]}

   :kaocha
   {:dependencies
    [[lambdaisland/kaocha "1.0.641"]
     [lambdaisland/kaocha-cljs "0.0-71"]]}

   :coverage
   {:plugins [[lein-cloverage "1.1.2"]]
    :dependencies [[org.clojure/tools.reader "1.3.2"]]}})
