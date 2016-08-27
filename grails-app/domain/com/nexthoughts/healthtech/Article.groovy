package com.nexthoughts.healthtech

class Article {

    String title
    Date dateCreated
    Date lastUpdated
    String friendlyUrl
    Boolean isDeleted


    def beforeInsert() {
        this.friendlyUrl=this.title?.asFriendlyUrl()
    }

    static constraints = {
        friendlyUrl()
    }
}
