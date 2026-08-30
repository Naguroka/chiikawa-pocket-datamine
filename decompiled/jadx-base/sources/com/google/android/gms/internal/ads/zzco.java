package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzco {
    private static final java.lang.String zzA;
    private static final java.lang.String zzB;
    private static final java.lang.String zzC;
    private static final java.lang.String zzD;
    private static final java.lang.String zzE;
    private static final java.lang.String zzF;
    private static final java.lang.String zzG;
    private static final java.lang.String zzp;
    private static final java.lang.String zzq;
    private static final java.lang.String zzr;
    private static final java.lang.String zzs;
    private static final java.lang.String zzt;
    private static final java.lang.String zzu;
    private static final java.lang.String zzv;
    private static final java.lang.String zzw;
    private static final java.lang.String zzx;
    private static final java.lang.String zzy;
    private static final java.lang.String zzz;
    public final java.lang.CharSequence zza;
    public final android.text.Layout.Alignment zzb;
    public final android.text.Layout.Alignment zzc;
    public final android.graphics.Bitmap zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final int zzi;
    public final float zzj;
    public final float zzk;
    public final int zzl;
    public final float zzm;
    public final int zzn;
    public final float zzo;

    static {
        com.google.android.gms.internal.ads.zzcm zzcmVar = new com.google.android.gms.internal.ads.zzcm();
        zzcmVar.zzl("");
        zzcmVar.zzp();
        zzp = java.lang.Integer.toString(0, 36);
        zzq = java.lang.Integer.toString(17, 36);
        zzr = java.lang.Integer.toString(1, 36);
        zzs = java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        zzt = java.lang.Integer.toString(18, 36);
        zzu = java.lang.Integer.toString(4, 36);
        zzv = java.lang.Integer.toString(5, 36);
        zzw = java.lang.Integer.toString(6, 36);
        zzx = java.lang.Integer.toString(7, 36);
        zzy = java.lang.Integer.toString(8, 36);
        zzz = java.lang.Integer.toString(9, 36);
        zzA = java.lang.Integer.toString(10, 36);
        zzB = java.lang.Integer.toString(11, 36);
        zzC = java.lang.Integer.toString(12, 36);
        zzD = java.lang.Integer.toString(13, 36);
        zzE = java.lang.Integer.toString(14, 36);
        zzF = java.lang.Integer.toString(15, 36);
        zzG = java.lang.Integer.toString(16, 36);
    }

    public final boolean equals(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzco zzcoVar = (com.google.android.gms.internal.ads.zzco) obj;
            if (android.text.TextUtils.equals(this.zza, zzcoVar.zza) && this.zzb == zzcoVar.zzb && this.zzc == zzcoVar.zzc && ((bitmap = this.zzd) != null ? !((bitmap2 = zzcoVar.zzd) == null || !bitmap.sameAs(bitmap2)) : zzcoVar.zzd == null) && this.zze == zzcoVar.zze && this.zzf == zzcoVar.zzf && this.zzg == zzcoVar.zzg && this.zzh == zzcoVar.zzh && this.zzi == zzcoVar.zzi && this.zzj == zzcoVar.zzj && this.zzk == zzcoVar.zzk && this.zzl == zzcoVar.zzl && this.zzm == zzcoVar.zzm && this.zzn == zzcoVar.zzn && this.zzo == zzcoVar.zzo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.zza, this.zzb, this.zzc, this.zzd, java.lang.Float.valueOf(this.zze), java.lang.Integer.valueOf(this.zzf), java.lang.Integer.valueOf(this.zzg), java.lang.Float.valueOf(this.zzh), java.lang.Integer.valueOf(this.zzi), java.lang.Float.valueOf(this.zzj), java.lang.Float.valueOf(this.zzk), false, java.lang.Integer.valueOf(androidx.core.view.ViewCompat.MEASURED_STATE_MASK), java.lang.Integer.valueOf(this.zzl), java.lang.Float.valueOf(this.zzm), java.lang.Integer.valueOf(this.zzn), java.lang.Float.valueOf(this.zzo)});
    }

    public final android.os.Bundle zza() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.CharSequence charSequence = this.zza;
        if (charSequence != null) {
            bundle.putCharSequence(zzp, charSequence);
            java.lang.CharSequence charSequence2 = this.zza;
            if (charSequence2 instanceof android.text.Spanned) {
                java.util.ArrayList<? extends android.os.Parcelable> arrayListZza = com.google.android.gms.internal.ads.zzcq.zza((android.text.Spanned) charSequence2);
                if (!arrayListZza.isEmpty()) {
                    bundle.putParcelableArrayList(zzq, arrayListZza);
                }
            }
        }
        bundle.putSerializable(zzr, this.zzb);
        bundle.putSerializable(zzs, this.zzc);
        bundle.putFloat(zzu, this.zze);
        bundle.putInt(zzv, this.zzf);
        bundle.putInt(zzw, this.zzg);
        bundle.putFloat(zzx, this.zzh);
        bundle.putInt(zzy, this.zzi);
        bundle.putInt(zzz, this.zzl);
        bundle.putFloat(zzA, this.zzm);
        bundle.putFloat(zzB, this.zzj);
        bundle.putFloat(zzC, this.zzk);
        bundle.putBoolean(zzE, false);
        bundle.putInt(zzD, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        bundle.putInt(zzF, this.zzn);
        bundle.putFloat(zzG, this.zzo);
        if (this.zzd != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            com.google.android.gms.internal.ads.zzcw.zzf(this.zzd.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(zzt, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public final com.google.android.gms.internal.ads.zzcm zzb() {
        return new com.google.android.gms.internal.ads.zzcm(this, null);
    }

    /* synthetic */ zzco(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, android.text.Layout.Alignment alignment2, android.graphics.Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, com.google.android.gms.internal.ads.zzcn zzcnVar) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            com.google.android.gms.internal.ads.zzcw.zzd(bitmap == null);
        }
        if (charSequence instanceof android.text.Spanned) {
            this.zza = android.text.SpannedString.valueOf(charSequence);
        } else {
            this.zza = charSequence != null ? charSequence.toString() : null;
        }
        this.zzb = alignment;
        this.zzc = alignment2;
        this.zzd = bitmap;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = f2;
        this.zzi = i3;
        this.zzj = f4;
        this.zzk = f5;
        this.zzl = i4;
        this.zzm = f3;
        this.zzn = i6;
        this.zzo = f6;
    }
}
