(defproject mvxcvi/arrangement "1.2.1"
  :description "Total-order comparator for Clojure(Script)."
  :url "https://github.com/greglook/clj-arrangement"
  :license {:name "Public Domain"
            :url "http://unlicense.org/"}

  :deploy-branches ["master"]
  ;:pedantic? :abort

  :aliases
  {"clj:test" ["do" ["check"] ["test"]]
   "cljs:check" ["with-profile" "+doo" "cljsbuild" "once"]
   "cljs:repl" ["run" "-m" "clojure.main" "dev/cljs_repl.clj"]
   "cljs:test" ["doo" "rhino" "test" "once"]
   "coverage" ["with-profile" "+test,+coverage" "cloverage"]}

  :plugins
  [[lein-cljsbuild "1.1.7"]
   [lein-doo "0.1.11"]]

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
    [[org.clojure/clojure "1.10.1"]
     [org.clojure/clojurescript "1.10.773"]
     [org.clojure/test.check "1.1.0"]
     [criterium "0.4.6"]]}

   :coverage
   {:plugins [[lein-cloverage "1.1.0"]]
    :dependencies [[org.clojure/tools.reader "1.3.2"]]}

   :doo
   {:dependencies
    [[doo "0.1.11"]]}})
