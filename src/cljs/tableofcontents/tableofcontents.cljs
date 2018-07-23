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
      [:span.right-arrow (when (first sublinks) "\u221F")]
      (when (first sublinks)
        [:div.subcontents-component.thin-shadow
          (for [sublink sublinks]
            ^{:key sublink} [sublink-content-component sublink])])]))

(defn tableofcontents [props]
  (let [open (when (:open props) "open")]
    [:div#TableOfContents.table-of-contents-component {:class open}
      [:div.generic-button-component.content-component-button.primary "Subscribe"]
      [:hr.divider]
      [:div.multicontent-component.content-component
        [:a.primary {:href "home"} "Home Page"]
        [:a.secondary {:href "usandworld"} "US & World"]
        [:a.secondary {:href "regional"} "Regional"]]
      (for [content c/contentlinks]
        ^{:key content} [content-component content])
      [:hr.divider]]))
