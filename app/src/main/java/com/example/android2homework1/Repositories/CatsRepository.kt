package com.example.android2homework1.Repositories

import com.example.android2homework1.data.DataModel

class CatsRepository {

    private val catAddress: String = "https://http.cat/"
    private val catModelList = ArrayList<DataModel>()

    fun getListOfCats(): ArrayList<DataModel> {
        catModelList.add(
            DataModel(
                "${catAddress}100",
                "Continue",
                "неудачное соединение с сервером из-за неверного пароля"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}101.jpg",
                "Switching Protocols",
                "Ошибка программной логики возникает, когда, несмотря на точный ввод от пользователя, производится неверный вывод. Это может произойти, когда исходный код Google Inc. имеет уязвимость в отношении передачи данных."
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}102.jpg",
                "Processing",
                "логическая ошибка возникает, когда компьютер генерирует неправильный вывод, даже если пользователь предоставляет правильный ввод. Это связано с ошибками в исходном коде Google Inc., обрабатывающих ввод неправильно"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}103.jpg",
                "Early Hints",
                "Не удалось выполнить операции шифрования/расшифровки на компьютере."
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}200.jpg",
                "Ok",
                "запрос пользователя выполнен успешно, и страница, на которую он переходил, найдена и отображена."
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}201.jpg",
                "Created",
                "в результате успешного выполнения запроса был создан новый ресурс"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}202.jpg",
                "Accepted",
                "запрос получен, но ещё не обработан"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}203.jpg",
                "Non-Authoritative",
                "Статус ответа указывает, что запрос был успешным, но прилагаемая полезная нагрузка была изменена с учётом ответа сервера 200 ( OK ) сервера происхождения с помощью преобразующего proxy"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}204.jpg",
                "No Content",
                "сервер успешно обработал запрос, но в ответе были переданы только заголовки без тела сообщения."
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}206.jpg",
                "Partial Content",
                "приложения Adobe не могут сохранить ваш профиль и информацию о лицензии в безопасном хранилище"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}207.jpg",
                "Multi-Status",
                "получает правильный ввод, но генерирует неверный вывод"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}300.jpg",
                "Multiple Choices",
                "нарушение порядка зажигания"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}301.jpg",
                "Moved Permanently",
                "апрошенный ресурс был окончательно перемещён в URL, указанный в заголовке Location (en-US)"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}302.jpg",
                "Found",
                "запрошенный ресурс был временно перемещён по адресу, указанному в заголовке Location (en-US)"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}303.jpg",
                "See Other",
                "логическая ошибка возникает, когда Safari производит неправильный вывод из правильного ввода."
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}304.jpg",
                "Not Modified",
                "нет необходимости повторно передавать запрошенные ресурсы."
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}305.jpg",
                "Use Proxy",
                "запрос к запрашиваемому ресурсу должен осуществляться через прокси-сервер, URI которого указан в поле Location заголовка"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}307.jpg",
                "Temporary Redirect",
                "запрошенный ресурс был временно перемещён в URL-адрес, указанный в заголовке Location (en-US)."
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}308.jpg",
                "Permanent Redirect",
                "запрошенный ресурс был окончательно перемещён в URL-адрес, указанный в Location (en-US)."
            )
        )
        catModelList.add(DataModel("${catAddress}400.jpg", "Bad Request", "плохой запрос"))
        catModelList.add(
            DataModel(
                "${catAddress}401.jpg",
                "Unauthorized",
                "вы пытаетесь получить доступ к странице, на которую нужно сначала войти, используя действительный ID пользователя и пароль для просмотра."
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}402.jpg",
                "Payment Required",
                "нестандартная ошибка клиента, зарезервированная для использования в будущем"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}403.jpg",
                "Forbidden",
                "сервер понял запрос, но отказывается его авторизовать."
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}404.jpg",
                "Not Found",
                "сервер успешно обработал запрос и запрашиваемая страница будет загружена"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}405.jpg",
                "Method Not Allowed",
                "метод запроса известен серверу, но был отключён и не может быть использован."
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}406.jpg",
                "Not Acceptable",
                "код ошибки клиента 406 Not Acceptable означает, что сервер не может вернуть ответ, соответствующий списку допустимых значений, определённых в заголовках упреждающего согласования контента, и что сервер не желает вернуть представление контента по умолчанию"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}407.jpg",
                "Proxy Authentication Required",
                "Это сообщение появляется при проблемах с аутентификацией на прокси-сервере."
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}408.jpg",
                "Request Timeout",
                "сервер решил закрыть соединение, а не продолжать ждать."
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}409.jpg",
                "Conflict",
                "конфликт запроса с текущим состоянием сервера"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}410.jpg",
                "Gone",
                "целевой ресурс больше недоступен на сервере происхождения"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}411.jpg",
                "Length Required",
                "сервер отказывается принять запрос без определённого Content-Length ."
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}412.jpg",
                "Precondition Failed",
                "доступ к целевому ресурсу был отклонён"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}413.jpg",
                "Payload Too Large",
                "объект запроса больше, чем ограничения, определённые сервером"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}414.jpg",
                "URI Too Long",
                "Эта ошибка возникает, если URL API слишком длинные; она связана с ограничением длины веб-сервером"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}415.jpg",
                "Unsupported Media",
                " сервер отказывается принять запрос, потому что формат содержимого не поддерживается сервером. "
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}416.jpg",
                "Range Not Satisfiable",
                "сервер не может обслуживать запрошенные диапазоны."
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}418.jpg",
                "I'm a teapot",
                "сервер не может приготовить кофе, потому что он чайник"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}421.jpg",
                "Misdirected Request",
                "Сервер занят или перегружен"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}423.jpg",
                "ExpectationFailed",
                "целевой ресурс из запроса заблокирован от применения к нему указанного метода"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}424.jpg",
                "ExpectationFailed",
                "Возникает, в случаях подозрительных запросов, т. е. если запрос расценен как попытка несанкционированного доступа к сайту, через известные уязвимости CMS."
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}425.jpg",
                "ExpectationFailed",
                "сервер не хочет рисковать обрабатывать запрос, который может быть воспроизведённым, поскольку это открывает возможность для атаки повторного воспроизведения"
            )
        )
        catModelList.add(
            DataModel(
                "${catAddress}426.jpg",
                "ExpectationFailed",
                "сервер отказывается выполнять запрос с использованием текущего протокола, но может захотеть сделать это после того, как клиент обновится до другого протокола."
            )
        )

        return catModelList

    }
}