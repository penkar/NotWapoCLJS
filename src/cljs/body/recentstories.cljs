(ns notwapo.recentstories
  (:require [notwapo.stories :as stories]))

(defn main []
  [:ul.recent-sectional
    [:li.label "In the News"]
    (for [story stories/articles]
      ^{:key story}[:li.recent-sectional-title
        [:a {:href (str "#" (:id story))} (:title story)] ]) ])
