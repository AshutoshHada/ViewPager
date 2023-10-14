package com.example.viewpager.ViewHolder

import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager.Interface.ToastShower
import com.example.viewpager.bean.ItemParent
import com.example.viewpager.bean.SchoolViewHolder
import com.example.viewpager.bean.StudentDetails
import com.example.viewpager.databinding.StudentCardLayoutBinding

class StudentViewHolder(val binding:StudentCardLayoutBinding,val listner:ToastShower): SchoolViewHolder ,RecyclerView.ViewHolder(binding.root){
  override fun bind(item: ItemParent) {
    if(item is StudentDetails){
     binding.studentClass.text=item.classStudent.toString()
      binding.studentName.text=item.nameStudent
      binding.studentScore.text=item.score
      binding.root.setOnClickListener {
        listner.showToast("${item.nameStudent} ${item.classStudent} ${item.score}")
      }
      
    }
  }
  
}