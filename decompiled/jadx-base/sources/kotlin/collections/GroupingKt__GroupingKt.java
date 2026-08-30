package kotlin.collections;

/* JADX INFO: compiled from: Grouping.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u009e\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052b\u0010\u0006\u001a^\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00030\u0007H\u0087\bø\u0001\u0000\u001a·\u0001\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102b\u0010\u0006\u001a^\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00030\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001aI\u0010\u0014\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0016\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00150\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u0010H\u0007¢\u0006\u0002\u0010\u0016\u001a¿\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u000526\u0010\u0018\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u00192K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u001aH\u0087\bø\u0001\u0000\u001a\u007f\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u001b\u001a\u0002H\u000326\u0010\u0006\u001a2\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u0019H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001aØ\u0001\u0010\u001d\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u001026\u0010\u0018\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u00192K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u001aH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a\u0093\u0001\u0010\u001d\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102\u0006\u0010\u001b\u001a\u0002H\u000326\u0010\u0006\u001a2\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u0019H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001f\u001a\u008b\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0\u0001\"\u0004\b\u0000\u0010!\"\b\b\u0001\u0010\u0004*\u0002H!\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H!¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H!0\u001aH\u0087\bø\u0001\u0000\u001a¤\u0001\u0010\"\u001a\u0002H\u0010\"\u0004\b\u0000\u0010!\"\b\b\u0001\u0010\u0004*\u0002H!\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H!¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H!0\u001aH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"aggregate", "", "K", "R", "T", "Lkotlin/collections/Grouping;", "operation", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", com.ironsource.y8.h.W, "accumulator", "element", "", "first", "aggregateTo", "M", "", com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function4;)Ljava/util/Map;", "eachCountTo", "", "(Lkotlin/collections/Grouping;Ljava/util/Map;)Ljava/util/Map;", "fold", "initialValueSelector", "Lkotlin/Function2;", "Lkotlin/Function3;", "initialValue", "(Lkotlin/collections/Grouping;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "foldTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "(Lkotlin/collections/Grouping;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "reduce", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "reduceTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/GroupingKt")
class GroupingKt__GroupingKt extends kotlin.collections.GroupingKt__GroupingJVMKt {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T, K, R> java.util.Map<K, R> aggregate(kotlin.collections.Grouping<T, ? extends K> grouping, kotlin.jvm.functions.Function4<? super K, ? super R, ? super T, ? super java.lang.Boolean, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "operation");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<T> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            java.lang.Object objKeyOf = grouping.keyOf(next);
            android.Manifest.permission_group permission_groupVar = (java.lang.Object) linkedHashMap.get(objKeyOf);
            linkedHashMap.put(objKeyOf, operation.invoke(objKeyOf, permission_groupVar, next, java.lang.Boolean.valueOf(permission_groupVar == null && !linkedHashMap.containsKey(objKeyOf))));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    public static final <T, K, R, M extends java.util.Map<? super K, R>> M aggregateTo(kotlin.collections.Grouping<T, ? extends K> grouping, M destination, kotlin.jvm.functions.Function4<? super K, ? super R, ? super T, ? super java.lang.Boolean, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "operation");
        java.util.Iterator<T> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            java.lang.Object objKeyOf = grouping.keyOf(next);
            android.Manifest.permission_group permission_groupVar = (java.lang.Object) destination.get(objKeyOf);
            destination.put(objKeyOf, operation.invoke(objKeyOf, permission_groupVar, next, java.lang.Boolean.valueOf(permission_groupVar == null && !destination.containsKey(objKeyOf))));
        }
        return destination;
    }

    public static final <T, K, M extends java.util.Map<? super K, java.lang.Integer>> M eachCountTo(kotlin.collections.Grouping<T, ? extends K> grouping, M destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        java.util.Iterator<T> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            K kKeyOf = grouping.keyOf(itSourceIterator.next());
            java.lang.Object obj = destination.get(kKeyOf);
            if (obj == null && !destination.containsKey(kKeyOf)) {
                obj = 0;
            }
            destination.put(kKeyOf, java.lang.Integer.valueOf(((java.lang.Number) obj).intValue() + 1));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T, K, R> java.util.Map<K, R> fold(kotlin.collections.Grouping<T, ? extends K> grouping, kotlin.jvm.functions.Function2<? super K, ? super T, ? extends R> initialValueSelector, kotlin.jvm.functions.Function3<? super K, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialValueSelector, "initialValueSelector");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "operation");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<T> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            java.lang.Object objKeyOf = grouping.keyOf(next);
            R rInvoke = (java.lang.Object) linkedHashMap.get(objKeyOf);
            if (rInvoke == null && !linkedHashMap.containsKey(objKeyOf)) {
                rInvoke = initialValueSelector.invoke(objKeyOf, next);
            }
            linkedHashMap.put(objKeyOf, operation.invoke(objKeyOf, rInvoke, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    public static final <T, K, R, M extends java.util.Map<? super K, R>> M foldTo(kotlin.collections.Grouping<T, ? extends K> grouping, M destination, kotlin.jvm.functions.Function2<? super K, ? super T, ? extends R> initialValueSelector, kotlin.jvm.functions.Function3<? super K, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialValueSelector, "initialValueSelector");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "operation");
        java.util.Iterator<T> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            java.lang.Object objKeyOf = grouping.keyOf(next);
            R rInvoke = (java.lang.Object) destination.get(objKeyOf);
            if (rInvoke == null && !destination.containsKey(objKeyOf)) {
                rInvoke = initialValueSelector.invoke(objKeyOf, next);
            }
            destination.put(objKeyOf, operation.invoke(objKeyOf, rInvoke, next));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T, K, R> java.util.Map<K, R> fold(kotlin.collections.Grouping<T, ? extends K> grouping, R r, kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "operation");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<T> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            K kKeyOf = grouping.keyOf(next);
            android.R r2 = (java.lang.Object) linkedHashMap.get(kKeyOf);
            if (r2 == null && !linkedHashMap.containsKey(kKeyOf)) {
                r2 = (java.lang.Object) r;
            }
            linkedHashMap.put(kKeyOf, operation.invoke(r2, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    public static final <T, K, R, M extends java.util.Map<? super K, R>> M foldTo(kotlin.collections.Grouping<T, ? extends K> grouping, M destination, R r, kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "operation");
        java.util.Iterator<T> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            K kKeyOf = grouping.keyOf(next);
            android.R r2 = (java.lang.Object) destination.get(kKeyOf);
            if (r2 == null && !destination.containsKey(kKeyOf)) {
                r2 = (java.lang.Object) r;
            }
            destination.put(kKeyOf, operation.invoke(r2, next));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <S, T extends S, K> java.util.Map<K, S> reduce(kotlin.collections.Grouping<T, ? extends K> grouping, kotlin.jvm.functions.Function3<? super K, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "operation");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            S sInvoke = (java.lang.Object) itSourceIterator.next();
            java.lang.Object objKeyOf = grouping.keyOf(sInvoke);
            android.Manifest.permission_group permission_groupVar = (java.lang.Object) linkedHashMap.get(objKeyOf);
            if (!(permission_groupVar == null && !linkedHashMap.containsKey(objKeyOf))) {
                sInvoke = operation.invoke(objKeyOf, permission_groupVar, sInvoke);
            }
            linkedHashMap.put(objKeyOf, sInvoke);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <S, T extends S, K, M extends java.util.Map<? super K, S>> M reduceTo(kotlin.collections.Grouping<T, ? extends K> grouping, M destination, kotlin.jvm.functions.Function3<? super K, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grouping, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "operation");
        java.util.Iterator itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            S sInvoke = (java.lang.Object) itSourceIterator.next();
            java.lang.Object objKeyOf = grouping.keyOf(sInvoke);
            android.Manifest.permission_group permission_groupVar = (java.lang.Object) destination.get(objKeyOf);
            if (!(permission_groupVar == null && !destination.containsKey(objKeyOf))) {
                sInvoke = operation.invoke(objKeyOf, permission_groupVar, sInvoke);
            }
            destination.put(objKeyOf, sInvoke);
        }
        return destination;
    }
}
