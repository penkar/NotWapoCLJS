(ns notwapo.application
    (:require [notwapo.header :as h]
              [notwapo.tableofcontents :as toc]))

(defn application []
  [:span
    [h/header]
    [toc/tableofcontents]])
