fun main () {
    var pembeli = 625_000
    var member = true

    if (pembeli >= 500_000) {
        if (member) {
            var total = pembeli * 10 / 100
            var total1 = pembeli * 5 / 100
            var total2 = total + total1
            var pembeli1 = pembeli - total2
            println("pembeli 1 mendapat diskon 15% dari $pembeli , jadi totalnya $pembeli - $total2 = $pembeli1")
        } else {
            var total = pembeli * 10 / 100
            var total1 = pembeli - total
            println("pembeli 1 mendapat diskon 10% dari $pembeli/ jadi totalnya $total1")
        }
    }
    var tinggibadan = 170
    var beratbadan = 50
    var rumus = tinggibadan - 110
    if (beratbadan == rumus) {
        println("idel")
    } else if (beratbadan <= rumus) {
        println("kurus")
    } else {
        println("gemuk")
    }

}
