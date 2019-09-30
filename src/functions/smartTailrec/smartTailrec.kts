// by Grigorii Yurkov @rpuxa

tailrec fun recursive() {
  ::recursive()
}

recursive()

// What will it print?
// a) Infinite loop
// b) StackOverflowError
// c) Will not compile
// d) None of the above
