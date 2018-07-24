(ns notwapo.slogan)

(defn main [hashchange]
  (let [date   (.toDateString (js/Date. ))
        change #(hashchange "")]
    [:div.slogan-sectional
      [:a.slogan-text {:onClick change :href "#"} "Not the Washington Post"]
      [:div.slogan-row-text
        [:span.slogan-row-text-col.left date]
        [:span.slogan-row-text-col.center "Mold Dies in Daylight"]
        [:span.slogan-row-text-col.right "Edition: "
          [:a {:style {:color "black"}} "Web"]]]
      [:hr.medium-divider]]))
