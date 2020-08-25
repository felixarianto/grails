package com.company

class Employee {

    static constraints = {
        name size: 5..40, blank: false
        phone size: 8..13, blank: false
    }
    
    String name
    String phone
    static belongsTo = [position: Position]
    
    String toString() {
        name
    }
}
