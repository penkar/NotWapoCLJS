(ns notwapo.homepage
  (:require [notwapo.stories :as stories]
            [notwapo.story :as nws]))

(defn main-story [props]
  (let [figure      (:hash props)
        story-list  (filter (fn [str] (= (:id str) figure)) stories/articles)]
    [:div.home-page-body
      (for [s story-list]
        ^{:key s} [nws/story props s true])]))

(defn main-stories [props]
  [:div.home-page-body {:style {}}
    [:div.home-page-body-col {:style {:width "90vw" :flex-wrap "wrap" :flex-direction "row"}}
      (for [s stories/articles]
        ^{:key s} [nws/story props s false])]])

