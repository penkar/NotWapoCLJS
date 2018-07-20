(ns notwapo.header
  (:require [notwapo.newslink :as newslink]
            [reagent.core :as r]))


(def headerlinks ( list {:title "Politics" :link "#politics"}
                        {:title "Opinions" :link "#opinions"}
                        {:title "Sports" :link "#sports"}
                        {:title "Local" :link "#local"}
                        {:title "National" :link "#national"}
                        {:title "World" :link "#world"}
                        {:title "Business" :link "#business"}
                        {:title "Tech" :link "#tech"}
                        {:title "Lifestyle" :link "#lifestyle"} ))
(def alarmlink (list {:title "&#128276;" :link "#"}))

(defn header []
  (print (:title (first headerlinks)))
  [:div#header-row 
    [newslink/ul-news-link headerlinks]
    [newslink/ul-news-link alarmlink]])