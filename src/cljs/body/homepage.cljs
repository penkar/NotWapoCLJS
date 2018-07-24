(ns notwapo.homepage
  (:require [notwapo.stories :as stories]))

(defn main [hash]
  (print (:hash hash));
  (if (empty? hash)
    [:div.story-teaser-component.main-article-component]
    ;[:div.home-page-body]
  ))
