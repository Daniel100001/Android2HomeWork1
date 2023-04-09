package com.example.android2homework1.Repositories

import com.example.android2homework1.data.DataModel

class CatsRepository {
    private val catAddress: String = "https://http.cat/"

    private val catModelList = ArrayList<DataModel>()

    fun getListOfCats(): ArrayList<DataModel> {
        catModelList.add(DataModel("${catAddress}100",  "Continue", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}101", "Switching Protocols", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}102", "Processing", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}103", "Early Hints", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}200", "Ok", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}201", "Created", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}202", "Accepted", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}203",  "Non-Authoritative", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}204",  "No Content", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}206",  "Partial Content", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}207",  "Multi-Status", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}300", "Multiple Choices", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}301", "Moved Permanently", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}302",  "Found", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}303",  "See Other", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}304",  "Not Modified", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}305", "Use Proxy", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}307",  "Temporary Redirect", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}308", "Permanent Redirect", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}400",  "Bad Request", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}401",  "Unauthorized", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}402",  "Payment Required", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}403",  "Forbidden", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}404",  "Not Found", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}405",  "Method Not Allowed", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}406",  "Not Acceptable", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}407",  "Proxy Authentication Required", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}408",  "Request Timeout", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}409", "Conflict", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}410",  "Gone", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}411",  "Length Required", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}412",  "Precondition Failed", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}413",  "Payload Too Large", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}414",  "URI Too Long", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}415",  "Unsupported Media", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}416",  "Range Not Satisfiable", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}418",  "I'm a teapot", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}421",  "Misdirected Request", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}423",  "ExpectationFailed", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}424",  "ExpectationFailed", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}425",  "ExpectationFailed", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}426",  "ExpectationFailed", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}417", "ExpectationFailed", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}417", "ExpectationFailed", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}417",  "ExpectationFailed", "Cам виноват"))
        catModelList.add(DataModel("${catAddress}417", "ExpectationFailed", "Cам виноват"))

        return catModelList

    }
}