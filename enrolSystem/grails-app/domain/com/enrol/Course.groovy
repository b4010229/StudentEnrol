package com.enrol

class Course {

String department
String title
String leader
String code
String studyMode
Date startDate
Date endDate
String description
int numberOfStudents
Double tuitionFees

Boolean isItRunning
double fees



double calculateFees(){
4*fees

}
    static constraints = {

title blank:false, nullable:false
department blank:false, nullable:false
leader blank:false, nullable:false
code blank:false, nullable:false
numberOfStudents blank:false, nullable:false, max:60, min:20
startDate blank:false, nullable:false
endDate blank:false, nullable:false
studyMode blank:false, nullable:false, size:1..20
description blank:false, nullable:false, maxSize:5000, widget:'textarea'
tuitionFees blank:false, nullable:false, amountscale:2

    }
}
