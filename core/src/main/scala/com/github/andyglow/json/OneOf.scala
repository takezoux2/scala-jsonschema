package com.github.andyglow.json

trait OneOf[T1, T2] {
}

object OneOf {
  type _2[T1,T2] = OneOf[T1, T2]
  type _3[T1,T2,T3] = OneOf[T1, OneOf[T2, T3]]
  type _4[T1,T2,T3,T4] = OneOf[T1, OneOf[T2, OneOf[T3,T4]]]
  type _5[T1,T2,T3,T4,T5] = OneOf[T1, OneOf[T2, OneOf[T3,OneOf[T4,T5]]]]
  type _6[T1,T2,T3,T4,T5,T6] = OneOf[T1, OneOf[T2, OneOf[T3,OneOf[T4,OneOf[T5,T6]]]]]
  type _7[T1,T2,T3,T4,T5,T6,T7] = OneOf[T1, OneOf[T2, OneOf[T3,OneOf[T4,OneOf[T5,OneOf[T6,T7]]]]]]
  type _8[T1,T2,T3,T4,T5,T6,T7,T8] = OneOf[T1, OneOf[T2, OneOf[T3,OneOf[T4,OneOf[T5,OneOf[T6,OneOf[T7,T8]]]]]]]
  type _9[T1,T2,T3,T4,T5,T6,T7,T8,T9] = OneOf[T1, OneOf[T2, OneOf[T3,OneOf[T4,OneOf[T5,OneOf[T6,OneOf[T7,OneOf[T8,T9]]]]]]]]
}
