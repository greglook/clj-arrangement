(defproject mvxcvi/arrangement "1.1.0"
  :description "Total-order comparator for Clojure(Script)."
  :url "https://github.com/greglook/clj-arrangement"
  :license {:name "Public Domain"
            :url "http://unlicense.org/"}

  :deploy-branches ["master"]

  :plugins
  [[lein-cljsbuild "1.1.2"]
   [lein-doo "0.1.6"]]

  :dependencies
  [[org.clojure/clojure "1.7.0"]]

  :cljsbuild
  {:builds [{:id "test"
             :source-paths ["src" "test"]
             :compiler {:output-dir "target/cljs/out"
                        :output-to "target/cljs/tests.js"
                        :main arrangement.test-runner
                        :optimizations :whitespace}}]}

  :profiles
  {:dev {:dependencies
         [[org.clojure/clojurescript "1.7.170"]]}})
