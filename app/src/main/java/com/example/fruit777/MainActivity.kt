package com.example.fruit777

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.main_recycler_view)
        val list_of_fruits = get_list_of_fruits()
        val fruitAdapter = fruit_adapter(list_of_fruits)
        recyclerView.adapter = fruitAdapter
        fruitAdapter.onItemClick = {
            val intent = Intent(this, fruit_details::class.java)
            intent.putExtra("Fruit", it)
            startActivity(intent)
        }
    }

    private fun get_list_of_fruits(): List<Fruit> {
        val fruits = mutableListOf<Fruit>()
        fruits.add(Fruit("Apple", R.drawable.red_apple, 25.0, 30))
        fruits.add(Fruit("Mango", R.drawable.mango, 30.5, 50))
        fruits.add(Fruit("Watermelon", R.drawable.watermelon, 15.0, 30))
        fruits.add(Fruit("Peach", R.drawable.peach, 22.0, 64))
        fruits.add(Fruit("Dragon Fruit", R.drawable.dragonfruit, 120.0, 10))
        fruits.add(Fruit("Banana", R.drawable.banana, 18.0, 24))
        fruits.add(Fruit("Strawberry", R.drawable.strawberry, 30.0, 35))
        fruits.add(Fruit("Kewy", R.drawable.kiwi, 38.0, 25))
        fruits.add(Fruit("Potato", R.drawable.berries, 10.0, 60))
        fruits.add(Fruit("Apple", R.drawable.red_apple, 25.0, 30))
        fruits.add(Fruit("Mango", R.drawable.mango, 30.5, 50))
        fruits.add(Fruit("Watermelon", R.drawable.watermelon, 15.0, 30))
        fruits.add(Fruit("Peach", R.drawable.peach, 22.0, 64))
        fruits.add(Fruit("Dragon Fruit", R.drawable.dragonfruit, 120.0, 10))
        fruits.add(Fruit("Banana", R.drawable.banana, 18.0, 24))
        fruits.add(Fruit("Strawberry", R.drawable.strawberry, 30.0, 35))
        fruits.add(Fruit("Kewy", R.drawable.kiwi, 38.0, 25))
        fruits.add(Fruit("Potato", R.drawable.berries, 10.0, 60))

        return fruits
    }
}