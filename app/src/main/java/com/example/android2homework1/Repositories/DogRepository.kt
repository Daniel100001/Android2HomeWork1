package com.example.android2homework1.Repositories

import com.example.android2homework1.data.DataModel

class DogRepository {
    private val dogAddress: String = "https://http.dog/"
    private val dogModelList = mutableListOf<DataModel>()

    fun getLisOfDog() : MutableList<DataModel>{
        dogModelList.add(DataModel("${dogAddress}100.jpg", "Continue", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}101.jpg", "Switching Protocols", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}102.jpg", "Processing", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}103.jpg", "Early Hints", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}200.jpg", "Ok", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}201.jpg", "Created", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}202.jpg", "Accepted", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}203.jpg", "Non-Authoritative", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}204.jpg", "No Content", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}206.jpg", "Partial Content", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}207.jpg", "Multi-Status", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}300.jpg", "Multiple Choices", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}301.jpg", "Moved Permanently", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}302.jpg", "Found", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}303.jpg", "See Other", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}304.jpg", "Not Modified", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}305.jpg", "Use Proxy", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}307.jpg", "Temporary Redirect", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}308.jpg", "Permanent Redirect", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}400.jpg","Bad Request", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}401.jpg","Unauthorized", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}402.jpg", "Payment Required", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}403.jpg", "Forbidden", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}404.jpg", "Not Found", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}405.jpg", "Method Not Allowed", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}406.jpg", "Not Acceptable", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}407.jpg", "Proxy Authentication Required", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}408.jpg", "Request Timeout", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}409.jpg", "Conflict", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}410.jpg", "Gone", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}411.jpg", "Length Required", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}412.jpg", "Precondition Failed", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}413.jpg", "Payload Too Large", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}414.jpg", "URI Too Long", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}415.jpg", "Unsupported Media", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}416.jpg", "Range Not Satisfiable", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}418.jpg", "I'm a teapot", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}421.jpg","Misdirected Request", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}423.jpg", "ExpectationFailed", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}424.jpg", "ExpectationFailed", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}425.jpg", "ExpectationFailed", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}426.jpg", "ExpectationFailed", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}417.jpg", "ExpectationFailed", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}417.jpg", "ExpectationFailed", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}417.jpg", "ExpectationFailed", "Cам виноват"))
        dogModelList.add(DataModel("${dogAddress}417.jpg", "ExpectationFailed", "Cам виноват"))

        return dogModelList

    }
}