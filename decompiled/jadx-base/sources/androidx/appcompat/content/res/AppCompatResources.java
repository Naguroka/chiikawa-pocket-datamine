package androidx.appcompat.content.res;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatResources {
    private AppCompatResources() {
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context context, int i) {
        return androidx.core.content.ContextCompat.getColorStateList(context, i);
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context context, int i) {
        return androidx.appcompat.widget.ResourceManagerInternal.get().getDrawable(context, i);
    }
}
