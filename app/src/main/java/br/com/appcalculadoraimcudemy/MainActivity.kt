package br.com.appcalculadoraimcudemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.appcalculadoraimcudemy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

     binding.btCalcular.setOnClickListener {

         val num1 = binding.rlEtNota1
         val num2 = binding.rlEtNota2
         val num3 = binding.rlEtNota3
         val num4 = binding.rlEtNota4
         val numfaltas = binding.etFaltas
         val resultado = binding.tvResultado

         val nota1 = Integer.parseInt(num1.text.toString())
         val nota2 = Integer.parseInt(num2.text.toString())
         val nota3 = Integer.parseInt(num3.text.toString())
         val nota4 = Integer.parseInt(num4.text.toString())
         val faltas = Integer.parseInt(numfaltas.text.toString())

         val media = (nota1 + nota2 + nota3 + nota4)/4

         if((media >= 6) && (faltas <= 10)) {

             resultado.setText("O Aluno foi APROVADO com a média $media e a quantidade de faltas $faltas!")
             resultado.setTextColor(getColor(R.color.result_green))

         } else if((media >= 6) && (faltas > 10)) {

             resultado.setText("O Aluno foi REPROVADO com a média $media e a quantidade de faltas $faltas!")
             resultado.setTextColor(getColor(R.color.red))

         } else if(media < 6) {

            resultado.setText("O Aluno foi REPROVADO com a média $media e a quantidade de faltas $faltas!")
             resultado.setTextColor(getColor(R.color.red))
         }
     }
    }
}