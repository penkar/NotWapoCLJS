(ns notwapo.slogan)

(defn main []
  (let [date (.toDateString (js/Date. ))]
    [:div.slogan-sectional
      [:a.slogan-text {:href "#"} "Not the Washington Post"]
      [:div.slogan-row-text
        [:span.slogan-row-text-col.left date]
        [:span.slogan-row-text-col.center "Mold Dies in Daylight"]
        [:span.slogan-row-text-col.right "Edition: "
          [:a {:style {:color "black"}} "Web"]]]
      [:hr.medium-divider]]))
