package com.company

class Position {

    static constraints = {
        name size: 2..20, blank:false
    }
    
    String name
    static hasMany = [employee: Employee]
    
    String toString() {
        name
    }
    
}
