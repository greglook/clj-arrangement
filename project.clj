(defproject mvxcvi/arrangement "1.1.1"
  :description "Total-order comparator for Clojure(Script)."
  :url "https://github.com/greglook/clj-arrangement"
  :license {:name "Public Domain"
            :url "http://unlicense.org/"}

  :deploy-branches ["master"]
  :pedantic? :abort

  :aliases
  {"cljs-test" ["doo" "phantom" "test" "once"]
   "coverage" ["with-profile" "+test,+coverage" "cloverage"]}

  :plugins
  [[lein-cljsbuild "1.1.7"]
   [lein-doo "0.1.8" :exclusions [org.clojure/clojurescript]]]

  :cljsbuild
  {:builds [{:id "test"
             :source-paths ["src" "test"]
             :compiler {:output-dir "target/cljs/out"
                        :output-to "target/cljs/tests.js"
                        :main arrangement.test-runner
                        :optimizations :whitespace}}]}

  :codox
  {:metadata {:doc/format :markdown}
   :source-uri "https://github.com/greglook/clj-arrangement/blob/master/{filepath}#L{line}"
   :output-path "target/doc/api"}

  :profiles
  {:dev
   {:dependencies
    [[org.clojure/clojure "1.8.0"]
     [org.clojure/clojurescript "1.9.946"]]}

   :coverage
   {:plugins [[lein-cloverage "1.0.10"]]
    :dependencies [[org.clojure/tools.reader "1.1.0"]]}})
