package com.zhuinden.rxcombinetuplekt

import com.zhuinden.tupleskt.*
import io.reactivex.Single
import io.reactivex.functions.*

fun <T1, T2> zipTuple(f1: Single<T1>, f2: Single<T2>): Single<Pair<T1, T2>> = Single.zip(
    f1,
    f2,
    BiFunction<T1, T2, Pair<T1, T2>> { t1, t2 -> t1 to t2 }
)

fun <T1, T2, T3> zipTuple(f1: Single<T1>, f2: Single<T2>, f3: Single<T3>): Single<Triple<T1, T2, T3>> = Single.zip(
    f1,
    f2,
    f3,
    Function3<T1, T2, T3, Triple<T1, T2, T3>> { t1, t2, t3 -> Triple(t1, t2, t3) }
)

fun <T1, T2, T3, T4> zipTuple(f1: Single<T1>, f2: Single<T2>, f3: Single<T3>, f4: Single<T4>): Single<Tuple4<T1, T2, T3, T4>> = Single.zip(
    f1,
    f2,
    f3,
    f4,
    Function4<T1, T2, T3, T4, Tuple4<T1, T2, T3, T4>> { t1, t2, t3, t4 -> Tuple4(t1, t2, t3, t4) }
)

fun <T1, T2, T3, T4, T5> zipTuple(f1: Single<T1>, f2: Single<T2>, f3: Single<T3>, f4: Single<T4>, f5: Single<T5>): Single<Tuple5<T1, T2, T3, T4, T5>> = Single.zip(
    f1,
    f2,
    f3,
    f4,
    f5,
    Function5<T1, T2, T3, T4, T5, Tuple5<T1, T2, T3, T4, T5>> { t1, t2, t3, t4, t5 -> Tuple5(t1, t2, t3, t4, t5) }
)

fun <T1, T2, T3, T4, T5, T6> zipTuple(f1: Single<T1>, f2: Single<T2>, f3: Single<T3>, f4: Single<T4>, f5: Single<T5>, f6: Single<T6>): Single<Tuple6<T1, T2, T3, T4, T5, T6>> = Single.zip(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    Function6<T1, T2, T3, T4, T5, T6, Tuple6<T1, T2, T3, T4, T5, T6>> { t1, t2, t3, t4, t5, t6 -> Tuple6(t1, t2, t3, t4, t5, t6) }
)

fun <T1, T2, T3, T4, T5, T6, T7> zipTuple(f1: Single<T1>, f2: Single<T2>, f3: Single<T3>, f4: Single<T4>, f5: Single<T5>, f6: Single<T6>, f7: Single<T7>): Single<Tuple7<T1, T2, T3, T4, T5, T6, T7>> = Single.zip(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    Function7<T1, T2, T3, T4, T5, T6, T7, Tuple7<T1, T2, T3, T4, T5, T6, T7>> { t1, t2, t3, t4, t5, t6, t7 -> Tuple7(t1, t2, t3, t4, t5, t6, t7) }
)

