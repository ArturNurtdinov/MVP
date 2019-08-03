package com.example.mvp.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mvp.R
import com.example.mvp.contracts.MainContract
import com.example.mvp.data.Human
import com.example.mvp.presenters.Presenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {
    private val presenter = Presenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            presenter.onButtonWasClicked()
        }
    }

    override fun showData(data: ArrayList<Human>) {
        text_view.text = "I got list with size ${data.size}"
    }

}
