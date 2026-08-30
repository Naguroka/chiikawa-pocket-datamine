package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public class zzx extends com.google.android.gms.ads.internal.util.zzv {
    static final /* synthetic */ android.view.WindowInsets zzl(android.app.Activity activity, android.view.View view, android.view.WindowInsets windowInsets) {
        if (com.google.android.gms.ads.internal.zzv.zzp().zzi().zzj() == null) {
            android.view.DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            java.lang.String strConcat = "";
            if (displayCutout != null) {
                com.google.android.gms.ads.internal.util.zzg zzgVarZzi = com.google.android.gms.ads.internal.zzv.zzp().zzi();
                for (android.graphics.Rect rect : displayCutout.getBoundingRects()) {
                    java.lang.String str = java.lang.String.format(java.util.Locale.US, "%d,%d,%d,%d", java.lang.Integer.valueOf(rect.left), java.lang.Integer.valueOf(rect.top), java.lang.Integer.valueOf(rect.right), java.lang.Integer.valueOf(rect.bottom));
                    if (!android.text.TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat("|");
                    }
                    strConcat = strConcat.concat(java.lang.String.valueOf(str));
                }
                zzgVarZzi.zzy(strConcat);
            } else {
                com.google.android.gms.ads.internal.zzv.zzp().zzi().zzy("");
            }
        }
        zzn(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzn(boolean z, android.app.Activity activity) {
        android.view.Window window = activity.getWindow();
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = true != z ? 2 : 1;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int zzj(android.media.AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final void zzk(final android.app.Activity activity) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbo)).booleanValue() && com.google.android.gms.ads.internal.zzv.zzp().zzi().zzj() == null && !activity.isInMultiWindowMode()) {
            zzn(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener(this) { // from class: com.google.android.gms.ads.internal.util.zzw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
                    return com.google.android.gms.ads.internal.util.zzx.zzl(activity, view, windowInsets);
                }
            });
        }
    }
}