fun <T1, T2, T3, T4, T5, T6, T7, T8> zipTuple(f1: Single<T1>, f2: Single<T2>, f3: Single<T3>, f4: Single<T4>, f5: Single<T5>, f6: Single<T6>, f7: Single<T7>, f8: Single<T8>): Single<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> = Single.zip(
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

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> zipTuple(f1: Single<T1>, f2: Single<T2>, f3: Single<T3>, f4: Single<T4>, f5: Single<T5>, f6: Single<T6>, f7: Single<T7>, f8: Single<T8>, f9: Single<T9>): Single<Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> = Single.zip(
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

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> zipTuple(f1: Single<T1>, f2: Single<T2>, f3: Single<T3>, f4: Single<T4>, f5: Single<T5>, f6: Single<T6>, f7: Single<T7>, f8: Single<T8>, f9: Single<T9>, f10: Single<T10>): Single<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> = Single.zipArray(
    Function<Array<*>, Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> { t ->
        @Suppress("UNCHECKED_CAST")
        Tuple10(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10)
    }, 
    f1, 
    f2, 
    f3, 
    f4, 
    f5, 
    f6, 
    f7, 
    f8, 
    f9, 
    f10)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> zipTuple(f1: Single<T1>, f2: Single<T2>, f3: Single<T3>, f4: Single<T4>, f5: Single<T5>, f6: Single<T6>, f7: Single<T7>, f8: Single<T8>, f9: Single<T9>, f10: Single<T10>, f11: Single<T11>): Single<Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> = Single.zipArray(
    Function<Array<*>, Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> { t ->
        @Suppress("UNCHECKED_CAST")
        Tuple11(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11)
    },
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
    f11)


fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> zipTuple(f1: Single<T1>, f2: Single<T2>, f3: Single<T3>, f4: Single<T4>, f5: Single<T5>, f6: Single<T6>, f7: Single<T7>, f8: Single<T8>, f9: Single<T9>, f10: Single<T10>, f11: Single<T11>, f12: Single<T12>): Single<Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> = Single.zipArray(
    Function<Array<*>, Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> { t ->
        @Suppress("UNCHECKED_CAST")
        Tuple12(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12)
    },
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
    f12)
                                                                                                                                                                                                                                                        
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> zipTuple(f1: Single<T1>, f2: Single<T2>, f3: Single<T3>, f4: Single<T4>, f5: Single<T5>, f6: Single<T6>, f7: Single<T7>, f8: Single<T8>, f9: Single<T9>, f10: Single<T10>, f11: Single<T11>, f12: Single<T12>, f13: Single<T13>): Single<Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> = Single.zipArray(
    Function<Array<*>, Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> { t ->
        @Suppress("UNCHECKED_CAST")
        Tuple13(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13)
    },
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
    f13)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> zipTuple(f1: Single<T1>, f2: Single<T2>, f3: Single<T3>, f4: Single<T4>, f5: Single<T5>, f6: Single<T6>, f7: Single<T7>, f8: Single<T8>, f9: Single<T9>, f10: Single<T10>, f11: Single<T11>, f12: Single<T12>, f13: Single<T13>, f14: Single<T14>): Single<Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>> = Single.zipArray(
    Function<Array<*>, Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>> { t ->
        @Suppress("UNCHECKED_CAST")
        Tuple14(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14)
    },
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
    f14)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> zipTuple(f1: Single<T1>, f2: Single<T2>, f3: Single<T3>, f4: Single<T4>, f5: Single<T5>, f6: Single<T6>, f7: Single<T7>, f8: Single<T8>, f9: Single<T9>, f10: Single<T10>, f11: Single<T11>, f12: Single<T12>, f13: Single<T13>, f14: Single<T14>, f15: Single<T15>): Single<Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> = Single.zipArray(
    Function<Array<*>, Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> { t ->
        @Suppress("UNCHECKED_CAST")
        Tuple15(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15)
    },
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
    f15)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> zipTuple(f1: Single<T1>, f2: Single<T2>, f3: Single<T3>, f4: Single<T4>, f5: Single<T5>, f6: Single<T6>, f7: Single<T7>, f8: Single<T8>, f9: Single<T9>, f10: Single<T10>, f11: Single<T11>, f12: Single<T12>, f13: Single<T13>, f14: Single<T14>, f15: Single<T15>, f16: Single<T16>): Single<Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>> = Single.zipArray(
    Function<Array<*>, Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>> { t ->
        @Suppress("UNCHECKED_CAST")
        Tuple16(t[0] as T1, t[1] as T2, t[2] as T3, t[3] as T4, t[4] as T5, t[5] as T6, t[6] as T7, t[7] as T8, t[8] as T9, t[9] as T10, t[10] as T11, t[11] as T12, t[12] as T13, t[13] as T14, t[14] as T15, t[15] as T16)
    },
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
    f16)
