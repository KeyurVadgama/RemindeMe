package com.example.remindeme

//model class is used to set and get the data from database
class Model {
    var title: String? = null
    var date: String? = null
    var time: String? = null

    constructor() {}
    constructor(title: String?, date: String?, time: String?) {
        this.title = title
        this.date = date
        this.time = time
    }
}
