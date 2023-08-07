package com.vazidsapplication.app.modules.profileselection.ui

import android.view.View
import androidx.activity.viewModels
import com.vazidsapplication.app.R
import com.vazidsapplication.app.appcomponents.base.BaseActivity
import com.vazidsapplication.app.databinding.ActivityProfileSelectionBinding
import com.vazidsapplication.app.modules.profileselection.`data`.model.ListellipseoneRowModel
import com.vazidsapplication.app.modules.profileselection.`data`.viewmodel.ProfileSelectionVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileSelectionActivity :
    BaseActivity<ActivityProfileSelectionBinding>(R.layout.activity_profile_selection) {
  private val viewModel: ProfileSelectionVM by viewModels<ProfileSelectionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipseoneAdapter =
    ListellipseoneAdapter(viewModel.listellipseoneList.value?:mutableListOf())
    binding.recyclerListellipseone.adapter = listellipseoneAdapter
    listellipseoneAdapter.setOnItemClickListener(
    object : ListellipseoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipseoneRowModel) {
        onClickRecyclerListellipseone(view, position, item)
      }
    }
    )
    viewModel.listellipseoneList.observe(this) {
      listellipseoneAdapter.updateData(it)
    }
    binding.profileSelectionVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListellipseone(
    view: View,
    position: Int,
    item: ListellipseoneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_SELECTION_ACTIVITY"

  }
}
