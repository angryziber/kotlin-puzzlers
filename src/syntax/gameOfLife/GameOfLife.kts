val cells = arrayOf(arrayOf(1, 1, 1),
                    arrayOf(0, 1, 1),
                    arrayOf(1, 0, 1))

var neighbors = cells[0][0] + cells[0][1] + cells[0][2]
              + cells[1][0]               + cells[1][2]
              + cells[2][0] + cells[2][1] + cells[2][2]

print(neighbors)

// What will it print?
// a) 6
// b) 3
// c) 2
// d) will not compile
