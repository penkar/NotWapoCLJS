(ns notwapo.application
    (:require [reagent.core :as r :refer [atom]]
              [notwapo.header :as h]
              [notwapo.tableofcontents :as toc]
              [notwapo.body :as b]))

(defonce application-state
  (atom {:open false :hash js/window.location.hash}))
(defn change-state [key value]
  (swap! application-state assoc key value))
(defn open-change []
  (swap! application-state assoc :open (not (:open @application-state))))
(defn hash-change [hash]
  (swap! application-state assoc :hash hash))

(defn Application []
  (let [open  (:open @application-state)
        hash  (:hash @application-state)
        props {:open open :hash hash :openchange open-change :hashchange hash-change}]
    [:span
      [h/main props]
      [toc/main props]
      [b/main props]]))
