(ns notwapo.header
  (:require [notwapo.newslink :as newslink]
            [reagent.core :as r]))

(def headerlinks (list {:title "Politics" :link "#politics"}
                       {:title "Opinions" :link "#opinions"}
                       {:title "Sports" :link "#sports"}
                       {:title "Local" :link "#local"}
                       {:title "National" :link "#national"}
                       {:title "World" :link "#world"}
                       {:title "Business" :link "#business"}
                       {:title "Tech" :link "#tech"}
                       {:title "Lifestyle" :link "#lifestyle"} ))

(def alarmlink (list {:title "\u237E" :link ""}))

(defn main [props]
  [:div#header-row
    [newslink/left-ul-news-links headerlinks props]
    [newslink/right-ul-news-links alarmlink props]])
