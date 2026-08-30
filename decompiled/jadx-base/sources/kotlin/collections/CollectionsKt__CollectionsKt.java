package kotlin.collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aC\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u00072\u0006\u0010\f\u001a\u00020\u00062!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00070\u000eH\u0087\bø\u0001\u0000\u001aC\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u00072\u0006\u0010\f\u001a\u00020\u00062!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00070\u000eH\u0087\bø\u0001\u0000\u001a\u001f\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u0002H\u00070\u0015j\b\u0012\u0004\u0012\u0002H\u0007`\u0016\"\u0004\b\u0000\u0010\u0007H\u0087\b\u001a5\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u0002H\u00070\u0015j\b\u0012\u0004\u0012\u0002H\u0007`\u0016\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010\u0019\u001aN\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\b\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u001f\b\u0001\u0010\u001d\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0\u0013\u0012\u0004\u0012\u00020\u001e0\u000e¢\u0006\u0002\b\u001fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001aF\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\b\"\u0004\b\u0000\u0010\u001b2\u001f\b\u0001\u0010\u001d\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0\u0013\u0012\u0004\u0012\u00020\u001e0\u000e¢\u0006\u0002\b\u001fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a!\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00182\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0002\u0010#\u001a3\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00070\u0018\"\u0004\b\u0000\u0010\u00072\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0018H\u0000¢\u0006\u0002\u0010%\u001a\u0012\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007\u001a\u0015\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007H\u0087\b\u001a+\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010(\u001a%\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\b\b\u0000\u0010\u0007*\u00020!2\b\u0010*\u001a\u0004\u0018\u0001H\u0007¢\u0006\u0002\u0010+\u001a3\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\b\b\u0000\u0010\u0007*\u00020!2\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00070\u0018\"\u0004\u0018\u0001H\u0007¢\u0006\u0002\u0010(\u001a\u0015\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u0007H\u0087\b\u001a+\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010(\u001a%\u0010-\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0002\b0\u001a\b\u00101\u001a\u00020\u001eH\u0001\u001a\b\u00102\u001a\u00020\u001eH\u0001\u001a%\u00103\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018H\u0000¢\u0006\u0002\u00104\u001aS\u00105\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\u0006\u0010*\u001a\u0002H\u00072\u001a\u00106\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000707j\n\u0012\u0006\b\u0000\u0012\u0002H\u0007`82\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u0006¢\u0006\u0002\u00109\u001a>\u00105\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u00062\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00060\u000e\u001aE\u00105\u001a\u00020\u0006\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070;*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\b2\b\u0010*\u001a\u0004\u0018\u0001H\u00072\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u0006¢\u0006\u0002\u0010<\u001ag\u0010=\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u0010>*\b\u0012\u0004\u0012\u0002H>0;*\b\u0012\u0004\u0012\u0002H\u00070\b2\b\u0010?\u001a\u0004\u0018\u0001H>2\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u00062\u0016\b\u0004\u0010@\u001a\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u0001H>0\u000eH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010A\u001a,\u0010B\u001a\u00020C\"\t\b\u0000\u0010\u0007¢\u0006\u0002\bD*\b\u0012\u0004\u0012\u0002H\u00070\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002H\u0087\b\u001a;\u0010E\u001a\u0002HF\"\u0010\b\u0000\u0010G*\u0006\u0012\u0002\b\u00030\u0002*\u0002HF\"\u0004\b\u0001\u0010F*\u0002HG2\f\u0010H\u001a\b\u0012\u0004\u0012\u0002HF0IH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010J\u001a\u0019\u0010K\u001a\u00020C\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0002H\u0087\b\u001a,\u0010L\u001a\u00020C\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\u001e\u0010M\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\bH\u0000\u001a!\u0010N\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0002H\u0087\b\u001a!\u0010N\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\bH\u0087\b\u001a&\u0010O\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070P2\u0006\u0010Q\u001a\u00020RH\u0007\"\u0019\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"!\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006S"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "lastIndex", "", "T", "", "getLastIndex", "(Ljava/util/List;)I", "List", "size", com.ironsource.y8.a.f, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "MutableList", "", "arrayListOf", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "elements", "", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "buildList", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "capacity", "builderAction", "", "Lkotlin/ExtensionFunctionType;", "collectionToArrayCommonImpl", "", "collection", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "emptyList", "listOf", "([Ljava/lang/Object;)Ljava/util/List;", "listOfNotNull", "element", "(Ljava/lang/Object;)Ljava/util/List;", "mutableListOf", "rangeCheck", "fromIndex", "toIndex", "rangeCheck$CollectionsKt__CollectionsKt", "throwCountOverflow", "throwIndexOverflow", "asCollection", "([Ljava/lang/Object;)Ljava/util/Collection;", "binarySearch", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;II)I", "comparison", "", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "binarySearchBy", "K", com.ironsource.y8.h.W, "selector", "(Ljava/util/List;Ljava/lang/Comparable;IILkotlin/jvm/functions/Function1;)I", "containsAll", "", "Lkotlin/internal/OnlyInputTypes;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "isNullOrEmpty", "optimizeReadOnlyList", "orEmpty", "shuffled", "", "random", "Lkotlin/random/Random;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class CollectionsKt__CollectionsKt extends kotlin.collections.CollectionsKt__CollectionsJVMKt {
    public static final <T> java.util.Collection<T> asCollection(T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new kotlin.collections.ArrayAsCollection(tArr, false);
    }

    public static final <T> java.util.List<T> emptyList() {
        return kotlin.collections.EmptyList.INSTANCE;
    }

    public static final <T> java.util.List<T> listOf(T... elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? kotlin.collections.ArraysKt.asList(elements) : kotlin.collections.CollectionsKt.emptyList();
    }

    private static final <T> java.util.List<T> listOf() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    private static final <T> java.util.List<T> mutableListOf() {
        return new java.util.ArrayList();
    }

    private static final <T> java.util.ArrayList<T> arrayListOf() {
        return new java.util.ArrayList<>();
    }

    public static final <T> java.util.List<T> mutableListOf(T... elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new java.util.ArrayList() : new java.util.ArrayList(new kotlin.collections.ArrayAsCollection(elements, true));
    }

    public static final <T> java.util.ArrayList<T> arrayListOf(T... elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new java.util.ArrayList<>() : new java.util.ArrayList<>(new kotlin.collections.ArrayAsCollection(elements, true));
    }

    public static final <T> java.util.List<T> listOfNotNull(T t) {
        return t != null ? kotlin.collections.CollectionsKt.listOf(t) : kotlin.collections.CollectionsKt.emptyList();
    }

    public static final <T> java.util.List<T> listOfNotNull(T... elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.ArraysKt.filterNotNull(elements);
    }

    private static final <T> java.util.List<T> List(int i, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> init) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(init, "init");
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(init.invoke(java.lang.Integer.valueOf(i2)));
        }
        return arrayList;
    }

    private static final <T> java.util.List<T> MutableList(int i, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> init) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(init, "init");
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(init.invoke(java.lang.Integer.valueOf(i2)));
        }
        return arrayList;
    }

    private static final <E> java.util.List<E> buildList(kotlin.jvm.functions.Function1<? super java.util.List<E>, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        java.util.List listCreateListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        builderAction.invoke(listCreateListBuilder);
        return kotlin.collections.CollectionsKt.build(listCreateListBuilder);
    }

    private static final <E> java.util.List<E> buildList(int i, kotlin.jvm.functions.Function1<? super java.util.List<E>, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        java.util.List listCreateListBuilder = kotlin.collections.CollectionsKt.createListBuilder(i);
        builderAction.invoke(listCreateListBuilder);
        return kotlin.collections.CollectionsKt.build(listCreateListBuilder);
    }

    public static final kotlin.ranges.IntRange getIndices(java.util.Collection<?> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "<this>");
        return new kotlin.ranges.IntRange(0, collection.size() - 1);
    }

    public static final <T> int getLastIndex(java.util.List<? extends T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    private static final <T> boolean isNotEmpty(java.util.Collection<? extends T> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "<this>");
        return !collection.isEmpty();
    }

    private static final <T> boolean isNullOrEmpty(java.util.Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> java.util.Collection<T> orEmpty(java.util.Collection<? extends T> collection) {
        return collection == 0 ? kotlin.collections.CollectionsKt.emptyList() : collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> java.util.List<T> orEmpty(java.util.List<? extends T> list) {
        return list == 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    private static final java.lang.Object ifEmpty(java.util.Collection collection, kotlin.jvm.functions.Function0 defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return collection.isEmpty() ? defaultValue.invoke() : collection;
    }

    private static final <T> boolean containsAll(java.util.Collection<? extends T> collection, java.util.Collection<? extends T> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.containsAll(elements);
    }

    public static final <T> java.util.List<T> shuffled(java.lang.Iterable<? extends T> iterable, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        java.util.List<T> mutableList = kotlin.collections.CollectionsKt.toMutableList(iterable);
        kotlin.collections.CollectionsKt.shuffle(mutableList, random);
        return mutableList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> java.util.List<T> optimizeReadOnlyList(java.util.List<? extends T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : kotlin.collections.CollectionsKt.listOf(list.get(0));
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static /* synthetic */ int binarySearch$default(java.util.List list, java.lang.Comparable comparable, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return kotlin.collections.CollectionsKt.binarySearch((java.util.List<? extends java.lang.Comparable>) list, comparable, i, i2);
    }

    public static final <T extends java.lang.Comparable<? super T>> int binarySearch(java.util.List<? extends T> list, T t, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iCompareValues = kotlin.comparisons.ComparisonsKt.compareValues(list.get(i4), t);
            if (iCompareValues < 0) {
                i = i4 + 1;
            } else {
                if (iCompareValues <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int binarySearch$default(java.util.List list, java.lang.Object obj, java.util.Comparator comparator, int i, int i2, int i3, java.lang.Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = list.size();
        }
        return kotlin.collections.CollectionsKt.binarySearch(list, obj, comparator, i, i2);
    }

    public static final <T> int binarySearch(java.util.List<? extends T> list, T t, java.util.Comparator<? super T> comparator, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iCompare = comparator.compare(list.get(i4), t);
            if (iCompare < 0) {
                i = i4 + 1;
            } else {
                if (iCompare <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int binarySearchBy$default(java.util.List list, java.lang.Comparable comparable, int i, int i2, kotlin.jvm.functions.Function1 selector, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        return kotlin.collections.CollectionsKt.binarySearch(list, i, i2, new kotlin.collections.CollectionsKt__CollectionsKt.AnonymousClass1(selector, comparable));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1, reason: invalid class name */
    /* JADX INFO: compiled from: Collections.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "K", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
    public static final class AnonymousClass1<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<T, java.lang.Integer> {

        /* JADX INFO: Incorrect field signature: TK; */
        final /* synthetic */ java.lang.Comparable $key;
        final /* synthetic */ kotlin.jvm.functions.Function1<T, K> $selector;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TT;+TK;>;TK;)V */
        public AnonymousClass1(kotlin.jvm.functions.Function1 function1, java.lang.Comparable comparable) {
            super(1);
            this.$selector = function1;
            this.$key = comparable;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Integer invoke(T t) {
            return java.lang.Integer.valueOf(kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Comparable) this.$selector.invoke(t), this.$key));
        }
    }

    public static final <T, K extends java.lang.Comparable<? super K>> int binarySearchBy(java.util.List<? extends T> list, K k, int i, int i2, kotlin.jvm.functions.Function1<? super T, ? extends K> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        return kotlin.collections.CollectionsKt.binarySearch(list, i, i2, new kotlin.collections.CollectionsKt__CollectionsKt.AnonymousClass1(selector, k));
    }

    public static /* synthetic */ int binarySearch$default(java.util.List list, int i, int i2, kotlin.jvm.functions.Function1 function1, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        return kotlin.collections.CollectionsKt.binarySearch(list, i, i2, function1);
    }

    public static final <T> int binarySearch(java.util.List<? extends T> list, int i, int i2, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> comparison) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparison, "comparison");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iIntValue = comparison.invoke(list.get(i4)).intValue();
            if (iIntValue < 0) {
                i = i4 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    private static final void rangeCheck$CollectionsKt__CollectionsKt(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new java.lang.IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        }
        if (i2 < 0) {
            throw new java.lang.IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        }
        if (i3 > i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
        }
    }

    public static final void throwIndexOverflow() {
        throw new java.lang.ArithmeticException("Index overflow has happened.");
    }

    public static final void throwCountOverflow() {
        throw new java.lang.ArithmeticException("Count overflow has happened.");
    }

    public static final java.lang.Object[] collectionToArrayCommonImpl(java.util.Collection<?> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "collection");
        int i = 0;
        if (collection.isEmpty()) {
            return new java.lang.Object[0];
        }
        java.lang.Object[] objArr = new java.lang.Object[collection.size()];
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    public static final <T> T[] collectionToArrayCommonImpl(java.util.Collection<?> collection, T[] array) {
        java.lang.Object[] objArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "collection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        int i = 0;
        if (collection.isEmpty()) {
            return (T[]) kotlin.collections.CollectionsKt.terminateCollectionToArray(0, array);
        }
        if (array.length < collection.size()) {
            objArr = array;
            objArr = (T[]) kotlin.collections.ArraysKt.arrayOfNulls(array, collection.size());
        }
        objArr = array;
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return (T[]) kotlin.collections.CollectionsKt.terminateCollectionToArray(collection.size(), objArr);
    }
}
