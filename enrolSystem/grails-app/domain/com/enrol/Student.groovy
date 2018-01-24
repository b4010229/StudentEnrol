package com.enrol

class Student {

String name
String studentID
Date dob
Boolean isFundingAvailable
String email
String username
String password
String course

String toString(){ //declares method toString
return "$name, $studentID, $course" //merges variables as groovy strings

}


    static constraints = {

name blank:false, nullable:false
studentID blank:false, nullable:false
dob blank:false, nullable:false
email blank:false, nullable:false, email:true
username blank:false, nullable:false, unique:true
password blank:false, nullable:false
isFundingAvailable blank:false, nullable:false
course blank:false, nullable:false
    }
}
