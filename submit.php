<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $name = $_POST['name'] ?? 'Не указано';
    $email = $_POST['email'] ?? 'Не указано';
    $message = $_POST['message'] ?? 'Пусто';

    // Здесь может быть логика записи в БД, лог или почта
    echo "Данные успешно получены!<br>Имя: $name<br>Email: $email<br>Сообщение: $message";
}
?>
