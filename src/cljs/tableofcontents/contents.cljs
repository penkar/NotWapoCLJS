(ns notwapo.contents)

(def contentlinks (list {
    :label "Politics"
    :link "/politics"
    :key "politics"
    :sublinks (list {
      :label "The White House"
      :key "thewhitehouse"
      :link "#thewhitehouse"
    } {
      :label "Courts and Law"
      :key "courtsandlaw"
      :link "#courtsandlaw"
    } {
      :label "Polling"
      :key "polling"
      :link "#polling"
    } {
      :label "Senate"
      :key "senate"
      :link "#senate"
    } {
      :label "House of Representatives"
      :key "houseofrepresentatives"
      :link "#houseofrepresentatives"
    })
  } {
    :label "Sports"
    :link "/sports"
    :key "sports"
    :sublinks  (list {
      :label "NFL"
      :key "nfl"
      :link "#nfl"
    } {
      :label "NBA"
      :key "nba"
      :link "#nba"
    } {
      :label "MLB"
      :key "mlb"
      :link "#mlb"
    })
  } {
    :label "News Letter"
    :link "/newsletter"
    :key "newsletter"
    :sublinks (list nil)
  } {
    :label "National"
    :link "/national"
    :key "national"
    :sublinks (list {
      :label "Education"
      :key "education"
      :link "#education"
    } {
      :label "Investigations"
      :key "investigations"
      :link "#investigations"
    } {
      :label "Obituaries"
      :key "obituaries"
      :link "#obituaries"
    } {
      :label "National Security"
      :key "nationalsecurity"
      :link "#nationalsecurity"
    } {
      :label "Health & Science"
      :key "HealthScience"
      :link "/national/healthscience"
    } {
      :label "True Crime"
      :key "truecrime"
      :link "#truecrime"
    })
  } {
    :label "Tech"
    :link "/tech"
    :key "tech"
    :sublinks  (list {
      :label "Innovation"
      :key "innovation"
      :link "#innovation"
    } {
      :label "Silicon Valley"
      :key "siliconvalley"
      :link "#siliconvalley"
    })
  } {
    :label "Business"
    :link "/business"
    :key "business"
    :sublinks  (list {
      :label "On Leadership"
      :key "onleadership"
      :link "#onleadership"
    } {
      :label "Personal Finance"
      :key "personalfinance"
      :link "#personalfinance"
    } {
      :label "Energy and Environment"
      :key "energyandenvironment"
      :link "#energyandenvironment"
    } {
      :label "Markets"
      :key "markets"
      :link "#markets"
    } {
      :label "World Business"
      :key "worldbusiness"
      :link "#worldbusiness"
    } {
      :label "Capital Markets"
      :key "capitalmarkets"
      :link "#capitalmarkets"
    })
  } {
    :label "Entertainment"
    :link "/entertainment"
    :key "entertainment"
    :sublinks  (list {
      :label "Books"
      :key "books"
      :link "#books"
    } {
      :label "Comics"
      :key "comics"
      :link "#comics"
    } {
      :label "Television"
      :key "television"
      :link "#television"
    } {
      :label "Movies"
      :key "movies"
      :link "#movies"
    } {
      :label "Museum"
      :key "museum"
      :link "#museum"
    } {
      :label "Music"
      :key "music"
      :link "#music"
    } {
      :label "Theater and Dance"
      :key "theateranddance"
      :link "#theateranddance"
    } {
      :label "Bars / Clubs"
      :key "barsclubs"
      :link "#barsclubs"
    })
  } {
    :label "Lifestyle"
    :link "/lifestyle"
    :key "lifestyle"
    :sublinks  (list {
      :label "Food"
      :key "food"
      :link "#food"
    } {
      :label "Travel"
      :key "travel"
      :link "#travel"
    } {
      :label "Wellness"
      :key "wellness"
      :link "#wellness"
    } {
      :label "Fashion"
      :key "fashion"
      :link "#fashion"
    } {
      :label "Home and Garden"
      :key "homeandgarden"
      :link "#homeandgarden"
    })
  }
))
