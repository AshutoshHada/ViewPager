package com.example.viewpager.bean

class TeacherDetails(name:String,subj:String) : ItemParent {
  var teacherName:String=name
  var subject:String=subj
  override fun whoIsPerson():String{
    return "teacher"
  }
  
}