(ns notwapo.newslink)
(defn button-news-link [data]
  (let [title    (:title data)
        callback (:callback data)]
      [:div.news-button {:onClick callback} title]))

(defn li-news-link [linkobject hashchange]
  (let [title (:title linkobject)
        link  (:link linkobject)
        onClick #(hashchange link)]
  [:li.news-link-li
    [:a {:href link :key title :onClick onClick} (str title)]]))

(defn right-ul-news-links [links props]
  (let [hashchange (:hashchange props)]
    [:ul.news-link-ul
      (for [link links]
        ^{:key link} [li-news-link link hashchange])]))

(defn left-ul-news-links [links props]
  (let [openchange (:openchange props)
        hashchange (:hashchange props)]
    [:ul.news-link-ul
      [button-news-link {:title "Search" :callback nil}]
      [button-news-link {:title "Sections \u2630" :callback openchange}]
      (for [link links]
        ^{:key link} [li-news-link link hashchange])]))
