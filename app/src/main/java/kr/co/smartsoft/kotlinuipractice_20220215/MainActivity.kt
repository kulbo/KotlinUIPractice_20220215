package kr.co.smartsoft.kotlinuipractice_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        버튼이 눌릴때 -> 입력된 메세지가 어떤건지 추출. -> 토스트로 띄워주기.

        btnOk.setOnClickListener {
//            버튼이 눌릴때 마다 실행
//            -> 입력된 메세지는 변수에 담아두자

            val inputMessage = edtMessage.text.toString()   // EDITText의 문구(text)를 추출 -> String으로 변환까지

            Toast.makeText(this, inputMessage, Toast.LENGTH_SHORT).show()

            txtMessage.text = inputMessage  // TextView의 문구(text)을 변경 : set

        }

        btnCalculate.setOnClickListener {

            /*
//            입력한 숫자 추출
            val inputNumber = edtNumber.text.toString().toInt()   // 입력한 문구를 > String으로 > Int로 변환
//            숫자는 짝수인가? => 조건문 if문 활용
            if (inputNumber % 2 == 0) {
                Toast.makeText(this, "입력한 숫자는 짝수 입니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "입력한 숫자는 홀수 입니다.", Toast.LENGTH_SHORT).show()
            }
             */
            val inputBirthYear = edtNumber.text.toString().toInt()

            val age = 2022 - inputBirthYear + 1

            Toast.makeText(this, "이 사람은 올해 ${age}세 입니다.", Toast.LENGTH_SHORT).show()
        }
    }
}