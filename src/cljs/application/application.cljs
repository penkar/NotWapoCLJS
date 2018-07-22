(ns notwapo.application
    (:require [notwapo.header :as h]))

(defn application []
  (print "hello");
  [:span
    [h/header]])
