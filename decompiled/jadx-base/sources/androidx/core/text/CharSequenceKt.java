package androidx.core.text;

/* JADX INFO: compiled from: CharSequence.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0086\b¨\u0006\u0005"}, d2 = {"isDigitsOnly", "", "", "trimmedLength", "", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CharSequenceKt {
    public static final boolean isDigitsOnly(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return android.text.TextUtils.isDigitsOnly(charSequence);
    }

    public static final int trimmedLength(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return android.text.TextUtils.getTrimmedLength(charSequence);
    }
}
