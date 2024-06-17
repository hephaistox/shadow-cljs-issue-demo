(ns core
  (:require
   [other-ns :as on]
   [other-aliased-ns :as-alias on2]))

(println #:other-ns{:a 1})

(println ::on2/a)

(comment
  (println #::on2{:a 2})

; Uncommenting this one make compilation fail
  )
