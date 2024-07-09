package com.kolaysoft.kisiler_app_jetpack.data.datasource

import com.kolaysoft.kisiler_app_jetpack.data.model.PersonModel

class PersonDataSource {
    fun registerPersonList(personList: MutableList<PersonModel>, person: PersonModel) {
        personList.add(person)
    }
}