(ns notwapo.newslink)
(defn button-news-link [data]
  (let [title    (:title data)
        callback (:callback data)]
      [:div.news-button {:onClick callback} title]))

(defn li-news-link [linkobject]
  (let [title (:title linkobject)
        link  (:link linkobject)]
  [:li.news-link-li
    [:a {:href link :key title} (str title)]]))

    
(defn right-ul-news-links [links]
  [:ul.news-link-ul
    (for [link links]
      ^{:key link} [li-news-link link])])      
            
(defn left-ul-news-links [links props]
  (let [openchange (:openchange props)]
    [:ul.news-link-ul
      [button-news-link {:title "Search" :callback nil}]
      [button-news-link {:title "Sections \u2630" :callback openchange}]
      (for [link links]
        ^{:key link} [li-news-link link])]))
