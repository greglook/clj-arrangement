Change Log
==========

All notable changes to this project will be documented in this file, which
follows the conventions of [keepachangelog.com](http://keepachangelog.com/).
This project adheres to [Semantic Versioning](http://semver.org/).

## [Unreleased]

...


## [2.0.0] - 2021-03-24

This is release changes how sets and maps are ranked, which is why it's getting
a new major version. If you rely on the ordering produced by earlier versions,
you should evaluate how the changes will impact you.

### Fixed
- Sets are sorted recursively using `rank` before being compared.
  [#4](https://github.com/greglook/clj-arrangement/issues/4)

### Changed
- Maps are first ordered by cardinality, then by element, matching sets.
  [#2](https://github.com/greglook/clj-arrangement/issues/2)


## [1.2.1] - 2020-07-23

### Changes
- Sort same-sized sets before comparing their elements.


## [1.2.0] - 2019-03-16

### Changes
- Various minor performance optimizations.


## [1.1.1] - 2017-11-04

### Changes
- Migrate from TravisCI to CircleCI.


## [1.1.0] - 2016-03-09

### Changes
- Migrate to cross-compiled `cljc` code to support ClojureScript usage.


## 1.0.0 - 2015-10-01

Initial project release.


[Unreleased]: https://github.com/greglook/blocks/compare/2.0.0...HEAD
[2.0.0]: https://github.com/greglook/blocks/compare/1.2.1...2.0.0
[1.2.1]: https://github.com/greglook/blocks/compare/1.2.0...1.2.1
[1.2.0]: https://github.com/greglook/blocks/compare/1.1.1...1.2.0
[1.1.1]: https://github.com/greglook/blocks/compare/1.1.0...1.1.1
[1.1.0]: https://github.com/greglook/blocks/compare/1.0.0...1.1.0
