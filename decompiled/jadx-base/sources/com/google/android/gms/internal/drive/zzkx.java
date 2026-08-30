package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public class zzkx {
    private static final com.google.android.gms.internal.drive.zzjx zzng = com.google.android.gms.internal.drive.zzjx.zzci();
    private com.google.android.gms.internal.drive.zzjc zzth;
    private volatile com.google.android.gms.internal.drive.zzlq zzti;
    private volatile com.google.android.gms.internal.drive.zzjc zztj;

    public int hashCode() {
        return 1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.drive.zzkx)) {
            return false;
        }
        com.google.android.gms.internal.drive.zzkx zzkxVar = (com.google.android.gms.internal.drive.zzkx) obj;
        com.google.android.gms.internal.drive.zzlq zzlqVar = this.zzti;
        com.google.android.gms.internal.drive.zzlq zzlqVar2 = zzkxVar.zzti;
        if (zzlqVar == null && zzlqVar2 == null) {
            return zzbl().equals(zzkxVar.zzbl());
        }
        if (zzlqVar != null && zzlqVar2 != null) {
            return zzlqVar.equals(zzlqVar2);
        }
        if (zzlqVar != null) {
            return zzlqVar.equals(zzkxVar.zzh(zzlqVar.zzda()));
        }
        return zzh(zzlqVar2.zzda()).equals(zzlqVar2);
    }

    private final com.google.android.gms.internal.drive.zzlq zzh(com.google.android.gms.internal.drive.zzlq zzlqVar) {
        if (this.zzti == null) {
            synchronized (this) {
                if (this.zzti == null) {
                    try {
                        this.zzti = zzlqVar;
                        this.zztj = com.google.android.gms.internal.drive.zzjc.zznq;
                    } catch (com.google.android.gms.internal.drive.zzkq unused) {
                        this.zzti = zzlqVar;
                        this.zztj = com.google.android.gms.internal.drive.zzjc.zznq;
                    }
                }
            }
        }
        return this.zzti;
    }

    public final com.google.android.gms.internal.drive.zzlq zzi(com.google.android.gms.internal.drive.zzlq zzlqVar) {
        com.google.android.gms.internal.drive.zzlq zzlqVar2 = this.zzti;
        this.zzth = null;
        this.zztj = null;
        this.zzti = zzlqVar;
        return zzlqVar2;
    }

    public final int zzcx() {
        if (this.zztj != null) {
            return this.zztj.size();
        }
        if (this.zzti != null) {
            return this.zzti.zzcx();
        }
        return 0;
    }

    public final com.google.android.gms.internal.drive.zzjc zzbl() {
        if (this.zztj != null) {
            return this.zztj;
        }
        synchronized (this) {
            if (this.zztj != null) {
                return this.zztj;
            }
            if (this.zzti == null) {
                this.zztj = com.google.android.gms.internal.drive.zzjc.zznq;
            } else {
                this.zztj = this.zzti.zzbl();
            }
            return this.zztj;
        }
    }
}
