val xs = for{
  a <- 1:: 2::3:: Nil
  b <- 4:: 5::6:: Nil
} yield b


1+1
!!!
2+2

1::2::Nil
Seq(1,2)