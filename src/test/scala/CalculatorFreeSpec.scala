import org.scalatest.freespec.AnyFreeSpec

class CalculatorFreeSpec extends AnyFreeSpec {

  val calculator = new Calculator1

  "The calculator of Addition " - {
    "gives back the two numbers of addition" in {
      assert(calculator.add(-5, -7) == (-12))
      assert(calculator.add(22, 88) == 110)
    }
  }
  "The calculator of Subtraction" - {
    "gives back to two numbers of subtraction" in {
      assert(calculator.sub(8, -4) == 12)
      assert(calculator.sub(1,0)==1)
      assert(calculator.sub(12, -3) == 15)
    }
  }
  "The Calculator of Multiplication"-{
    "gives back to two  numbers of multiplication" in{
      assert(calculator.mul(3,3)==9)
      assert(calculator.mul(6,4)==24)
    }
  }
  "The Calculator of Division" - {
    "gives back to two  numbers of divison" in{
      assert(calculator.div(3,3)===1)
      assert(calculator.div(6,-3)==(-2))
    }
  }
}