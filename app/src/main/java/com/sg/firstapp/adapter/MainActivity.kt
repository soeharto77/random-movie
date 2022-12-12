    package com.sg.firstapp.adapter
    import android.content.Intent
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.view.View
    import android.widget.Button
    import android.widget.ImageView
    import android.widget.TextView
    import com.sg.firstapp.R
    import com.sg.firstapp.adapter.ListMovie

    class MainActivity : AppCompatActivity() {
    
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val tombolAksi: Button = findViewById(R.id.buttonganti)
            tombolAksi.setOnClickListener {
                ubahAngka()
            }
    
    
        }
        //fungsi ketika tombol di klik akan di panggil fungsi ini
        private fun ubahAngka(){
    
            //mengubah isi textbox
            val txtHello: TextView = findViewById(R.id.txtdadu1)
            val image1: ImageView = findViewById(R.id.imageView1)
            isiGambar(txtHello,image1)
    
            val txtDadu2: TextView = findViewById(R.id.txtdadu2)
            val image2: ImageView = findViewById(R.id.imageView2)
            isiGambar(txtDadu2,image2)
    
    
            val txtDadu3: TextView = findViewById(R.id.txtdadu3)
            val image3: ImageView = findViewById(R.id.imageView3)
            isiGambar(txtDadu3,image3)
    
        }
    
        private fun isiGambar( txtHello: TextView, image1: ImageView){
            val tes = (1 until 6).random()
            txtHello.text = tes.toString()
    
            when (tes) {
                1 -> image1.setImageDrawable(getDrawable(R.drawable.gambar1))
                2 -> image1.setImageDrawable(getDrawable(R.drawable.gambar2))
                3 -> image1.setImageDrawable(getDrawable(R.drawable.gambar3))
                4 -> image1.setImageDrawable(getDrawable(R.drawable.gambar1))
                5 -> image1.setImageDrawable(getDrawable(R.drawable.gambar2))
                else -> { // Note the block
                    image1.setImageDrawable(getDrawable(R.drawable.gambar3))
                }
            }
        }
        fun pindahPage(view: View){
            val intent = Intent(this, ListMovie::class.java).apply {
                // putExtra(, message)
            }
            startActivity(intent)
        }

    }


    
