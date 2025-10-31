package com.example.praktikumwireframe

data class FoodItem(
    val id: Int,
    val name: String,
    val description: String,
    val price: String,
    val colorRes: Int
)

object FoodData {
    val foodList = listOf(
        FoodItem(
            1,
            "Tonkotsu Ramen",
            "Ramen kuah kaldu tulang babi kental dengan chashu lembut",
            "Rp 42.000",
            R.color.ramenRed
        ),
        FoodItem(
            2,
            "Shoyu Ramen",
            "Ramen kuah soy sauce klasik dengan telur ajitsuke",
            "Rp 38.000",
            R.color.soySauce
        ),
        FoodItem(
            3,
            "Miso Ramen",
            "Ramen kuah miso hangat dengan jagung manis dan butter",
            "Rp 40.000",
            R.color.miso
        ),
        FoodItem(
            4,
            "Spicy Tan Tan Men",
            "Ramen pedas dengan pasta wijen dan daging cincang",
            "Rp 45.000",
            R.color.ramenRed
        ),
        FoodItem(
            5,
            "Chicken Karaage",
            "Ayam goreng Jepang crispy dengan saus mayo",
            "Rp 28.000",
            R.color.eggYolk
        ),
        FoodItem(
            6,
            "Gyoza 6pcs",
            "Dumpling Jepang dengan isian daging dan sayur",
            "Rp 25.000",
            R.color.noriGreen
        ),
        FoodItem(
            7,
            "Yakitori Set",
            "4 tusuk ayam bakar dengan saus teriyaki khas Jepang",
            "Rp 32.000",
            R.color.soySauce
        ),
        FoodItem(
            8,
            "Edamame",
            "Kacang kedelai Jepang rebus dengan garam laut",
            "Rp 18.000",
            R.color.wasabiGreen
        ),
        FoodItem(
            9,
            "Chicken Teriyaki Don",
            "Nasi dengan ayam teriyaki, telur, dan sayuran",
            "Rp 35.000",
            R.color.soySauce
        ),
        FoodItem(
            10,
            "Katsu Curry Rice",
            "Nasi kari Jepang dengan chicken katsu crispy",
            "Rp 40.000",
            R.color.miso
        ),
        FoodItem(
            11,
            "Vegetable Tempura",
            "Sayuran goreng tepung crispy dengan saus tentsuyu",
            "Rp 30.000",
            R.color.wasabiGreen
        ),
        FoodItem(
            12,
            "Salmon Teriyaki",
            "Salmon bakar dengan saus teriyaki dan nasi",
            "Rp 48.000",
            R.color.ramenRed
        )
    )
}
