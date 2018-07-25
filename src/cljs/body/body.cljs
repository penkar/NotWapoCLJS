(ns notwapo.body
  (:require [notwapo.slogan :as slogan]
            [notwapo.recentstories :as recent]
            [notwapo.homepage :as homepage]))

(defn main [props]
  (let [open            (:open props)
        openchange      (:openchange props)
        tableofcontents (when open "tableofcontents")
        hash            (:hash props)
        hashchange      (:hashchange props)]
    [:div.app-body {:class tableofcontents}
      [slogan/main hashchange]
      (when (empty? hash)       [recent/main props])
      (when (empty? hash)       [homepage/main-stories props])
      (when (not (empty? hash)) [homepage/main-story props])]))
