package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzamp {
    private final com.google.android.gms.internal.ads.zzadt zza;
    private final android.util.SparseArray zzb = new android.util.SparseArray();
    private final android.util.SparseArray zzc = new android.util.SparseArray();
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public zzamp(com.google.android.gms.internal.ads.zzadt zzadtVar, boolean z, boolean z2) {
        this.zza = zzadtVar;
        byte[] bArr = new byte[128];
        this.zzd = bArr;
        new com.google.android.gms.internal.ads.zzfl(bArr, 0, 0);
        this.zzh = false;
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
    private final void zzg(int i) {
        long j = this.zzj;
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return;
        }
        boolean z = this.zzk;
        long j2 = this.zzf - this.zzi;
        this.zza.zzt(j, z ? 1 : 0, (int) j2, i, null);
    }

    private final void zzh() {
        boolean z = this.zzl;
        boolean z2 = this.zzk;
        int i = this.zze;
        boolean z3 = true;
        if (i != 5 && (!z || i != 1)) {
            z3 = false;
        }
        this.zzk = z2 | z3;
    }

    public final void zza(long j) {
        zzh();
        this.zzf = j;
        zzg(0);
        this.zzh = false;
    }

    public final void zzb(com.google.android.gms.internal.ads.zzfi zzfiVar) {
        this.zzc.append(zzfiVar.zza, zzfiVar);
    }

    public final void zzc(com.google.android.gms.internal.ads.zzfj zzfjVar) {
        this.zzb.append(zzfjVar.zzd, zzfjVar);
    }

    public final void zzd() {
        this.zzh = false;
    }

    public final void zze(long j, int i, long j2, boolean z) {
        this.zze = i;
        this.zzg = j2;
        this.zzf = j;
        this.zzl = z;
    }

    public final boolean zzf(long j, int i, boolean z) {
        if (this.zze == 9) {
            if (z && this.zzh) {
                zzg(i + ((int) (j - this.zzf)));
            }
            this.zzi = this.zzf;
            this.zzj = this.zzg;
            this.zzk = false;
            this.zzh = true;
        }
        zzh();
        return this.zzk;
    }
}
