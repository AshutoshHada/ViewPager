package com.example.viewpager.ViewHolder

import android.content.Intent
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager.Interface.ToastShower
import com.example.viewpager.bean.ItemParent
import com.example.viewpager.bean.SchoolViewHolder
import com.example.viewpager.bean.TeacherDetails
import com.example.viewpager.databinding.TeacherCardLayoutBinding
import com.example.viewpager.ui.MainActivity
import kotlin.coroutines.coroutineContext

class TeacherViewHolder(val binding: TeacherCardLayoutBinding,val listner: ToastShower) : SchoolViewHolder,RecyclerView.ViewHolder(binding.root) {
  override fun bind(item: ItemParent) {
if(item is TeacherDetails) {
  binding.teacherName.text=item.teacherName
  binding.subjectTeacher.text=item.subject
  binding.root.setOnClickListener {
    listner.showToast("${item.teacherName} ${item.subject}")
  }
}
  }
}