package kr.ac.kopo.dialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnDialog = findViewById<Button>(R.id.btnDialog)

        btnDialog.setOnClickListener {
            // 체크박스 목록 대화상자
            var placesArr = arrayOf("유니버셜 스튜디오", "한적한 카페", "빤쮸토끼 팝업스토어")
            var selectArr = booleanArrayOf(false, true, false)
            var dialog = AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("좋아하는 핫플레이스")
            dialog.setIcon(R.drawable.dialogicon)
            dialog.setMultiChoiceItems(placesArr, selectArr) { d1, which, isChecked ->
                btnDialog.text = placesArr[which]
            }
            dialog.setPositiveButton("닫기", null)
            dialog.show()
        }
    }
}
