package com.linegames.s.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ImageView
import com.linegames.s.R
import com.linegames.s.databinding.ActivityGameBinding

class Game : AppCompatActivity() {
    var roll= mutableListOf<String>("1","2")
    var r1=0
    var r2=0
    var r3=0
    var r4=0
    var r5=0
    var r8=0
    var r9=0
    var r10=0
    var r11=0
    var r12=0
    var r13=0
    var r14=0
    var r15=0
    var r16=0
    var r17=0
    var r18=0
    var scr=0

    private var timer: CountDownTimer?=null
    lateinit var binding: ActivityGameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        startTimer(10000)
    }


    private fun startTimer(timeMillis:Long){
        timer?.cancel()
        timer=object : CountDownTimer(timeMillis,500){
            override fun onTick(TimeEl: Long) {
                if(r1==0){
                    var i1=roll.random()
                    check(i1,binding.im1)
                }
                binding.im1.setOnClickListener {
                    if(r1==0){
                        r1=1
                        scr++
                        binding.im1.setImageResource(R.drawable.mosqclickr)
                        binding.score.text="$scr"
                    }
                }
                if(r2==0){
                    var i2=roll.random()
                    check(i2,binding.im2)
                }
                binding.im2.setOnClickListener {
                    if(r2==0){
                        r2=1
                        scr++
                        binding.im2.setImageResource(R.drawable.mosqclickr)
                        binding.score.text="$scr"
                    }
                }
                if(r3==0){
                    var i3=roll.random()
                    check(i3,binding.im3)
                }
                binding.im3.setOnClickListener {
                    if(r3==0){
                        r3=1
                        scr++
                        binding.im3.setImageResource(R.drawable.mosqclickr)
                        binding.score.text="$scr"
                    }
                }
                if(r4==0){
                    var i4=roll.random()
                    check(i4,binding.im4)
                }
                binding.im4.setOnClickListener {
                    if(r4==0){
                        r4=1
                        scr++
                        binding.im4.setImageResource(R.drawable.mosqclickr)
                        binding.score.text="$scr"
                    }
                }
                if(r5==0){
                    var i5=roll.random()
                    check(i5,binding.im5)
                }
                binding.im5.setOnClickListener {
                    if(r5==0){
                        r5=1
                        scr++
                        binding.im5.setImageResource(R.drawable.mosqclickr)
                        binding.score.text="$scr"
                    }
                }
                if(r8==0){
                    var i8=roll.random()
                    check(i8,binding.im8)
                }
                binding.im8.setOnClickListener {
                    if(r8==0){
                        r8=1
                        scr++
                        binding.im8.setImageResource(R.drawable.mosqclickr)
                        binding.score.text="$scr"
                    }
                }
                if(r9==0){
                    var i9=roll.random()
                    check(i9,binding.im9)
                }
                binding.im9.setOnClickListener {
                    if(r9==0){
                        r9=1
                        scr++
                        binding.im9.setImageResource(R.drawable.mosqclickr)
                        binding.score.text="$scr"
                    }
                }
                if(r10==0){
                    var i10=roll.random()
                    check(i10,binding.im10)
                }
                binding.im10.setOnClickListener {
                    if(r10==0){
                        r10=1
                        scr++
                        binding.im10.setImageResource(R.drawable.mosqclickr)
                        binding.score.text="$scr"
                    }
                }
                if(r11==0){
                    var i11=roll.random()
                    check(i11,binding.im11)
                }
                binding.im11.setOnClickListener {
                    if(r11==0){
                        r11=1
                        scr++
                        binding.im11.setImageResource(R.drawable.mosqclickr)
                        binding.score.text="$scr"
                    }
                }
                if(r12==0){
                    var i12=roll.random()
                    check(i12,binding.im12)
                }
                binding.im12.setOnClickListener {
                    if(r12==0){
                        r12=1
                        scr++
                        binding.im12.setImageResource(R.drawable.mosqclickr)
                        binding.score.text="$scr"
                    }
                }
                if(r13==0){
                    var i13=roll.random()
                    check(i13,binding.im13)
                }
                binding.im13.setOnClickListener {
                    if(r13==0){
                        r13=1
                        scr++
                        binding.im13.setImageResource(R.drawable.mosqclickr)
                        binding.score.text="$scr"
                    }
                }
                if(r14==0){
                    var i14=roll.random()
                    check(i14,binding.im14)
                }
                binding.im14.setOnClickListener {
                    if(r14==0){
                        r14=1
                        scr++
                        binding.im14.setImageResource(R.drawable.mosqclickr)
                        binding.score.text="$scr"
                    }
                }
                if(r15==0){
                    var i15=roll.random()
                    check(i15,binding.im15)
                }
                binding.im15.setOnClickListener {
                    if(r15==0){
                        r15=1
                        scr++
                        binding.im15.setImageResource(R.drawable.mosqclickr)
                        binding.score.text="$scr"
                    }
                }
                if(r16==0){
                    var i16=roll.random()
                    check(i16,binding.im16)
                }
                binding.im16.setOnClickListener {
                    if(r16==0){
                        r16=1
                        scr++
                        binding.im16.setImageResource(R.drawable.mosqclickr)
                        binding.score.text="$scr"
                    }
                }
                if(r17==0){
                    var i17=roll.random()
                    check(i17,binding.im17)
                }
                binding.im17.setOnClickListener {
                    if(r17==0){
                        r17=1
                        scr++
                        binding.im17.setImageResource(R.drawable.mosqclickr)
                        binding.score.text="$scr"
                    }
                }
                if(r18==0){
                    var i18=roll.random()
                    check(i18,binding.im18)
                }
                binding.im18.setOnClickListener {
                    if(r18==0){
                        r18=1
                        scr++
                        binding.im18.setImageResource(R.drawable.mosqclickr)
                        binding.score.text="$scr"
                    }
                }
                binding.timend.text="${(TimeEl/1000).toString()}"


            }
            override fun onFinish() {
                var srcsrc=scr.toString()
                val intent= Intent(this@Game,Res::class.java)
                intent.putExtra("score",srcsrc)
                startActivity(intent)

            }

        }.start()

    }
    fun check(i:String,im:ImageView){
        if(i=="1"){
            im.setVisibility(View.GONE)
        }
        else if(i=="2"){
            im.setVisibility(View.VISIBLE)
        }
    }

}