package androidx.appcompat.text;

/* JADX INFO: loaded from: classes.dex */
public class AllCapsTransformationMethod implements android.text.method.TransformationMethod {
    private java.util.Locale mLocale;

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(android.view.View view, java.lang.CharSequence charSequence, boolean z, int i, android.graphics.Rect rect) {
    }

    public AllCapsTransformationMethod(android.content.Context context) {
        this.mLocale = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public java.lang.CharSequence getTransformation(java.lang.CharSequence charSequence, android.view.View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.mLocale);
        }
        return null;
    }
}
