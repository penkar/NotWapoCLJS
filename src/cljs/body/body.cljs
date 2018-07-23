(ns notwapo.body
  (:require [notwapo.slogan :as slogan]
            [notwapo.recentstories :as recent]
            [notwapo.homepage :as homepage]))

(defn main [props]
  (let [open            (:open props)
        openchange      (:openchange props)
        tableofcontents (when open "tableofcontents")]
    [:div.app-body {:class tableofcontents}
      [slogan/main]
      [recent/main]
      [homepage/main]]))
