package androidx.core.os;

/* JADX INFO: compiled from: Bundle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a;\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"bundleOf", "Landroid/os/Bundle;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class BundleKt {
    public static final android.os.Bundle bundleOf(kotlin.Pair<java.lang.String, ? extends java.lang.Object>... pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "pairs");
        android.os.Bundle bundle = new android.os.Bundle(pairs.length);
        for (kotlin.Pair<java.lang.String, ? extends java.lang.Object> pair : pairs) {
            java.lang.String strComponent1 = pair.component1();
            java.lang.Object objComponent2 = pair.component2();
            if (objComponent2 == null) {
                bundle.putString(strComponent1, null);
            } else if (objComponent2 instanceof java.lang.Boolean) {
                bundle.putBoolean(strComponent1, ((java.lang.Boolean) objComponent2).booleanValue());
            } else if (objComponent2 instanceof java.lang.Byte) {
                bundle.putByte(strComponent1, ((java.lang.Number) objComponent2).byteValue());
            } else if (objComponent2 instanceof java.lang.Character) {
                bundle.putChar(strComponent1, ((java.lang.Character) objComponent2).charValue());
            } else if (objComponent2 instanceof java.lang.Double) {
                bundle.putDouble(strComponent1, ((java.lang.Number) objComponent2).doubleValue());
            } else if (objComponent2 instanceof java.lang.Float) {
                bundle.putFloat(strComponent1, ((java.lang.Number) objComponent2).floatValue());
            } else if (objComponent2 instanceof java.lang.Integer) {
                bundle.putInt(strComponent1, ((java.lang.Number) objComponent2).intValue());
            } else if (objComponent2 instanceof java.lang.Long) {
                bundle.putLong(strComponent1, ((java.lang.Number) objComponent2).longValue());
            } else if (objComponent2 instanceof java.lang.Short) {
                bundle.putShort(strComponent1, ((java.lang.Number) objComponent2).shortValue());
            } else if (objComponent2 instanceof android.os.Bundle) {
                bundle.putBundle(strComponent1, (android.os.Bundle) objComponent2);
            } else if (objComponent2 instanceof java.lang.CharSequence) {
                bundle.putCharSequence(strComponent1, (java.lang.CharSequence) objComponent2);
            } else if (objComponent2 instanceof android.os.Parcelable) {
                bundle.putParcelable(strComponent1, (android.os.Parcelable) objComponent2);
            } else if (objComponent2 instanceof boolean[]) {
                bundle.putBooleanArray(strComponent1, (boolean[]) objComponent2);
            } else if (objComponent2 instanceof byte[]) {
                bundle.putByteArray(strComponent1, (byte[]) objComponent2);
            } else if (objComponent2 instanceof char[]) {
                bundle.putCharArray(strComponent1, (char[]) objComponent2);
            } else if (objComponent2 instanceof double[]) {
                bundle.putDoubleArray(strComponent1, (double[]) objComponent2);
            } else if (objComponent2 instanceof float[]) {
                bundle.putFloatArray(strComponent1, (float[]) objComponent2);
            } else if (objComponent2 instanceof int[]) {
                bundle.putIntArray(strComponent1, (int[]) objComponent2);
            } else if (objComponent2 instanceof long[]) {
                bundle.putLongArray(strComponent1, (long[]) objComponent2);
            } else if (objComponent2 instanceof short[]) {
                bundle.putShortArray(strComponent1, (short[]) objComponent2);
            } else if (objComponent2 instanceof java.lang.Object[]) {
                java.lang.Class<?> componentType = objComponent2.getClass().getComponentType();
                kotlin.jvm.internal.Intrinsics.checkNotNull(componentType);
                if (android.os.Parcelable.class.isAssignableFrom(componentType)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(objComponent2, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(strComponent1, (android.os.Parcelable[]) objComponent2);
                } else if (java.lang.String.class.isAssignableFrom(componentType)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(objComponent2, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(strComponent1, (java.lang.String[]) objComponent2);
                } else if (java.lang.CharSequence.class.isAssignableFrom(componentType)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(objComponent2, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(strComponent1, (java.lang.CharSequence[]) objComponent2);
                } else if (java.io.Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(strComponent1, (java.io.Serializable) objComponent2);
                } else {
                    throw new java.lang.IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + strComponent1 + kotlin.text.Typography.quote);
                }
            } else if (objComponent2 instanceof java.io.Serializable) {
                bundle.putSerializable(strComponent1, (java.io.Serializable) objComponent2);
            } else if (objComponent2 instanceof android.os.IBinder) {
                androidx.core.os.BundleApi18ImplKt.putBinder(bundle, strComponent1, (android.os.IBinder) objComponent2);
            } else if (objComponent2 instanceof android.util.Size) {
                androidx.core.os.BundleApi21ImplKt.putSize(bundle, strComponent1, (android.util.Size) objComponent2);
            } else if (objComponent2 instanceof android.util.SizeF) {
                androidx.core.os.BundleApi21ImplKt.putSizeF(bundle, strComponent1, (android.util.SizeF) objComponent2);
            } else {
                throw new java.lang.IllegalArgumentException("Illegal value type " + objComponent2.getClass().getCanonicalName() + " for key \"" + strComponent1 + kotlin.text.Typography.quote);
            }
        }
        return bundle;
    }

    public static final android.os.Bundle bundleOf() {
        return new android.os.Bundle(0);
    }
}
