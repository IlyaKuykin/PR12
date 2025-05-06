import requests

# Функция отправки GET запроса на сервер и получения ответа
def send_get_request(url):
    response = requests.get(url)
    return response.text

# Функция отправки POST запроса на сервер и получения ответа
def send_post_request(url, data):
    response = requests.post(url, data=data)
    return response.text
