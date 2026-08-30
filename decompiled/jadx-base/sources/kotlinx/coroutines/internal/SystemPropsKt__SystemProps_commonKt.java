package kotlinx.coroutines.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: SystemProps.common.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a,\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\t"}, d2 = {"systemProp", "", "propertyName", "", "defaultValue", "", "minValue", "maxValue", "", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/internal/SystemPropsKt")
public final /* synthetic */ class SystemPropsKt__SystemProps_commonKt {
    public static final boolean systemProp(java.lang.String str, boolean z) {
        java.lang.String strSystemProp = kotlinx.coroutines.internal.SystemPropsKt.systemProp(str);
        return strSystemProp != null ? java.lang.Boolean.parseBoolean(strSystemProp) : z;
    }

    public static /* synthetic */ int systemProp$default(java.lang.String str, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return kotlinx.coroutines.internal.SystemPropsKt.systemProp(str, i, i2, i3);
    }

    public static final int systemProp(java.lang.String str, int i, int i2, int i3) {
        return (int) kotlinx.coroutines.internal.SystemPropsKt.systemProp(str, i, i2, i3);
    }

    public static /* synthetic */ long systemProp$default(java.lang.String str, long j, long j2, long j3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return kotlinx.coroutines.internal.SystemPropsKt.systemProp(str, j, j4, j3);
    }

    public static final long systemProp(java.lang.String str, long j, long j2, long j3) {
        java.lang.String strSystemProp = kotlinx.coroutines.internal.SystemPropsKt.systemProp(str);
        if (strSystemProp == null) {
            return j;
        }
        java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(strSystemProp);
        if (longOrNull == null) {
            throw new java.lang.IllegalStateException(("System property '" + str + "' has unrecognized value '" + strSystemProp + '\'').toString());
        }
        long jLongValue = longOrNull.longValue();
        boolean z = false;
        if (j2 <= jLongValue && jLongValue <= j3) {
            z = true;
        }
        if (z) {
            return jLongValue;
        }
        throw new java.lang.IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final java.lang.String systemProp(java.lang.String str, java.lang.String str2) {
        java.lang.String strSystemProp = kotlinx.coroutines.internal.SystemPropsKt.systemProp(str);
        return strSystemProp == null ? str2 : strSystemProp;
    }
}
