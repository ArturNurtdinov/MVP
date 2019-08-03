package com.example.mvp.contracts

import com.example.mvp.data.Human

interface MainContract {
    interface View {
        fun showData(data: ArrayList<Human>)
    }

    interface Presenter {
        fun onButtonWasClicked()
    }

    interface Model {
        fun loadData(): ArrayList<Human>
    }
}