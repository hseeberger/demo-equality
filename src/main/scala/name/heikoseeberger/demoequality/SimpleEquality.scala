/*
 * Copyright 2013 Heiko Seeberger
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package name.heikoseeberger.demoequality

/**
 * By importing `SimpleEquality._` you get '''type-safe''' yet '''unbalanced''' equality:
 *
 * {{{
 * import name.heikoseeberger.demoequality.SimpleEquality._
 *
 * 123 === 666 // false
 * "a" === "a" // true
 * 123 === "a" // won't compile!
 * }}}
 *
 * This equality is unbalanced, i.e. `===` only works (compiles),
 * if the type on the right is a subtype (including the same type) of the type on the left:
 *
 * {{{
 * Seq(1, 2, 3) === List(1, 2, 3)
 * List(1, 2, 3) === Seq(1, 2, 3) // won't compile!
 * }}}
 */
object SimpleEquality {

  /**
   * Extends any type with a type-safe and unbalanced `===` operator.
   */
  implicit class Equal[A](val left: A) extends AnyVal {

    /**
     * Type-safe and unbalanced `===` operator.
     */
    def ===(right: A): Boolean =
      left == right
  }
}
