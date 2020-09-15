package app.itakura.reirei.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var courseData:List<CourseData> = listOf(
            CourseData(R.drawable.apple_icon,"iPhoneコース","世界に一つだけのiPhoneアプリを作って周りを驚かせよう"),
            CourseData(R.drawable.banana_icon,"Androidコース","色んなアプリを作って周りを驚かせよう"),
            CourseData(R.drawable.orange_icon,"Unityコース","世界を驚かすわくわくが止まらない！３Dゲームを作ろう"),
            CourseData(R.drawable.strawberry_icon,"webDコース","オリジナルウェブサイトを作ろう"),
            CourseData(R.drawable.apple_icon,"iPhoneコース","世界に一つだけのiPhoneアプリを作って周りを驚かせよう"), CourseData(R.drawable.banana_icon,"Androidコース","色んなアプリを作って周りを驚かせよう"),
            CourseData(R.drawable.orange_icon,"Unityコース","世界を驚かすわくわくが止まらない！３Dゲームを作ろう"),
            CourseData(R.drawable.strawberry_icon,"webDコース","オリジナルウェブサイトを作ろう"),
            CourseData(R.drawable.apple_icon,"iPhoneコース","世界に一つだけのiPhoneアプリを作って周りを驚かせよう"),
            CourseData(R.drawable.banana_icon,"Androidコース","色んなアプリを作って周りを驚かせよう"),
            CourseData(R.drawable.orange_icon,"Unityコース","世界を驚かすわくわくが止まらない！３Dゲームを作ろう"),
            CourseData(R.drawable.strawberry_icon,"webDコース","オリジナルウェブサイトを作ろう"),
            CourseData(R.drawable.apple_icon,"iPhoneコース","世界に一つだけのiPhoneアプリを作って周りを驚かせよう"),
            CourseData(R.drawable.banana_icon,"Androidコース","色んなアプリを作って周りを驚かせよう"),
            CourseData(R.drawable.orange_icon,"Unityコース","世界を驚かすわくわくが止まらない！３Dゲームを作ろう"),
            CourseData(R.drawable.strawberry_icon,"webDコース","オリジナルウェブサイトを作ろう"),
            CourseData(R.drawable.apple_icon,"iPhoneコース","世界に一つだけのiPhoneアプリを作って周りを驚かせよう"),
            CourseData(R.drawable.banana_icon,"Androidコース","色んなアプリを作って周りを驚かせよう"),
            CourseData(R.drawable.orange_icon,"Unityコース","世界を驚かすわくわくが止まらない！３Dゲームを作ろう"),
            CourseData(R.drawable.strawberry_icon,"webDコース","オリジナルウェブサイトを作ろう")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.addAll(courseData)

    }
}