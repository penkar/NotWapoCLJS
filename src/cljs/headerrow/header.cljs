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
(def headerbuttons (list {:title "Search" :callback nil}
                         {:title "Sections \u2630" :callback nil}))

(def alarmlink (list {:title "\u237E" :link "#"}))

(defn header []
  [:div#header-row
    [newslink/ul-news-links headerlinks headerbuttons]
    [newslink/ul-news-links alarmlink nil]])
