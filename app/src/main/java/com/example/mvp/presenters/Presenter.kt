package com.example.mvp.presenters

import com.example.mvp.contracts.MainContract
import com.example.mvp.models.Model

class Presenter(private val view: MainContract.View): MainContract.Presenter {
    private val model = Model()
    override fun onButtonWasClicked() {
        val data = model.loadData()
        view.showData(data)
    }
}