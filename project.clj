(defproject deckjs2odp "0.1.0-SNAPSHOT"
  :description "Utility to convert a deck.js slide deck to an ODP presentation"
  :url "https://github.com/sctincman/deckjs2odp"
  :license {:name "MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [enlive "1.1.6"]]
  :main ^:skip-aot deckjs2odp.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
