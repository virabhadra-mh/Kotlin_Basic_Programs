
class RaceCondiationCheck : Runnable {

    private var inventory = 2
    var twoSeconds: Long = 1

    override fun run() {
        synchronized(this) {     // Synchronized is used for to allow only one thread to operat resourses;
            if (inventory > 0) {
                try {
                    println("Thread " + Thread.currentThread().name + " starting with inventory: " + inventory)
                    Thread.sleep(twoSeconds)
                } catch (e: InterruptedException) {
                    // no op
                }
                inventory--
                println("Thread " + Thread.currentThread().name + " leaving with inventory: " + inventory)
            } else {
                println("Need to backorder! Thread " + Thread.currentThread().name + " found inventory with: " + inventory)
            }
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val prc = RaceCondiationCheck()
            val firstThread = Thread(prc, "First thread")
            val secondThread = Thread(prc, "Second thread")
            firstThread.start()
            secondThread.start()
        }
    }
}