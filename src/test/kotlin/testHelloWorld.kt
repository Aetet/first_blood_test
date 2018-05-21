import io.kotlintest.matchers.startWith
import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class MyTests : StringSpec({
    "Hello, World test" {
        helloWorld() shouldBe "Hello, World!"
    }
})