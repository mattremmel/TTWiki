# TTWiki
TTWiki is a spring boot project who purpose was to create a generic and flexible platform to be used alongside various table-top games. The idea was that a host could create a number of wiki pages that are made up of information snippets, which could be revealed to players individually. The host would be able to see and edit any page or snippet, but players would only see information revealed to them specifically.

Data is stored in a MongoDB database, and is interacted with via an API built with Java Sprint Boot. The API returns JSON objects, so it would be feasible to build different clients for the server, however there is an AngularJS app included in this project.

Overall, this is very unfinished but served as a proof of concept, and gave me a chance to get a little experience working with MongoDB, Spring Boot, and AngularJS. One day I would like to overhaul this and polish it up.
