(ns notwapo.newslink)


(defn button-news-link [data]
  (let [title    (:title data)
        callback (:callback data)]
      [:div.news-button title]))

(defn li-news-link [linkobject]
  (let [title (:title linkobject)
        link  (:link linkobject)]
  [:li.news-link-li
    [:a {:href link :key title} (str title)]]))

(defn ul-news-links
  ([links]
    [:ul.news-link-ul
      (for [link links]
        ^{:key link} [li-news-link link])])
  ([links buttons]
    [:ul.news-link-ul
      (for [btn buttons]
        ^{:key btn} [button-news-link btn])
      (for [link links]
        ^{:key link} [li-news-link link])]))
