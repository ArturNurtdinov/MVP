package com.example.mvp.models

import com.example.mvp.contracts.MainContract
import com.example.mvp.data.Human

class Model : MainContract.Model {
    override fun loadData(): ArrayList<Human> {
        /**
         * Here we should request databases or network for our data
         * I will just initialize it here
         */
        return arrayListOf(
            Human("First", 21),
            Human("Second", 33),
            Human("Third", 19)
        )
    }
}