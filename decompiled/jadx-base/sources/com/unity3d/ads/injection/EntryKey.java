package com.unity3d.ads.injection;

/* JADX INFO: compiled from: EntryKey.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\r\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/injection/EntryKey;", "", "named", "", "instanceClass", "Lkotlin/reflect/KClass;", "(Ljava/lang/String;Lkotlin/reflect/KClass;)V", "getInstanceClass", "()Lkotlin/reflect/KClass;", "getNamed", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EntryKey {
    private final kotlin.reflect.KClass<?> instanceClass;
    private final java.lang.String named;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.unity3d.ads.injection.EntryKey copy$default(com.unity3d.ads.injection.EntryKey entryKey, java.lang.String str, kotlin.reflect.KClass kClass, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = entryKey.named;
        }
        if ((i & 2) != 0) {
            kClass = entryKey.instanceClass;
        }
        return entryKey.copy(str, kClass);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getNamed() {
        return this.named;
    }

    public final kotlin.reflect.KClass<?> component2() {
        return this.instanceClass;
    }

    public final com.unity3d.ads.injection.EntryKey copy(java.lang.String named, kotlin.reflect.KClass<?> instanceClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceClass, "instanceClass");
        return new com.unity3d.ads.injection.EntryKey(named, instanceClass);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.ads.injection.EntryKey)) {
            return false;
        }
        com.unity3d.ads.injection.EntryKey entryKey = (com.unity3d.ads.injection.EntryKey) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.named, entryKey.named) && kotlin.jvm.internal.Intrinsics.areEqual(this.instanceClass, entryKey.instanceClass);
    }

    public int hashCode() {
        return (this.named.hashCode() * 31) + this.instanceClass.hashCode();
    }

    public java.lang.String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public EntryKey(java.lang.String named, kotlin.reflect.KClass<?> instanceClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceClass, "instanceClass");
        this.named = named;
        this.instanceClass = instanceClass;
    }

    public /* synthetic */ EntryKey(java.lang.String str, kotlin.reflect.KClass kClass, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, kClass);
    }

    public final java.lang.String getNamed() {
        return this.named;
    }

    public final kotlin.reflect.KClass<?> getInstanceClass() {
        return this.instanceClass;
    }
}
