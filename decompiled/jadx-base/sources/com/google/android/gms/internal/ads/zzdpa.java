package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdpa {
    private android.content.Context zza;
    private android.widget.PopupWindow zzb;

    public final void zza(android.content.Context context, android.view.View view) {
        android.widget.PopupWindow popupWindow;
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKat() || com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()) {
            return;
        }
        android.view.Window window = context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((android.app.Activity) context).isDestroyed()) {
            popupWindow = null;
        } else {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
            frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(view, -1, -1);
            popupWindow = new android.widget.PopupWindow((android.view.View) frameLayout, 1, 1, false);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setClippingEnabled(false);
            com.google.android.gms.ads.internal.util.client.zzo.zze("Displaying the 1x1 popup off the screen.");
            try {
                popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (java.lang.Exception unused) {
                popupWindow = null;
            }
        }
        this.zzb = popupWindow;
        if (popupWindow == null) {
            context = null;
        }
        this.zza = context;
    }

    public final void zzb() {
        android.widget.PopupWindow popupWindow;
        android.content.Context context = this.zza;
        if (context == null || this.zzb == null) {
            return;
        }
        if ((!(context instanceof android.app.Activity) || !((android.app.Activity) context).isDestroyed()) && (popupWindow = this.zzb) != null && popupWindow.isShowing()) {
            this.zzb.dismiss();
        }
        this.zza = null;
        this.zzb = null;
    }
}
