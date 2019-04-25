(ns notwapo.homepage
  (:require [notwapo.stories :as stories]
            [notwapo.story :as nws]))

(defn main-story [props]
  (let [figure      (:hash props)
        story-list  (filter (fn [str] (= (:id str) figure)) stories/articles)]
    [:div.home-page-body
      (for [s story-list]
        ^{:key s} [nws/story props s true])]))


(defn copy-times [item number]
  ;; given a list ITEM make a list of NUMBER copies of ITEM
  (loop [count 0
         accumulator []]
    (if (= count number)
      accumulator
      (recur (+ count 1)
             (conj accumulator item)))))

(defn split-list-into [seq number]
  ;; Break SEQ into NUMBER amount of lists.
  (loop [accumulator-seq seq
         accumulator (copy-times [] number)]
    (if (empty? accumulator-seq)
      accumulator
      (let [head     (first accumulator)
            new-last (conj head (first accumulator-seq))
            tail     (rest accumulator)]

        (recur (rest accumulator-seq)
               (concat tail [new-last]))))))


(defn main-stories [props]
  [:div.home-page-body {:style {}}
   (for [column (split-list-into stories/articles 3)]
     [:div.home-page-body-col {:style {:width "90vw" :flex-wrap "wrap" :flex-direction "row"}}
      (for [s column]
        ^{:key s} [nws/story props s false])])])
