package com.enrol

class BootStrap {

    def init = { servletContext -> 

def computing=new Course(
department:'Computing',
code:'CS123',
title:'BSc Hon Computing',
leader:'Dr Michelle Murphy',
startDate:new Date('09/09/2018'),
endDate:new Date('07/07/2022'),
numberOfStudents:55,
studyMode:'Fulltime',
tuitionFees:9000.60,
description:'Lorem ipsum dolor sit amet, cum sale error tantas ne').save()

def pasties=new Course(
department:'Pasty Baking',
code:'PB123',
title:'BSc Pasty Honors',
leader:'Dr Gregg',
startDate:new Date('09/09/2018'),
endDate:new Date('07/07/2022'),
numberOfStudents:55,
studyMode:'Fulltime',
tuitionFees:9000.60,
description:'Our vision is to become customers favourite for food on-the-go!').save()

def english=new Course(
department:'English',
code:'EN123',
title:'English with Honors',
leader:'Dr Phil',
startDate:new Date('09/09/2018'),
endDate:new Date('07/07/2022'),
numberOfStudents:55,
studyMode:'Fulltime',
tuitionFees:9000.60,
description:'i dnt read 2 good').save()

    }
    def destroy = {
greggs     }
}
