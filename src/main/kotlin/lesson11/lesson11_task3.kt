package lesson11

import java.awt.Color

fun main() {
    addingParticipant(participants, room.listParticipants, room)
    clickAvatar(participants)
    updateStatus(participants)
    clickAvatar(participants)
}

class Room(
    val cover: Color,
    val nameRoom: String,
    var listParticipants: MutableList<String> = mutableListOf("привет"),
)

class Participants(
    var speakerStatus: String,
    val nikName: String,
    val avatar: String,
)

val participants =
    Participants(
        speakerStatus = "mute",
        nikName = "Denis",
        avatar = "парень",
    )

val room =
    Room(
        cover = Color.red,
        nameRoom = "Комната для любителей бега",
        listParticipants = mutableListOf(),
    )

fun updateStatus(participant: Participants) {
    println("Обновите статус спикера:")
    participant.speakerStatus = readln()
}

fun clickAvatar(participant: Participants) {
    println(
        "Имя пользователя ${participant.nikName},\nАватарка " +
            "${participant.avatar},\nСтатус микрофона ${participant.speakerStatus},\n",
    )
}

fun addingParticipant(
    participant: Participants,
    listParticipants: MutableList<String>,
    room: Room,
) {
    val participantDetails =
        "Имя пользователя: ${participant.nikName}, Аватарка: ${participant.avatar}, " +
            "Статус микрофона: ${participant.speakerStatus}"
    listParticipants.add(participantDetails)
    println("Новый участник ${participant.nikName} добавлен в ${room.nameRoom}")
}

// fun roomDetails(room: Room) {
//    val roomDetails =
//        "Название комнаты: ${room.nameRoom}, Обложка: ${room.cover}, " +
//            "Список участников: ${room.listParticipants}"
//    println(roomDetails)
// }

// Прокачиваем абстрактное мышление. Задача на проектирование сущностей для
// упрощенной версии приложения социальной сети, в которой общаются только голосом.
// Требуется описать сущности и имитировать действия методами.
//
// Функционал одного из модулей будет такой. Есть лента, в которой отображаются
// “комнаты” для общения по интересам. В карточке “комнаты” отображается:
//
// - обложка;
// - название;
// - список участников — отображаются в виде аватарок. При долгом нажатии на
// аватар подсветится его никнейм. Рядом с аватаркой отображается текстовый бейдж
// с одним из возможных статусов говорящего: “разговаривает”, “микрофон выключен”,
// “пользователь заглушен”.
//
// Класс должен содержать методы:
//
// – добавления участника (принимает объект участника и сохраняет в свойство комнаты);
// – обновления статуса (принимает имя пользователя и новый статус);
// – вывода информации о пользователе при долгом нажатии на аватар.
//
// После проектирования создай объект комнаты с произвольными данными.
