package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzazt {
    static long zza(long j, int i) {
        if (i == 1) {
            return j;
        }
        int i2 = i >> 1;
        long j2 = (j * j) % 1073807359;
        return ((i & 1) == 0 ? zza(j2, i2) : j * (zza(j2, i2) % 1073807359)) % 1073807359;
    }

    static java.lang.String zzb(java.lang.String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to construct shingle");
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i >= i4) {
                sb.append(strArr[i4]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    public static void zzc(java.lang.String[] strArr, int i, int i2, java.util.PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzd(i, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jZze = zze(strArr, 0, 6);
        zzd(i, jZze, zzb(strArr, 0, 6), 6, priorityQueue);
        int i3 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i3 >= length2 - 5) {
                return;
            }
            long jZza = com.google.android.gms.internal.ads.zzazp.zza(strArr[i3 - 1]);
            long jZza2 = com.google.android.gms.internal.ads.zzazp.zza(strArr[i3 + 5]);
            java.lang.String strZzb = zzb(strArr, i3, 6);
            jZze = ((((((jZze + 1073807359) - ((zza(16785407L, 5) * ((jZza + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((jZza2 + 2147483647L) % 1073807359)) % 1073807359;
            zzd(i, jZze, strZzb, length2, priorityQueue);
            i3++;
        }
    }

    static void zzd(int i, long j, java.lang.String str, int i2, java.util.PriorityQueue priorityQueue) {
        com.google.android.gms.internal.ads.zzazs zzazsVar = new com.google.android.gms.internal.ads.zzazs(j, str, i2);
        if ((priorityQueue.size() != i || (((com.google.android.gms.internal.ads.zzazs) priorityQueue.peek()).zzc <= zzazsVar.zzc && ((com.google.android.gms.internal.ads.zzazs) priorityQueue.peek()).zza <= zzazsVar.zza)) && !priorityQueue.contains(zzazsVar)) {
            priorityQueue.add(zzazsVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(java.lang.String[] strArr, int i, int i2) {
        long jZza = (((long) com.google.android.gms.internal.ads.zzazp.zza(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            jZza = (((jZza * 16785407) % 1073807359) + ((((long) com.google.android.gms.internal.ads.zzazp.zza(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jZza;
    }
}
