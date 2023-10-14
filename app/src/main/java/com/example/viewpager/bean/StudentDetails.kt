package com.example.viewpager.bean

class StudentDetails(name:String,standard:Int,percentage:String) : ItemParent {
  var nameStudent =name
  var classStudent = standard
  var score=percentage
  override fun whoIsPerson():String{
    return "student"
  }
  
}