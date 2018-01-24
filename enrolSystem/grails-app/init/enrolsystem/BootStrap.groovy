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

def patrick=new Student(
name:'Patrick Stewart',
studentID:'123456',
dob:new Date('02/28/1995'),
isFundingAvailable:'true',
email:'paddystewart@aol.co.uk',
username:'patrick91',
password:'patts1995',
course:'english').save()

def andrew=new Student(
name:'Andrew Graham',
studentID:'123457',
dob:new Date('13/06/1998'),
isFundingAvailable:'true',
email:'andrewgraham@hotmail.co.uk',
username:'digusbickus',
password:'password',
course:'pasties').save()

def projects=new Module(
title:'Professional Computing Projects',
code:'PCP89',
credits:60,
lecturer:'Laura Jones',
course:'Computing',
description:'Come get a free degree').save()



    }
    def destroy = {
greggs     }
}
