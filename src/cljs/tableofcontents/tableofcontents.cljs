(ns notwapo.tableofcontents
  (:require [notwapo.contents :as c]))

(defn sublink-content-component [data]
  (let [label (:label data)
        link  (:link data)]
    [:div.subcontent-component
      [:a {:href link} label]]))

(defn content-component [data]
  (let [label    (:label data)
        link     (:link data)
        key      (:key data)
        sublinks (:sublinks data)]
    [:div.content-component
      [:span.label label]
      [:span.right-arrow (when (first sublinks) ">")]
      (when (first sublinks)
        [:div.subcontents-component.thin-shadow
          (for [sublink sublinks]
            ^{:key sublink} [sublink-content-component sublink])])]))

(defn tableofcontents []
  [:div#TableOfContents.table-of-contents-component.open
    (for [content c/contentlinks]
      ^{:key content} [content-component content])])
