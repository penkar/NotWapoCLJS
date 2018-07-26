(ns notwapo.story)

(defn story [props story main]
  (let [main-class (if main "main-article-component" "")]
    [:div.story-teaser-component {:class main-class}
      [:div.title (:title story)]
      [:div.author (:author story)]
      (for [item (:story story)]
        [:span.title-story-element (:text item)])
    ]))
