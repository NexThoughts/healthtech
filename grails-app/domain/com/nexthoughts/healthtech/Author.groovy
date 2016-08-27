package com.nexthoughts.healthtech

class Author extends User{

    String firstName
    String lastName
    Date dateCreated
    Date lastUpdated

    static hasMany = [articles:Article,comments:Comment]

    static constraints = {

    }
}
