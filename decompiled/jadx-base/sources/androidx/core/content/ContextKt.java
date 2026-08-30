package androidx.core.content;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0086\b¢\u0006\u0002\u0010\u0004\u001aQ\u0010\u0005\u001a\u00020\u0006*\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0002\b\u0011H\u0086\bø\u0001\u0000\u001a;\u0010\u0005\u001a\u00020\u0006*\u00020\u00032\b\b\u0001\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0002\b\u0011H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"getSystemService", "T", "", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Object;", "withStyledAttributes", "", "set", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "defStyleRes", "block", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Lkotlin/ExtensionFunctionType;", "resourceId", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ContextKt {
    public static final /* synthetic */ <T> T getSystemService(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) androidx.core.content.ContextCompat.getSystemService(context, java.lang.Object.class);
    }

    public static /* synthetic */ void withStyledAttributes$default(android.content.Context context, android.util.AttributeSet attributeSet, int[] attrs, int i, int i2, kotlin.jvm.functions.Function1 block, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, attrs, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        block.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void withStyledAttributes(android.content.Context context, android.util.AttributeSet attributeSet, int[] attrs, int i, int i2, kotlin.jvm.functions.Function1<? super android.content.res.TypedArray, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, attrs, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        block.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void withStyledAttributes(android.content.Context context, int i, int[] attrs, kotlin.jvm.functions.Function1<? super android.content.res.TypedArray, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, attrs);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
        block.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
