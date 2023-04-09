package com.example.android2homework1.Repositories

import com.example.android2homework1.data.DataModel

class MoviesRepository {
    private val modelList = mutableListOf<DataModel>()


    fun getListOfData() : MutableList<DataModel>{
        modelList.add(
            DataModel("",
            "Баскетбол Куроко",
            "Это аниме про баскетбол"
        )
        )
        modelList.add(
            DataModel(
            "",
            "Волейбол",
            "Аниме про волейбол"
        )
        )
        modelList.add(
            DataModel(
                "",
                "Тетрадь Смерти",
                "Аниме про тетрадь смерти"
        )
        )
        modelList.add(
            DataModel(
                "",
                "Тетрадь Смерти",
                "Аниме про тетрадь смерти"
            ))
        modelList.add(
            DataModel(
                "",
                "Тетрадь Смерти",
                "Аниме про тетрадь смерти"
            ))
        modelList.add(
            DataModel(
                "",
                "Тетрадь Смерти",
                "Аниме про тетрадь смерти"
            ))
        modelList.add(
            DataModel(
                "",
                "Тетрадь Смерти",
                "Аниме про тетрадь смерти"
            ))
        modelList.add(
            DataModel(
                "",
                "Тетрадь Смерти",
                "Аниме про тетрадь смерти"
            ))
        modelList.add(
            DataModel(
                "",
                "Тетрадь Смерти",
                "Аниме про тетрадь смерти"
            ))
        modelList.add(
            DataModel(
                "",
                "Тетрадь Смерти",
                "Аниме про тетрадь смерти"
            ))


        return modelList
    }
}