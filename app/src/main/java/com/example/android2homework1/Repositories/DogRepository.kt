package com.example.android2homework1.Repositories

import com.example.android2homework1.data.DataModel

class DogRepository {

    private val dogAddress: String = "https://http.dog/"
    private val dogModelList = mutableListOf<DataModel>()

    fun getLisOfDogs(): MutableList<DataModel> {
        dogModelList.add(
            DataModel(
                "${dogAddress}100.jpg",
                "Continue",
                "неудачное соединение с сервером из-за неверного пароля"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}101.jpg",
                "Switching Protocols",
                "Ошибка программной логики возникает, когда, несмотря на точный ввод от пользователя, производится неверный вывод. Это может произойти, когда исходный код Google Inc. имеет уязвимость в отношении передачи данных."
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}102.jpg",
                "Processing",
                "логическая ошибка возникает, когда компьютер генерирует неправильный вывод, даже если пользователь предоставляет правильный ввод. Это связано с ошибками в исходном коде Google Inc., обрабатывающих ввод неправильно"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}103.jpg",
                "Early Hints",
                "Не удалось выполнить операции шифрования/расшифровки на компьютере."
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}200.jpg",
                "Ok",
                "запрос пользователя выполнен успешно, и страница, на которую он переходил, найдена и отображена."
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}201.jpg",
                "Created",
                "в результате успешного выполнения запроса был создан новый ресурс"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}202.jpg",
                "Accepted",
                "запрос получен, но ещё не обработан"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}203.jpg",
                "Non-Authoritative",
                "Статус ответа указывает, что запрос был успешным, но прилагаемая полезная нагрузка была изменена с учётом ответа сервера 200 ( OK ) сервера происхождения с помощью преобразующего proxy"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}204.jpg",
                "No Content",
                "сервер успешно обработал запрос, но в ответе были переданы только заголовки без тела сообщения."
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}206.jpg",
                "Partial Content",
                "приложения Adobe не могут сохранить ваш профиль и информацию о лицензии в безопасном хранилище"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}207.jpg",
                "Multi-Status",
                "получает правильный ввод, но генерирует неверный вывод"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}300.jpg",
                "Multiple Choices",
                "нарушение порядка зажигания"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}301.jpg",
                "Moved Permanently",
                "апрошенный ресурс был окончательно перемещён в URL, указанный в заголовке Location (en-US)"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}302.jpg",
                "Found",
                "запрошенный ресурс был временно перемещён по адресу, указанному в заголовке Location (en-US)"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}303.jpg",
                "See Other",
                "логическая ошибка возникает, когда Safari производит неправильный вывод из правильного ввода."
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}304.jpg",
                "Not Modified",
                "нет необходимости повторно передавать запрошенные ресурсы."
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}305.jpg",
                "Use Proxy",
                "запрос к запрашиваемому ресурсу должен осуществляться через прокси-сервер, URI которого указан в поле Location заголовка"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}307.jpg",
                "Temporary Redirect",
                "запрошенный ресурс был временно перемещён в URL-адрес, указанный в заголовке Location (en-US)."
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}308.jpg",
                "Permanent Redirect",
                "запрошенный ресурс был окончательно перемещён в URL-адрес, указанный в Location (en-US)."
            )
        )
        dogModelList.add(DataModel("${dogAddress}400.jpg", "Bad Request", "плохой запрос"))
        dogModelList.add(
            DataModel(
                "${dogAddress}401.jpg",
                "Unauthorized",
                "вы пытаетесь получить доступ к странице, на которую нужно сначала войти, используя действительный ID пользователя и пароль для просмотра."
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}402.jpg",
                "Payment Required",
                "нестандартная ошибка клиента, зарезервированная для использования в будущем"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}403.jpg",
                "Forbidden",
                "сервер понял запрос, но отказывается его авторизовать."
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}404.jpg",
                "Not Found",
                "сервер успешно обработал запрос и запрашиваемая страница будет загружена"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}405.jpg",
                "Method Not Allowed",
                "метод запроса известен серверу, но был отключён и не может быть использован."
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}406.jpg",
                "Not Acceptable",
                "код ошибки клиента 406 Not Acceptable означает, что сервер не может вернуть ответ, соответствующий списку допустимых значений, определённых в заголовках упреждающего согласования контента, и что сервер не желает вернуть представление контента по умолчанию"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}407.jpg",
                "Proxy Authentication Required",
                "Это сообщение появляется при проблемах с аутентификацией на прокси-сервере."
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}408.jpg",
                "Request Timeout",
                "сервер решил закрыть соединение, а не продолжать ждать."
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}409.jpg",
                "Conflict",
                "конфликт запроса с текущим состоянием сервера"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}410.jpg",
                "Gone",
                "целевой ресурс больше недоступен на сервере происхождения"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}411.jpg",
                "Length Required",
                "сервер отказывается принять запрос без определённого Content-Length ."
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}412.jpg",
                "Precondition Failed",
                "доступ к целевому ресурсу был отклонён"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}413.jpg",
                "Payload Too Large",
                "объект запроса больше, чем ограничения, определённые сервером"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}414.jpg",
                "URI Too Long",
                "Эта ошибка возникает, если URL API слишком длинные; она связана с ограничением длины веб-сервером"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}415.jpg",
                "Unsupported Media",
                " сервер отказывается принять запрос, потому что формат содержимого не поддерживается сервером. "
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}416.jpg",
                "Range Not Satisfiable",
                "сервер не может обслуживать запрошенные диапазоны."
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}418.jpg",
                "I'm a teapot",
                "сервер не может приготовить кофе, потому что он чайник"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}421.jpg",
                "Misdirected Request",
                "Сервер занят или перегружен"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}423.jpg",
                "ExpectationFailed",
                "целевой ресурс из запроса заблокирован от применения к нему указанного метода"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}424.jpg",
                "ExpectationFailed",
                "Возникает, в случаях подозрительных запросов, т. е. если запрос расценен как попытка несанкционированного доступа к сайту, через известные уязвимости CMS."
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}425.jpg",
                "ExpectationFailed",
                "сервер не хочет рисковать обрабатывать запрос, который может быть воспроизведённым, поскольку это открывает возможность для атаки повторного воспроизведения"
            )
        )
        dogModelList.add(
            DataModel(
                "${dogAddress}426.jpg",
                "ExpectationFailed",
                "сервер отказывается выполнять запрос с использованием текущего протокола, но может захотеть сделать это после того, как клиент обновится до другого протокола."
            )
        )

        return dogModelList

    }
}