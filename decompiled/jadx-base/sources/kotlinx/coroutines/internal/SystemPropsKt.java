package kotlinx.coroutines.internal;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
public final class SystemPropsKt {
    public static final int getAVAILABLE_PROCESSORS() {
        return kotlinx.coroutines.internal.SystemPropsKt__SystemPropsKt.getAVAILABLE_PROCESSORS();
    }

    public static final int systemProp(java.lang.String str, int i, int i2, int i3) {
        return kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp(str, i, i2, i3);
    }

    public static final long systemProp(java.lang.String str, long j, long j2, long j3) {
        return kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp(str, j, j2, j3);
    }

    public static final java.lang.String systemProp(java.lang.String str) {
        return kotlinx.coroutines.internal.SystemPropsKt__SystemPropsKt.systemProp(str);
    }

    public static final java.lang.String systemProp(java.lang.String str, java.lang.String str2) {
        return kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp(str, str2);
    }

    public static final boolean systemProp(java.lang.String str, boolean z) {
        return kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp(str, z);
    }
}
