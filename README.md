Arrangement
===========

[![Build Status](https://travis-ci.org/greglook/clj-arrangement.svg?branch=master)](https://travis-ci.org/greglook/clj-arrangement)
[![codecov.io](https://img.shields.io/codecov/c/github/multiformats/clj-multihash.svg?style=flat-square&branch=develop)](https://codecov.io/github/multiformats/clj-multihash?branch=develop)
[![API codox](https://img.shields.io/badge/doc-API-blue.svg)](https://multiformats.github.io/clj-multihash/api/multihash.core.html)

A micro-library which provides a total-ordering comparator for Clojure values.

## Usage

Library releases are published on Clojars. To use the latest version with
Leiningen, add the following dependency to your project definition:

[![Clojars Project](http://clojars.org/mvxcvi/arrangement/latest-version.svg)](http://clojars.org/mvxcvi/arrangement)

In your code:

```clojure
=> (require '[arrangement.core :as order])

=> (sort order/rank
         ['a false 2 :b nil 3.14159 "c" true \d [3 2] #{:one :two} [3 1 2] #{:three}])
[nil false true 2 3.14159 \d "c" :b a [3 1 2] [3 2] #{:three} #{:one :two}]
```

## License

This is free and unencumbered software released into the public domain.
See the UNLICENSE file for more information.
