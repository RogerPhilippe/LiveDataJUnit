package br.com.philippesis.livedatajunit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        val viewModel = MainViewModel()

        viewModel.currentUser().observe(this, Observer {
            if (it != null && it.name.isNotEmpty()) {
                mainLabel.setText("Nome do usuário: ${it.name}")
            } else { mainLabel.setText("Sem nome definido!") }
        })

        UserImpl().makeUser(viewModel)

    }
}
