package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public class zzjx {
    private static volatile boolean zzol = false;
    private static volatile com.google.android.gms.internal.drive.zzjx zzon;
    private final java.util.Map<com.google.android.gms.internal.drive.zzjx.zza, com.google.android.gms.internal.drive.zzkk.zzd<?, ?>> zzop;
    private static final java.lang.Class<?> zzom = zzch();
    static final com.google.android.gms.internal.drive.zzjx zzoo = new com.google.android.gms.internal.drive.zzjx(true);

    private static java.lang.Class<?> zzch() {
        try {
            return java.lang.Class.forName("com.google.protobuf.Extension");
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    static final class zza {
        private final int number;
        private final java.lang.Object object;

        zza(java.lang.Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final int hashCode() {
            return (java.lang.System.identityHashCode(this.object) * 65535) + this.number;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.android.gms.internal.drive.zzjx.zza)) {
                return false;
            }
            com.google.android.gms.internal.drive.zzjx.zza zzaVar = (com.google.android.gms.internal.drive.zzjx.zza) obj;
            return this.object == zzaVar.object && this.number == zzaVar.number;
        }
    }

    public static com.google.android.gms.internal.drive.zzjx zzci() {
        return com.google.android.gms.internal.drive.zzjw.zzcf();
    }

    public static com.google.android.gms.internal.drive.zzjx zzcj() {
        com.google.android.gms.internal.drive.zzjx zzjxVarZzcg = zzon;
        if (zzjxVarZzcg == null) {
            synchronized (com.google.android.gms.internal.drive.zzjx.class) {
                zzjxVarZzcg = zzon;
                if (zzjxVarZzcg == null) {
                    zzjxVarZzcg = com.google.android.gms.internal.drive.zzjw.zzcg();
                    zzon = zzjxVarZzcg;
                }
            }
        }
        return zzjxVarZzcg;
    }

    static com.google.android.gms.internal.drive.zzjx zzcg() {
        return com.google.android.gms.internal.drive.zzki.zza(com.google.android.gms.internal.drive.zzjx.class);
    }

    public final <ContainingType extends com.google.android.gms.internal.drive.zzlq> com.google.android.gms.internal.drive.zzkk.zzd<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (com.google.android.gms.internal.drive.zzkk.zzd) this.zzop.get(new com.google.android.gms.internal.drive.zzjx.zza(containingtype, i));
    }

    zzjx() {
        this.zzop = new java.util.HashMap();
    }

    private zzjx(boolean z) {
        this.zzop = java.util.Collections.emptyMap();
    }
}
