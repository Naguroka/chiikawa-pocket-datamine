package androidx.core.content;

/* JADX INFO: compiled from: ContentValues.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"contentValuesOf", "Landroid/content/ContentValues;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/content/ContentValues;", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ContentValuesKt {
    public static final android.content.ContentValues contentValuesOf(kotlin.Pair<java.lang.String, ? extends java.lang.Object>... pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "pairs");
        android.content.ContentValues contentValues = new android.content.ContentValues(pairs.length);
        for (kotlin.Pair<java.lang.String, ? extends java.lang.Object> pair : pairs) {
            java.lang.String strComponent1 = pair.component1();
            java.lang.Object objComponent2 = pair.component2();
            if (objComponent2 == null) {
                contentValues.putNull(strComponent1);
            } else if (objComponent2 instanceof java.lang.String) {
                contentValues.put(strComponent1, (java.lang.String) objComponent2);
            } else if (objComponent2 instanceof java.lang.Integer) {
                contentValues.put(strComponent1, (java.lang.Integer) objComponent2);
            } else if (objComponent2 instanceof java.lang.Long) {
                contentValues.put(strComponent1, (java.lang.Long) objComponent2);
            } else if (objComponent2 instanceof java.lang.Boolean) {
                contentValues.put(strComponent1, (java.lang.Boolean) objComponent2);
            } else if (objComponent2 instanceof java.lang.Float) {
                contentValues.put(strComponent1, (java.lang.Float) objComponent2);
            } else if (objComponent2 instanceof java.lang.Double) {
                contentValues.put(strComponent1, (java.lang.Double) objComponent2);
            } else if (objComponent2 instanceof byte[]) {
                contentValues.put(strComponent1, (byte[]) objComponent2);
            } else if (objComponent2 instanceof java.lang.Byte) {
                contentValues.put(strComponent1, (java.lang.Byte) objComponent2);
            } else {
                if (!(objComponent2 instanceof java.lang.Short)) {
                    throw new java.lang.IllegalArgumentException("Illegal value type " + objComponent2.getClass().getCanonicalName() + " for key \"" + strComponent1 + kotlin.text.Typography.quote);
                }
                contentValues.put(strComponent1, (java.lang.Short) objComponent2);
            }
        }
        return contentValues;
    }
}
