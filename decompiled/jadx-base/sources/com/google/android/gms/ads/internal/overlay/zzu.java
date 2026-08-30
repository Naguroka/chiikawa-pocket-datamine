package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzu extends android.widget.FrameLayout implements android.view.View.OnClickListener {
    private final android.widget.ImageButton zza;
    private final com.google.android.gms.ads.internal.overlay.zzag zzb;

    public zzu(android.content.Context context, com.google.android.gms.ads.internal.overlay.zzt zztVar, com.google.android.gms.ads.internal.overlay.zzag zzagVar) {
        super(context);
        this.zzb = zzagVar;
        setOnClickListener(this);
        android.widget.ImageButton imageButton = new android.widget.ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        int iZzx = com.google.android.gms.ads.internal.util.client.zzf.zzx(context, zztVar.zza);
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        int iZzx2 = com.google.android.gms.ads.internal.util.client.zzf.zzx(context, 0);
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        int iZzx3 = com.google.android.gms.ads.internal.util.client.zzf.zzx(context, zztVar.zzb);
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        imageButton.setPadding(iZzx, iZzx2, iZzx3, com.google.android.gms.ads.internal.util.client.zzf.zzx(context, zztVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        int iZzx4 = com.google.android.gms.ads.internal.util.client.zzf.zzx(context, zztVar.zzd + zztVar.zza + zztVar.zzb);
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        addView(imageButton, new android.widget.FrameLayout.LayoutParams(iZzx4, com.google.android.gms.ads.internal.util.client.zzf.zzx(context, zztVar.zzd + zztVar.zzc), 17));
        long jLongValue = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbl)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzs zzsVar = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbm)).booleanValue() ? new com.google.android.gms.ads.internal.overlay.zzs(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(zzsVar);
    }

    private final void zzc() {
        java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbk);
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop() || android.text.TextUtils.isEmpty(str) || "default".equals(str)) {
            this.zza.setImageResource(android.R.drawable.btn_dialog);
            return;
        }
        android.content.res.Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        if (resourcesZze == null) {
            this.zza.setImageResource(android.R.drawable.btn_dialog);
            return;
        }
        android.graphics.drawable.Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = resourcesZze.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_circle_black_cross);
            } else if ("black".equals(str)) {
                drawable = resourcesZze.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_black_circle_white_cross);
            }
        } catch (android.content.res.Resources.NotFoundException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Close button resource not found, falling back to default.");
        }
        if (drawable == null) {
            this.zza.setImageResource(android.R.drawable.btn_dialog);
        } else {
            this.zza.setImageDrawable(drawable);
            this.zza.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.google.android.gms.ads.internal.overlay.zzag zzagVar = this.zzb;
        if (zzagVar != null) {
            zzagVar.zzj();
        }
    }

    public final void zzb(boolean z) {
        if (!z) {
            this.zza.setVisibility(0);
            return;
        }
        this.zza.setVisibility(8);
        if (((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbl)).longValue() > 0) {
            this.zza.animate().cancel();
            this.zza.clearAnimation();
        }
    }
}
