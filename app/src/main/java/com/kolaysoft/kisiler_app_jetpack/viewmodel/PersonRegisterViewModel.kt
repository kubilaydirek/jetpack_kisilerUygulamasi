package com.kolaysoft.kisiler_app_jetpack.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kolaysoft.kisiler_app_jetpack.data.model.PersonModel
import com.kolaysoft.kisiler_app_jetpack.data.repo.PersonRespository
import kotlinx.coroutines.launch

class PersonRegisterViewModel : ViewModel() {
    private val personRepo: PersonRespository = PersonRespository()
    var personList by mutableStateOf<List<PersonModel>>(emptyList())


    fun kaydet(person: PersonModel) {
        viewModelScope.launch {
            personRepo.registerPersonList(personList, person)
        }

    }

    fun test(person: PersonModel) {
        personList = personList.toMutableList().apply { add(person) }
    }

}