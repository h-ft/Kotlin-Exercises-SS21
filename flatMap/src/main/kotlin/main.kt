fun main(args: Array<String>) {
    val departments = listOf(
        Department(listOf(Worker("Jack Black"), Worker("James Roe"))),
        Department(listOf(Worker("Mick Kick"), Worker("Johns Rones")))
    )

    val allWorkers = departments.flatMap { it.workers }
    println(allWorkers)
}

fun <T, R> Iterable<T>.flatMap(transform: (T) -> Iterable<R>): List<R> {
    val resList = mutableListOf<R>()
    for(items in this) {
        resList.addAll(transform(items))
    }
    return resList.toList()
}