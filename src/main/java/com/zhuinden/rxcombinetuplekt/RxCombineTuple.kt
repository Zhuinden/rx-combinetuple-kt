/*
 * Copyright 2020-2023 Gabor Varadi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zhuinden.rxcombinetuplekt

import com.zhuinden.tupleskt.*
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.functions.*
import io.reactivex.functions.Function

fun <T1: Any> combineTuple(f1: Flowable<T1>): Flowable<Tuple1<T1>> = f1.map(::Tuple1)

fun <T1: Any, T2: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>): Flowable<Pair<T1, T2>> = Flowable.combineLatest(
    f1,
    f2,
    BiFunction<T1, T2, Pair<T1, T2>> { t1, t2 -> t1 to t2 }
)

fun <T1: Any, T2: Any, T3: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>): Flowable<Triple<T1, T2, T3>> = Flowable.combineLatest(
    f1,
    f2,
    f3,
    Function3<T1, T2, T3, Triple<T1, T2, T3>> { t1, t2, t3 -> Triple(t1, t2, t3) }
)

fun <T1: Any, T2: Any, T3: Any, T4: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>): Flowable<Tuple4<T1, T2, T3, T4>> = Flowable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    Function4<T1, T2, T3, T4, Tuple4<T1, T2, T3, T4>> { t1, t2, t3, t4 -> Tuple4(t1, t2, t3, t4) }
)

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>): Flowable<Tuple5<T1, T2, T3, T4, T5>> = Flowable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    Function5<T1, T2, T3, T4, T5, Tuple5<T1, T2, T3, T4, T5>> { t1, t2, t3, t4, t5 -> Tuple5(t1, t2, t3, t4, t5) }
)

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>): Flowable<Tuple6<T1, T2, T3, T4, T5, T6>> = Flowable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    Function6<T1, T2, T3, T4, T5, T6, Tuple6<T1, T2, T3, T4, T5, T6>> { t1, t2, t3, t4, t5, t6 -> Tuple6(t1, t2, t3, t4, t5, t6) }
)

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>): Flowable<Tuple7<T1, T2, T3, T4, T5, T6, T7>> = Flowable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    Function7<T1, T2, T3, T4, T5, T6, T7, Tuple7<T1, T2, T3, T4, T5, T6, T7>> { t1, t2, t3, t4, t5, t6, t7 -> Tuple7(t1, t2, t3, t4, t5, t6, t7) }
)

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>): Flowable<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> = Flowable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    Function8<T1, T2, T3, T4, T5, T6, T7, T8, Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> { t1, t2, t3, t4, t5, t6, t7, t8 -> Tuple8(t1, t2, t3, t4, t5, t6, t7, t8) }
)

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>): Flowable<Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> = Flowable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> { t1, t2, t3, t4, t5, t6, t7, t8, t9 -> Tuple9(t1, t2, t3, t4, t5, t6, t7, t8, t9) }
)

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>): Flowable<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10), object : Function<Array<*>, Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> {
    override fun apply(t: Array<*>): Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> {
        @Suppress("UNCHECKED_CAST")
        return Tuple10(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>): Flowable<Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11), object : Function<Array<*>, Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> {
    override fun apply(t: Array<*>): Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> {
        @Suppress("UNCHECKED_CAST")
        return Tuple11(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>): Flowable<Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12), object : Function<Array<*>, Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> {
    override fun apply(t: Array<*>): Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> {
        @Suppress("UNCHECKED_CAST")
        return Tuple12(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>): Flowable<Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13), object : Function<Array<*>, Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> {
    override fun apply(t: Array<*>): Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> {
        @Suppress("UNCHECKED_CAST")
        return Tuple13(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>): Flowable<Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13, 
    f14), object : Function<Array<*>, Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>> {
    override fun apply(t: Array<*>): Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> {
        @Suppress("UNCHECKED_CAST")
        return Tuple14(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>): Flowable<Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14, 
    f15), object : Function<Array<*>, Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> {
    override fun apply(t: Array<*>): Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> {
        @Suppress("UNCHECKED_CAST")
        return Tuple15(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>): Flowable<Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16), object : Function<Array<*>, Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>> {
    override fun apply(t: Array<*>): Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> {
        @Suppress("UNCHECKED_CAST")
        return Tuple16(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>): Flowable<Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17), object : Function<Array<*>, Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>> {
    override fun apply(t: Array<*>): Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> {
        @Suppress("UNCHECKED_CAST")
        return Tuple17(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>): Flowable<Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18), object : Function<Array<*>, Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>> {
    override fun apply(t: Array<*>): Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> {
        @Suppress("UNCHECKED_CAST")
        return Tuple18(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>): Flowable<Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19), object : Function<Array<*>, Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>> {
    override fun apply(t: Array<*>): Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> {
        @Suppress("UNCHECKED_CAST")
        return Tuple19(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>): Flowable<Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20), object : Function<Array<*>, Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>> {
    override fun apply(t: Array<*>): Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> {
        @Suppress("UNCHECKED_CAST")
        return Tuple20(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>, f21: Flowable<T21>): Flowable<Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21), object : Function<Array<*>, Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>> {
    override fun apply(t: Array<*>): Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> {
        @Suppress("UNCHECKED_CAST")
        return Tuple21(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>, f21: Flowable<T21>, f22: Flowable<T22>): Flowable<Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22), object : Function<Array<*>, Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>> {
    override fun apply(t: Array<*>): Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> {
        @Suppress("UNCHECKED_CAST")
        return Tuple22(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>, f21: Flowable<T21>, f22: Flowable<T22>, f23: Flowable<T23>): Flowable<Tuple23<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23), object : Function<Array<*>, Tuple23<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23>> {
    override fun apply(t: Array<*>): Tuple23<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> {
        @Suppress("UNCHECKED_CAST")
        return Tuple23(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>, f21: Flowable<T21>, f22: Flowable<T22>, f23: Flowable<T23>, f24: Flowable<T24>): Flowable<Tuple24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24), object : Function<Array<*>, Tuple24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24>> {
    override fun apply(t: Array<*>): Tuple24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> {
        @Suppress("UNCHECKED_CAST")
        return Tuple24(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>, f21: Flowable<T21>, f22: Flowable<T22>, f23: Flowable<T23>, f24: Flowable<T24>, f25: Flowable<T25>): Flowable<Tuple25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25), object : Function<Array<*>, Tuple25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25>> {
    override fun apply(t: Array<*>): Tuple25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> {
        @Suppress("UNCHECKED_CAST")
        return Tuple25(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>, f21: Flowable<T21>, f22: Flowable<T22>, f23: Flowable<T23>, f24: Flowable<T24>, f25: Flowable<T25>, f26: Flowable<T26>): Flowable<Tuple26<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26), object : Function<Array<*>, Tuple26<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26>> {
    override fun apply(t: Array<*>): Tuple26<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> {
        @Suppress("UNCHECKED_CAST")
        return Tuple26(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>, f21: Flowable<T21>, f22: Flowable<T22>, f23: Flowable<T23>, f24: Flowable<T24>, f25: Flowable<T25>, f26: Flowable<T26>, f27: Flowable<T27>): Flowable<Tuple27<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27), object : Function<Array<*>, Tuple27<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27>> {
    override fun apply(t: Array<*>): Tuple27<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> {
        @Suppress("UNCHECKED_CAST")
        return Tuple27(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>, f21: Flowable<T21>, f22: Flowable<T22>, f23: Flowable<T23>, f24: Flowable<T24>, f25: Flowable<T25>, f26: Flowable<T26>, f27: Flowable<T27>, f28: Flowable<T28>): Flowable<Tuple28<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28), object : Function<Array<*>, Tuple28<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28>> {
    override fun apply(t: Array<*>): Tuple28<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> {
        @Suppress("UNCHECKED_CAST")
        return Tuple28(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any, T29: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>, f21: Flowable<T21>, f22: Flowable<T22>, f23: Flowable<T23>, f24: Flowable<T24>, f25: Flowable<T25>, f26: Flowable<T26>, f27: Flowable<T27>, f28: Flowable<T28>, f29: Flowable<T29>): Flowable<Tuple29<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28,
    f29), object : Function<Array<*>, Tuple29<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29>> {
    override fun apply(t: Array<*>): Tuple29<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> {
        @Suppress("UNCHECKED_CAST")
        return Tuple29(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28, t[28] as T29)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any, T29: Any, T30: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>, f21: Flowable<T21>, f22: Flowable<T22>, f23: Flowable<T23>, f24: Flowable<T24>, f25: Flowable<T25>, f26: Flowable<T26>, f27: Flowable<T27>, f28: Flowable<T28>, f29: Flowable<T29>, f30: Flowable<T30>): Flowable<Tuple30<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28,
    f29,
    f30), object : Function<Array<*>, Tuple30<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30>> {
    override fun apply(t: Array<*>): Tuple30<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> {
        @Suppress("UNCHECKED_CAST")
        return Tuple30(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28, t[28] as T29, t[29] as T30)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any, T29: Any, T30: Any, T31: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>, f21: Flowable<T21>, f22: Flowable<T22>, f23: Flowable<T23>, f24: Flowable<T24>, f25: Flowable<T25>, f26: Flowable<T26>, f27: Flowable<T27>, f28: Flowable<T28>, f29: Flowable<T29>, f30: Flowable<T30>, f31: Flowable<T31>): Flowable<Tuple31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28,
    f29,
    f30,
    f31), object : Function<Array<*>, Tuple31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>> {
    override fun apply(t: Array<*>): Tuple31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> {
        @Suppress("UNCHECKED_CAST")
        return Tuple31(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28, t[28] as T29, t[29] as T30, t[30] as T31)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any, T29: Any, T30: Any, T31: Any, T32: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>, f21: Flowable<T21>, f22: Flowable<T22>, f23: Flowable<T23>, f24: Flowable<T24>, f25: Flowable<T25>, f26: Flowable<T26>, f27: Flowable<T27>, f28: Flowable<T28>, f29: Flowable<T29>, f30: Flowable<T30>, f31: Flowable<T31>, f32: Flowable<T32>): Flowable<Tuple32<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28,
    f29,
    f30,
    f31,
    f32), object : Function<Array<*>, Tuple32<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32>> {
    override fun apply(t: Array<*>): Tuple32<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> {
        @Suppress("UNCHECKED_CAST")
        return Tuple32(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28, t[28] as T29, t[29] as T30, t[30] as T31, t[31] as T32)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any, T29: Any, T30: Any, T31: Any, T32: Any, T33: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>, f21: Flowable<T21>, f22: Flowable<T22>, f23: Flowable<T23>, f24: Flowable<T24>, f25: Flowable<T25>, f26: Flowable<T26>, f27: Flowable<T27>, f28: Flowable<T28>, f29: Flowable<T29>, f30: Flowable<T30>, f31: Flowable<T31>, f32: Flowable<T32>, f33: Flowable<T33>): Flowable<Tuple33<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28,
    f29,
    f30,
    f31,
    f32,
    f33), object : Function<Array<*>, Tuple33<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33>> {
    override fun apply(t: Array<*>): Tuple33<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33> {
        @Suppress("UNCHECKED_CAST")
        return Tuple33(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28, t[28] as T29, t[29] as T30, t[30] as T31, t[31] as T32, t[32] as T33)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any, T29: Any, T30: Any, T31: Any, T32: Any, T33: Any, T34: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>, f21: Flowable<T21>, f22: Flowable<T22>, f23: Flowable<T23>, f24: Flowable<T24>, f25: Flowable<T25>, f26: Flowable<T26>, f27: Flowable<T27>, f28: Flowable<T28>, f29: Flowable<T29>, f30: Flowable<T30>, f31: Flowable<T31>, f32: Flowable<T32>, f33: Flowable<T33>, f34: Flowable<T34>): Flowable<Tuple34<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28,
    f29,
    f30,
    f31,
    f32,
    f33,
    f34), object : Function<Array<*>, Tuple34<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34>> {
    override fun apply(t: Array<*>): Tuple34<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34> {
        @Suppress("UNCHECKED_CAST")
        return Tuple34(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28, t[28] as T29, t[29] as T30, t[30] as T31, t[31] as T32, t[32] as T33, t[33] as T34)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any, T29: Any, T30: Any, T31: Any, T32: Any, T33: Any, T34: Any, T35: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>, f21: Flowable<T21>, f22: Flowable<T22>, f23: Flowable<T23>, f24: Flowable<T24>, f25: Flowable<T25>, f26: Flowable<T26>, f27: Flowable<T27>, f28: Flowable<T28>, f29: Flowable<T29>, f30: Flowable<T30>, f31: Flowable<T31>, f32: Flowable<T32>, f33: Flowable<T33>, f34: Flowable<T34>, f35: Flowable<T35>): Flowable<Tuple35<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28,
    f29,
    f30,
    f31,
    f32,
    f33,
    f34,
    f35), object : Function<Array<*>, Tuple35<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35>> {
    override fun apply(t: Array<*>): Tuple35<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35> {
        @Suppress("UNCHECKED_CAST")
        return Tuple35(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28, t[28] as T29, t[29] as T30, t[30] as T31, t[31] as T32, t[32] as T33, t[33] as T34, t[34] as T35)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any, T29: Any, T30: Any, T31: Any, T32: Any, T33: Any, T34: Any, T35: Any, T36: Any> combineTuple(f1: Flowable<T1>, f2: Flowable<T2>, f3: Flowable<T3>, f4: Flowable<T4>, f5: Flowable<T5>, f6: Flowable<T6>, f7: Flowable<T7>, f8: Flowable<T8>, f9: Flowable<T9>, f10: Flowable<T10>, f11: Flowable<T11>, f12: Flowable<T12>, f13: Flowable<T13>, f14: Flowable<T14>, f15: Flowable<T15>, f16: Flowable<T16>, f17: Flowable<T17>, f18: Flowable<T18>, f19: Flowable<T19>, f20: Flowable<T20>, f21: Flowable<T21>, f22: Flowable<T22>, f23: Flowable<T23>, f24: Flowable<T24>, f25: Flowable<T25>, f26: Flowable<T26>, f27: Flowable<T27>, f28: Flowable<T28>, f29: Flowable<T29>, f30: Flowable<T30>, f31: Flowable<T31>, f32: Flowable<T32>, f33: Flowable<T33>, f34: Flowable<T34>, f35: Flowable<T35>, f36: Flowable<T36>): Flowable<Tuple36<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35, T36>> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28,
    f29,
    f30,
    f31,
    f32,
    f33,
    f34,
    f35,
    f36), object : Function<Array<*>, Tuple36<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35, T36>> {
    override fun apply(t: Array<*>): Tuple36<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35, T36> {
        @Suppress("UNCHECKED_CAST")
        return Tuple36(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28, t[28] as T29, t[29] as T30, t[30] as T31, t[31] as T32, t[32] as T33, t[33] as T34, t[34] as T35, t[35] as T36)
    }
})

fun <T1: Any> combineTuple(f1: Observable<T1>): Observable<Tuple1<T1>> = f1.map(::Tuple1)

fun <T1: Any, T2: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>): Observable<Pair<T1, T2>> = Observable.combineLatest(
    f1,
    f2,
    BiFunction<T1, T2, Pair<T1, T2>> { t1, t2 -> t1 to t2 }
)

fun <T1: Any, T2: Any, T3: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>): Observable<Triple<T1, T2, T3>> = Observable.combineLatest(
    f1,
    f2,
    f3,
    Function3<T1, T2, T3, Triple<T1, T2, T3>> { t1, t2, t3 -> Triple(t1, t2, t3) }
)

fun <T1: Any, T2: Any, T3: Any, T4: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>): Observable<Tuple4<T1, T2, T3, T4>> = Observable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    Function4<T1, T2, T3, T4, Tuple4<T1, T2, T3, T4>> { t1, t2, t3, t4 -> Tuple4(t1, t2, t3, t4) }
)

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>): Observable<Tuple5<T1, T2, T3, T4, T5>> = Observable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    Function5<T1, T2, T3, T4, T5, Tuple5<T1, T2, T3, T4, T5>> { t1, t2, t3, t4, t5 -> Tuple5(t1, t2, t3, t4, t5) }
)

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>): Observable<Tuple6<T1, T2, T3, T4, T5, T6>> = Observable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    Function6<T1, T2, T3, T4, T5, T6, Tuple6<T1, T2, T3, T4, T5, T6>> { t1, t2, t3, t4, t5, t6 -> Tuple6(t1, t2, t3, t4, t5, t6) }
)

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>): Observable<Tuple7<T1, T2, T3, T4, T5, T6, T7>> = Observable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    Function7<T1, T2, T3, T4, T5, T6, T7, Tuple7<T1, T2, T3, T4, T5, T6, T7>> { t1, t2, t3, t4, t5, t6, t7 -> Tuple7(t1, t2, t3, t4, t5, t6, t7) }
)

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>): Observable<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> = Observable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    Function8<T1, T2, T3, T4, T5, T6, T7, T8, Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> { t1, t2, t3, t4, t5, t6, t7, t8 -> Tuple8(t1, t2, t3, t4, t5, t6, t7, t8) }
)

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>): Observable<Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> = Observable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> { t1, t2, t3, t4, t5, t6, t7, t8, t9 -> Tuple9(t1, t2, t3, t4, t5, t6, t7, t8, t9) }
)

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>): Observable<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10), object : Function<Array<*>, Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> {
    override fun apply(t: Array<*>): Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> {
        @Suppress("UNCHECKED_CAST")
        return Tuple10(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>): Observable<Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11), object : Function<Array<*>, Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> {
    override fun apply(t: Array<*>): Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> {
        @Suppress("UNCHECKED_CAST")
        return Tuple11(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>): Observable<Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12), object : Function<Array<*>, Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> {
    override fun apply(t: Array<*>): Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> {
        @Suppress("UNCHECKED_CAST")
        return Tuple12(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>): Observable<Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13), object : Function<Array<*>, Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> {
    override fun apply(t: Array<*>): Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> {
        @Suppress("UNCHECKED_CAST")
        return Tuple13(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>): Observable<Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14), object : Function<Array<*>, Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>> {
    override fun apply(t: Array<*>): Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> {
        @Suppress("UNCHECKED_CAST")
        return Tuple14(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>): Observable<Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15), object : Function<Array<*>, Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> {
    override fun apply(t: Array<*>): Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> {
        @Suppress("UNCHECKED_CAST")
        return Tuple15(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>): Observable<Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16), object : Function<Array<*>, Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>> {
    override fun apply(t: Array<*>): Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> {
        @Suppress("UNCHECKED_CAST")
        return Tuple16(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>): Observable<Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17), object : Function<Array<*>, Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>> {
    override fun apply(t: Array<*>): Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> {
        @Suppress("UNCHECKED_CAST")
        return Tuple17(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>): Observable<Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18), object : Function<Array<*>, Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>> {
    override fun apply(t: Array<*>): Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> {
        @Suppress("UNCHECKED_CAST")
        return Tuple18(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>): Observable<Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19), object : Function<Array<*>, Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>> {
    override fun apply(t: Array<*>): Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> {
        @Suppress("UNCHECKED_CAST")
        return Tuple19(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>): Observable<Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20), object : Function<Array<*>, Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>> {
    override fun apply(t: Array<*>): Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> {
        @Suppress("UNCHECKED_CAST")
        return Tuple20(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>, f21: Observable<T21>): Observable<Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21), object : Function<Array<*>, Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>> {
    override fun apply(t: Array<*>): Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> {
        @Suppress("UNCHECKED_CAST")
        return Tuple21(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>, f21: Observable<T21>, f22: Observable<T22>): Observable<Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22), object : Function<Array<*>, Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>> {
    override fun apply(t: Array<*>): Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> {
        @Suppress("UNCHECKED_CAST")
        return Tuple22(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>, f21: Observable<T21>, f22: Observable<T22>, f23: Observable<T23>): Observable<Tuple23<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23), object : Function<Array<*>, Tuple23<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23>> {
    override fun apply(t: Array<*>): Tuple23<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> {
        @Suppress("UNCHECKED_CAST")
        return Tuple23(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>, f21: Observable<T21>, f22: Observable<T22>, f23: Observable<T23>, f24: Observable<T24>): Observable<Tuple24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24), object : Function<Array<*>, Tuple24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24>> {
    override fun apply(t: Array<*>): Tuple24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> {
        @Suppress("UNCHECKED_CAST")
        return Tuple24(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>, f21: Observable<T21>, f22: Observable<T22>, f23: Observable<T23>, f24: Observable<T24>, f25: Observable<T25>): Observable<Tuple25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25), object : Function<Array<*>, Tuple25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25>> {
    override fun apply(t: Array<*>): Tuple25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> {
        @Suppress("UNCHECKED_CAST")
        return Tuple25(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>, f21: Observable<T21>, f22: Observable<T22>, f23: Observable<T23>, f24: Observable<T24>, f25: Observable<T25>, f26: Observable<T26>): Observable<Tuple26<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26), object : Function<Array<*>, Tuple26<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26>> {
    override fun apply(t: Array<*>): Tuple26<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> {
        @Suppress("UNCHECKED_CAST")
        return Tuple26(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>, f21: Observable<T21>, f22: Observable<T22>, f23: Observable<T23>, f24: Observable<T24>, f25: Observable<T25>, f26: Observable<T26>, f27: Observable<T27>): Observable<Tuple27<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27), object : Function<Array<*>, Tuple27<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27>> {
    override fun apply(t: Array<*>): Tuple27<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> {
        @Suppress("UNCHECKED_CAST")
        return Tuple27(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>, f21: Observable<T21>, f22: Observable<T22>, f23: Observable<T23>, f24: Observable<T24>, f25: Observable<T25>, f26: Observable<T26>, f27: Observable<T27>, f28: Observable<T28>): Observable<Tuple28<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28), object : Function<Array<*>, Tuple28<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28>> {
    override fun apply(t: Array<*>): Tuple28<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> {
        @Suppress("UNCHECKED_CAST")
        return Tuple28(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any, T29: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>, f21: Observable<T21>, f22: Observable<T22>, f23: Observable<T23>, f24: Observable<T24>, f25: Observable<T25>, f26: Observable<T26>, f27: Observable<T27>, f28: Observable<T28>, f29: Observable<T29>): Observable<Tuple29<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28,
    f29), object : Function<Array<*>, Tuple29<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29>> {
    override fun apply(t: Array<*>): Tuple29<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> {
        @Suppress("UNCHECKED_CAST")
        return Tuple29(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28, t[28] as T29)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any, T29: Any, T30: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>, f21: Observable<T21>, f22: Observable<T22>, f23: Observable<T23>, f24: Observable<T24>, f25: Observable<T25>, f26: Observable<T26>, f27: Observable<T27>, f28: Observable<T28>, f29: Observable<T29>, f30: Observable<T30>): Observable<Tuple30<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28,
    f29,
    f30), object : Function<Array<*>, Tuple30<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30>> {
    override fun apply(t: Array<*>): Tuple30<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> {
        @Suppress("UNCHECKED_CAST")
        return Tuple30(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28, t[28] as T29, t[29] as T30)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any, T29: Any, T30: Any, T31: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>, f21: Observable<T21>, f22: Observable<T22>, f23: Observable<T23>, f24: Observable<T24>, f25: Observable<T25>, f26: Observable<T26>, f27: Observable<T27>, f28: Observable<T28>, f29: Observable<T29>, f30: Observable<T30>, f31: Observable<T31>): Observable<Tuple31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28,
    f29,
    f30,
    f31), object : Function<Array<*>, Tuple31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>> {
    override fun apply(t: Array<*>): Tuple31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> {
        @Suppress("UNCHECKED_CAST")
        return Tuple31(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28, t[28] as T29, t[29] as T30, t[30] as T31)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any, T29: Any, T30: Any, T31: Any, T32: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>, f21: Observable<T21>, f22: Observable<T22>, f23: Observable<T23>, f24: Observable<T24>, f25: Observable<T25>, f26: Observable<T26>, f27: Observable<T27>, f28: Observable<T28>, f29: Observable<T29>, f30: Observable<T30>, f31: Observable<T31>, f32: Observable<T32>): Observable<Tuple32<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28,
    f29,
    f30,
    f31,
    f32), object : Function<Array<*>, Tuple32<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32>> {
    override fun apply(t: Array<*>): Tuple32<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> {
        @Suppress("UNCHECKED_CAST")
        return Tuple32(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28, t[28] as T29, t[29] as T30, t[30] as T31, t[31] as T32)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any, T29: Any, T30: Any, T31: Any, T32: Any, T33: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>, f21: Observable<T21>, f22: Observable<T22>, f23: Observable<T23>, f24: Observable<T24>, f25: Observable<T25>, f26: Observable<T26>, f27: Observable<T27>, f28: Observable<T28>, f29: Observable<T29>, f30: Observable<T30>, f31: Observable<T31>, f32: Observable<T32>, f33: Observable<T33>): Observable<Tuple33<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28,
    f29,
    f30,
    f31,
    f32,
    f33), object : Function<Array<*>, Tuple33<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33>> {
    override fun apply(t: Array<*>): Tuple33<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33> {
        @Suppress("UNCHECKED_CAST")
        return Tuple33(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28, t[28] as T29, t[29] as T30, t[30] as T31, t[31] as T32, t[32] as T33)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any, T29: Any, T30: Any, T31: Any, T32: Any, T33: Any, T34: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>, f21: Observable<T21>, f22: Observable<T22>, f23: Observable<T23>, f24: Observable<T24>, f25: Observable<T25>, f26: Observable<T26>, f27: Observable<T27>, f28: Observable<T28>, f29: Observable<T29>, f30: Observable<T30>, f31: Observable<T31>, f32: Observable<T32>, f33: Observable<T33>, f34: Observable<T34>): Observable<Tuple34<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28,
    f29,
    f30,
    f31,
    f32,
    f33,
    f34), object : Function<Array<*>, Tuple34<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34>> {
    override fun apply(t: Array<*>): Tuple34<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34> {
        @Suppress("UNCHECKED_CAST")
        return Tuple34(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28, t[28] as T29, t[29] as T30, t[30] as T31, t[31] as T32, t[32] as T33, t[33] as T34)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any, T29: Any, T30: Any, T31: Any, T32: Any, T33: Any, T34: Any, T35: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>, f21: Observable<T21>, f22: Observable<T22>, f23: Observable<T23>, f24: Observable<T24>, f25: Observable<T25>, f26: Observable<T26>, f27: Observable<T27>, f28: Observable<T28>, f29: Observable<T29>, f30: Observable<T30>, f31: Observable<T31>, f32: Observable<T32>, f33: Observable<T33>, f34: Observable<T34>, f35: Observable<T35>): Observable<Tuple35<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28,
    f29,
    f30,
    f31,
    f32,
    f33,
    f34,
    f35), object : Function<Array<*>, Tuple35<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35>> {
    override fun apply(t: Array<*>): Tuple35<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35> {
        @Suppress("UNCHECKED_CAST")
        return Tuple35(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28, t[28] as T29, t[29] as T30, t[30] as T31, t[31] as T32, t[32] as T33, t[33] as T34, t[34] as T35)
    }
})

fun <T1: Any, T2: Any, T3: Any, T4: Any, T5: Any, T6: Any, T7: Any, T8: Any, T9: Any, T10: Any, T11: Any, T12: Any, T13: Any, T14: Any, T15: Any, T16: Any, T17: Any, T18: Any, T19: Any, T20: Any, T21: Any, T22: Any, T23: Any, T24: Any, T25: Any, T26: Any, T27: Any, T28: Any, T29: Any, T30: Any, T31: Any, T32: Any, T33: Any, T34: Any, T35: Any, T36: Any> combineTuple(f1: Observable<T1>, f2: Observable<T2>, f3: Observable<T3>, f4: Observable<T4>, f5: Observable<T5>, f6: Observable<T6>, f7: Observable<T7>, f8: Observable<T8>, f9: Observable<T9>, f10: Observable<T10>, f11: Observable<T11>, f12: Observable<T12>, f13: Observable<T13>, f14: Observable<T14>, f15: Observable<T15>, f16: Observable<T16>, f17: Observable<T17>, f18: Observable<T18>, f19: Observable<T19>, f20: Observable<T20>, f21: Observable<T21>, f22: Observable<T22>, f23: Observable<T23>, f24: Observable<T24>, f25: Observable<T25>, f26: Observable<T26>, f27: Observable<T27>, f28: Observable<T28>, f29: Observable<T29>, f30: Observable<T30>, f31: Observable<T31>, f32: Observable<T32>, f33: Observable<T33>, f34: Observable<T34>, f35: Observable<T35>, f36: Observable<T36>): Observable<Tuple36<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35, T36>> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16,
    f17,
    f18,
    f19,
    f20,
    f21,
    f22,
    f23,
    f24,
    f25,
    f26,
    f27,
    f28,
    f29,
    f30,
    f31,
    f32,
    f33,
    f34,
    f35,
    f36), object : Function<Array<*>, Tuple36<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35, T36>> {
    override fun apply(t: Array<*>): Tuple36<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35, T36> {
        @Suppress("UNCHECKED_CAST")
        return Tuple36(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16, t[16] as T17, t[17] as T18, t[18] as T19, t[19] as T20, t[20] as T21, t[21] as T22, t[22] as T23, t[23] as T24, t[24] as T25, t[25] as T26, t[26] as T27, t[27] as T28, t[28] as T29, t[29] as T30, t[30] as T31, t[31] as T32, t[32] as T33, t[33] as T34, t[34] as T35, t[35] as T36)
    }
})