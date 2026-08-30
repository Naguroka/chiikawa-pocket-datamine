package kotlin.random;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\t\u0010\u0000\u001a\u00020\u0001H\u0081\b\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0001H\u0007\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\bH\u0007¨\u0006\n"}, d2 = {"defaultPlatformRandom", "Lkotlin/random/Random;", "doubleFromParts", "", "hi26", "", "low27", "asJavaRandom", "Ljava/util/Random;", "asKotlinRandom", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PlatformRandomKt {
    public static final double doubleFromParts(int i, int i2) {
        return ((((long) i) << 27) + ((long) i2)) / 9.007199254740992E15d;
    }

    public static final java.util.Random asJavaRandom(kotlin.random.Random random) {
        java.util.Random impl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "<this>");
        kotlin.random.AbstractPlatformRandom abstractPlatformRandom = random instanceof kotlin.random.AbstractPlatformRandom ? (kotlin.random.AbstractPlatformRandom) random : null;
        return (abstractPlatformRandom == null || (impl = abstractPlatformRandom.getImpl()) == null) ? new kotlin.random.KotlinRandom(random) : impl;
    }

    public static final kotlin.random.Random asKotlinRandom(java.util.Random random) {
        kotlin.random.Random impl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "<this>");
        kotlin.random.KotlinRandom kotlinRandom = random instanceof kotlin.random.KotlinRandom ? (kotlin.random.KotlinRandom) random : null;
        return (kotlinRandom == null || (impl = kotlinRandom.getImpl()) == null) ? new kotlin.random.PlatformRandom(random) : impl;
    }

    private static final kotlin.random.Random defaultPlatformRandom() {
        return kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();
    }
}
