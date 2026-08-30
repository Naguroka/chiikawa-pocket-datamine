package kotlin.coroutines;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¨\u0006\b"}, d2 = {"getPolymorphicElement", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlin/coroutines/CoroutineContext$Element;", com.ironsource.y8.h.W, "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusPolymorphicKey", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CoroutineContextImplKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends kotlin.coroutines.CoroutineContext.Element> E getPolymorphicElement(kotlin.coroutines.CoroutineContext.Element element, kotlin.coroutines.CoroutineContext.Key<E> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.AbstractCoroutineContextKey) {
            kotlin.coroutines.AbstractCoroutineContextKey abstractCoroutineContextKey = (kotlin.coroutines.AbstractCoroutineContextKey) key;
            if (!abstractCoroutineContextKey.isSubKey$kotlin_stdlib(element.getKey())) {
                return null;
            }
            E e = (E) abstractCoroutineContextKey.tryCast$kotlin_stdlib(element);
            if (e instanceof kotlin.coroutines.CoroutineContext.Element) {
                return e;
            }
            return null;
        }
        if (element.getKey() == key) {
            return element;
        }
        return null;
    }

    public static final kotlin.coroutines.CoroutineContext minusPolymorphicKey(kotlin.coroutines.CoroutineContext.Element element, kotlin.coroutines.CoroutineContext.Key<?> key) {
        kotlin.coroutines.CoroutineContext coroutineContext;
        kotlin.coroutines.CoroutineContext coroutineContext2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.AbstractCoroutineContextKey) {
            kotlin.coroutines.AbstractCoroutineContextKey abstractCoroutineContextKey = (kotlin.coroutines.AbstractCoroutineContextKey) key;
            if (abstractCoroutineContextKey.isSubKey$kotlin_stdlib(element.getKey()) && abstractCoroutineContextKey.tryCast$kotlin_stdlib(element) != null) {
                coroutineContext2 = element;
                coroutineContext2 = element;
                coroutineContext2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
            }
            coroutineContext2 = element;
            coroutineContext2 = element;
            coroutineContext2 = element;
            return coroutineContext2;
        }
        if (element.getKey() == key) {
            coroutineContext = element;
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        coroutineContext = element;
        return coroutineContext;
    }
}
