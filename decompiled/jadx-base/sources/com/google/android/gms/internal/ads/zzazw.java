package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzazw {
    private final com.google.android.gms.internal.ads.zzazl zza;
    private final int zzb;
    private final int zzc;

    public zzazw(int i, int i2, int i3) {
        this.zzb = i;
        i2 = (i2 > 64 || i2 < 0) ? 64 : i2;
        if (i3 <= 0) {
            this.zzc = 1;
        } else {
            this.zzc = i3;
        }
        this.zza = new com.google.android.gms.internal.ads.zzazu(i2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    public final java.lang.String zza(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        java.util.Collections.sort(arrayList2, new com.google.android.gms.internal.ads.zzazv(this));
        java.util.HashSet hashSet = new java.util.HashSet();
        loop0: for (int i = 0; i < arrayList2.size(); i++) {
            java.lang.String[] strArrSplit = java.text.Normalizer.normalize((java.lang.CharSequence) arrayList.get(((com.google.android.gms.internal.ads.zzazk) arrayList2.get(i)).zze()), java.text.Normalizer.Form.NFKC).toLowerCase(java.util.Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (java.lang.String str : strArrSplit) {
                    if (str.contains("'")) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
                        int i2 = 1;
                        boolean z = false;
                        while (true) {
                            int i3 = i2 + 2;
                            if (i3 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i2) == '\'') {
                                if (sb.charAt(i2 - 1) != ' ') {
                                    int i4 = i2 + 1;
                                    if ((sb.charAt(i4) == 's' || sb.charAt(i4) == 'S') && (i3 == sb.length() || sb.charAt(i3) == ' ')) {
                                        sb.insert(i2, ' ');
                                        i2 = i3;
                                    } else {
                                        sb.setCharAt(i2, ' ');
                                    }
                                } else {
                                    sb.setCharAt(i2, ' ');
                                }
                                z = true;
                            }
                            i2++;
                        }
                        java.lang.String string = z ? sb.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    }
                    java.lang.String[] strArrZzb = com.google.android.gms.internal.ads.zzazp.zzb(str, true);
                    if (strArrZzb.length >= this.zzc) {
                        for (int i5 = 0; i5 < strArrZzb.length; i5++) {
                            java.lang.String strConcat = "";
                            for (int i6 = 0; i6 < this.zzc; i6++) {
                                int i7 = i5 + i6;
                                if (i7 >= strArrZzb.length) {
                                    break;
                                }
                                if (i6 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(java.lang.String.valueOf(strArrZzb[i7]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
            }
        }
        com.google.android.gms.internal.ads.zzazn zzaznVar = new com.google.android.gms.internal.ads.zzazn();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzaznVar.zzb.write(this.zza.zzb((java.lang.String) it.next()));
            } catch (java.io.IOException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzaznVar.toString();
    }
}
