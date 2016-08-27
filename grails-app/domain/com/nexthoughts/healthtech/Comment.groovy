package com.nexthoughts.healthtech

class Comment {

    String comment
    Date dateCreated
    Date lastUpdated
    Boolean isDeleted

    static constraints = {
        comment(nullable:true)
    }
}
