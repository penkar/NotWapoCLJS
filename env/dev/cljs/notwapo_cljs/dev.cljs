(ns ^:figwheel-no-load notwapo-cljs.dev
  (:require
    [notwapo-cljs.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
