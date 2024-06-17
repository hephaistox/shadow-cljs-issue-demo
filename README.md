# as-alias and aliased namespaced map litteral seem incompatible

Project demonstrates the use of two clojure features:

* Working separately but not combined in clojurescript
* Working separately AND combined in clojure.

The features are:

* Alias namespaced map litteral works:

```clojure
(println #::other-ns{:a 1})
;; #:other-ns{:a 1}
```

* So is `as-alias`:

```clojure
(ns core
  (:require
   [other-ns :as on]))
   
(println ::on/foo)
```

* But both together they are working in latest clojure but does not work with clojurescript `2.28.9`:

``` clojure
(ns core
  (:require
   [other-aliased-ns :as-alias on2]))

(println #::on2{:a 2})
```

`
