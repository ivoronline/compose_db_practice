package com.ivoronline.compose_db_practice

import androidx.room.Dao
import androidx.room.Insert
import com.ivoronline.compose_db_practice.Person

@Dao
interface PersonDao {

  //INSERT PERSON
  @Insert
  fun insertPerson(product: Person)

}


