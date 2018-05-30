(defproject clj-find-ip "0.1.0-SNAPSHOT"
  :description "GUI to get IP from domain name"
  :url "https://github.com/rstolliker/clj-find-ip"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [seesaw "1.5.0"]]
  :main ^:skip-aot clj-find-ip.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
