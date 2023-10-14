package com.example.viewpager.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewpager.Interface.ToastShower
import com.example.viewpager.bean.ItemParent
import com.example.viewpager.Adapter.SchoolAdapter
import com.example.viewpager.bean.StudentDetails
import com.example.viewpager.bean.TeacherDetails
import com.example.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),ToastShower {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    
    val binding = ActivityMainBinding.inflate(layoutInflater)
    super.setContentView(binding.root)
    val array= ArrayList<ItemParent>()
    array.add(TeacherDetails("Khushboo","Math"))
    array.add(StudentDetails("ashes",1,"90%"))
    array.add(StudentDetails("ashes",10,"98%"))
    array.add(StudentDetails("ashes",3,"90%"))
    
    val adapter= SchoolAdapter(this)
    adapter.setItem(array)
    binding.schoolRecord.layoutManager= LinearLayoutManager(this)
    binding.schoolRecord.adapter=adapter
    
  }
  
  override fun showToast(toast:String) {
    Toast.makeText(this,toast,Toast.LENGTH_SHORT).show()
  }
}