(defproject mvxcvi/arrangement "1.1.0-SNAPSHOT"
  :description "Total-order comparator for Clojure(Script)."
  :url "https://github.com/greglook/clj-arrangement"
  :license {:name "Public Domain"
            :url "http://unlicense.org/"}

  :deploy-branches ["master"]

  :plugins
  [[lein-cljsbuild "1.1.2"]
   [lein-doo "0.1.6"]]

  :cljsbuild
  {:builds [{:id "test"
             :source-paths ["src" "test"]
             :compiler {:output-dir "target/cljs/out"
                        :output-to "target/cljs/tests.js"
             :main arrangement.test-runner
             :optimizations :none}}]}

  :codox
  {:metadata {:doc/format :markdown}
   :source-uri "https://github.com/greglook/alphabase/blob/master/{filepath}#L{line}"
   :doc-paths [""]
   :output-path "doc/api"}

  :profiles
  {:dev {:dependencies
         [[org.clojure/clojure "1.7.0"]
          [org.clojure/clojurescript "1.7.170"]]}})
