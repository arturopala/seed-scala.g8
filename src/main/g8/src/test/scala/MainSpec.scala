import org.scalatest.prop.PropertyChecks
import org.scalatest.{FlatSpec, Matchers}

class MainSpec extends FlatSpec with Matchers with PropertyChecks {

  "Main" should "be tested" in {
    Main.hello shouldBe "World!"
  }
}