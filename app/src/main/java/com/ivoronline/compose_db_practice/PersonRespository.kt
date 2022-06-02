package com.ivoronline.compose_db_practice

import com.ivoronline.compose_db_practice.Person
import com.ivoronline.compose_db_practice.PersonDao
import kotlinx.coroutines.*

class PersonRepository(private val productDao: PersonDao) {

  //PROPERTIES
  private val coroutineScope = CoroutineScope(Dispatchers.Main)

  //INSERT PERSON
  fun insertPerson(person: Person) {
    coroutineScope.launch(Dispatchers.IO) {
      productDao.insertPerson(person)
    }
  }

}

