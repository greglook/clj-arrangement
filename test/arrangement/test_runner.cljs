(ns arrangement.test-runner
  (:require-macros
    [doo.runner :refer [doo-tests]])
  (:require
    arrangement.core-test
    doo.runner))


(doo-tests
  'arrangement.core-test)
