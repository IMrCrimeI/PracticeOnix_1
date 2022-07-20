package com.onix.internship.ui.firstSetting.role

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.onix.internship.arch.BaseViewModel
import com.onix.internship.arch.lifecycle.SingleLiveEvent
import com.onix.internship.data.UserRole

class RoleVerificationViewModel :
    BaseViewModel() {
    private val _moveToFragment = SingleLiveEvent<Boolean>()
    val moveToFragment: LiveData<Boolean> = _moveToFragment

    val role = MutableLiveData<UserRole>()

    fun setUserRole(it: UserRole) {
        when (it) {
            UserRole.HERO -> role.value = UserRole.HERO
            UserRole.PLAYER -> role.value = UserRole.PLAYER
            UserRole.MASTER -> role.value = UserRole.MASTER
        }
    }

    fun goBack() {
        _moveToFragment.value = false
    }

    fun goToRoleFragment() {
        if(role.value != null) {
            _moveToFragment.value = true
        }
    }
}