package lesson11.task3

class Room(
    val cover: String,
    val nameRoom: String,
    var listParticipants: MutableList<Participant> = mutableListOf(),
) {
    fun clickAvatar(participant: Participant) {
        println(
            "Вы навели курсор на автар участника:\n" +
                "Имя пользователя ${participant.nikName},\nАватарка " +
                "${participant.avatar},\nСтатус микрофона ${participant.speakerStatus},\n",
        )
    }

    fun addingParticipant(
        participant: Participant,
        listParticipants: MutableList<Participant>,
        room: Room,
    ) {
        listParticipants.add(participant)
        println("Новый участник ${participant.nikName} добавлен в ${room.nameRoom} c цветом обложки ${room.cover}")
    }

    fun updateStatus(participant: Participant) {
        println("Обновите статус спикера:")
        participant.speakerStatus = readln()
    }
}
