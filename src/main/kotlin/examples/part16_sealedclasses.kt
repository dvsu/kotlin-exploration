package examples

// sealed classes are used to restrict class hierarchies
// The behavior is similar to "Enums"

fun sealedClassesExample() {
    println("""
    .-----.----------------------------------------------------------------------------------.
    |  16 | Sealed Classes                                                                   |
    '-----'----------------------------------------------------------------------------------'
    """.trimIndent())

    // observe the similar behavior to Enums but with additional parameter-access functionality
    messagingHandler(MessagingEvent.SentEvent(1890, "john.doe@example.com"))
    messagingHandler(MessagingEvent.ReceivedEvent(1910, "adam.smith@example.com"))
    messagingHandler(MessagingEvent.ErrorEvent(5678, "Not connected to network"))
}

sealed class MessagingEvent {
    class SentEvent(val messageId: Int, val to: String): MessagingEvent()
    class ReceivedEvent(val messageId: Int, val from: String): MessagingEvent()
    class ErrorEvent(val messageId: Int, val log: String): MessagingEvent()
}
// to access a sealed class, we usually use 'when'
fun messagingHandler(e: MessagingEvent) =
    when(e) {
        is MessagingEvent.SentEvent -> println("[ID: ${e.messageId}] Message sent to ${e.to}")
        is MessagingEvent.ReceivedEvent -> println("[ID: ${e.messageId}] Message received from ${e.from}")
        is MessagingEvent.ErrorEvent -> println("[ID: ${e.messageId}] Message error with log: ${e.log}")
    }