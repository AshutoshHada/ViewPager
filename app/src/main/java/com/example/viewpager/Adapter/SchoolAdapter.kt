package com.example.viewpager.Adapter

import android.view.LayoutInflater
import android.view.OnReceiveContentListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.viewpager.Interface.ToastShower
import com.example.viewpager.ViewHolder.StudentViewHolder
import com.example.viewpager.ViewHolder.TeacherViewHolder
import com.example.viewpager.bean.ItemParent
import com.example.viewpager.bean.SchoolViewHolder
import com.example.viewpager.databinding.StudentCardLayoutBinding
import com.example.viewpager.databinding.TeacherCardLayoutBinding


class SchoolAdapter(val listener: ToastShower) : RecyclerView.Adapter<ViewHolder>() {
  private var item = arrayListOf<ItemParent>()
  override fun getItemViewType(position: Int): Int {
    if(item[position].whoIsPerson()=="teacher")
      return 2
    else
      return 1
  }
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return when(viewType){
      1->{
        val binding = StudentCardLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        StudentViewHolder(binding,listener)
      }
      else->{
        val binding = TeacherCardLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        TeacherViewHolder(binding,listener)
      }
      
    }
  }
  
  
  override fun getItemCount(): Int {
    return item.size
  }
  
  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder as SchoolViewHolder
    holder.bind(item[position])
    
  }
  
  fun setItem(data:ArrayList<ItemParent>){
    item=data
  }
  
  
  
}