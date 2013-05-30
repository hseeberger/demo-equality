# demo-equality #

Demos for type-safe equality with Scala implicits.

The simplest approach gives you a **type-safe** yet **unbalanced** `===` equality operation:

```
scala> import name.heikoseeberger.demoequality._
import name.heikoseeberger.demoequality._

scala> import SimpleEquality._
import SimpleEquality._

scala> 123 === 666
res0: Boolean = false

scala> "a" === "a"
res1: Boolean = true

scala> 123 === "a"
<console>:14: error: type mismatch;
 found   : String("a")
 required: Int
              123 === "a"

scala> Seq(1, 2, 3) === List(1, 2, 3)
res3: Boolean = true

scala> List(1, 2, 3) === Seq(1, 2, 3)
<console>:17: error: type mismatch;
 found   : Seq[Int]
 required: List[Int]
              List(1, 2, 3) === Seq(1, 2, 3)
```

For type- or view-based balanced equality more information see my blog series "Implicits unchained – type-safe equality":

- [Part 1](http://hseeberger.github.io/blog/2013/05/30/implicits-unchained-type-safe-equality-part1): simple yet unbalanced equality
- [Part 2](http://hseeberger.github.io/blog/2013/05/31/implicits-unchained-type-safe-equality-part2): type-wise balanced equality
- [Part 3](http://hseeberger.github.io/blog/2013/06/01/implicits-unchained-type-safe-equality-part3): view-wise balanced equality

## Contribution policy ##

Contributions via GitHub pull requests are gladly accepted from their original author. Along with any pull requests, please state that the contribution is your original work and that you license the work to the project under the project's open source license. Whether or not you state this explicitly, by submitting any copyrighted material via pull request, email, or other means you agree to license the material under the project's open source license and warrant that you have the legal authority to do so.

## License ##

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").
