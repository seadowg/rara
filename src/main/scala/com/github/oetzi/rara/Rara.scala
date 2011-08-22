package com.github.oetzi.rara {	
	object Rara {
		implicit def any2Robj(obj : Any) : Robj = new Robj(obj)
		implicit def string2Rstring(obj : String) : Rstring = new Rstring(obj)
		implicit def int2Rint(obj : Int) : Rint = new Rint(obj)
	}

	class Robj(obj : Any) {
		def to_s() : String = obj.toString
		def equal(other : Any) = obj.equals(other)
		def instance_of[T] = obj.isInstanceOf[T]
	}

	class Rstring(obj : String) {
		def to_i() : Int = obj.toInt
		def to_f() : Float = obj.toFloat
		def to_d() : Double = obj.toDouble
		def to_a() : Array[Char] = obj.toArray
		def to_b() : Boolean = obj.toBoolean
	}
	
	class Rint(obj : Int) {
		def times(block : Int => Any = { i => null }) : Int = {
			1.to(obj).foreach { i => block(i) }
			obj
		}
	}
}