package com.haso.bugdroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randombut: Button = findViewById(R.id.gen_but)
        val description: TextView = findViewById(R.id.des_id)
        val posimage: ImageView = findViewById(R.id.poster_image)
        randombut.setOnClickListener{
            var randomNumber = (1..9).random()
            when(randomNumber){
                1 -> {
                    posimage.setImageResource(R.drawable.kotlin01)
                    description.text = "First and foremost, Kotlin in an open source programming language. This statically typed language was built by Jetbrains, who are also makers of IntelliJ IDE. Apart from being an open source programming language, Kotlin doesn’t ask much when it comes to converting existing Java code, it happens with a single-click tool."
                }

                2 -> {
                    posimage.setImageResource(R.drawable.kotlin02)
                    description.text = "One of the best features of Kotlin programming language is its deep interoperability with Java, which is bound to attract more Java developers to learn Kotlin. It runs on the JVM and uses Java libraries and tools. It offers backward compatibility for Java versions 6 and 7."
                }
                3 -> {
                    posimage.setImageResource(R.drawable.kotlin03)
                    description.text = "As Kotlin compiles to JVM bytecode or JavaScript, Java and JS developers will be most tempted to learn this programming language. Added to this, the programmers who use a garbage collected runtime will also find Kotlin programming language interesting."
                }
                4 -> {

                    description.text = "The feature scope and necessity of a class is always argued by the programming language designers. A typical data class in Java has tons of boilerplate code one needs to skip while finding out the real use of that class. However, in Kotlin, you can write the equivalent of the same Java code in a very simple manner and save tons of typing and mental effort. It’s one of the best features of Kotin programming language."
                }
                5 -> {

                    description.text = "The defaulted parameters in Kotlin are pretty handy when you pass the arguments by name, instead of index. Their advantage is seen when there’s a function with tons of optional parameters."
                }
                6 -> {

                    description.text = "The standard Kotlin library doesn’t have garbage, it’s tight and small. It has mostly focused extensions to the Java standard library. Many of its functions are inline-only that just become inline code. Kotlin has many optimizations which, specifically, help Android development."
                }
                7 -> {

                    description.text = "Kotlin programming language’s type system aims at eliminating the perils of null references from code, which is often called The Billion Dollar Mistake. For example, in Java, accessing a member of null reference results in a null reference exception. Kotlin doesn’t compile code that assigns or returns a null. This is seen as one of the most important features of Kotlin."
                }
                8 -> {description.text = "Thanks to the extension functions in Kotlin, you can add methods to classes without making changes to their source code. Similar to Scala’s implicit methods, you can add methods on a per-user basis to classes. While extension functions are often controversial, every now and then it’s very useful."
                9 -> description.text = "Unlike Java, which needs you to write everything, Kotlin compiler can understand from the code and write the remaining code, for example, it can infer types in variable declarations. This increases productivity and saves time. Kotlin makes Android development more fun. If you search the web, you’ll find tons of ways in which Java’s pain points are solved by Kotlin and how features of Kotlin aim to make Android development more fun. You can use it write more expressive and effective code with fewer bugs."

            }
        }
    }
}