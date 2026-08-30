package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfqr extends com.google.android.gms.internal.ads.zzfqf {
    private com.google.android.gms.internal.ads.zzfvf<java.lang.Integer> zza;
    private com.google.android.gms.internal.ads.zzfvf<java.lang.Integer> zzb;
    private com.google.android.gms.internal.ads.zzfqq zzc;
    private java.net.HttpURLConnection zzd;

    zzfqr() {
        this(new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqh
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final java.lang.Object zza() {
                return com.google.android.gms.internal.ads.zzfqr.zzf();
            }
        }, new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqi
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final java.lang.Object zza() {
                return com.google.android.gms.internal.ads.zzfqr.zzg();
            }
        }, null);
    }

    zzfqr(com.google.android.gms.internal.ads.zzfvf<java.lang.Integer> zzfvfVar, com.google.android.gms.internal.ads.zzfvf<java.lang.Integer> zzfvfVar2, com.google.android.gms.internal.ads.zzfqq zzfqqVar) {
        this.zza = zzfvfVar;
        this.zzb = zzfvfVar2;
        this.zzc = zzfqqVar;
    }

    static /* synthetic */ java.lang.Integer zzf() {
        return -1;
    }

    static /* synthetic */ java.lang.Integer zzg() {
        return -1;
    }

    public static void zzs(java.net.HttpURLConnection httpURLConnection) {
        com.google.android.gms.internal.ads.zzfqg.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public java.net.HttpURLConnection zzm() throws java.io.IOException {
        com.google.android.gms.internal.ads.zzfqg.zzb(((java.lang.Integer) this.zza.zza()).intValue(), ((java.lang.Integer) this.zzb.zza()).intValue());
        com.google.android.gms.internal.ads.zzfqq zzfqqVar = this.zzc;
        zzfqqVar.getClass();
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) zzfqqVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public java.net.HttpURLConnection zzn(com.google.android.gms.internal.ads.zzfqq zzfqqVar, final int i, final int i2) throws java.io.IOException {
        this.zza = new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqj
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final java.lang.Object zza() {
                return java.lang.Integer.valueOf(i);
            }
        };
        this.zzb = new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqk
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final java.lang.Object zza() {
                return java.lang.Integer.valueOf(i2);
            }
        };
        this.zzc = zzfqqVar;
        return zzm();
    }

    public java.net.HttpURLConnection zzo(final android.net.Network network, final java.net.URL url, final int i, final int i2) throws java.io.IOException {
        this.zza = new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzfql
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final java.lang.Object zza() {
                return java.lang.Integer.valueOf(i);
            }
        };
        this.zzb = new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqm
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final java.lang.Object zza() {
                return java.lang.Integer.valueOf(i2);
            }
        };
        this.zzc = new com.google.android.gms.internal.ads.zzfqq() { // from class: com.google.android.gms.internal.ads.zzfqn
            @Override // com.google.android.gms.internal.ads.zzfqq
            public final java.net.URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzm();
    }

    public java.net.URLConnection zzr(final java.net.URL url, final int i) throws java.io.IOException {
        this.zza = new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzfqo
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final java.lang.Object zza() {
                return java.lang.Integer.valueOf(i);
            }
        };
        this.zzc = new com.google.android.gms.internal.ads.zzfqq() { // from class: com.google.android.gms.internal.ads.zzfqp
            @Override // com.google.android.gms.internal.ads.zzfqq
            public final java.net.URLConnection zza() {
                return url.openConnection();
            }
        };
        return zzm();
    }
}
