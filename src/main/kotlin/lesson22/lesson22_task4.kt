class MainScreenViewModel(mainScreenState: MainScreenState) {
    data class MainScreenState(val loadingData: String = "", val isLoding: Boolean = false)

    fun loadData() {
        val status = MainScreenState()
        for (state in 0..3) {
            if (state == 1) {
                val status1 = status.copy(loadingData = "Ожидаем загрузку данных")
                println(status1)
            } else if (state == 2) {
                val status2 = status.copy(loadingData = "Идёт загрузка данных", isLoding = true)
                println(status2)
            } else if (state == 3) {
                val status3 = status.copy(loadingData = "Загрузка данных окончена")
                println(status3)
            }
        }
    }
}

fun main() {
    val mainScreenViewModel = MainScreenViewModel(mainScreenState = MainScreenViewModel.MainScreenState())
    mainScreenViewModel.loadData()
}
