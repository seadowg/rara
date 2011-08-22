import org.specs._
import com.github.oetzi.rara.Rint

object RintSpec extends Specification {
	"'times' function" should {
		"return the obj value of Rint" in {
			val rint = new Rint(5)
			(rint.times { i => true }) mustBe 5
		}
		
		"execute a passed block obj times" in {
			val rint = new Rint(5)
			var x = 0
			rint times { i => x = i }
			x mustBe 5
		}
		
		"not need a passed block" in {
			val rint = new Rint(5)
			(rint times()) mustBe 5
		}
		
		"only return number if obj is negative" in {
			val rint = new Rint(-5)
			var side_effect = 0
			val result = rint times { i => side_effect = side_effect + 1 }
			
			result mustBe -5
			side_effect mustBe 0
		}
	} 
}