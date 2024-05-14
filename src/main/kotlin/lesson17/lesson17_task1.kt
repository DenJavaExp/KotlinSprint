class Victrina(
    question: String,
    answer: String,
) {
    var question = "Зимой и летом одним цветом?"
        get() = field

    var answer = "Ёлка!"
        get() = field
        set(value) {
            field = value
        }
}
