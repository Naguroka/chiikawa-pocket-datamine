package androidx.core.content.res;

/* JADX INFO: compiled from: TypedArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0007\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\f\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0016\u0010\r\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0010\u001a\u00020\u000b*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0014\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0015\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u001b\u001a\u0014\u0010\u001c\u001a\u00020\u001a*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a/\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e*\u00020\u00022\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u001e0 H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"checkAttribute", "", "Landroid/content/res/TypedArray;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "getBooleanOrThrow", "", "getColorOrThrow", "getColorStateListOrThrow", "Landroid/content/res/ColorStateList;", "getDimensionOrThrow", "", "getDimensionPixelOffsetOrThrow", "getDimensionPixelSizeOrThrow", "getDrawableOrThrow", "Landroid/graphics/drawable/Drawable;", "getFloatOrThrow", "getFontOrThrow", "Landroid/graphics/Typeface;", "getIntOrThrow", "getIntegerOrThrow", "getResourceIdOrThrow", "getStringOrThrow", "", "getTextArrayOrThrow", "", "", "(Landroid/content/res/TypedArray;I)[Ljava/lang/CharSequence;", "getTextOrThrow", "use", "R", "block", "Lkotlin/Function1;", "(Landroid/content/res/TypedArray;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class TypedArrayKt {
    private static final void checkAttribute(android.content.res.TypedArray typedArray, int i) {
        if (!typedArray.hasValue(i)) {
            throw new java.lang.IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean getBooleanOrThrow(android.content.res.TypedArray typedArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getBoolean(i, false);
    }

    public static final int getColorOrThrow(android.content.res.TypedArray typedArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getColor(i, 0);
    }

    public static final android.content.res.ColorStateList getColorStateListOrThrow(android.content.res.TypedArray typedArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "<this>");
        checkAttribute(typedArray, i);
        android.content.res.ColorStateList colorStateList = typedArray.getColorStateList(i);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new java.lang.IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    public static final float getDimensionOrThrow(android.content.res.TypedArray typedArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getDimension(i, 0.0f);
    }

    public static final int getDimensionPixelOffsetOrThrow(android.content.res.TypedArray typedArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getDimensionPixelOffset(i, 0);
    }

    public static final int getDimensionPixelSizeOrThrow(android.content.res.TypedArray typedArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getDimensionPixelSize(i, 0);
    }

    public static final android.graphics.drawable.Drawable getDrawableOrThrow(android.content.res.TypedArray typedArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "<this>");
        checkAttribute(typedArray, i);
        android.graphics.drawable.Drawable drawable = typedArray.getDrawable(i);
        kotlin.jvm.internal.Intrinsics.checkNotNull(drawable);
        return drawable;
    }

    public static final float getFloatOrThrow(android.content.res.TypedArray typedArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getFloat(i, 0.0f);
    }

    public static final android.graphics.Typeface getFontOrThrow(android.content.res.TypedArray typedArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return androidx.core.content.res.TypedArrayApi26ImplKt.getFont(typedArray, i);
    }

    public static final int getIntOrThrow(android.content.res.TypedArray typedArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getInt(i, 0);
    }

    public static final int getIntegerOrThrow(android.content.res.TypedArray typedArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getInteger(i, 0);
    }

    public static final int getResourceIdOrThrow(android.content.res.TypedArray typedArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getResourceId(i, 0);
    }

    public static final java.lang.String getStringOrThrow(android.content.res.TypedArray typedArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "<this>");
        checkAttribute(typedArray, i);
        java.lang.String string = typedArray.getString(i);
        if (string != null) {
            return string;
        }
        throw new java.lang.IllegalStateException("Attribute value could not be coerced to String.".toString());
    }

    public static final java.lang.CharSequence getTextOrThrow(android.content.res.TypedArray typedArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "<this>");
        checkAttribute(typedArray, i);
        java.lang.CharSequence text = typedArray.getText(i);
        if (text != null) {
            return text;
        }
        throw new java.lang.IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }

    public static final java.lang.CharSequence[] getTextArrayOrThrow(android.content.res.TypedArray typedArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "<this>");
        checkAttribute(typedArray, i);
        java.lang.CharSequence[] textArray = typedArray.getTextArray(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textArray, "getTextArray(index)");
        return textArray;
    }

    public static final <R> R use(android.content.res.TypedArray typedArray, kotlin.jvm.functions.Function1<? super android.content.res.TypedArray, ? extends R> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        R rInvoke = block.invoke(typedArray);
        typedArray.recycle();
        return rInvoke;
    }
}
