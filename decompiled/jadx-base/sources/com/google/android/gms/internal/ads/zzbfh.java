package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbfh extends android.widget.RelativeLayout {
    private static final float[] zza = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private android.graphics.drawable.AnimationDrawable zzb;

    public zzbfh(android.content.Context context, com.google.android.gms.internal.ads.zzbfg zzbfgVar, android.widget.RelativeLayout.LayoutParams layoutParams) {
        super(context);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbfgVar);
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(zza, null, null));
        shapeDrawable.getPaint().setColor(zzbfgVar.zzd());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        if (!android.text.TextUtils.isEmpty(zzbfgVar.zzg())) {
            android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(android.graphics.Typeface.DEFAULT);
            textView.setText(zzbfgVar.zzg());
            textView.setTextColor(zzbfgVar.zze());
            textView.setTextSize(zzbfgVar.zzf());
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            int iZzx = com.google.android.gms.ads.internal.util.client.zzf.zzx(context, 4);
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            textView.setPadding(iZzx, 0, com.google.android.gms.ads.internal.util.client.zzf.zzx(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        java.util.List listZzi = zzbfgVar.zzi();
        if (listZzi != null && listZzi.size() > 1) {
            this.zzb = new android.graphics.drawable.AnimationDrawable();
            java.util.Iterator it = listZzi.iterator();
            while (it.hasNext()) {
                try {
                    this.zzb.addFrame((android.graphics.drawable.Drawable) com.google.android.gms.dynamic.ObjectWrapper.unwrap(((com.google.android.gms.internal.ads.zzbfj) it.next()).zzf()), zzbfgVar.zzb());
                } catch (java.lang.Exception e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Error while getting drawable.", e);
                }
            }
            imageView.setBackground(this.zzb);
        } else if (listZzi.size() == 1) {
            try {
                imageView.setImageDrawable((android.graphics.drawable.Drawable) com.google.android.gms.dynamic.ObjectWrapper.unwrap(((com.google.android.gms.internal.ads.zzbfj) listZzi.get(0)).zzf()));
            } catch (java.lang.Exception e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        android.graphics.drawable.AnimationDrawable animationDrawable = this.zzb;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
