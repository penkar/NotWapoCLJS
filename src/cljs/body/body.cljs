(ns notwapo.body
  (:require [notwapo.slogan :as slogan]
            [notwapo.recentstories :as recent]
            [notwapo.homepage :as homepage]))

(defn main [props]
  (let [open            (:open props)
        openchange      (:openchange props)
        tableofcontents (when open "tableofcontents")
        hash            (:hash props)
        hashchange      (:hashchange props)
        num             (js/parseInt hash)]
    [:div.app-body {:class tableofcontents}
      [slogan/main hashchange]
      (when (not (int? num))       [recent/main props])
      (when (not (int? num))       [homepage/main-stories props])
      (when (int? num) [homepage/main-story props])]))
