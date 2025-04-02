package com.example.forapp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.forapp.AboutUsActivity
import com.example.forapp.AcademicsActivity
import com.example.forapp.StudentLifeActivity
import com.example.forapp.ResearchActivity
import com.example.forapp.AdmissionActivity
import com.example.forapp.ExaminationsActivity
import com.example.forapp.PlacementActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_about_us).setOnClickListener {
            navigateTo(AboutUsActivity::class.java)
        }
        findViewById<Button>(R.id.btn_academics).setOnClickListener {
            navigateTo(AcademicsActivity::class.java)
        }

        findViewById<Button>(R.id.btn_student_life).setOnClickListener {
            navigateTo(StudentLifeActivity::class.java)
        }

        findViewById<Button>(R.id.btn_research).setOnClickListener {
            navigateTo(ResearchActivity::class.java)
        }

        findViewById<Button>(R.id.btn_admission).setOnClickListener {
            navigateTo(AdmissionActivity::class.java)
        }

        findViewById<Button>(R.id.btn_examinations).setOnClickListener {
            navigateTo(ExaminationsActivity::class.java)
        }

        findViewById<Button>(R.id.btn_placement).setOnClickListener {
            navigateTo(PlacementActivity::class.java)
        }
    }

    private fun navigateTo(activity: Class<*>) {
        val intent = Intent(this, activity)
        startActivity(intent)
    }
}