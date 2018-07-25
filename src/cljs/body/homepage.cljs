(ns notwapo.homepage
  (:require [notwapo.stories :as stories]))

(defn main-story [hash]
  [:div.home-page-body
    [:div.story-teaser-component.main-article-component]
    ])

(defn main-stories [hash]
  [:div.home-page-body
    [:div.home-page-body-col]
    [:div.home-page-body-col]
    [:div.home-page-body-col]])
