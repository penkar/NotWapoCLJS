(ns notwapo.recentstories
  (:require [notwapo.stories :as stories]))

(defn main [props]
  (let [hashchange (:hashchange props)]
    [:ul.recent-sectional
      [:li.label "In the News"]
      (for [story stories/articles]
        ^{:key story}[:li.recent-sectional-title
          [:a {:href (str "#" (:id story)) :onClick #(hashchange (:id story))} (:title story)] ]) ]))
