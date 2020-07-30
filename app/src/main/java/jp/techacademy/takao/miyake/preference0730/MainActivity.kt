package jp.techacademy.takao.miyake.preference0730

import android.os.Bundle
import android.preference.PreferenceManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preference = PreferenceManager.getDefaultSharedPreferences(this)

        putButton.setOnClickListener{
            val editor = preference.edit()
            editor.putString("TEXT",editText.text.toString())
            editor.commit()
        }

        getButton.setOnClickListener{
            editText.setText(preference.getSring("TEXT","まだ保存されていません"))
        }
    }
}









