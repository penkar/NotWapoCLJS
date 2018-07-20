(ns notwapo.newslink
  (:require [reagent.core :as r]))


(defn button-news-link []
  [:div.news-button "HeaderRowComponent"])
  
(defn li-news-link []
  [:li.news-link-li "HeaderRowComponent"])
  
  

(defn ul-news-link [links]
  [:ul.news-link-ul
    ; (map #([li-news-link]) links)
    ])