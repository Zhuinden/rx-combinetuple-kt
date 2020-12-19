/*
 * Copyright 2020 Gabor Varadi
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