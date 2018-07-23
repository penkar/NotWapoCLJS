(ns notwapo.application
    (:require [reagent.core :as reagent :refer [atom]]
              [notwapo.header :as h]
              [notwapo.tableofcontents :as toc]
              [notwapo.body :as body]))

(defonce open (atom false))
(defn openchange []
  (swap! open not))
  
(defn application []
  (let [props {:open @open :openchange openchange}]
    [:span
      [h/header props]
      [toc/tableofcontents props]
      [body/main props]]))
