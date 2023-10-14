import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager.bean.ItemParent
import com.example.viewpager.R
import com.example.viewpager.bean.TeacherDetails

class CustomAdapter(private val mList: List<ItemParent>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
  
  // create new views
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    // inflates the card_view_design view
    // that is used to hold list item
    val view = LayoutInflater.from(parent.context)
      .inflate(R.layout.teacher_card_layout, parent, false)
    
    return ViewHolder(view)
  }
  
  // binds the list items to a view
  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    
    val ItemsViewModel = mList[position]
    ItemsViewModel as TeacherDetails
    // sets the image to the imageview from our itemHolder class
    holder.imageView.text = ItemsViewModel.teacherName
    
    // sets the text to the textview from our itemHolder class
    holder.textView.text = ItemsViewModel.subject
    
  }
  
  // return the number of the items in the list
  override fun getItemCount(): Int {
    return mList.size
  }
  
  // Holds the views for adding it to image and text
  class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
    val imageView: TextView = itemView.findViewById(R.id.teacherName)
    val textView: TextView = itemView.findViewById(R.id.subjectTeacher)
  }
}
