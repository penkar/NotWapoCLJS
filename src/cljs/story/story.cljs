(ns notwapo.story)

(defn story [props main]
  (let [main-class (if main "main-article-component" "")]

    [:div.story-teaser-component {:class main-class}
    ]
    ))
