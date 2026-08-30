package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzamn {
    private final com.google.android.gms.internal.ads.zzadt zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzamn(com.google.android.gms.internal.ads.zzadt zzadtVar) {
        this.zza = zzadtVar;
    }

    public final void zza(byte[] bArr, int i, int i2) {
        if (this.zzc) {
            int i3 = this.zzf;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.zzf = i3 + (i2 - i);
            } else {
                this.zzd = ((bArr[i4] & 192) >> 6) == 0;
                this.zzc = false;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void zzb(long j, int i, boolean z) {
        com.google.android.gms.internal.ads.zzcw.zzf(this.zzh != androidx.media3.common.C.TIME_UNSET);
        if (this.zze == 182 && z && this.zzb) {
            this.zza.zzt(this.zzh, this.zzd ? 1 : 0, (int) (j - this.zzg), i, null);
        }
        if (this.zze != 179) {
            this.zzg = j;
        }
    }

    public final void zzc(int i, long j) {
        boolean z;
        this.zze = i;
        this.zzd = false;
        if (i == 182) {
            z = true;
        } else if (i == 179) {
            i = 179;
            z = true;
        } else {
            z = false;
        }
        this.zzb = z;
        this.zzc = i == 182;
        this.zzf = 0;
        this.zzh = j;
    }

    public final void zzd() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }
}
