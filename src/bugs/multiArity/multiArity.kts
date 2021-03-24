package bugs.multiArity
// by Mike Gorünov @Miha-x64

object MultiFunction : () -> Unit, (Unit) -> Unit {
  override fun invoke() {}
  override fun invoke(p1: Unit) {}
}

if (MultiFunction is () -> Unit) print(0)
if (MultiFunction is (Unit) -> Unit) print(1)

// What will it print?
// a) nothing
// b) 0
// c) 1
// d) 01
