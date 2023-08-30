package com.example.lorempicsum.navigation

import com.example.common_utils.Activities
import com.example.common_utils.Navigator
import com.example.lorempicsum_presentation.GoToPicSumActivity
import com.example.lorempicsuminfo_presentation.GoToPicSumInfoActivity

class DefaultNavigator: Navigator.Provider {

    override fun getActivities(activities: Activities): Navigator {
        return when(activities){
            Activities.PicSumActivity -> { GoToPicSumActivity }
            Activities.PicSumInfoActivity -> { GoToPicSumInfoActivity }
        }
    }
}