package com.kolaysoft.kisiler_app_jetpack.data.repo

import com.kolaysoft.kisiler_app_jetpack.data.datasource.PersonDataSource
import com.kolaysoft.kisiler_app_jetpack.data.model.PersonModel

class PersonRespository {
    private var personDataSource: PersonDataSource = PersonDataSource()

    fun registerPersonList(personList: List<PersonModel>, person: PersonModel): List<PersonModel> {
        val updatedList = personList.toMutableList()
        personDataSource.registerPersonList(updatedList, person)
        return updatedList
    }

}